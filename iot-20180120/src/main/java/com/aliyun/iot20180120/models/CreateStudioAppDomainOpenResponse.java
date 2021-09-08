// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateStudioAppDomainOpenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateStudioAppDomainOpenResponseData data;

    public static CreateStudioAppDomainOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStudioAppDomainOpenResponse self = new CreateStudioAppDomainOpenResponse();
        return TeaModel.build(map, self);
    }

    public CreateStudioAppDomainOpenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStudioAppDomainOpenResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateStudioAppDomainOpenResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateStudioAppDomainOpenResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateStudioAppDomainOpenResponse setData(CreateStudioAppDomainOpenResponseData data) {
        this.data = data;
        return this;
    }
    public CreateStudioAppDomainOpenResponseData getData() {
        return this.data;
    }

    public static class CreateStudioAppDomainOpenResponseData extends TeaModel {
        @NameInMap("TenantId")
        @Validation(required = true)
        public String tenantId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("IsBeian")
        @Validation(required = true)
        public String isBeian;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        public static CreateStudioAppDomainOpenResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateStudioAppDomainOpenResponseData self = new CreateStudioAppDomainOpenResponseData();
            return TeaModel.build(map, self);
        }

        public CreateStudioAppDomainOpenResponseData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateStudioAppDomainOpenResponseData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateStudioAppDomainOpenResponseData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateStudioAppDomainOpenResponseData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateStudioAppDomainOpenResponseData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public CreateStudioAppDomainOpenResponseData setIsBeian(String isBeian) {
            this.isBeian = isBeian;
            return this;
        }
        public String getIsBeian() {
            return this.isBeian;
        }

        public CreateStudioAppDomainOpenResponseData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
