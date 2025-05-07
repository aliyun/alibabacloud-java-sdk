// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxbBindFixedLineRequest extends TeaModel {
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
     * <p>消息请求标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>绑定id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A93IOELD93</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>业务时间戳，格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116001</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static DeleteAxbBindFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxbBindFixedLineRequest self = new DeleteAxbBindFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAxbBindFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAxbBindFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DeleteAxbBindFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAxbBindFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteAxbBindFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteAxbBindFixedLineRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public DeleteAxbBindFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
