// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthConsumerResourceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the consumer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ConsumerId")
    public Long consumerId;

    /**
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-3f97e2989c344f35ab3fd62b19f1****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public String pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The resource authorization status. Valid values:</p>
     * <ul>
     * <li>true: enabled</li>
     * <li>false: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceStatus")
    public Boolean resourceStatus;

    /**
     * <p>The name of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
