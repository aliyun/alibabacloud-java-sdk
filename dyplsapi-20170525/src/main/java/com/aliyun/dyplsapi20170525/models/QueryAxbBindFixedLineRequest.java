// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxbBindFixedLineRequest extends TeaModel {
    /**
     * <p>The number pool ID.</p>
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
     * <p>The A/B number. Required when QueryType is set to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>138****6534</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The query type. Valid values:</p>
     * <ul>
     * <li><p>0: Query by binding ID.</p>
     * </li>
     * <li><p>1: Query by X and A/B numbers.</p>
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
     * <p>The binding ID. Required when QueryType is set to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>A203**************</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>The X number. Required when QueryType is set to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0571******23</p>
     */
    @NameInMap("TelX")
    public String telX;

    /**
     * <p>The business timestamp. Format: yyyyMMddHHmmssSSS. The time is in UTC+8, in 24-hour format, accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116123</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static QueryAxbBindFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAxbBindFixedLineRequest self = new QueryAxbBindFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public QueryAxbBindFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryAxbBindFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAxbBindFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryAxbBindFixedLineRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public QueryAxbBindFixedLineRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryAxbBindFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryAxbBindFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryAxbBindFixedLineRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public QueryAxbBindFixedLineRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public QueryAxbBindFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
