// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDynamicRouteRequest extends TeaModel {
    /**
     * <p>A collection of internal network access application IDs for the dynamic route. You can enter a maximum of 200 internal network access application IDs. Required when ApplicationType is <strong>Application</strong>. Choose one of <strong>ApplicationIds</strong> or <strong>TagIds</strong>. Do not enter when <strong>ApplicationType</strong> is <strong>All</strong>.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The application type of the dynamic route. Valid values:</p>
     * <ul>
     * <li><p><strong>All</strong>: All applications.</p>
     * </li>
     * <li><p><strong>Application</strong>: Application.</p>
     * </li>
     * <li><p><strong>Tag</strong>: Tag.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The dynamic route description. It is 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase letters, numbers, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条动态路由</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The dynamic route type. Valid values: <strong>connector</strong>: Leased line.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector</p>
     */
    @NameInMap("DynamicRouteType")
    public String dynamicRouteType;

    /**
     * <p>The dynamic route name. It is 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dynamic_route_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The next hop instance ID of the dynamic route. Source:</p>
     * <ul>
     * <li>For more information, see <a href="">ListConnectors</a>: Query Connectors in batches.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-8ccb13b6f52c****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The dynamic route priority. 1 indicates the highest priority. Valid values: 1-99.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>A list of regions supported by SASE POP cluster access points.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The dynamic route status. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Disabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A collection of internal network access tag IDs for the dynamic route. You can enter a maximum of 40 internal network access tag IDs. Required when ApplicationType is <strong>Tag</strong>. Choose one of <strong>ApplicationIds</strong> or <strong>TagIds</strong>. Do not enter when <strong>ApplicationType</strong> is <strong>All</strong>.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static CreateDynamicRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicRouteRequest self = new CreateDynamicRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateDynamicRouteRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public CreateDynamicRouteRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreateDynamicRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDynamicRouteRequest setDynamicRouteType(String dynamicRouteType) {
        this.dynamicRouteType = dynamicRouteType;
        return this;
    }
    public String getDynamicRouteType() {
        return this.dynamicRouteType;
    }

    public CreateDynamicRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDynamicRouteRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public CreateDynamicRouteRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateDynamicRouteRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public CreateDynamicRouteRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateDynamicRouteRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}
