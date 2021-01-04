// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateCcRouteRulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("RouteList")
    public String routeList;

    public static CreateCcRouteRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCcRouteRulesRequest self = new CreateCcRouteRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateCcRouteRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateCcRouteRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateCcRouteRulesRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public CreateCcRouteRulesRequest setRouteList(String routeList) {
        this.routeList = routeList;
        return this;
    }
    public String getRouteList() {
        return this.routeList;
    }

}
