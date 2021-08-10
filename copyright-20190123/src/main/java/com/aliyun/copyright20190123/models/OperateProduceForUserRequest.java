// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class OperateProduceForUserRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("ExtInfo")
    public String extInfo;

    public static OperateProduceForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceForUserRequest self = new OperateProduceForUserRequest();
        return TeaModel.build(map, self);
    }

    public OperateProduceForUserRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public OperateProduceForUserRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateProduceForUserRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateProduceForUserRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
