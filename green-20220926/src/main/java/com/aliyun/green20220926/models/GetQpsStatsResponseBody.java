// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetQpsStatsResponseBody extends TeaModel {
    /**
     * <p>The chart configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;cn-shanghai&quot;:{&quot;X&quot;:[&quot;20260701&quot;],&quot;Y&quot;:[{&quot;Name&quot;:&quot;cn-shanghai&quot;,&quot;Data&quot;:[10]}]}}</p>
     */
    @NameInMap("Charts")
    public java.util.Map<String, ChartsValue> charts;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetQpsStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQpsStatsResponseBody self = new GetQpsStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQpsStatsResponseBody setCharts(java.util.Map<String, ChartsValue> charts) {
        this.charts = charts;
        return this;
    }
    public java.util.Map<String, ChartsValue> getCharts() {
        return this.charts;
    }

    public GetQpsStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
