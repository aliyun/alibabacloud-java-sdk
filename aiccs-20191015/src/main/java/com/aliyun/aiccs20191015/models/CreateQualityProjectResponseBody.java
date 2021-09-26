// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateQualityProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public CreateQualityProjectResponseBodyData data;

    public static CreateQualityProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityProjectResponseBody self = new CreateQualityProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQualityProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateQualityProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateQualityProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQualityProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateQualityProjectResponseBody setData(CreateQualityProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateQualityProjectResponseBodyData getData() {
        return this.data;
    }

    public static class CreateQualityProjectResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Version")
        public Integer version;

        @NameInMap("ProjectId")
        public Long projectId;

        public static CreateQualityProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateQualityProjectResponseBodyData self = new CreateQualityProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateQualityProjectResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateQualityProjectResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public CreateQualityProjectResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
