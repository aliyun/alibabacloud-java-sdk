// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class SwitchSecurityProxyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>This parameter is required.</p>
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
