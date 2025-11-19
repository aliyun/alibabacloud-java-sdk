// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RegisterServiceInput extends TeaModel {
    /**
     * <p>关联的凭证ID，用于服务认证</p>
     * 
     * <strong>example:</strong>
     * <p>my-credential</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>服务的协议类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>关联的资源名称</p>
     * 
     * <strong>example:</strong>
     * <p>my-resource</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>转发的下游服务端点URL，必须是有效的HTTP/HTTPS地址（这里是 FC trigger endpoint）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://123456789.cn-hangzhou.fc.aliyuncs.com/2016-08-15/proxy/my-service/my-function/">https://123456789.cn-hangzhou.fc.aliyuncs.com/2016-08-15/proxy/my-service/my-function/</a></p>
     */
    @NameInMap("serviceBackendEndpoint")
    public String serviceBackendEndpoint;

    /**
     * <p>服务名称，在租户内唯一</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-service</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>服务类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <p>租户ID，用于多租户隔离</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static RegisterServiceInput build(java.util.Map<String, ?> map) throws Exception {
        RegisterServiceInput self = new RegisterServiceInput();
        return TeaModel.build(map, self);
    }

    public RegisterServiceInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public RegisterServiceInput setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public RegisterServiceInput setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public RegisterServiceInput setServiceBackendEndpoint(String serviceBackendEndpoint) {
        this.serviceBackendEndpoint = serviceBackendEndpoint;
        return this;
    }
    public String getServiceBackendEndpoint() {
        return this.serviceBackendEndpoint;
    }

    public RegisterServiceInput setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RegisterServiceInput setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public RegisterServiceInput setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
