// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsRequest extends TeaModel {
    /**
     * <p>The dimension by which resources are grouped. Valid values:</p>
     * <br>
     * <p>*   ResourceType: specifies that resources are grouped by type.</p>
     * <p>*   Region: specifies that resources are grouped by region.</p>
     */
    @NameInMap("GroupByKey")
    public String groupByKey;

    /**
     * <p>This parameter has been removed from 00:00:00, June 30, 2021. Account group-related operations are provided as an alternative after 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related operations after 00:00:00, May 30, 2021. For more information about account groups, see [Overview](~~211534~~).</p>
     */
    @NameInMap("MemberId")
    public Long memberId;

    /**
     * <p>This parameter has been removed from 00:00:00, June 30, 2021. Account group-related operations are provided as an alternative after 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related operations after 00:00:00, May 30, 2021. For more information about account groups, see [Overview](~~211534~~).</p>
     */
    @NameInMap("MultiAccount")
    public Boolean multiAccount;

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

    public GetDiscoveredResourceCountsRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public GetDiscoveredResourceCountsRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

}
