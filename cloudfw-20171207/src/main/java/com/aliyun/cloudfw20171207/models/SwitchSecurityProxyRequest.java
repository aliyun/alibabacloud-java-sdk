// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class SwitchSecurityProxyRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
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
     * <p>proxy-natbf******</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>The security protection switch. Valid values:</p>
     * <ul>
     * <li><p>open: Enables security protection.</p>
     * </li>
     * <li><p>close: Disables security protection.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Switch")
    public String _switch;

    public static SwitchSecurityProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSecurityProxyRequest self = new SwitchSecurityProxyRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSecurityProxyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SwitchSecurityProxyRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public SwitchSecurityProxyRequest set_switch(String _switch) {
        this._switch = _switch;
        return this;
    }
    public String get_switch() {
        return this._switch;
    }

}
