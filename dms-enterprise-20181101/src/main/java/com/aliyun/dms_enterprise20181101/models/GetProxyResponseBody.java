// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyResponseBody extends TeaModel {
    /**
     * <p>The ID of the user who enabled the secure access proxy feature.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("CreatorId")
    public Long creatorId;

    /**
     * <p>The nickname of the user who enabled the secure access proxy feature.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("CreatorName")
    public String creatorName;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The condition cannot be empty!</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The port number used by the HTTPS protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("HttpsPort")
    public Integer httpsPort;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>183****</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>Indicates whether the internal endpoint was enabled. Default value: <strong>true</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrivateEnable")
    public Boolean privateEnable;

    /**
     * <p>The internal endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>dphzmy-5j8oimjsz6ze****.proxy.dms.aliyuncs.com</p>
     */
    @NameInMap("PrivateHost")
    public String privateHost;

    /**
     * <p>The port number used by the protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("ProtocolPort")
    public Integer protocolPort;

    /**
     * <p>The protocol type of the database. Example: MYSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The ID of the secure access proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>4**</p>
     */
    @NameInMap("ProxyId")
    public Long proxyId;

    /**
     * <p>Indicates whether the public endpoint was enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The public endpoint was enabled.</li>
     * <li><strong>false</strong>: The public endpoint was disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicEnable")
    public Boolean publicEnable;

    /**
     * <p>The public endpoint. A public endpoint is returned no matter whether the public endpoint is enabled or disabled.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the value of the PublicEnable parameter is <strong>true</strong>, a valid public endpoint that can be resolved by using Alibaba Cloud DNS is returned.</p>
     * </li>
     * <li><p>If the value of the PublicEnable parameter is <strong>false</strong>, an invalid public endpoint that cannot be resolved by using Alibaba Cloud DNS is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dphzmy-5j8oimjsz6zed7k****.proxy.dms.aliyuncs.com</p>
     */
    @NameInMap("PublicHost")
    public String publicHost;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F49D4598-2B3C-5723-865E-2CCB818E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
