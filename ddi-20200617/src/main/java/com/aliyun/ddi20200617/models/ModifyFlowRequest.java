// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Status")
    public String status;

    @NameInMap("Description")
    public String description;

    @NameInMap("Periodic")
    public Boolean periodic;

    @NameInMap("StartSchedule")
    public Long startSchedule;

    @NameInMap("EndSchedule")
    public Long endSchedule;

    @NameInMap("CronExpr")
    public String cronExpr;

    @NameInMap("CreateCluster")
    public Boolean createCluster;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Application")
    public String application;

    @NameInMap("AlertConf")
    public String alertConf;

    @NameInMap("AlertUserGroupBizId")
    public String alertUserGroupBizId;

    @NameInMap("AlertDingDingGroupBizId")
    public String alertDingDingGroupBizId;

    @NameInMap("ParentFlowList")
    public String parentFlowList;

    @NameInMap("ParentCategory")
    public String parentCategory;

    public static ModifyFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowRequest self = new ModifyFlowRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFlowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifyFlowRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyFlowRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFlowRequest setPeriodic(Boolean periodic) {
        this.periodic = periodic;
        return this;
    }
    public Boolean getPeriodic() {
        return this.periodic;
    }

    public ModifyFlowRequest setStartSchedule(Long startSchedule) {
        this.startSchedule = startSchedule;
        return this;
    }
    public Long getStartSchedule() {
        return this.startSchedule;
    }

    public ModifyFlowRequest setEndSchedule(Long endSchedule) {
        this.endSchedule = endSchedule;
        return this;
    }
    public Long getEndSchedule() {
        return this.endSchedule;
    }

    public ModifyFlowRequest setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
        return this;
    }
    public String getCronExpr() {
        return this.cronExpr;
    }

    public ModifyFlowRequest setCreateCluster(Boolean createCluster) {
        this.createCluster = createCluster;
        return this;
    }
    public Boolean getCreateCluster() {
        return this.createCluster;
    }

    public ModifyFlowRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyFlowRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyFlowRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public ModifyFlowRequest setAlertConf(String alertConf) {
        this.alertConf = alertConf;
        return this;
    }
    public String getAlertConf() {
        return this.alertConf;
    }

    public ModifyFlowRequest setAlertUserGroupBizId(String alertUserGroupBizId) {
        this.alertUserGroupBizId = alertUserGroupBizId;
        return this;
    }
    public String getAlertUserGroupBizId() {
        return this.alertUserGroupBizId;
    }

    public ModifyFlowRequest setAlertDingDingGroupBizId(String alertDingDingGroupBizId) {
        this.alertDingDingGroupBizId = alertDingDingGroupBizId;
        return this;
    }
    public String getAlertDingDingGroupBizId() {
        return this.alertDingDingGroupBizId;
    }

    public ModifyFlowRequest setParentFlowList(String parentFlowList) {
        this.parentFlowList = parentFlowList;
        return this;
    }
    public String getParentFlowList() {
        return this.parentFlowList;
    }

    public ModifyFlowRequest setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
        return this;
    }
    public String getParentCategory() {
        return this.parentCategory;
    }

}
