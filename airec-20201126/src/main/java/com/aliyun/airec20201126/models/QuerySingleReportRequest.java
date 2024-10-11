// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QuerySingleReportRequest extends TeaModel {
    /**
     * <p>The type of the single table report. This parameter is required.</p>
     * <p>Valid values: typeItemValidScene,</p>
     * <p>typeItemTag,</p>
     * <p>typeItemTagScene,</p>
     * <p>typeItemWeightScene,</p>
     * <p>typeItemRawScene, and</p>
     * <p>typeItemExpireScene</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>typeItemTagScene</p>
     */
    @NameInMap("reportType")
    public String reportType;

    public static QuerySingleReportRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleReportRequest self = new QuerySingleReportRequest();
        return TeaModel.build(map, self);
    }

    public QuerySingleReportRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

}
