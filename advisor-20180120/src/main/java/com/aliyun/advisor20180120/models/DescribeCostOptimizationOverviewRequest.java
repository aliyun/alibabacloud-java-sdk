// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostOptimizationOverviewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11***********35</p>
     */
    @NameInMap("AssumeAliyunId")
    public Long assumeAliyunId;

    @NameInMap("AssumeAliyunIdList")
    public java.util.List<Long> assumeAliyunIdList;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeCostOptimizationOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostOptimizationOverviewRequest self = new DescribeCostOptimizationOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostOptimizationOverviewRequest setAssumeAliyunId(Long assumeAliyunId) {
        this.assumeAliyunId = assumeAliyunId;
        return this;
    }
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    public DescribeCostOptimizationOverviewRequest setAssumeAliyunIdList(java.util.List<Long> assumeAliyunIdList) {
        this.assumeAliyunIdList = assumeAliyunIdList;
        return this;
    }
    public java.util.List<Long> getAssumeAliyunIdList() {
        return this.assumeAliyunIdList;
    }

    public DescribeCostOptimizationOverviewRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
