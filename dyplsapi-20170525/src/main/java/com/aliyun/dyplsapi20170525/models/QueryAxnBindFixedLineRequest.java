// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxnBindFixedLineRequest extends TeaModel {
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
     * <p>The A/B phone number. This parameter is required when QueryType is set to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>138****6534</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The query type. Valid values:</p>
     * <ul>
     * <li><p>0: query by binding ID.</p>
     * </li>
     * <li><p>1: query by X and A/B phone number.</p>
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
     * <p>The binding ID. This parameter is required when QueryType is set to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>A203**************</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>The X phone number. This parameter is required when QueryType is set to 1.</p>
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

    public static QueryAxnBindFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAxnBindFixedLineRequest self = new QueryAxnBindFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public QueryAxnBindFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryAxnBindFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAxnBindFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryAxnBindFixedLineRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public QueryAxnBindFixedLineRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryAxnBindFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryAxnBindFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryAxnBindFixedLineRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public QueryAxnBindFixedLineRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public QueryAxnBindFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
