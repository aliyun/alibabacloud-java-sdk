// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadCcRouteRulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    public static DownloadCcRouteRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadCcRouteRulesRequest self = new DownloadCcRouteRulesRequest();
        return TeaModel.build(map, self);
    }

    public DownloadCcRouteRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DownloadCcRouteRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DownloadCcRouteRulesRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

}
