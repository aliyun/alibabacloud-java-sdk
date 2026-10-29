// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPublishedAppInstanceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the application used to filter delivery groups. Partial matching is supported. The delivery group must contain a deployed application that meets the condition. If this parameter is not specified or is set to an empty string, the results are not filtered by application ID. If this parameter is specified together with <code>AppName</code>, both conditions must be met by the same application.</p>
     * <p>This condition does not restrict the returned <code>Apps</code> list to the matched applications.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the delivery group used for filtering. Partial matching is supported. You can pass the complete ID or a continuous segment of it. If this parameter is not specified or is set to an empty string, the results are not filtered by ID. This parameter can be used together with other filter conditions, and the results must meet all conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The name of the delivery group used for filtering. Partial matching is supported. For example, if you pass <code>Office applications</code>, delivery groups whose names contain this text are matched. If this parameter is not specified or is set to an empty string, the results are not filtered by name. If this parameter is specified together with the delivery group ID, both the ID and the name must be matched.</p>
     * 
     * <strong>example:</strong>
     * <p>Office applications</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The name of the application used to filter delivery groups. Partial matching is supported. The delivery group must contain a deployed application whose name contains the specified text. If this parameter is not specified or is set to an empty string, the results are not filtered by application name. If this parameter is specified together with <code>AppId</code>, both conditions must be met by the same application.</p>
     * <p>This condition does not restrict the returned <code>Apps</code> list to the matched applications.</p>
     * 
     * <strong>example:</strong>
     * <p>Office applications</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The username to be excluded based on existing authorizations. Exact match by full username is supported, such as <code>alice</code>. If this parameter is specified, delivery groups for which all applications have been directly authorized to the user are excluded. If this parameter is not specified or is set to an empty string, the results are not filtered by user authorization status.</p>
     * <p><strong>Authorizations for a single application or access permissions obtained through user groups are not fully evaluated by this condition.</strong> Do not equate the returned results with a list of delivery groups to which the user has no access at all.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("ExcludeUserId")
    public String excludeUserId;

    /**
     * <p>The ID of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing+dir-172301****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The page number. This parameter is required. Start the query from page <code>1</code> and use it in conjunction with <code>PageSize</code>. Keep other filter conditions unchanged when querying subsequent pages.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of delivery groups to return per page. This parameter is required. Valid values: <code>1</code> to <code>100</code>. Explicitly specify this parameter and do not use the default values of other query operations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. This parameter is required. The value must be the same as the product type of the delivery groups to be queried. Only published delivery groups of this product type are returned. If an unrecognized value is passed, a parameter error is returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>CloudApp</code>: Wuying Cloud App.</li>
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

    public static ListPublishedAppInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppInstanceGroupRequest self = new ListPublishedAppInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppInstanceGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListPublishedAppInstanceGroupRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListPublishedAppInstanceGroupRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ListPublishedAppInstanceGroupRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListPublishedAppInstanceGroupRequest setExcludeUserId(String excludeUserId) {
        this.excludeUserId = excludeUserId;
        return this;
    }
    public String getExcludeUserId() {
        return this.excludeUserId;
    }

    public ListPublishedAppInstanceGroupRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListPublishedAppInstanceGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPublishedAppInstanceGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishedAppInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
