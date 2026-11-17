// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedAppInstanceGroupByUserRequest extends TeaModel {
    /**
     * <p>The application ID. Fuzzy match is supported. App instance groups in which the IDs of deployed applications contain this string are returned. You can obtain the application ID from the Apps list returned by this operation.</p>
     * <p>If this parameter is not specified, app instance groups are not filtered by application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The app instance group ID. Fuzzy match is supported. App instance groups whose IDs contain this string are returned. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID.</p>
     * <p>If this parameter is not specified, app instance groups are not filtered by app instance group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The app instance group name. Fuzzy match is supported. For example, if you specify <code>Office applications</code>, app instance groups whose names contain <code>Office applications</code> (such as <code>My office applications</code> and <code>Office applications A</code>) are queried.</p>
     * <p>If this parameter is not specified, app instance groups are not filtered by app instance group name.</p>
     * 
     * <strong>example:</strong>
     * <p>Office applications</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The application name. Fuzzy match is supported. App instance groups in which the names of deployed applications contain this string are returned.</p>
     * <p>If this parameter is not specified, app instance groups are not filtered by application name.</p>
     * 
     * <strong>example:</strong>
     * <p>Office applications</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The username. Exact match is used based on the username to query the app instance groups to which the user has been granted app instance group-level authorization.</p>
     * <blockquote>
     * <p>This parameter is required. If this parameter is not specified, the error code InvalidParameter.UserId is returned.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen+dir-436909****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The page number. Pages start from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of app instance groups to return on each page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. The value must be consistent with the product type of the queried app instance groups. Only app instance groups of this product type are returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: Cloud App.</li>
     * <li>CloudBrowser: Cloud Browser.</li>
     * <li>WuyingServer: Enterprise Edition workstation.</li>
     * <li>WuyingWorkstation: Personal Edition Linggou container workstation.</li>
     * <li>WuyingWorkstationTeam: Team Edition Linggou container workstation.</li>
     * <li>WuyingWorkstationBusiness: Exclusive Edition Linggou container workstation.</li>
     * <li>AndroidCloud: Cloud Phone.</li>
     * <li>AIAgent: AgentBay (AI agent).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListAuthorizedAppInstanceGroupByUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAppInstanceGroupByUserRequest self = new ListAuthorizedAppInstanceGroupByUserRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
