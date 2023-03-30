// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthConsumerResourceRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ConsumerId")
    public Long consumerId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("PageNum")
    public String pageNum;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ResourceStatus")
    public Boolean resourceStatus;

    @NameInMap("RouteName")
    public String routeName;

    public static ListGatewayAuthConsumerResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthConsumerResourceRequest self = new ListGatewayAuthConsumerResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthConsumerResourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListGatewayAuthConsumerResourceRequest setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public Long getConsumerId() {
        return this.consumerId;
    }

    public ListGatewayAuthConsumerResourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public ListGatewayAuthConsumerResourceRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListGatewayAuthConsumerResourceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListGatewayAuthConsumerResourceRequest setResourceStatus(Boolean resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }
    public Boolean getResourceStatus() {
        return this.resourceStatus;
    }

    public ListGatewayAuthConsumerResourceRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

}
