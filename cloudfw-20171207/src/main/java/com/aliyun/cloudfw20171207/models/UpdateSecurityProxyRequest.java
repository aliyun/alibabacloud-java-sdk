// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateSecurityProxyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-natfdc73073e031****8e0d</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy_auto_heyuan</p>
     */
    @NameInMap("ProxyName")
    public String proxyName;

    /**
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
