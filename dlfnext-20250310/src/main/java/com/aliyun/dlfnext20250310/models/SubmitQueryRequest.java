// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class SubmitQueryRequest extends TeaModel {
    /**
     * <p>The default catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>test_catalog</p>
     */
    @NameInMap("defaultCatalog")
    public String defaultCatalog;

    /**
     * <p>The default database.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("defaultDatabase")
    public String defaultDatabase;

    /**
     * <p>The limit on the number of returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The SQL text. Multiple statements separated by semicolons are supported and executed sequentially within the same session.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from table_name;</p>
     */
    @NameInMap("sql")
    public String sql;

    /**
     * <p>The execution specifications. Default value: standard.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("tier")
    public String tier;

    public static SubmitQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQueryRequest self = new SubmitQueryRequest();
        return TeaModel.build(map, self);
    }

    public SubmitQueryRequest setDefaultCatalog(String defaultCatalog) {
        this.defaultCatalog = defaultCatalog;
        return this;
    }
    public String getDefaultCatalog() {
        return this.defaultCatalog;
    }

    public SubmitQueryRequest setDefaultDatabase(String defaultDatabase) {
        this.defaultDatabase = defaultDatabase;
        return this;
    }
    public String getDefaultDatabase() {
        return this.defaultDatabase;
    }

    public SubmitQueryRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SubmitQueryRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public SubmitQueryRequest setTier(String tier) {
        this.tier = tier;
        return this;
    }
    public String getTier() {
        return this.tier;
    }

}
