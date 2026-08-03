// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The list of workspace API keys.</p>
     */
    @NameInMap("Apikeys")
    public java.util.List<GetWorkspaceResponseBodyApikeys> apikeys;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-01T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of service details.</p>
     */
    @NameInMap("Services")
    public java.util.List<GetWorkspaceResponseBodyServices> services;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-first-workspace</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setApikeys(java.util.List<GetWorkspaceResponseBodyApikeys> apikeys) {
        this.apikeys = apikeys;
        return this;
    }
    public java.util.List<GetWorkspaceResponseBodyApikeys> getApikeys() {
        return this.apikeys;
    }

    public GetWorkspaceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceResponseBody setServices(java.util.List<GetWorkspaceResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<GetWorkspaceResponseBodyServices> getServices() {
        return this.services;
    }

    public GetWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetWorkspaceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class GetWorkspaceResponseBodyApikeysAuthServices extends TeaModel {
        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-xxxxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li>memory</li>
         * <li>drama</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        public static GetWorkspaceResponseBodyApikeysAuthServices build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyApikeysAuthServices self = new GetWorkspaceResponseBodyApikeysAuthServices();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyApikeysAuthServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetWorkspaceResponseBodyApikeysAuthServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

    public static class GetWorkspaceResponseBodyApikeys extends TeaModel {
        /**
         * <p>The service ID.</p>
         */
        @NameInMap("AuthServices")
        public java.util.List<GetWorkspaceResponseBodyApikeysAuthServices> authServices;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>Sat Mar 14 14:44:27 GMT+08:00 2026</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>my test key</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxxxx</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The name of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>my test key</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>The prefix of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-1235*****</p>
         */
        @NameInMap("KeyPrefix")
        public String keyPrefix;

        public static GetWorkspaceResponseBodyApikeys build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyApikeys self = new GetWorkspaceResponseBodyApikeys();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyApikeys setAuthServices(java.util.List<GetWorkspaceResponseBodyApikeysAuthServices> authServices) {
            this.authServices = authServices;
            return this;
        }
        public java.util.List<GetWorkspaceResponseBodyApikeysAuthServices> getAuthServices() {
            return this.authServices;
        }

        public GetWorkspaceResponseBodyApikeys setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWorkspaceResponseBodyApikeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkspaceResponseBodyApikeys setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public GetWorkspaceResponseBodyApikeys setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public GetWorkspaceResponseBodyApikeys setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

    }

    public static class GetWorkspaceResponseBodyServices extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-01T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The compute resource.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-21T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The billing type. Valid values:</p>
         * <ul>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * <li><strong>PREPAY</strong>: subscription.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not specified, the default value is pay-as-you-go.</li>
         * <li>In subscription billing mode, a discount is available when you purchase a duration of one year or longer. Select a billing type as needed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-xxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-xxx</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li><strong>memory</strong></li>
         * <li><strong>drama</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The service status. Valid values:</p>
         * <ul>
         * <li>creating: being created.</li>
         * <li>active: running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetWorkspaceResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyServices self = new GetWorkspaceResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWorkspaceResponseBodyServices setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public GetWorkspaceResponseBodyServices setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetWorkspaceResponseBodyServices setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetWorkspaceResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetWorkspaceResponseBodyServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetWorkspaceResponseBodyServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetWorkspaceResponseBodyServices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
