// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyFlowForWebRequest extends TeaModel {
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

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("LogArchiveLocation")
    public String logArchiveLocation;

    @NameInMap("Lifecycle")
    public String lifecycle;

    @NameInMap("Graph")
    public String graph;

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

    public static ModifyFlowForWebRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowForWebRequest self = new ModifyFlowForWebRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowForWebRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFlowForWebRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifyFlowForWebRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyFlowForWebRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyFlowForWebRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyFlowForWebRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFlowForWebRequest setPeriodic(Boolean periodic) {
        this.periodic = periodic;
        return this;
    }
    public Boolean getPeriodic() {
        return this.periodic;
    }

    public ModifyFlowForWebRequest setStartSchedule(Long startSchedule) {
        this.startSchedule = startSchedule;
        return this;
    }
    public Long getStartSchedule() {
        return this.startSchedule;
    }

    public ModifyFlowForWebRequest setEndSchedule(Long endSchedule) {
        this.endSchedule = endSchedule;
        return this;
    }
    public Long getEndSchedule() {
        return this.endSchedule;
    }

    public ModifyFlowForWebRequest setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
        return this;
    }
    public String getCronExpr() {
        return this.cronExpr;
    }

    public ModifyFlowForWebRequest setCreateCluster(Boolean createCluster) {
        this.createCluster = createCluster;
        return this;
    }
    public Boolean getCreateCluster() {
        return this.createCluster;
    }

    public ModifyFlowForWebRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyFlowForWebRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyFlowForWebRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyFlowForWebRequest setLogArchiveLocation(String logArchiveLocation) {
        this.logArchiveLocation = logArchiveLocation;
        return this;
    }
    public String getLogArchiveLocation() {
        return this.logArchiveLocation;
    }

    public ModifyFlowForWebRequest setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public String getLifecycle() {
        return this.lifecycle;
    }

    public ModifyFlowForWebRequest setGraph(String graph) {
        this.graph = graph;
        return this;
    }
    public String getGraph() {
        return this.graph;
    }

    public ModifyFlowForWebRequest setAlertConf(String alertConf) {
        this.alertConf = alertConf;
        return this;
    }
    public String getAlertConf() {
        return this.alertConf;
    }

    public ModifyFlowForWebRequest setAlertUserGroupBizId(String alertUserGroupBizId) {
        this.alertUserGroupBizId = alertUserGroupBizId;
        return this;
    }
    public String getAlertUserGroupBizId() {
        return this.alertUserGroupBizId;
    }

    public ModifyFlowForWebRequest setAlertDingDingGroupBizId(String alertDingDingGroupBizId) {
        this.alertDingDingGroupBizId = alertDingDingGroupBizId;
        return this;
    }
    public String getAlertDingDingGroupBizId() {
        return this.alertDingDingGroupBizId;
    }

    public ModifyFlowForWebRequest setParentFlowList(String parentFlowList) {
        this.parentFlowList = parentFlowList;
        return this;
    }
    public String getParentFlowList() {
        return this.parentFlowList;
    }

    public ModifyFlowForWebRequest setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
        return this;
    }
    public String getParentCategory() {
        return this.parentCategory;
    }

}
