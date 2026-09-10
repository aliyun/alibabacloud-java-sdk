// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SingleSqlDryRunRequest extends TeaModel {
    /**
     * <p>The data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>ds_demo</p>
     */
    @NameInMap("datasourceName")
    public String datasourceName;

    /**
     * <p>The SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT id, name FROM src_table WHERE ds = \&quot;20260116\&quot;</p>
     */
    @NameInMap("sql")
    public String sql;

    public static SingleSqlDryRunRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleSqlDryRunRequest self = new SingleSqlDryRunRequest();
        return TeaModel.build(map, self);
    }

    public SingleSqlDryRunRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public SingleSqlDryRunRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
