// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultRequest extends TeaModel {
    /**
     * <p>The verification ID. A unique ID that identifies a verification task. The value can be up to 64 characters in length. For a single verification task, the system supports unlimited submissions until the verification is passed and the task is completed.</p>
     * <blockquote>
     * <p>Use a different BizId for each verification task.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39ecf51e-2f81-4dc5-90ee-ff86125b****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The business scenario identifier of the ID Verification service.</p>
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
