// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AnalyzeSQLLineageRequest extends TeaModel {
    /**
     * <p>The database ID.</p>
     * <br>
     * <p>>  You can call one of the [SearchDatabase](https://help.aliyun.com/document_detail/141876.html), [ListDatabases](https://help.aliyun.com/document_detail/141873.html), and [GetDatabase](https://help.aliyun.com/document_detail/141869.html) operations to obtain the database ID provided in the DatabaseId response parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>The SQL statement.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SqlContent")
    public String sqlContent;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>>  To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static AnalyzeSQLLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeSQLLineageRequest self = new AnalyzeSQLLineageRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeSQLLineageRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public AnalyzeSQLLineageRequest setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent;
        return this;
    }
    public String getSqlContent() {
        return this.sqlContent;
    }

    public AnalyzeSQLLineageRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
