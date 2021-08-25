// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class TransferResourceRequest extends TeaModel {
    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Token")
    public String token;

    @NameInMap("NeedCallback")
    public Boolean needCallback;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("SpecCode")
    public String specCode;

    @NameInMap("CurrentOwnerId")
    public Long currentOwnerId;

    @NameInMap("CurrentBuyerId")
    public Long currentBuyerId;

    @NameInMap("TransferTargetBuyerId")
    public Long transferTargetBuyerId;

    @NameInMap("TransferTargetOwnerId")
    public Long transferTargetOwnerId;

    public static TransferResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferResourceRequest self = new TransferResourceRequest();
        return TeaModel.build(map, self);
    }

    public TransferResourceRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public TransferResourceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public TransferResourceRequest setNeedCallback(Boolean needCallback) {
        this.needCallback = needCallback;
        return this;
    }
    public Boolean getNeedCallback() {
        return this.needCallback;
    }

    public TransferResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransferResourceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public TransferResourceRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public TransferResourceRequest setCurrentOwnerId(Long currentOwnerId) {
        this.currentOwnerId = currentOwnerId;
        return this;
    }
    public Long getCurrentOwnerId() {
        return this.currentOwnerId;
    }

    public TransferResourceRequest setCurrentBuyerId(Long currentBuyerId) {
        this.currentBuyerId = currentBuyerId;
        return this;
    }
    public Long getCurrentBuyerId() {
        return this.currentBuyerId;
    }

    public TransferResourceRequest setTransferTargetBuyerId(Long transferTargetBuyerId) {
        this.transferTargetBuyerId = transferTargetBuyerId;
        return this;
    }
    public Long getTransferTargetBuyerId() {
        return this.transferTargetBuyerId;
    }

    public TransferResourceRequest setTransferTargetOwnerId(Long transferTargetOwnerId) {
        this.transferTargetOwnerId = transferTargetOwnerId;
        return this;
    }
    public Long getTransferTargetOwnerId() {
        return this.transferTargetOwnerId;
    }

}
