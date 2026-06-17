// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateSecurityProxyRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-natfdc73073e031****8e0d</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>The name of the NAT firewall. The name must be 4 to 50 characters long. It can contain letters, digits, Chinese characters, and underscores (<em>). The name cannot start with an underscore (</em>).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy_auto_heyuan</p>
     */
    @NameInMap("ProxyName")
    public String proxyName;

    /**
     * <p>Specifies whether to enable strict mode. Valid values:</p>
     * <ul>
     * <li><p>1: strict mode</p>
     * </li>
     * <li><p>0: loose mode</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StrictMode")
    public Integer strictMode;

    public static UpdateSecurityProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityProxyRequest self = new UpdateSecurityProxyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityProxyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateSecurityProxyRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public UpdateSecurityProxyRequest setProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }
    public String getProxyName() {
        return this.proxyName;
    }

    public UpdateSecurityProxyRequest setStrictMode(Integer strictMode) {
        this.strictMode = strictMode;
        return this;
    }
    public Integer getStrictMode() {
        return this.strictMode;
    }

}
