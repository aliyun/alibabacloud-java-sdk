// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetQpsStatsResponseBody extends TeaModel {
    /**
     * <p>The chart configurations.</p>
     */
    @NameInMap("Charts")
    public java.util.Map<String, ChartsValue> charts;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. It can be used to troubleshoot issues.</p>
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
