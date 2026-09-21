// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetKeylessServerRequest extends TeaModel {
    /**
     * <p>The CA certificate used to verify the server certificate of the Keyless server. This parameter takes effect only when Verify is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----****</p>
     */
    @NameInMap("CaCertificate")
    public String caCertificate;

    /**
     * <p>The client certificate. This parameter must be specified together with the client private key.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----****</p>
     */
    @NameInMap("ClientCertificate")
    public String clientCertificate;

    /**
     * <p>The client private key. This parameter must be specified together with the client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY-----****</p>
     */
    @NameInMap("ClientPrivateKey")
    public String clientPrivateKey;

    /**
     * <p>The hostname of the Keyless server. The value can be a domain name or an IP address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>keyless.example.com</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>Keyless server ID。</p>
     * 
     * <strong>example:</strong>
     * <p>baba39055622c008b90285a8838e****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the Keyless server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The port of the Keyless server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("Port")
    public Long port;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Specifies whether to verify the server certificate of the Keyless server. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verify")
    public Boolean verify;

    public static SetKeylessServerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetKeylessServerRequest self = new SetKeylessServerRequest();
        return TeaModel.build(map, self);
    }

    public SetKeylessServerRequest setCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }
    public String getCaCertificate() {
        return this.caCertificate;
    }

    public SetKeylessServerRequest setClientCertificate(String clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }
    public String getClientCertificate() {
        return this.clientCertificate;
    }

    public SetKeylessServerRequest setClientPrivateKey(String clientPrivateKey) {
        this.clientPrivateKey = clientPrivateKey;
        return this;
    }
    public String getClientPrivateKey() {
        return this.clientPrivateKey;
    }

    public SetKeylessServerRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public SetKeylessServerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetKeylessServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SetKeylessServerRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public SetKeylessServerRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public SetKeylessServerRequest setVerify(Boolean verify) {
        this.verify = verify;
        return this;
    }
    public Boolean getVerify() {
        return this.verify;
    }

}
