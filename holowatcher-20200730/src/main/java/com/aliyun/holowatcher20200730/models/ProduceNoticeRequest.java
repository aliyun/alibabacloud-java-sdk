// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProduceNoticeRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("UserId")
    public Long userId;

    public static ProduceNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        ProduceNoticeRequest self = new ProduceNoticeRequest();
        return TeaModel.build(map, self);
    }

    public ProduceNoticeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ProduceNoticeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ProduceNoticeRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ProduceNoticeRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public ProduceNoticeRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
