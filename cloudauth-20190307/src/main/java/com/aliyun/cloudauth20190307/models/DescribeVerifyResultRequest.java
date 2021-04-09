// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("BizType")
    @Validation(required = true)
    public String bizType;

    public static DescribeVerifyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyResultRequest self = new DescribeVerifyResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyResultRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeVerifyResultRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
