// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeMyCatDbListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SchemaUrl")
    @Validation(required = true)
    public String schemaUrl;

    @NameInMap("RuleUrl")
    @Validation(required = true)
    public String ruleUrl;

    public static DescribeMyCatDbListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyCatDbListRequest self = new DescribeMyCatDbListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMyCatDbListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMyCatDbListRequest setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }
    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public DescribeMyCatDbListRequest setRuleUrl(String ruleUrl) {
        this.ruleUrl = ruleUrl;
        return this;
    }
    public String getRuleUrl() {
        return this.ruleUrl;
    }

}
