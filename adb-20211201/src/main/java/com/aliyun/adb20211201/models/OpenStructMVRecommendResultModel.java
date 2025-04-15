// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMVRecommendResultModel extends TeaModel {
    @NameInMap("AcceleratedQueriesCount")
    public Long acceleratedQueriesCount;

    @NameInMap("BaseTables")
    public java.util.List<OpenStructMvBaseTableDetailModel> baseTables;

    @NameInMap("SavedScanbytes")
    public Long savedScanbytes;

    @NameInMap("Subquery")
    public String subquery;

    @NameInMap("SubqueryId")
    public Long subqueryId;

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
