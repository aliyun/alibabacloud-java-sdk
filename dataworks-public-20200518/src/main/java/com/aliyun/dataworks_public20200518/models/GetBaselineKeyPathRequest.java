// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineKeyPathRequest extends TeaModel {
    /**
     * <p>The name of the event.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The ID of the event.</p>
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
