// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SchedulePodRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("GroupUuid")
    public String groupUuid;

    @NameInMap("WorkloadUuid")
    public String workloadUuid;

    @NameInMap("Tenant")
    public String tenant;

    @NameInMap("Regions")
    public String regions;

    @NameInMap("AreaCodes")
    public String areaCodes;

    @NameInMap("Isps")
    public String isps;

    @NameInMap("Requirements")
    public String requirements;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("ResourceAttribute")
    public String resourceAttribute;

    public static SchedulePodRequest build(java.util.Map<String, ?> map) throws Exception {
        SchedulePodRequest self = new SchedulePodRequest();
        return TeaModel.build(map, self);
    }

    public SchedulePodRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public SchedulePodRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public SchedulePodRequest setWorkloadUuid(String workloadUuid) {
        this.workloadUuid = workloadUuid;
        return this;
    }
    public String getWorkloadUuid() {
        return this.workloadUuid;
    }

    public SchedulePodRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public SchedulePodRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public SchedulePodRequest setAreaCodes(String areaCodes) {
        this.areaCodes = areaCodes;
        return this;
    }
    public String getAreaCodes() {
        return this.areaCodes;
    }

    public SchedulePodRequest setIsps(String isps) {
        this.isps = isps;
        return this;
    }
    public String getIsps() {
        return this.isps;
    }

    public SchedulePodRequest setRequirements(String requirements) {
        this.requirements = requirements;
        return this;
    }
    public String getRequirements() {
        return this.requirements;
    }

    public SchedulePodRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public SchedulePodRequest setResourceAttribute(String resourceAttribute) {
        this.resourceAttribute = resourceAttribute;
        return this;
    }
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

}
