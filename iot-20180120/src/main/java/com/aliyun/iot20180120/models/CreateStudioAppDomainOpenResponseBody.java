// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateStudioAppDomainOpenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateStudioAppDomainOpenResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>a12******</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.test.com">www.aliyun.test.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>1573</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("IsBeian")
        public String isBeian;

        /**
         * <strong>example:</strong>
         * <p>a12*******</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>C70B541046F64EAABE3*******</p>
         */
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
