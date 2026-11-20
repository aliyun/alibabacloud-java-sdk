// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxnExtensionBindFixedLineRequest extends TeaModel {
    /**
     * <p>The ID of the number pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC10000016848****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The unique identifier of the message request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123*******</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The query type. Valid values:</p>
     * <ul>
     * <li><p>0: query by binding ID.</p>
     * </li>
     * <li><p>1: query by X and A/B numbers.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The binding ID. This parameter is required when QueryType is set to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>A203**************</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>The number A. This parameter is required when QueryType is set to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>155****1111</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>The business timestamp. Format: yyyyMMddHHmmssSSS. The time is in UTC+8, in 24-hour format, accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116123</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static QueryAxnExtensionBindFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAxnExtensionBindFixedLineRequest self = new QueryAxnExtensionBindFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public QueryAxnExtensionBindFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryAxnExtensionBindFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAxnExtensionBindFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryAxnExtensionBindFixedLineRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryAxnExtensionBindFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryAxnExtensionBindFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryAxnExtensionBindFixedLineRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public QueryAxnExtensionBindFixedLineRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public QueryAxnExtensionBindFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
