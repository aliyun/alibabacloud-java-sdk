// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member. This parameter takes effect only when a multi-account governance maturity check is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>176618589410****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationResultsRequest self = new ListEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListEvaluationResultsRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ListEvaluationResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
