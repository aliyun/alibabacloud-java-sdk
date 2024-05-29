// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthConsumerRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The status of the consumer. Valid values:</p>
     * <br>
     * <p>*   true: enabled</p>
     * <p>*   false: disabled</p>
     */
    @NameInMap("ConsumerStatus")
    public Boolean consumerStatus;

    /**
     * <p>The unique ID of the gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The name of the consumer.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNum")
    public String pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The authentication type. Valid values:</p>
     * <br>
     * <p>*   JWT</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListGatewayAuthConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthConsumerRequest self = new ListGatewayAuthConsumerRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthConsumerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListGatewayAuthConsumerRequest setConsumerStatus(Boolean consumerStatus) {
        this.consumerStatus = consumerStatus;
        return this;
    }
    public Boolean getConsumerStatus() {
        return this.consumerStatus;
    }

    public ListGatewayAuthConsumerRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public ListGatewayAuthConsumerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListGatewayAuthConsumerRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListGatewayAuthConsumerRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListGatewayAuthConsumerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
