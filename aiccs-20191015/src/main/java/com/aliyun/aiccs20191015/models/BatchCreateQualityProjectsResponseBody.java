// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class BatchCreateQualityProjectsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<BatchCreateQualityProjectsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchCreateQualityProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateQualityProjectsResponseBody self = new BatchCreateQualityProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateQualityProjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreateQualityProjectsResponseBody setData(java.util.List<BatchCreateQualityProjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchCreateQualityProjectsResponseBodyData> getData() {
        return this.data;
    }

    public BatchCreateQualityProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreateQualityProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateQualityProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCreateQualityProjectsResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Version")
        public Integer version;

        public static BatchCreateQualityProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateQualityProjectsResponseBodyData self = new BatchCreateQualityProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCreateQualityProjectsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchCreateQualityProjectsResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public BatchCreateQualityProjectsResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
