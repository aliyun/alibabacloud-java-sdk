// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListSelectionProductsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>56****2304</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    public static ListSelectionProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSelectionProductsRequest self = new ListSelectionProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListSelectionProductsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSelectionProductsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSelectionProductsRequest setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

}
