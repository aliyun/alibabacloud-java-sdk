// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListOpenedAccessLogInstancesRequest extends TeaModel {
    /**
     * <p>The number of the Anti-DDoS Origin instances for which log analysis was enabled.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListOpenedAccessLogInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOpenedAccessLogInstancesRequest self = new ListOpenedAccessLogInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListOpenedAccessLogInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOpenedAccessLogInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOpenedAccessLogInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
