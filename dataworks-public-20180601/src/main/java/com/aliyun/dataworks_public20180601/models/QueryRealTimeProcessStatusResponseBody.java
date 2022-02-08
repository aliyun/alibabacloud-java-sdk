// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class QueryRealTimeProcessStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryRealTimeProcessStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryRealTimeProcessStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRealTimeProcessStatusResponseBody self = new QueryRealTimeProcessStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRealTimeProcessStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryRealTimeProcessStatusResponseBody setData(QueryRealTimeProcessStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRealTimeProcessStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryRealTimeProcessStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRealTimeProcessStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryRealTimeProcessStatusResponseBodyData extends TeaModel {
        @NameInMap("DataworksOrderId")
        public String dataworksOrderId;

        @NameInMap("DstDatasourceName")
        public String dstDatasourceName;

        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        @NameInMap("RealtimeTaskName")
        public String realtimeTaskName;

        @NameInMap("ResGroupIdentifier")
        public String resGroupIdentifier;

        @NameInMap("ResGroupName")
        public String resGroupName;

        @NameInMap("ResGroupOrderId")
        public String resGroupOrderId;

        @NameInMap("SrcDatasourceName")
        public String srcDatasourceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskUrl")
        public String taskUrl;

        public static QueryRealTimeProcessStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRealTimeProcessStatusResponseBodyData self = new QueryRealTimeProcessStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRealTimeProcessStatusResponseBodyData setDataworksOrderId(String dataworksOrderId) {
            this.dataworksOrderId = dataworksOrderId;
            return this;
        }
        public String getDataworksOrderId() {
            return this.dataworksOrderId;
        }

        public QueryRealTimeProcessStatusResponseBodyData setDstDatasourceName(String dstDatasourceName) {
            this.dstDatasourceName = dstDatasourceName;
            return this;
        }
        public String getDstDatasourceName() {
            return this.dstDatasourceName;
        }

        public QueryRealTimeProcessStatusResponseBodyData setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public QueryRealTimeProcessStatusResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryRealTimeProcessStatusResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public QueryRealTimeProcessStatusResponseBodyData setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public QueryRealTimeProcessStatusResponseBodyData setRealtimeTaskName(String realtimeTaskName) {
            this.realtimeTaskName = realtimeTaskName;
            return this;
        }
        public String getRealtimeTaskName() {
            return this.realtimeTaskName;
        }

        public QueryRealTimeProcessStatusResponseBodyData setResGroupIdentifier(String resGroupIdentifier) {
            this.resGroupIdentifier = resGroupIdentifier;
            return this;
        }
        public String getResGroupIdentifier() {
            return this.resGroupIdentifier;
        }

        public QueryRealTimeProcessStatusResponseBodyData setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public QueryRealTimeProcessStatusResponseBodyData setResGroupOrderId(String resGroupOrderId) {
            this.resGroupOrderId = resGroupOrderId;
            return this;
        }
        public String getResGroupOrderId() {
            return this.resGroupOrderId;
        }

        public QueryRealTimeProcessStatusResponseBodyData setSrcDatasourceName(String srcDatasourceName) {
            this.srcDatasourceName = srcDatasourceName;
            return this;
        }
        public String getSrcDatasourceName() {
            return this.srcDatasourceName;
        }

        public QueryRealTimeProcessStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRealTimeProcessStatusResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryRealTimeProcessStatusResponseBodyData setTaskUrl(String taskUrl) {
            this.taskUrl = taskUrl;
            return this;
        }
        public String getTaskUrl() {
            return this.taskUrl;
        }

    }

}
