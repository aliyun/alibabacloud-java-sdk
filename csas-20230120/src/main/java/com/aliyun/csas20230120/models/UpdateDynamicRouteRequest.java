// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateDynamicRouteRequest extends TeaModel {
    /**
     * <p>A collection of private network access application IDs for the dynamic route. You can specify up to 200 IDs. This parameter is required when <strong>ApplicationType</strong> is set to <strong>Application</strong>. Specify either this parameter or <strong>TagIds</strong>, but not both. Do not specify this parameter when <strong>ApplicationType</strong> is set to <strong>All</strong>.</p>
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
     * 
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The description of the dynamic route. The description must be 1 to 128 characters long and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条动态路由</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the dynamic route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-ca9fddfac7c6****</p>
     */
    @NameInMap("DynamicRouteId")
    public String dynamicRouteId;

    /**
     * <p>The type of the dynamic route. Valid value: <strong>connector</strong>: leased line.</p>
     * 
     * <strong>example:</strong>
     * <p>connector</p>
     */
    @NameInMap("DynamicRouteType")
    public String dynamicRouteType;

    /**
     * <p>The modification type of the dynamic route. Valid values:</p>
     * <ul>
     * <li><p><strong>Cover</strong> (default): Use the values of <strong>RegionIds</strong>, <strong>ApplicationIds</strong>, and <strong>TagIds</strong> to overwrite the existing regions, private network access application IDs, and private network access tag IDs supported by the SASE POP cluster access points.</p>
     * </li>
     * <li><p><strong>Append</strong>: Add the values specified in <strong>RegionIds</strong>, <strong>ApplicationIds</strong>, and <strong>TagIds</strong> to the existing regions, private network access application IDs, and private network access tag IDs supported by the SASE POP cluster access points.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The name of the dynamic route. The name must be 1 to 128 characters long and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>dynamic_route_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The next hop instance ID of the dynamic route. To get valid values, see:</p>
     * <ul>
     * <li><a href="~~ListConnectors~~">ListConnectors</a>: Query connectors in bulk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>connector-8ccb13b6f52c****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The route priority. A value of 1 indicates the highest priority. Valid values: 1 to 99.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>A list of regions supported by the SASE POP cluster access points.</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The status of the dynamic route. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Enable the route.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Disable the route.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A collection of private network access tag IDs for the dynamic route. You can specify up to 40 IDs. This parameter is required when <strong>ApplicationType</strong> is set to <strong>Tag</strong>. Specify either this parameter or <strong>ApplicationIds</strong>, but not both. Do not specify this parameter when <strong>ApplicationType</strong> is set to <strong>All</strong>.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static UpdateDynamicRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDynamicRouteRequest self = new UpdateDynamicRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDynamicRouteRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public UpdateDynamicRouteRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public UpdateDynamicRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDynamicRouteRequest setDynamicRouteId(String dynamicRouteId) {
        this.dynamicRouteId = dynamicRouteId;
        return this;
    }
    public String getDynamicRouteId() {
        return this.dynamicRouteId;
    }

    public UpdateDynamicRouteRequest setDynamicRouteType(String dynamicRouteType) {
        this.dynamicRouteType = dynamicRouteType;
        return this;
    }
    public String getDynamicRouteType() {
        return this.dynamicRouteType;
    }

    public UpdateDynamicRouteRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdateDynamicRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDynamicRouteRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public UpdateDynamicRouteRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateDynamicRouteRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public UpdateDynamicRouteRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateDynamicRouteRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}
