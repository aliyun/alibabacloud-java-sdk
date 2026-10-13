// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetMetaCompareIncrementDbOverviewRequest extends TeaModel {
    /**
     * <p>The name of the catalog. In a multi-catalog environment, it is used to locate the catalog where the destination database resides.</p>
     * 
     * <strong>example:</strong>
     * <p>fluss_e2e_dlf_catalog</p>
     */
    @NameInMap("catalogName")
    public String catalogName;

    /**
     * <p>The name of the database for which you want to query incremental changes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_eaps</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <p>Specifies whether to return only summary statistics.</p>
     */
    @NameInMap("isSummary")
    public Boolean isSummary;

    /**
     * <p>The ID of the metadata comparison task, which is obtained from the return value of the create or save comparison task API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static GetMetaCompareIncrementDbOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCompareIncrementDbOverviewRequest self = new GetMetaCompareIncrementDbOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaCompareIncrementDbOverviewRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public GetMetaCompareIncrementDbOverviewRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetMetaCompareIncrementDbOverviewRequest setIsSummary(Boolean isSummary) {
        this.isSummary = isSummary;
        return this;
    }
    public Boolean getIsSummary() {
        return this.isSummary;
    }

    public GetMetaCompareIncrementDbOverviewRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
