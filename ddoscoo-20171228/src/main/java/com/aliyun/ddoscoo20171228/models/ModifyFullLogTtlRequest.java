// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ModifyFullLogTtlRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyFullLogTtlRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullLogTtlRequest self = new ModifyFullLogTtlRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFullLogTtlRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyFullLogTtlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyFullLogTtlRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public ModifyFullLogTtlRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
