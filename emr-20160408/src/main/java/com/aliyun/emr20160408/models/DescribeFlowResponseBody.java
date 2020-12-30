// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowResponseBody extends TeaModel {
    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("Periodic")
    public Boolean periodic;

    @NameInMap("CronExpr")
    public String cronExpr;

    @NameInMap("AlertDingDingGroupBizId")
    public String alertDingDingGroupBizId;

    @NameInMap("Name")
    public String name;

    @NameInMap("AlertUserGroupBizId")
    public String alertUserGroupBizId;

    @NameInMap("LogArchiveLocation")
    public String logArchiveLocation;

    @NameInMap("EndSchedule")
    public Long endSchedule;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Status")
    public String status;

    @NameInMap("StartSchedule")
    public Long startSchedule;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Lifecycle")
    public String lifecycle;

    @NameInMap("EditLockDetail")
    public String editLockDetail;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Type")
    public String type;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("Graph")
    public String graph;

    @NameInMap("Id")
    public String id;

    @NameInMap("Application")
    public String application;

    @NameInMap("CreateCluster")
    public Boolean createCluster;

    @NameInMap("AlertConf")
    public String alertConf;

    @NameInMap("ParentFlowList")
    public DescribeFlowResponseBodyParentFlowList parentFlowList;

    public static DescribeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowResponseBody self = new DescribeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowResponseBody setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeFlowResponseBody setPeriodic(Boolean periodic) {
        this.periodic = periodic;
        return this;
    }
    public Boolean getPeriodic() {
        return this.periodic;
    }

    public DescribeFlowResponseBody setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
        return this;
    }
    public String getCronExpr() {
        return this.cronExpr;
    }

    public DescribeFlowResponseBody setAlertDingDingGroupBizId(String alertDingDingGroupBizId) {
        this.alertDingDingGroupBizId = alertDingDingGroupBizId;
        return this;
    }
    public String getAlertDingDingGroupBizId() {
        return this.alertDingDingGroupBizId;
    }

    public DescribeFlowResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFlowResponseBody setAlertUserGroupBizId(String alertUserGroupBizId) {
        this.alertUserGroupBizId = alertUserGroupBizId;
        return this;
    }
    public String getAlertUserGroupBizId() {
        return this.alertUserGroupBizId;
    }

    public DescribeFlowResponseBody setLogArchiveLocation(String logArchiveLocation) {
        this.logArchiveLocation = logArchiveLocation;
        return this;
    }
    public String getLogArchiveLocation() {
        return this.logArchiveLocation;
    }

    public DescribeFlowResponseBody setEndSchedule(Long endSchedule) {
        this.endSchedule = endSchedule;
        return this;
    }
    public Long getEndSchedule() {
        return this.endSchedule;
    }

    public DescribeFlowResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeFlowResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFlowResponseBody setStartSchedule(Long startSchedule) {
        this.startSchedule = startSchedule;
        return this;
    }
    public Long getStartSchedule() {
        return this.startSchedule;
    }

    public DescribeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeFlowResponseBody setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public String getLifecycle() {
        return this.lifecycle;
    }

    public DescribeFlowResponseBody setEditLockDetail(String editLockDetail) {
        this.editLockDetail = editLockDetail;
        return this;
    }
    public String getEditLockDetail() {
        return this.editLockDetail;
    }

    public DescribeFlowResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeFlowResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeFlowResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFlowResponseBody setGraph(String graph) {
        this.graph = graph;
        return this;
    }
    public String getGraph() {
        return this.graph;
    }

    public DescribeFlowResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowResponseBody setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public DescribeFlowResponseBody setCreateCluster(Boolean createCluster) {
        this.createCluster = createCluster;
        return this;
    }
    public Boolean getCreateCluster() {
        return this.createCluster;
    }

    public DescribeFlowResponseBody setAlertConf(String alertConf) {
        this.alertConf = alertConf;
        return this;
    }
    public String getAlertConf() {
        return this.alertConf;
    }

    public DescribeFlowResponseBody setParentFlowList(DescribeFlowResponseBodyParentFlowList parentFlowList) {
        this.parentFlowList = parentFlowList;
        return this;
    }
    public DescribeFlowResponseBodyParentFlowList getParentFlowList() {
        return this.parentFlowList;
    }

    public static class DescribeFlowResponseBodyParentFlowListParentFlow extends TeaModel {
        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ParentFlowName")
        public String parentFlowName;

        @NameInMap("ParentFlowId")
        public String parentFlowId;

        public static DescribeFlowResponseBodyParentFlowListParentFlow build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowResponseBodyParentFlowListParentFlow self = new DescribeFlowResponseBodyParentFlowListParentFlow();
            return TeaModel.build(map, self);
        }

        public DescribeFlowResponseBodyParentFlowListParentFlow setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeFlowResponseBodyParentFlowListParentFlow setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeFlowResponseBodyParentFlowListParentFlow setParentFlowName(String parentFlowName) {
            this.parentFlowName = parentFlowName;
            return this;
        }
        public String getParentFlowName() {
            return this.parentFlowName;
        }

        public DescribeFlowResponseBodyParentFlowListParentFlow setParentFlowId(String parentFlowId) {
            this.parentFlowId = parentFlowId;
            return this;
        }
        public String getParentFlowId() {
            return this.parentFlowId;
        }

    }

    public static class DescribeFlowResponseBodyParentFlowList extends TeaModel {
        @NameInMap("ParentFlow")
        public java.util.List<DescribeFlowResponseBodyParentFlowListParentFlow> parentFlow;

        public static DescribeFlowResponseBodyParentFlowList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowResponseBodyParentFlowList self = new DescribeFlowResponseBodyParentFlowList();
            return TeaModel.build(map, self);
        }

        public DescribeFlowResponseBodyParentFlowList setParentFlow(java.util.List<DescribeFlowResponseBodyParentFlowListParentFlow> parentFlow) {
            this.parentFlow = parentFlow;
            return this;
        }
        public java.util.List<DescribeFlowResponseBodyParentFlowListParentFlow> getParentFlow() {
            return this.parentFlow;
        }

    }

}
