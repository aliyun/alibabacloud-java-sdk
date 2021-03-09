// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityProjectResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<EditQualityProjectResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static EditQualityProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditQualityProjectResponseBody self = new EditQualityProjectResponseBody();
        return TeaModel.build(map, self);
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

    public EditQualityProjectResponseBody setData(java.util.List<EditQualityProjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<EditQualityProjectResponseBodyData> getData() {
        return this.data;
    }

    public EditQualityProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EditQualityProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EditQualityProjectResponseBodyData extends TeaModel {
        @NameInMap("Version")
        public Integer version;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("InstanceId")
        public String instanceId;

        public static EditQualityProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EditQualityProjectResponseBodyData self = new EditQualityProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EditQualityProjectResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public EditQualityProjectResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public EditQualityProjectResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
