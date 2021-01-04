// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcRouteRulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("Routelist")
    public String routelist;

    public static UpdateCcRouteRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcRouteRulesRequest self = new UpdateCcRouteRulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCcRouteRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateCcRouteRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateCcRouteRulesRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public UpdateCcRouteRulesRequest setRoutelist(String routelist) {
        this.routelist = routelist;
        return this;
    }
    public String getRoutelist() {
        return this.routelist;
    }

}
