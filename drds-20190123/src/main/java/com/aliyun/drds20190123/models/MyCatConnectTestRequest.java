// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class MyCatConnectTestRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SchemaUrl")
    @Validation(required = true)
    public String schemaUrl;

    @NameInMap("RuleUrl")
    @Validation(required = true)
    public String ruleUrl;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    public static MyCatConnectTestRequest build(java.util.Map<String, ?> map) throws Exception {
        MyCatConnectTestRequest self = new MyCatConnectTestRequest();
        return TeaModel.build(map, self);
    }

    public MyCatConnectTestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MyCatConnectTestRequest setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }
    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public MyCatConnectTestRequest setRuleUrl(String ruleUrl) {
        this.ruleUrl = ruleUrl;
        return this;
    }
    public String getRuleUrl() {
        return this.ruleUrl;
    }

    public MyCatConnectTestRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
