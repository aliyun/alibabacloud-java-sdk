// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeAssetScopeRequest extends TeaModel {
    /**
     * <p>The ID of the asset scope to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1932</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DescribeAssetScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetScopeRequest self = new DescribeAssetScopeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetScopeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
