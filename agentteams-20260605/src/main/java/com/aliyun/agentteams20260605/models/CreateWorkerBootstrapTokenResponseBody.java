// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerBootstrapTokenResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public CreateWorkerBootstrapTokenResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-XX-XX-XX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cms-demo">https://cms-demo</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The license key.</p>
         * 
         * <strong>example:</strong>
         * <p>lk-xxx</p>
         */
        @NameInMap("LicenseKey")
        public String licenseKey;

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-demo</p>
         */
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
        /**
         * <p>The bootstrap token.</p>
         * 
         * <strong>example:</strong>
         * <p>bt-xxx</p>
         */
        @NameInMap("BootstrapToken")
        public String bootstrapToken;

        /**
         * <p>The CMS configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Cms")
        public CreateWorkerBootstrapTokenResponseBodyDataCms cms;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>inst-demo</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The Worker name.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>INTRANET</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The token fingerprint.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:xxx</p>
         */
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
