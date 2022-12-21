// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyResponseBody extends TeaModel {
    // The ID of the user who enabled the secure access proxy feature.
    @NameInMap("CreatorId")
    public Long creatorId;

    // The nickname of the user who enabled the secure access proxy feature.
    @NameInMap("CreatorName")
    public String creatorName;

    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The port that was used by HTTPS clients to connect to the database instance.
    @NameInMap("HttpsPort")
    public Integer httpsPort;

    // The ID of the database instance.
    @NameInMap("InstanceId")
    public Long instanceId;

    // Indicates whether the internal endpoint is enabled. Default value: **true**.
    @NameInMap("PrivateEnable")
    public Boolean privateEnable;

    // The internal endpoint.
    @NameInMap("PrivateHost")
    public String privateHost;

    @NameInMap("ProtocolPort")
    public Integer protocolPort;

    @NameInMap("ProtocolType")
    public String protocolType;

    // The ID of the secure access proxy.
    @NameInMap("ProxyId")
    public Long proxyId;

    // Indicates whether the public endpoint is enabled. Valid values:
    // 
    // - **true**: The public endpoint is enabled.
    // - **false**: The public endpoint is disabled.
    @NameInMap("PublicEnable")
    public Boolean publicEnable;

    // The public endpoint. A public endpoint is returned no matter whether the public endpoint is enabled or disabled.  
    // 
    // > - If the value of the PublicEnable parameter is **true**, a valid public endpoint that can be resolved by using Alibaba Cloud DNS (DNS) is returned.
    // - If the value of the PublicEnable parameter is **false**, an invalid public endpoint that cannot be resolved by using DNS is returned.
    @NameInMap("PublicHost")
    public String publicHost;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static GetProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProxyResponseBody self = new GetProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProxyResponseBody setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public GetProxyResponseBody setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public GetProxyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetProxyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetProxyResponseBody setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public Integer getHttpsPort() {
        return this.httpsPort;
    }

    public GetProxyResponseBody setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetProxyResponseBody setPrivateEnable(Boolean privateEnable) {
        this.privateEnable = privateEnable;
        return this;
    }
    public Boolean getPrivateEnable() {
        return this.privateEnable;
    }

    public GetProxyResponseBody setPrivateHost(String privateHost) {
        this.privateHost = privateHost;
        return this;
    }
    public String getPrivateHost() {
        return this.privateHost;
    }

    public GetProxyResponseBody setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }
    public Integer getProtocolPort() {
        return this.protocolPort;
    }

    public GetProxyResponseBody setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public GetProxyResponseBody setProxyId(Long proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public Long getProxyId() {
        return this.proxyId;
    }

    public GetProxyResponseBody setPublicEnable(Boolean publicEnable) {
        this.publicEnable = publicEnable;
        return this;
    }
    public Boolean getPublicEnable() {
        return this.publicEnable;
    }

    public GetProxyResponseBody setPublicHost(String publicHost) {
        this.publicHost = publicHost;
        return this;
    }
    public String getPublicHost() {
        return this.publicHost;
    }

    public GetProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProxyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
