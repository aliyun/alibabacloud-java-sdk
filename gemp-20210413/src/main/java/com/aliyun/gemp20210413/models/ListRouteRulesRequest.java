// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("notFilterRouteRuleDeleted")
    public Boolean notFilterRouteRuleDeleted;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("routeType")
    public Long routeType;

    @NameInMap("ruleName")
    public byte[] ruleName;

    @NameInMap("serviceName")
    public byte[] serviceName;

    public static ListRouteRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRulesRequest self = new ListRouteRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListRouteRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListRouteRulesRequest setNotFilterRouteRuleDeleted(Boolean notFilterRouteRuleDeleted) {
        this.notFilterRouteRuleDeleted = notFilterRouteRuleDeleted;
        return this;
    }
    public Boolean getNotFilterRouteRuleDeleted() {
        return this.notFilterRouteRuleDeleted;
    }

    public ListRouteRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRouteRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRouteRulesRequest setRouteType(Long routeType) {
        this.routeType = routeType;
        return this;
    }
    public Long getRouteType() {
        return this.routeType;
    }

    public ListRouteRulesRequest setRuleName(byte[] ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public byte[] getRuleName() {
        return this.ruleName;
    }

    public ListRouteRulesRequest setServiceName(byte[] serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public byte[] getServiceName() {
        return this.serviceName;
    }

}
