// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageAmountSummaryRequest extends TeaModel {
    /**
     * <p>The date for which the statistics are collected. The statistics are collected on a daily basis. Specify the date in the YYYYMMDD format.</p>
     * 
     * <strong>example:</strong>
     * <p>20241205</p>
     */
    @NameInMap("date")
    public String date;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The tenant ID. You can log on to the MaxCompute console and choose <strong>Tenant Management</strong> &gt; <strong>Tenant Properties</strong> in the navigation pane on the left to view the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>478403690625249</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetStorageAmountSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageAmountSummaryRequest self = new GetStorageAmountSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageAmountSummaryRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetStorageAmountSummaryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetStorageAmountSummaryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
