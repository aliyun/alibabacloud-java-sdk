// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeConnectableClustersRequest extends TeaModel {
    /**
     * <p>Specifies whether to return instances that are already connected. Valid values:</p>
     * <ul>
     * <li>true (default): The returned instance list includes instances that are already connected.</li>
     * <li>false: The returned instance list does not include instances that are already connected.</li>
     * </ul>
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
