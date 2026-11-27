// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class BatchCreateQualityProjectsResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The quality check task information.</p>
     */
    @NameInMap("Data")
    public java.util.List<BatchCreateQualityProjectsResponseBodyData> data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the quality check task.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The version number of the quality check task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
