// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMVRecommendResultModel extends TeaModel {
    /**
     * <p>The number of accelerated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("AcceleratedQueriesCount")
    public Long acceleratedQueriesCount;

    /**
     * <p>The base table associated with the subquery.</p>
     */
    @NameInMap("BaseTables")
    public java.util.List<OpenStructMvBaseTableDetailModel> baseTables;

    /**
     * <p>Estimated bytes scanned reduction by current materialized view from correlated parent queries (posterior calculation).</p>
     * 
     * <strong>example:</strong>
     * <p>321321223</p>
     */
    @NameInMap("SavedScanbytes")
    public Long savedScanbytes;

    /**
     * <p>The extracted public subquery.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM demo.tbl</p>
     */
    @NameInMap("Subquery")
    public String subquery;

    /**
     * <p>The ID of the subquery.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SubqueryId")
    public Long subqueryId;

    /**
     * <p>Whether the current subquery supports incremental refresh.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportIncrementalRefresh")
    public Boolean supportIncrementalRefresh;

    public static OpenStructMVRecommendResultModel build(java.util.Map<String, ?> map) throws Exception {
        OpenStructMVRecommendResultModel self = new OpenStructMVRecommendResultModel();
        return TeaModel.build(map, self);
    }

    public OpenStructMVRecommendResultModel setAcceleratedQueriesCount(Long acceleratedQueriesCount) {
        this.acceleratedQueriesCount = acceleratedQueriesCount;
        return this;
    }
    public Long getAcceleratedQueriesCount() {
        return this.acceleratedQueriesCount;
    }

    public OpenStructMVRecommendResultModel setBaseTables(java.util.List<OpenStructMvBaseTableDetailModel> baseTables) {
        this.baseTables = baseTables;
        return this;
    }
    public java.util.List<OpenStructMvBaseTableDetailModel> getBaseTables() {
        return this.baseTables;
    }

    public OpenStructMVRecommendResultModel setSavedScanbytes(Long savedScanbytes) {
        this.savedScanbytes = savedScanbytes;
        return this;
    }
    public Long getSavedScanbytes() {
        return this.savedScanbytes;
    }

    public OpenStructMVRecommendResultModel setSubquery(String subquery) {
        this.subquery = subquery;
        return this;
    }
    public String getSubquery() {
        return this.subquery;
    }

    public OpenStructMVRecommendResultModel setSubqueryId(Long subqueryId) {
        this.subqueryId = subqueryId;
        return this;
    }
    public Long getSubqueryId() {
        return this.subqueryId;
    }

    public OpenStructMVRecommendResultModel setSupportIncrementalRefresh(Boolean supportIncrementalRefresh) {
        this.supportIncrementalRefresh = supportIncrementalRefresh;
        return this;
    }
    public Boolean getSupportIncrementalRefresh() {
        return this.supportIncrementalRefresh;
    }

}
