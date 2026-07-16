// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRuleMetadataRequest extends TeaModel {
    /**
     * <p>The name of the metadata.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa_condition_region_config_en</p>
     */
    @NameInMap("MetaName")
    public String metaName;

    public static DescribeRuleMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleMetadataRequest self = new DescribeRuleMetadataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleMetadataRequest setMetaName(String metaName) {
        this.metaName = metaName;
        return this;
    }
    public String getMetaName() {
        return this.metaName;
    }

}
