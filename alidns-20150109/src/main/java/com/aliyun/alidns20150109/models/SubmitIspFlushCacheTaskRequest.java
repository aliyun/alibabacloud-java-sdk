// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SubmitIspFlushCacheTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Isp")
    public java.util.List<String> isp;

    @NameInMap("Lang")
    public String lang;

    public static SubmitIspFlushCacheTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIspFlushCacheTaskRequest self = new SubmitIspFlushCacheTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIspFlushCacheTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitIspFlushCacheTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SubmitIspFlushCacheTaskRequest setIsp(java.util.List<String> isp) {
        this.isp = isp;
        return this;
    }
    public java.util.List<String> getIsp() {
        return this.isp;
    }

    public SubmitIspFlushCacheTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
