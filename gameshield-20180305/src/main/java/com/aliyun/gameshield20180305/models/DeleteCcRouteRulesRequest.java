// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DeleteCcRouteRulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("RouteIdList")
    public String routeIdList;

    public static DeleteCcRouteRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCcRouteRulesRequest self = new DeleteCcRouteRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCcRouteRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteCcRouteRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteCcRouteRulesRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public DeleteCcRouteRulesRequest setRouteIdList(String routeIdList) {
        this.routeIdList = routeIdList;
        return this;
    }
    public String getRouteIdList() {
        return this.routeIdList;
    }

}
