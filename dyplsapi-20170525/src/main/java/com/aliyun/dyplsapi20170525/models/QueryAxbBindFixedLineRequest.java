// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxbBindFixedLineRequest extends TeaModel {
    /**
     * <p>应用id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALPT_1234</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>业务id，消息请求标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3ererrrdrrrr</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A/B号码，queryType=1时，必传</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>查询类型 0：根据绑定id查询 1：根据X和A/B号码查询</p>
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
     * <p>绑定id， queryType=0时，必传</p>
     * 
     * <strong>example:</strong>
     * <p>A20304o0200303004j</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>x号码，queryType=1时，必传</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("TelX")
    public String telX;

    /**
     * <p>格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116001</p>
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
