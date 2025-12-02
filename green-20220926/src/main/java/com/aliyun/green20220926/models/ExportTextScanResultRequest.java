// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportTextScanResultRequest extends TeaModel {
    /**
     * <p>End time of the query, in the format yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-11 10:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Query conditions.</p>
     */
    @NameInMap("Query")
    public java.util.Map<String, String> query;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Start time of the query, in the format yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-10 10:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static ExportTextScanResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportTextScanResultRequest self = new ExportTextScanResultRequest();
        return TeaModel.build(map, self);
    }

    public ExportTextScanResultRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportTextScanResultRequest setQuery(java.util.Map<String, String> query) {
        this.query = query;
        return this;
    }
    public java.util.Map<String, String> getQuery() {
        return this.query;
    }

    public ExportTextScanResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportTextScanResultRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
