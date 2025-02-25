// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListLoadBalancerRegionsRequest extends TeaModel {
    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListLoadBalancerRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancerRegionsRequest self = new ListLoadBalancerRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancerRegionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLoadBalancerRegionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
