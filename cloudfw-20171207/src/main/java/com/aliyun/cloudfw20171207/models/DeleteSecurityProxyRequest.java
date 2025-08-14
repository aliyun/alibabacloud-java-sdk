// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteSecurityProxyRequest extends TeaModel {
    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
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
     * <p>proxy-nat00ab412ef93d4275a6b5</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    @NameInMap("trimSql")
    public String trimSql;

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

    public DeleteSecurityProxyRequest setTrimSql(String trimSql) {
        this.trimSql = trimSql;
        return this;
    }
    public String getTrimSql() {
        return this.trimSql;
    }

}
