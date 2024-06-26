// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeInviterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    public static DescribeInviterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInviterRequest self = new DescribeInviterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInviterRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
