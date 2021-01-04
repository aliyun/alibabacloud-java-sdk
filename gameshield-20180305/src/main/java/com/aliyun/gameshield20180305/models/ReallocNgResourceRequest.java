// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class ReallocNgResourceRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CcQps")
    public Integer ccQps;

    public static ReallocNgResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReallocNgResourceRequest self = new ReallocNgResourceRequest();
        return TeaModel.build(map, self);
    }

    public ReallocNgResourceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ReallocNgResourceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ReallocNgResourceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ReallocNgResourceRequest setCcQps(Integer ccQps) {
        this.ccQps = ccQps;
        return this;
    }
    public Integer getCcQps() {
        return this.ccQps;
    }

}
