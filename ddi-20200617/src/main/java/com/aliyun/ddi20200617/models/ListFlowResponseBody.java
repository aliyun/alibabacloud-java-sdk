// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowResponseBody extends TeaModel {
    // 工作流列表
    @NameInMap("Flow")
    public ListFlowResponseBodyFlow flow;

    // 页码。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 总数。
    @NameInMap("Total")
    public Integer total;

    public static ListFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowResponseBody self = new ListFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowResponseBody setFlow(ListFlowResponseBodyFlow flow) {
        this.flow = flow;
        return this;
    }
    public ListFlowResponseBodyFlow getFlow() {
        return this.flow;
    }

    public ListFlowResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListFlowResponseBodyFlowFlow extends TeaModel {
        @NameInMap("AlertConf")
        public String alertConf;

        @NameInMap("AlertDingDingGroupBizId")
        public String alertDingDingGroupBizId;

        @NameInMap("AlertUserGroupBizId")
        public String alertUserGroupBizId;

        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateCluster")
        public Boolean createCluster;

        @NameInMap("CronExpr")
        public String cronExpr;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndSchedule")
        public Long endSchedule;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Graph")
        public String graph;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Periodic")
        public Boolean periodic;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartSchedule")
        public Long startSchedule;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListFlowResponseBodyFlowFlow build(java.util.Map<String, ?> map) throws Exception {
            ListFlowResponseBodyFlowFlow self = new ListFlowResponseBodyFlowFlow();
            return TeaModel.build(map, self);
        }

        public ListFlowResponseBodyFlowFlow setAlertConf(String alertConf) {
            this.alertConf = alertConf;
            return this;
        }
        public String getAlertConf() {
            return this.alertConf;
        }

        public ListFlowResponseBodyFlowFlow setAlertDingDingGroupBizId(String alertDingDingGroupBizId) {
            this.alertDingDingGroupBizId = alertDingDingGroupBizId;
            return this;
        }
        public String getAlertDingDingGroupBizId() {
            return this.alertDingDingGroupBizId;
        }

        public ListFlowResponseBodyFlowFlow setAlertUserGroupBizId(String alertUserGroupBizId) {
            this.alertUserGroupBizId = alertUserGroupBizId;
            return this;
        }
        public String getAlertUserGroupBizId() {
            return this.alertUserGroupBizId;
        }

        public ListFlowResponseBodyFlowFlow setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListFlowResponseBodyFlowFlow setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListFlowResponseBodyFlowFlow setCreateCluster(Boolean createCluster) {
            this.createCluster = createCluster;
            return this;
        }
        public Boolean getCreateCluster() {
            return this.createCluster;
        }

        public ListFlowResponseBodyFlowFlow setCronExpr(String cronExpr) {
            this.cronExpr = cronExpr;
            return this;
        }
        public String getCronExpr() {
            return this.cronExpr;
        }

        public ListFlowResponseBodyFlowFlow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowResponseBodyFlowFlow setEndSchedule(Long endSchedule) {
            this.endSchedule = endSchedule;
            return this;
        }
        public Long getEndSchedule() {
            return this.endSchedule;
        }

        public ListFlowResponseBodyFlowFlow setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowResponseBodyFlowFlow setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowResponseBodyFlowFlow setGraph(String graph) {
            this.graph = graph;
            return this;
        }
        public String getGraph() {
            return this.graph;
        }

        public ListFlowResponseBodyFlowFlow setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListFlowResponseBodyFlowFlow setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowResponseBodyFlowFlow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowResponseBodyFlowFlow setPeriodic(Boolean periodic) {
            this.periodic = periodic;
            return this;
        }
        public Boolean getPeriodic() {
            return this.periodic;
        }

        public ListFlowResponseBodyFlowFlow setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFlowResponseBodyFlowFlow setStartSchedule(Long startSchedule) {
            this.startSchedule = startSchedule;
            return this;
        }
        public Long getStartSchedule() {
            return this.startSchedule;
        }

        public ListFlowResponseBodyFlowFlow setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowResponseBodyFlowFlow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListFlowResponseBodyFlow extends TeaModel {
        @NameInMap("Flow")
        public java.util.List<ListFlowResponseBodyFlowFlow> flow;

        public static ListFlowResponseBodyFlow build(java.util.Map<String, ?> map) throws Exception {
            ListFlowResponseBodyFlow self = new ListFlowResponseBodyFlow();
            return TeaModel.build(map, self);
        }

        public ListFlowResponseBodyFlow setFlow(java.util.List<ListFlowResponseBodyFlowFlow> flow) {
            this.flow = flow;
            return this;
        }
        public java.util.List<ListFlowResponseBodyFlowFlow> getFlow() {
            return this.flow;
        }

    }

}
