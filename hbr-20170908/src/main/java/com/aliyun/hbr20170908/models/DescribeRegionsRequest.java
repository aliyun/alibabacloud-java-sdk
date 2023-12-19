// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to return detailed information. Default value: false.</p>
     */
    @NameInMap("NeedVaultCount")
    public Boolean needVaultCount;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setNeedVaultCount(Boolean needVaultCount) {
        this.needVaultCount = needVaultCount;
        return this;
    }
    public Boolean getNeedVaultCount() {
        return this.needVaultCount;
    }

}
