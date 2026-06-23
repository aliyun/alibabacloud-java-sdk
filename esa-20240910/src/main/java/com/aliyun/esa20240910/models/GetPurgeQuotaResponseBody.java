// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPurgeQuotaResponseBody extends TeaModel {
    /**
     * <p>The total quota.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("Quota")
    public String quota;

    /**
     * <p>The total quota at 30-day granularity. A value of 0 indicates that this quota is not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>200000</p>
     */
    @NameInMap("Quota30Day")
    public String quota30Day;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The used quota.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Usage")
    public String usage;

    /**
     * <p>The used quota at 30-day granularity.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Usage30Day")
    public String usage30Day;

    public static GetPurgeQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPurgeQuotaResponseBody self = new GetPurgeQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPurgeQuotaResponseBody setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public GetPurgeQuotaResponseBody setQuota30Day(String quota30Day) {
        this.quota30Day = quota30Day;
        return this;
    }
    public String getQuota30Day() {
        return this.quota30Day;
    }

    public GetPurgeQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPurgeQuotaResponseBody setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public GetPurgeQuotaResponseBody setUsage30Day(String usage30Day) {
        this.usage30Day = usage30Day;
        return this;
    }
    public String getUsage30Day() {
        return this.usage30Day;
    }

}
