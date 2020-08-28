// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTopicsResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListTopicsResponseData data;

    public static ListTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsResponse self = new ListTopicsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListTopicsResponseDataTopics extends TeaModel {
        @NameInMap("TopicId")
        @Validation(required = true)
        public Long topicId;

        @NameInMap("TopicName")
        @Validation(required = true)
        public String topicName;

        @NameInMap("TopicStatus")
        @Validation(required = true)
        public String topicStatus;

        @NameInMap("TopicType")
        @Validation(required = true)
        public String topicType;

        @NameInMap("AddTime")
        @Validation(required = true)
        public Long addTime;

        @NameInMap("HappenTime")
        @Validation(required = true)
        public Long happenTime;

        @NameInMap("FixTime")
        @Validation(required = true)
        public Long fixTime;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("NodeOwner")
        @Validation(required = true)
        public String nodeOwner;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static ListTopicsResponseDataTopics build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseDataTopics self = new ListTopicsResponseDataTopics();
            return TeaModel.build(map, self);
        }

    }

    public static class ListTopicsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Topics")
        @Validation(required = true)
        public java.util.List<ListTopicsResponseDataTopics> topics;

        public static ListTopicsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseData self = new ListTopicsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
