// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppsByAppInstanceGroupIdRequest extends TeaModel {
    /**
     * <p>The delivery group ID.</p>
     * <ul>
     * <li>WUYING Cloud Application delivery group: call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID.</li>
     * <li>Cloud Browser group: specify the Cloud Browser group ID. Call the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation to obtain the ID.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is <strong>required</strong>. If it is not specified, the error code <code>InvalidParameter.AppInstanceGroupId</code> is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of applications to return per page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. The value must match the product type of the delivery group specified by AppInstanceGroupId. Otherwise, the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: WUYING Cloud Application.</li>
     * <li>CloudBrowser: Cloud Browser.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListAppsByAppInstanceGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppsByAppInstanceGroupIdRequest self = new ListAppsByAppInstanceGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public ListAppsByAppInstanceGroupIdRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListAppsByAppInstanceGroupIdRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppsByAppInstanceGroupIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppsByAppInstanceGroupIdRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
