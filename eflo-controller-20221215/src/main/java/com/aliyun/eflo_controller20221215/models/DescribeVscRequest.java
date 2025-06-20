// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeVscRequest extends TeaModel {
    /**
     * <p>The VSC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-001</p>
     */
    @NameInMap("VscId")
    public String vscId;

    public static DescribeVscRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVscRequest self = new DescribeVscRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVscRequest setVscId(String vscId) {
        this.vscId = vscId;
        return this;
    }
    public String getVscId() {
        return this.vscId;
    }

}
