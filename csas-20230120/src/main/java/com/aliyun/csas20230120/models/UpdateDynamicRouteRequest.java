// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateDynamicRouteRequest extends TeaModel {
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-ca9fddfac7c6****</p>
     */
    @NameInMap("DynamicRouteId")
    public String dynamicRouteId;

    /**
     * <strong>example:</strong>
     * <p>connector</p>
     */
    @NameInMap("DynamicRouteType")
    public String dynamicRouteType;

    /**
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <strong>example:</strong>
     * <p>dynamic_route_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>connector-8ccb13b6f52c****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("Status")
    public String status;

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
