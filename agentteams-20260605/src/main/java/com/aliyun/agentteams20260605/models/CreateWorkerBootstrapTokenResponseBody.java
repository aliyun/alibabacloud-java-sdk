// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerBootstrapTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateWorkerBootstrapTokenResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateWorkerBootstrapTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkerBootstrapTokenResponseBody self = new CreateWorkerBootstrapTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkerBootstrapTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWorkerBootstrapTokenResponseBody setData(CreateWorkerBootstrapTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWorkerBootstrapTokenResponseBodyData getData() {
        return this.data;
    }

    public CreateWorkerBootstrapTokenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateWorkerBootstrapTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWorkerBootstrapTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkerBootstrapTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWorkerBootstrapTokenResponseBodyDataCms extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("LicenseKey")
        public String licenseKey;

        @NameInMap("Workspace")
        public String workspace;

        public static CreateWorkerBootstrapTokenResponseBodyDataCms build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerBootstrapTokenResponseBodyDataCms self = new CreateWorkerBootstrapTokenResponseBodyDataCms();
            return TeaModel.build(map, self);
        }

        public CreateWorkerBootstrapTokenResponseBodyDataCms setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateWorkerBootstrapTokenResponseBodyDataCms setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public CreateWorkerBootstrapTokenResponseBodyDataCms setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class CreateWorkerBootstrapTokenResponseBodyData extends TeaModel {
        @NameInMap("BootstrapToken")
        public String bootstrapToken;

        @NameInMap("Cms")
        public CreateWorkerBootstrapTokenResponseBodyDataCms cms;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("TokenFingerprint")
        public String tokenFingerprint;

        public static CreateWorkerBootstrapTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerBootstrapTokenResponseBodyData self = new CreateWorkerBootstrapTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWorkerBootstrapTokenResponseBodyData setBootstrapToken(String bootstrapToken) {
            this.bootstrapToken = bootstrapToken;
            return this;
        }
        public String getBootstrapToken() {
            return this.bootstrapToken;
        }

        public CreateWorkerBootstrapTokenResponseBodyData setCms(CreateWorkerBootstrapTokenResponseBodyDataCms cms) {
            this.cms = cms;
            return this;
        }
        public CreateWorkerBootstrapTokenResponseBodyDataCms getCms() {
            return this.cms;
        }

        public CreateWorkerBootstrapTokenResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateWorkerBootstrapTokenResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerBootstrapTokenResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public CreateWorkerBootstrapTokenResponseBodyData setTokenFingerprint(String tokenFingerprint) {
            this.tokenFingerprint = tokenFingerprint;
            return this;
        }
        public String getTokenFingerprint() {
            return this.tokenFingerprint;
        }

    }

}
