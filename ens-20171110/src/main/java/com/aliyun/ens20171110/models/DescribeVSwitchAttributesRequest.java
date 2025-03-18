// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static DescribeVSwitchAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchAttributesRequest self = new DescribeVSwitchAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchAttributesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
