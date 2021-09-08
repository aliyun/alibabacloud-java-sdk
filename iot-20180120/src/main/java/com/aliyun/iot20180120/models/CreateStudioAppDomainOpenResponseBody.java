// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateStudioAppDomainOpenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public CreateStudioAppDomainOpenResponseBodyData data;

    public static CreateStudioAppDomainOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStudioAppDomainOpenResponseBody self = new CreateStudioAppDomainOpenResponseBody();
        return TeaModel.build(map, self);
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

    public CreateStudioAppDomainOpenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateStudioAppDomainOpenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateStudioAppDomainOpenResponseBody setData(CreateStudioAppDomainOpenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateStudioAppDomainOpenResponseBodyData getData() {
        return this.data;
    }

    public static class CreateStudioAppDomainOpenResponseBodyData extends TeaModel {
        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("IsBeian")
        public String isBeian;

        @NameInMap("Protocol")
        public String protocol;

        public static CreateStudioAppDomainOpenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateStudioAppDomainOpenResponseBodyData self = new CreateStudioAppDomainOpenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateStudioAppDomainOpenResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateStudioAppDomainOpenResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateStudioAppDomainOpenResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
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

        public CreateStudioAppDomainOpenResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
