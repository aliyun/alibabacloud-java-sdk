// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-53fvrq1oanz6c****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListNodesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
