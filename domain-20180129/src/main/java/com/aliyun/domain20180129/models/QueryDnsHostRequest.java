// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDnsHostRequest extends TeaModel {
    /**
     * <p>The ID of the domain name instance. Call the QueryDomainList API to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ST2017120814571100001303</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language for returned error messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The user\&quot;s IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDnsHostRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDnsHostRequest self = new QueryDnsHostRequest();
        return TeaModel.build(map, self);
    }

    public QueryDnsHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDnsHostRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryDnsHostRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
