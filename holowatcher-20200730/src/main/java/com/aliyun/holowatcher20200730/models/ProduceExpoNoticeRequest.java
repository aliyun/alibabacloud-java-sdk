// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProduceExpoNoticeRequest extends TeaModel {
    // A short description of struct
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("UserId")
    public Long userId;

    public static ProduceExpoNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        ProduceExpoNoticeRequest self = new ProduceExpoNoticeRequest();
        return TeaModel.build(map, self);
    }

    public ProduceExpoNoticeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ProduceExpoNoticeRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ProduceExpoNoticeRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public ProduceExpoNoticeRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
