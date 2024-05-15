// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteSecurityProxyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    public static DeleteSecurityProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityProxyRequest self = new DeleteSecurityProxyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityProxyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteSecurityProxyRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

}
