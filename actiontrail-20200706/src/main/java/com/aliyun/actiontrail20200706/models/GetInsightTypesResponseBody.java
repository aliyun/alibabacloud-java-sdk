// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetInsightTypesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;ApiCallRateInsight\&quot;: \&quot;Enable\&quot;, \&quot;ApiErrorRateInsight\&quot;: \&quot;Enable\&quot;, \&quot;IpInsight\&quot;: \&quot;Enable\&quot;, \&quot;AkInsight\&quot;: \&quot;Enable\&quot;}</p>
     */
    @NameInMap("InsightTypes")
    public java.util.Map<String, ?> insightTypes;

    /**
     * <strong>example:</strong>
     * <p>EC4A1F64-4927-5714-B205-5A0B16A2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInsightTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInsightTypesResponseBody self = new GetInsightTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInsightTypesResponseBody setInsightTypes(java.util.Map<String, ?> insightTypes) {
        this.insightTypes = insightTypes;
        return this;
    }
    public java.util.Map<String, ?> getInsightTypes() {
        return this.insightTypes;
    }

    public GetInsightTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
