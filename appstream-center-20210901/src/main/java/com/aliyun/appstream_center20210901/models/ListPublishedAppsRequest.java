// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPublishedAppsRequest extends TeaModel {
    /**
     * <p>The ID of the application used for filtering. Substring matching is supported. You can pass the complete ID or a continuous segment of it. If this parameter is not specified or an empty string is passed, filtering is not performed based on the application ID. If this parameter and <code>AppName</code> are specified at the same time, both conditions must be met by the same application.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the delivery group used for filtering. Substring matching is supported. You can pass the complete ID or a continuous segment of it. If this parameter is not specified or an empty string is passed, filtering is not performed based on the delivery group ID. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID. This parameter can be used together with other filter conditions, and all conditions must be met.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The name of the delivery group used for filtering. Substring matching is supported. For example, if you pass <code>Office applications</code>, delivery groups whose names contain this text are matched. If this parameter is not specified or an empty string is passed, filtering is not performed based on the delivery group name. If this parameter and the delivery group ID are specified at the same time, both conditions must be met.</p>
     * 
     * <strong>example:</strong>
     * <p>Office applications</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The name of the application used for filtering. Substring matching is supported. For example, if you pass <code>Office applications</code>, applications whose names contain this text are matched. If this parameter is not specified or an empty string is passed, filtering is not performed based on the application name. If this parameter and <code>AppId</code> are specified at the same time, both conditions must be met by the same application.</p>
     * 
     * <strong>example:</strong>
     * <p>Office applications</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The username to be excluded. Exact matching is performed based on the full username, such as <code>alice</code>. If this parameter is specified, applications that have been authorized for this user on a per-application basis through <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> are not returned. This can be used to find applications that can still be authorized for the user. If this parameter is not specified or an empty string is passed, filtering is not performed based on user authorization.</p>
     * <p><strong>Access permissions obtained through overall delivery group authorization or user groups are not evaluated by this condition.</strong> Do not equate the returned results with a list of applications that the user has absolutely no access to.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("ExcludeUserId")
    public String excludeUserId;

    /**
     * <p>The page number. This parameter is required. Start the query from page <code>1</code> and use it in conjunction with <code>PageSize</code>. Keep other filter conditions unchanged when querying subsequent pages. If the value is invalid, the error code <code>InvalidParameter.PageNumber</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of application records to return per page. This parameter is required. Valid values: <code>1</code> to <code>100</code>. If the value is out of range, the error code <code>InvalidParameter.PageSize</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. This parameter is required and is not case-sensitive. Only applications in published delivery groups of this product type are returned. If an unrecognized value is passed, the error code <code>InvalidParameter.ProductType</code> is returned. Filtering and statistics related to per-application authorization (<code>ExcludeUserId</code> and <code>AuthorizedUserCount</code>) are primarily used in WUYING Cloud App scenarios.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>CloudApp</code>: WUYING Cloud App.</li>
     * <li><code>CloudBrowser</code>: Cloud browser.</li>
     * <li><code>WuyingServer</code>: Enterprise Edition workstation.</li>
     * <li><code>WuyingWorkstation</code>: Personal Edition Linggou container workstation.</li>
     * <li><code>WuyingWorkstationTeam</code>: Team Edition Linggou container workstation.</li>
     * <li><code>WuyingWorkstationBusiness</code>: Dedicated Edition Linggou container workstation.</li>
     * <li><code>AndroidCloud</code>: Cloud phone.</li>
     * <li><code>AIAgent</code>: AgentBay (AI agent).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListPublishedAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppsRequest self = new ListPublishedAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListPublishedAppsRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListPublishedAppsRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ListPublishedAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListPublishedAppsRequest setExcludeUserId(String excludeUserId) {
        this.excludeUserId = excludeUserId;
        return this;
    }
    public String getExcludeUserId() {
        return this.excludeUserId;
    }

    public ListPublishedAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPublishedAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishedAppsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
