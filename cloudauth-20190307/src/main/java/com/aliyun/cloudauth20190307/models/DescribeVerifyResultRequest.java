// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultRequest extends TeaModel {
    /**
     * <p>Authentication ID. A unique ID that identifies an authentication task, not exceeding 64 characters. For a single authentication task, the system supports an unlimited number of submissions until the final authentication is successful and the task is completed. &gt; You need to use a different BizId for each new authentication task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39ecf51e-2f81-4dc5-90ee-ff86125b****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Business scenario identifier for real-person authentication service</p>
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
