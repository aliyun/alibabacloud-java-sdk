// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsRequest extends TeaModel {
    @NameInMap("GroupByKey")
    public String groupByKey;

    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    @NameInMap("MemberId")
    public Long memberId;

    public static GetDiscoveredResourceCountsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsRequest self = new GetDiscoveredResourceCountsRequest();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsRequest setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public GetDiscoveredResourceCountsRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public GetDiscoveredResourceCountsRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

}
