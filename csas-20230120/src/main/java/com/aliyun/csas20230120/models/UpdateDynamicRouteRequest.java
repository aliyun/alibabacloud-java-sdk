// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateDynamicRouteRequest extends TeaModel {
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("Description")
    public String description;

    @NameInMap("DynamicRouteId")
    public String dynamicRouteId;

    @NameInMap("DynamicRouteType")
    public String dynamicRouteType;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextHop")
    public String nextHop;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

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
