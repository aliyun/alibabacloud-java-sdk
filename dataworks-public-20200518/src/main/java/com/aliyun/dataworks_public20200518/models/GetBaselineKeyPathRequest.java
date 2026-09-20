// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineKeyPathRequest extends TeaModel {
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
     * <p>The business date in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ UTC format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-07T00:00:00+0800</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The cycle number of the baseline instance. The value is 1 for a daily baseline. Valid values for an hourly baseline: [1,24\].</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InGroupId")
    public Integer inGroupId;

    public static GetBaselineKeyPathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineKeyPathRequest self = new GetBaselineKeyPathRequest();
        return TeaModel.build(map, self);
    }

    public GetBaselineKeyPathRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

    public GetBaselineKeyPathRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public GetBaselineKeyPathRequest setInGroupId(Integer inGroupId) {
        this.inGroupId = inGroupId;
        return this;
    }
    public Integer getInGroupId() {
        return this.inGroupId;
    }

}
