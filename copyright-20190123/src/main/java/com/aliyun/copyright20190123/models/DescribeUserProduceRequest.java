// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DescribeUserProduceRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExtInfo")
    public String extInfo;

    public static DescribeUserProduceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProduceRequest self = new DescribeUserProduceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserProduceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeUserProduceRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeUserProduceRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
