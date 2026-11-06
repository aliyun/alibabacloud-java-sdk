// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPortalPublicationsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The API product name. This corresponds to the productName field in the response list items.</p>
     * 
     * <strong>example:</strong>
     * <p>model-service</p>
     */
    @NameInMap("productName")
    public String productName;

    public static ListPortalPublicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPortalPublicationsRequest self = new ListPortalPublicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListPortalPublicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPortalPublicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPortalPublicationsRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
