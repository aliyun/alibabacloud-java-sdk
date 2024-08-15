// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("notFilterRouteRuleDeleted")
    public Boolean notFilterRouteRuleDeleted;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("routeType")
    public Long routeType;

    /**
     * <strong>example:</strong>
     * <p>规则名字</p>
     */
    @NameInMap("ruleName")
    public byte[] ruleName;

    /**
     * <strong>example:</strong>
     * <p>冲上云霄</p>
     */
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
