// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody self = new DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody setData(java.util.List<DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData> getData() {
        return this.data;
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Project")
        public String project;

        public static DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData self = new DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

}
