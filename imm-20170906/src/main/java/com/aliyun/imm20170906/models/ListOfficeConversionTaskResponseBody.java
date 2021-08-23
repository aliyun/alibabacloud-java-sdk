// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<ListOfficeConversionTaskResponseBodyTasks> tasks;

    public static ListOfficeConversionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeConversionTaskResponseBody self = new ListOfficeConversionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOfficeConversionTaskResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListOfficeConversionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOfficeConversionTaskResponseBody setTasks(java.util.List<ListOfficeConversionTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListOfficeConversionTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ListOfficeConversionTaskResponseBodyTasks extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public Integer percent;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("NotifyTopicName")
        public String notifyTopicName;

        @NameInMap("NotifyEndpoint")
        public String notifyEndpoint;

        @NameInMap("SrcUri")
        public String srcUri;

        @NameInMap("TgtType")
        public String tgtType;

        @NameInMap("TgtUri")
        public String tgtUri;

        @NameInMap("ImageSpec")
        public String imageSpec;

        @NameInMap("ExternalID")
        public String externalID;

        @NameInMap("TaskId")
        public String taskId;

        public static ListOfficeConversionTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListOfficeConversionTaskResponseBodyTasks self = new ListOfficeConversionTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListOfficeConversionTaskResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOfficeConversionTaskResponseBodyTasks setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListOfficeConversionTaskResponseBodyTasks setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListOfficeConversionTaskResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOfficeConversionTaskResponseBodyTasks setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListOfficeConversionTaskResponseBodyTasks setNotifyTopicName(String notifyTopicName) {
            this.notifyTopicName = notifyTopicName;
            return this;
        }
        public String getNotifyTopicName() {
            return this.notifyTopicName;
        }

        public ListOfficeConversionTaskResponseBodyTasks setNotifyEndpoint(String notifyEndpoint) {
            this.notifyEndpoint = notifyEndpoint;
            return this;
        }
        public String getNotifyEndpoint() {
            return this.notifyEndpoint;
        }

        public ListOfficeConversionTaskResponseBodyTasks setSrcUri(String srcUri) {
            this.srcUri = srcUri;
            return this;
        }
        public String getSrcUri() {
            return this.srcUri;
        }

        public ListOfficeConversionTaskResponseBodyTasks setTgtType(String tgtType) {
            this.tgtType = tgtType;
            return this;
        }
        public String getTgtType() {
            return this.tgtType;
        }

        public ListOfficeConversionTaskResponseBodyTasks setTgtUri(String tgtUri) {
            this.tgtUri = tgtUri;
            return this;
        }
        public String getTgtUri() {
            return this.tgtUri;
        }

        public ListOfficeConversionTaskResponseBodyTasks setImageSpec(String imageSpec) {
            this.imageSpec = imageSpec;
            return this;
        }
        public String getImageSpec() {
            return this.imageSpec;
        }

        public ListOfficeConversionTaskResponseBodyTasks setExternalID(String externalID) {
            this.externalID = externalID;
            return this;
        }
        public String getExternalID() {
            return this.externalID;
        }

        public ListOfficeConversionTaskResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
