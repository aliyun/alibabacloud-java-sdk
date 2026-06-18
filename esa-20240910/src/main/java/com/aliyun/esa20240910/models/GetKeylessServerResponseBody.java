// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKeylessServerResponseBody extends TeaModel {
    /**
     * <p>The CA certificate used to verify the server certificate of the keyless server. This parameter applies only when Verify is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----****</p>
     */
    @NameInMap("CaCertificate")
    public String caCertificate;

    /**
     * <p>The client certificate. Must be provided as a pair with the client private key.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----****</p>
     */
    @NameInMap("ClientCertificate")
    public String clientCertificate;

    /**
     * <p>The client private key. Must be provided as a pair with the client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY-----****</p>
     */
    @NameInMap("ClientPrivateKey")
    public String clientPrivateKey;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-11T01:23:21Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The hostname of the keyless server.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The keyless server ID.</p>
     * 
     * <strong>example:</strong>
     * <p>baba39055622c008b90285a8838e****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The keyless server name.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The port of the keyless server. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("Port")
    public Long port;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3558df77-8a7a-4060-a900-2d794940****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The site name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-13T02:13:28Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>Indicates whether to verify the server certificate of the keyless server. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verify")
    public Boolean verify;

    public static GetKeylessServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKeylessServerResponseBody self = new GetKeylessServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKeylessServerResponseBody setCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }
    public String getCaCertificate() {
        return this.caCertificate;
    }

    public GetKeylessServerResponseBody setClientCertificate(String clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }
    public String getClientCertificate() {
        return this.clientCertificate;
    }

    public GetKeylessServerResponseBody setClientPrivateKey(String clientPrivateKey) {
        this.clientPrivateKey = clientPrivateKey;
        return this;
    }
    public String getClientPrivateKey() {
        return this.clientPrivateKey;
    }

    public GetKeylessServerResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetKeylessServerResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetKeylessServerResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetKeylessServerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetKeylessServerResponseBody setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public GetKeylessServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKeylessServerResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetKeylessServerResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public GetKeylessServerResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetKeylessServerResponseBody setVerify(Boolean verify) {
        this.verify = verify;
        return this;
    }
    public Boolean getVerify() {
        return this.verify;
    }

}
