// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayDomain extends TeaModel {
    /**
     * <p>The ID of the certificate in use.</p>
     * 
     * <strong>example:</strong>
     * <p>595xx36-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The name of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GatewayName")
    public String gatewayName;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-c9bc5afd61014165bd58f621b491****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The time when the gateway was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-31 10:16:46</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the gateway was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-11 15:28:47</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Indicates whether HTTPS is forcibly used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MustHttps")
    public String mustHttps;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The domain protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    public static GatewayDomain build(java.util.Map<String, ?> map) throws Exception {
        GatewayDomain self = new GatewayDomain();
        return TeaModel.build(map, self);
    }

    public GatewayDomain setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public GatewayDomain setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public GatewayDomain setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public GatewayDomain setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public GatewayDomain setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GatewayDomain setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GatewayDomain setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GatewayDomain setMustHttps(String mustHttps) {
        this.mustHttps = mustHttps;
        return this;
    }
    public String getMustHttps() {
        return this.mustHttps;
    }

    public GatewayDomain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GatewayDomain setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
