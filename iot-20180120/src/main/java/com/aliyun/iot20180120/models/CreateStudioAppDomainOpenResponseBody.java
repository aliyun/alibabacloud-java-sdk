// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateStudioAppDomainOpenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateStudioAppDomainOpenResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateStudioAppDomainOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStudioAppDomainOpenResponseBody self = new CreateStudioAppDomainOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStudioAppDomainOpenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateStudioAppDomainOpenResponseBody setData(CreateStudioAppDomainOpenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateStudioAppDomainOpenResponseBodyData getData() {
        return this.data;
    }

    public CreateStudioAppDomainOpenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateStudioAppDomainOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStudioAppDomainOpenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateStudioAppDomainOpenResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("IsBeian")
        public String isBeian;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("TenantId")
        public String tenantId;

        public static CreateStudioAppDomainOpenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateStudioAppDomainOpenResponseBodyData self = new CreateStudioAppDomainOpenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateStudioAppDomainOpenResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateStudioAppDomainOpenResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateStudioAppDomainOpenResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public CreateStudioAppDomainOpenResponseBodyData setIsBeian(String isBeian) {
            this.isBeian = isBeian;
            return this;
        }
        public String getIsBeian() {
            return this.isBeian;
        }

        public CreateStudioAppDomainOpenResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateStudioAppDomainOpenResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateStudioAppDomainOpenResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
