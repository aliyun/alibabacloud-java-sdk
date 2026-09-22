// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedAppsByUserRequest extends TeaModel {
    /**
     * <p>The application ID used to filter results. Fuzzy match by containment is used. This parameter can be combined with other filter parameters. You can obtain the application ID from the Apps list returned by the <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The delivery group ID used to filter results. Fuzzy match by containment is used. This parameter can be combined with other filter parameters. Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to obtain the delivery group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The delivery group name used to filter results. Fuzzy match by name is used. This parameter can be combined with other filter parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeApp</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The application name used to filter results. Fuzzy match by name is used. This parameter can be combined with other filter parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The username to query. <strong>Required</strong>. The user must already exist under the current account. Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The page number of the results. <strong>Required</strong>. The value starts from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. <strong>Required</strong>. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. <strong>Required</strong>. The value is case-insensitive.</p>
     * <p>This operation queries per-application authorization records. This authorization method applies to WUYING Cloud Application delivery groups. Valid values:</p>
     * <ul>
     * <li>CloudApp: WUYING Cloud Application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListAuthorizedAppsByUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAppsByUserRequest self = new ListAuthorizedAppsByUserRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAppsByUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAuthorizedAppsByUserRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListAuthorizedAppsByUserRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ListAuthorizedAppsByUserRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAuthorizedAppsByUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListAuthorizedAppsByUserRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedAppsByUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedAppsByUserRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
