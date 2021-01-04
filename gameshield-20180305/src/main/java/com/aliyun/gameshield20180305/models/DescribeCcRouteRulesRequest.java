// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcRouteRulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("RouteComment")
    public String routeComment;

    @NameInMap("RouteId")
    public String routeId;

    @NameInMap("RouteIp")
    public String routeIp;

    public static DescribeCcRouteRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcRouteRulesRequest self = new DescribeCcRouteRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCcRouteRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCcRouteRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCcRouteRulesRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public DescribeCcRouteRulesRequest setRouteComment(String routeComment) {
        this.routeComment = routeComment;
        return this;
    }
    public String getRouteComment() {
        return this.routeComment;
    }

    public DescribeCcRouteRulesRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public DescribeCcRouteRulesRequest setRouteIp(String routeIp) {
        this.routeIp = routeIp;
        return this;
    }
    public String getRouteIp() {
        return this.routeIp;
    }

}
