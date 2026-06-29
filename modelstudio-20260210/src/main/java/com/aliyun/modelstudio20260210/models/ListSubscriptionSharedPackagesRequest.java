// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListSubscriptionSharedPackagesRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1. The value must be a positive integer.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of statuses used for filtering.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    public static ListSubscriptionSharedPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionSharedPackagesRequest self = new ListSubscriptionSharedPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionSharedPackagesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListSubscriptionSharedPackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSubscriptionSharedPackagesRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
