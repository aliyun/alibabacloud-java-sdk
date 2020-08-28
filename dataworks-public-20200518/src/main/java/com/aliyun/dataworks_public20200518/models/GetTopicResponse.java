// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicResponse extends TeaModel {
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
    public GetTopicResponseData data;

    public static GetTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicResponse self = new GetTopicResponse();
        return TeaModel.build(map, self);
    }

    public static class GetTopicResponseData extends TeaModel {
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

        @NameInMap("AlertTime")
        @Validation(required = true)
        public Long alertTime;

        @NameInMap("Assigner")
        @Validation(required = true)
        public String assigner;

        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        @NameInMap("BaselineInGroupId")
        @Validation(required = true)
        public Integer baselineInGroupId;

        @NameInMap("BaselineStatus")
        @Validation(required = true)
        public String baselineStatus;

        @NameInMap("BaselineBuffer")
        @Validation(required = true)
        public Long baselineBuffer;

        @NameInMap("Buffer")
        @Validation(required = true)
        public Long buffer;

        @NameInMap("DealTime")
        @Validation(required = true)
        public Long dealTime;

        @NameInMap("DealUser")
        @Validation(required = true)
        public String dealUser;

        @NameInMap("FixTime")
        @Validation(required = true)
        public Long fixTime;

        @NameInMap("HappenTime")
        @Validation(required = true)
        public Long happenTime;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("NextAlertTime")
        @Validation(required = true)
        public Long nextAlertTime;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static GetTopicResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicResponseData self = new GetTopicResponseData();
            return TeaModel.build(map, self);
        }

    }

}
