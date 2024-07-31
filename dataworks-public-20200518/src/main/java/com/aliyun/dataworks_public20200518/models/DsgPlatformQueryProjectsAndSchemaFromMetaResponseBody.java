// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DsgPlatformQueryProjectsAndSchemaFromMetaResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1029030003</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>param error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>102400001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the EMR cluster. This parameter is generated only when the request parameter EngineName is set to EMR.</p>
         * 
         * <strong>example:</strong>
         * <p>c-12345</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the compute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>emr_test_project</p>
         */
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
