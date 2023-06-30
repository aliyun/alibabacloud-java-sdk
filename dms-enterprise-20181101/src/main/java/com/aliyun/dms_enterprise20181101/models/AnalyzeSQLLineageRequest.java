// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AnalyzeSQLLineageRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("SqlContent")
    public String sqlContent;

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
