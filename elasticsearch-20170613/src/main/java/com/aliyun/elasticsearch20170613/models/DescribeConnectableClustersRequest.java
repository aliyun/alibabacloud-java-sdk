// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeConnectableClustersRequest extends TeaModel {
    /**
     * <p>The ID of the instance that can communicate with each other.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alreadySetItems")
    public Boolean alreadySetItems;

    public static DescribeConnectableClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectableClustersRequest self = new DescribeConnectableClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConnectableClustersRequest setAlreadySetItems(Boolean alreadySetItems) {
        this.alreadySetItems = alreadySetItems;
        return this;
    }
    public Boolean getAlreadySetItems() {
        return this.alreadySetItems;
    }

}
