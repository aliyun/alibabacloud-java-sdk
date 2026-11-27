// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityProjectResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The quality inspection task information.</p>
     */
    @NameInMap("Data")
    public java.util.List<EditQualityProjectResponseBodyData> data;

    /**
     * <p>The status message.</p>
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

    public static EditQualityProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditQualityProjectResponseBody self = new EditQualityProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public EditQualityProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EditQualityProjectResponseBody setData(java.util.List<EditQualityProjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<EditQualityProjectResponseBodyData> getData() {
        return this.data;
    }

    public EditQualityProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EditQualityProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditQualityProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EditQualityProjectResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The quality inspection task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The version of the quality inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static EditQualityProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EditQualityProjectResponseBodyData self = new EditQualityProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EditQualityProjectResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public EditQualityProjectResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public EditQualityProjectResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
