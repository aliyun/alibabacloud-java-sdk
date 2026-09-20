// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineStatusRequest extends TeaModel {
    /**
     * <p>The ID of the baseline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>The business date in UTC format (yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-07T00:00:00+0800</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The cycle number of the baseline instance. The value is 1 for daily baselines. The value ranges from [1,24\] for hourly baselines.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InGroupId")
    public Integer inGroupId;

    public static GetBaselineStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineStatusRequest self = new GetBaselineStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetBaselineStatusRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

    public GetBaselineStatusRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public GetBaselineStatusRequest setInGroupId(Integer inGroupId) {
        this.inGroupId = inGroupId;
        return this;
    }
    public Integer getInGroupId() {
        return this.inGroupId;
    }

}
