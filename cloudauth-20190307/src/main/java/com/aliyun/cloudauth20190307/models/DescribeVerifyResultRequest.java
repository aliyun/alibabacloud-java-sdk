// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39ecf51e-2f81-4dc5-90ee-ff86125b****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FVBioOnlyTest</p>
     */
    @NameInMap("BizType")
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
