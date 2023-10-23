// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class TransferStorageOrderRequest extends TeaModel {
    @NameInMap("DstIotId")
    public String dstIotId;

    @NameInMap("EnableDefaultPlan")
    public Boolean enableDefaultPlan;

    @NameInMap("EventRecordDuration")
    public Integer eventRecordDuration;

    @NameInMap("EventRecordProlong")
    public Boolean eventRecordProlong;

    @NameInMap("ImmediateUse")
    public Boolean immediateUse;

    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    @NameInMap("SrcIotId")
    public String srcIotId;

    @NameInMap("SrcOrderId")
    public String srcOrderId;

    @NameInMap("SupportCrossIdentityTransfer")
    public Boolean supportCrossIdentityTransfer;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    public static TransferStorageOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferStorageOrderRequest self = new TransferStorageOrderRequest();
        return TeaModel.build(map, self);
    }

    public TransferStorageOrderRequest setDstIotId(String dstIotId) {
        this.dstIotId = dstIotId;
        return this;
    }
    public String getDstIotId() {
        return this.dstIotId;
    }

    public TransferStorageOrderRequest setEnableDefaultPlan(Boolean enableDefaultPlan) {
        this.enableDefaultPlan = enableDefaultPlan;
        return this;
    }
    public Boolean getEnableDefaultPlan() {
        return this.enableDefaultPlan;
    }

    public TransferStorageOrderRequest setEventRecordDuration(Integer eventRecordDuration) {
        this.eventRecordDuration = eventRecordDuration;
        return this;
    }
    public Integer getEventRecordDuration() {
        return this.eventRecordDuration;
    }

    public TransferStorageOrderRequest setEventRecordProlong(Boolean eventRecordProlong) {
        this.eventRecordProlong = eventRecordProlong;
        return this;
    }
    public Boolean getEventRecordProlong() {
        return this.eventRecordProlong;
    }

    public TransferStorageOrderRequest setImmediateUse(Boolean immediateUse) {
        this.immediateUse = immediateUse;
        return this;
    }
    public Boolean getImmediateUse() {
        return this.immediateUse;
    }

    public TransferStorageOrderRequest setPreRecordDuration(Integer preRecordDuration) {
        this.preRecordDuration = preRecordDuration;
        return this;
    }
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    public TransferStorageOrderRequest setSrcIotId(String srcIotId) {
        this.srcIotId = srcIotId;
        return this;
    }
    public String getSrcIotId() {
        return this.srcIotId;
    }

    public TransferStorageOrderRequest setSrcOrderId(String srcOrderId) {
        this.srcOrderId = srcOrderId;
        return this;
    }
    public String getSrcOrderId() {
        return this.srcOrderId;
    }

    public TransferStorageOrderRequest setSupportCrossIdentityTransfer(Boolean supportCrossIdentityTransfer) {
        this.supportCrossIdentityTransfer = supportCrossIdentityTransfer;
        return this;
    }
    public Boolean getSupportCrossIdentityTransfer() {
        return this.supportCrossIdentityTransfer;
    }

    public TransferStorageOrderRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public TransferStorageOrderRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
