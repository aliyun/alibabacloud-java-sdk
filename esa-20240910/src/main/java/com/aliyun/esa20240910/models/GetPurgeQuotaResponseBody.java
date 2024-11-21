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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The quota usage.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Usage")
    public String usage;

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

}
