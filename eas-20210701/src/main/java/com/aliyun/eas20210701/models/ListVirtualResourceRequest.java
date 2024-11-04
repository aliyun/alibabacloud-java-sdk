// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListVirtualResourceRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the virtual resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-vr-npovr28onap1xxxxxx</p>
     */
    @NameInMap("VirtualResourceId")
    public String virtualResourceId;

    /**
     * <p>The name of the virtual resource group.</p>
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
