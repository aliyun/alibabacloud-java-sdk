// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 第几页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 页的大小
    @NameInMap("pageSize")
    public Integer pageSize;

    // 路由类型：0触发事件 1仅触发报警 r
    @NameInMap("routeType")
    public Long routeType;

    // 规则名称
    @NameInMap("ruleName")
    public byte[] ruleName;

    // 服务名称
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
