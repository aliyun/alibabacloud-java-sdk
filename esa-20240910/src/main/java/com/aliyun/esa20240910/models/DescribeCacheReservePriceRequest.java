// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCacheReservePriceRequest extends TeaModel {
    /**
     * <p>The cache reserve region.</p>
     * <ul>
     * <li><p>HK: Hong Kong (China)</p>
     * </li>
     * <li><p>CN: the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HK</p>
     */
    @NameInMap("CrRegion")
    public String crRegion;

    /**
     * <p>The purchase period. Unit: months.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The cache reserve specification. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>512000</p>
     */
    @NameInMap("QuotaGb")
    public Long quotaGb;

    public static DescribeCacheReservePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheReservePriceRequest self = new DescribeCacheReservePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCacheReservePriceRequest setCrRegion(String crRegion) {
        this.crRegion = crRegion;
        return this;
    }
    public String getCrRegion() {
        return this.crRegion;
    }

    public DescribeCacheReservePriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeCacheReservePriceRequest setQuotaGb(Long quotaGb) {
        this.quotaGb = quotaGb;
        return this;
    }
    public Long getQuotaGb() {
        return this.quotaGb;
    }

}
