// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetResolveCountSummaryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TimeSpan")
    public Integer timeSpan;

    public static GetResolveCountSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResolveCountSummaryRequest self = new GetResolveCountSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetResolveCountSummaryRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetResolveCountSummaryRequest setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }
    public Integer getTimeSpan() {
        return this.timeSpan;
    }

}
