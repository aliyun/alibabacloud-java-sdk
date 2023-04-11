// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyResponseBody extends TeaModel {
    /**
     * <p>The ID of the user who enabled the secure access proxy feature.</p>
     */
    @NameInMap("CreatorId")
    public Long creatorId;

    /**
     * <p>The nickname of the user who enabled the secure access proxy feature.</p>
     */
    @NameInMap("CreatorName")
    public String creatorName;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The port number used by the HTTPS protocol.</p>
     */
    @NameInMap("HttpsPort")
    public Integer httpsPort;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>Indicates whether the internal endpoint was enabled. Default value: **true**.</p>
     */
    @NameInMap("PrivateEnable")
    public Boolean privateEnable;

    /**
     * <p>The internal endpoint.</p>
     */
    @NameInMap("PrivateHost")
    public String privateHost;

    /**
     * <p>The port number used by the protocol.</p>
     */
    @NameInMap("ProtocolPort")
    public Integer protocolPort;

    /**
     * <p>The protocol type of the database. Example: MYSQL.</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The ID of the secure access proxy.</p>
     */
    @NameInMap("ProxyId")
    public Long proxyId;

    /**
     * <p>Indicates whether the public endpoint was enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: The public endpoint was enabled.</p>
     * <p>*   **false**: The public endpoint was disabled.</p>
     */
    @NameInMap("PublicEnable")
    public Boolean publicEnable;

    /**
     * <p>The public endpoint. A public endpoint is returned no matter whether the public endpoint is enabled or disabled.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the value of the PublicEnable parameter is **true**, a valid public endpoint that can be resolved by using Alibaba Cloud DNS is returned.</p>
     * <br>
     * <p>*   If the value of the PublicEnable parameter is **false**, an invalid public endpoint that cannot be resolved by using Alibaba Cloud DNS is returned.</p>
     */
    @NameInMap("PublicHost")
    public String publicHost;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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

    public GetProxyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
