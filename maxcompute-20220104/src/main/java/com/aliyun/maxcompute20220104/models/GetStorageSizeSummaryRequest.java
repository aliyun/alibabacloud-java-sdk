// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageSizeSummaryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20241205</p>
     */
    @NameInMap("date")
    public String date;

    /**
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>483212237127906</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetStorageSizeSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageSizeSummaryRequest self = new GetStorageSizeSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageSizeSummaryRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetStorageSizeSummaryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetStorageSizeSummaryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
