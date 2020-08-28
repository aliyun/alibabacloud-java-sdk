// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListAlertMessagesResponse extends TeaModel {
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
    public ListAlertMessagesResponseData data;

    public static ListAlertMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertMessagesResponse self = new ListAlertMessagesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAlertMessagesResponseDataAlertMessagesInstances extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        public static ListAlertMessagesResponseDataAlertMessagesInstances build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessagesInstances self = new ListAlertMessagesResponseDataAlertMessagesInstances();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAlertMessagesResponseDataAlertMessagesTopics extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("TopicId")
        @Validation(required = true)
        public Long topicId;

        @NameInMap("TopicName")
        @Validation(required = true)
        public String topicName;

        @NameInMap("TopicOwner")
        @Validation(required = true)
        public String topicOwner;

        @NameInMap("TopicStatus")
        @Validation(required = true)
        public String topicStatus;

        public static ListAlertMessagesResponseDataAlertMessagesTopics build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessagesTopics self = new ListAlertMessagesResponseDataAlertMessagesTopics();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAlertMessagesResponseDataAlertMessagesNodes extends TeaModel {
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

        public static ListAlertMessagesResponseDataAlertMessagesNodes build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessagesNodes self = new ListAlertMessagesResponseDataAlertMessagesNodes();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAlertMessagesResponseDataAlertMessagesSlaAlert extends TeaModel {
        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        @NameInMap("BaselineOwner")
        @Validation(required = true)
        public String baselineOwner;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ListAlertMessagesResponseDataAlertMessagesSlaAlert build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessagesSlaAlert self = new ListAlertMessagesResponseDataAlertMessagesSlaAlert();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAlertMessagesResponseDataAlertMessages extends TeaModel {
        @NameInMap("AlertId")
        @Validation(required = true)
        public Long alertId;

        @NameInMap("AlertTime")
        @Validation(required = true)
        public Long alertTime;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("RemindId")
        @Validation(required = true)
        public Long remindId;

        @NameInMap("RemindName")
        @Validation(required = true)
        public String remindName;

        @NameInMap("AlertUser")
        @Validation(required = true)
        public String alertUser;

        @NameInMap("AlertMethod")
        @Validation(required = true)
        public String alertMethod;

        @NameInMap("AlertMessageStatus")
        @Validation(required = true)
        public String alertMessageStatus;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Instances")
        @Validation(required = true)
        public java.util.List<ListAlertMessagesResponseDataAlertMessagesInstances> instances;

        @NameInMap("Topics")
        @Validation(required = true)
        public java.util.List<ListAlertMessagesResponseDataAlertMessagesTopics> topics;

        @NameInMap("Nodes")
        @Validation(required = true)
        public java.util.List<ListAlertMessagesResponseDataAlertMessagesNodes> nodes;

        @NameInMap("SlaAlert")
        @Validation(required = true)
        public ListAlertMessagesResponseDataAlertMessagesSlaAlert slaAlert;

        public static ListAlertMessagesResponseDataAlertMessages build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessages self = new ListAlertMessagesResponseDataAlertMessages();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAlertMessagesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public String pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public String pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public String totalCount;

        @NameInMap("AlertMessages")
        @Validation(required = true)
        public java.util.List<ListAlertMessagesResponseDataAlertMessages> alertMessages;

        public static ListAlertMessagesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseData self = new ListAlertMessagesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
