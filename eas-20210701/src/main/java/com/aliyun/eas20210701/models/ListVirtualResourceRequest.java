// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListVirtualResourceRequest extends TeaModel {
    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>Desc: descending order.</li>
     * <li>Asc: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the virtual resource group list. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of virtual resource groups to display per page in a paged query. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort field. Results are sorted by timestamp in descending order by default.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The virtual resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-vr-npovr28onap1xxxxxx</p>
     */
    @NameInMap("VirtualResourceId")
    public String virtualResourceId;

    /**
     * <p>The virtual resource group name.</p>
     * 
     * <strong>example:</strong>
     * <p>MyVirtualResource</p>
     */
    @NameInMap("VirtualResourceName")
    public String virtualResourceName;

    public static ListVirtualResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualResourceRequest self = new ListVirtualResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListVirtualResourceRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListVirtualResourceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVirtualResourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVirtualResourceRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListVirtualResourceRequest setVirtualResourceId(String virtualResourceId) {
        this.virtualResourceId = virtualResourceId;
        return this;
    }
    public String getVirtualResourceId() {
        return this.virtualResourceId;
    }

    public ListVirtualResourceRequest setVirtualResourceName(String virtualResourceName) {
        this.virtualResourceName = virtualResourceName;
        return this;
    }
    public String getVirtualResourceName() {
        return this.virtualResourceName;
    }

}
