// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetFootprintListRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C-20080808-1</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The pagination parameter. The number of the page that starts from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Long currentPage;

    /**
     * <p>The number of entries returned on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Product type: 1 indicates that the carbon footprint of the product is requested, and 5 indicates that the carbon footprint of the supply chain is requested.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("productType")
    public Long productType;

    public static GetFootprintListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFootprintListRequest self = new GetFootprintListRequest();
        return TeaModel.build(map, self);
    }

    public GetFootprintListRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFootprintListRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetFootprintListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetFootprintListRequest setProductType(Long productType) {
        this.productType = productType;
        return this;
    }
    public Long getProductType() {
        return this.productType;
    }

}
