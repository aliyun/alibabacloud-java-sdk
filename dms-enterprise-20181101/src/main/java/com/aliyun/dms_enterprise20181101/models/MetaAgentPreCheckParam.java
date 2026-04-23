// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MetaAgentPreCheckParam extends TeaModel {
    @NameInMap("DbIds")
    public String dbIds;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Supplement")
    public String supplement;

    @NameInMap("TableNames")
    public String tableNames;

    public static MetaAgentPreCheckParam build(java.util.Map<String, ?> map) throws Exception {
        MetaAgentPreCheckParam self = new MetaAgentPreCheckParam();
        return TeaModel.build(map, self);
    }

    public MetaAgentPreCheckParam setDbIds(String dbIds) {
        this.dbIds = dbIds;
        return this;
    }
    public String getDbIds() {
        return this.dbIds;
    }

    public MetaAgentPreCheckParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MetaAgentPreCheckParam setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public MetaAgentPreCheckParam setSupplement(String supplement) {
        this.supplement = supplement;
        return this;
    }
    public String getSupplement() {
        return this.supplement;
    }

    public MetaAgentPreCheckParam setTableNames(String tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public String getTableNames() {
        return this.tableNames;
    }

}
