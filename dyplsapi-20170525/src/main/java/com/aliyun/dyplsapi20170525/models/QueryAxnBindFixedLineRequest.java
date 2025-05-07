// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxnBindFixedLineRequest extends TeaModel {
    /**
     * <p>业务id标识，由阿里云分配给客户侧</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alitest</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>消息请求唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A号码，queryType=1时，必传</p>
     * 
     * <strong>example:</strong>
     * <p>15500001111</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>查询类型 0：根据绑定id查询 1：根据A号码查询 2：根据X查询</p>
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
     * <p>绑定id queryType=0时，必传</p>
     * 
     * <strong>example:</strong>
     * <p>GHX0534X202504221531579290029-2-1-aliaxn</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>隐私号码</p>
     * 
     * <strong>example:</strong>
     * <p>05718950</p>
     */
    @NameInMap("TelX")
    public String telX;

    /**
     * <p>格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250421141723098</p>
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
