// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowsResponseBody extends TeaModel {
    @NameInMap("Flow")
    public ListFlowsResponseBodyFlow flow;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsResponseBody self = new ListFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowsResponseBody setFlow(ListFlowsResponseBodyFlow flow) {
        this.flow = flow;
        return this;
    }
    public ListFlowsResponseBodyFlow getFlow() {
        return this.flow;
    }

    public ListFlowsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListFlowsResponseBodyFlowFlow extends TeaModel {
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

        public static ListFlowsResponseBodyFlowFlow build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlowFlow self = new ListFlowsResponseBodyFlowFlow();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlowFlow setAlertConf(String alertConf) {
            this.alertConf = alertConf;
            return this;
        }
        public String getAlertConf() {
            return this.alertConf;
        }

        public ListFlowsResponseBodyFlowFlow setAlertDingDingGroupBizId(String alertDingDingGroupBizId) {
            this.alertDingDingGroupBizId = alertDingDingGroupBizId;
            return this;
        }
        public String getAlertDingDingGroupBizId() {
            return this.alertDingDingGroupBizId;
        }

        public ListFlowsResponseBodyFlowFlow setAlertUserGroupBizId(String alertUserGroupBizId) {
            this.alertUserGroupBizId = alertUserGroupBizId;
            return this;
        }
        public String getAlertUserGroupBizId() {
            return this.alertUserGroupBizId;
        }

        public ListFlowsResponseBodyFlowFlow setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListFlowsResponseBodyFlowFlow setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListFlowsResponseBodyFlowFlow setCreateCluster(Boolean createCluster) {
            this.createCluster = createCluster;
            return this;
        }
        public Boolean getCreateCluster() {
            return this.createCluster;
        }

        public ListFlowsResponseBodyFlowFlow setCronExpr(String cronExpr) {
            this.cronExpr = cronExpr;
            return this;
        }
        public String getCronExpr() {
            return this.cronExpr;
        }

        public ListFlowsResponseBodyFlowFlow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowsResponseBodyFlowFlow setEndSchedule(Long endSchedule) {
            this.endSchedule = endSchedule;
            return this;
        }
        public Long getEndSchedule() {
            return this.endSchedule;
        }

        public ListFlowsResponseBodyFlowFlow setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowsResponseBodyFlowFlow setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowsResponseBodyFlowFlow setGraph(String graph) {
            this.graph = graph;
            return this;
        }
        public String getGraph() {
            return this.graph;
        }

        public ListFlowsResponseBodyFlowFlow setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListFlowsResponseBodyFlowFlow setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowsResponseBodyFlowFlow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowsResponseBodyFlowFlow setPeriodic(Boolean periodic) {
            this.periodic = periodic;
            return this;
        }
        public Boolean getPeriodic() {
            return this.periodic;
        }

        public ListFlowsResponseBodyFlowFlow setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFlowsResponseBodyFlowFlow setStartSchedule(Long startSchedule) {
            this.startSchedule = startSchedule;
            return this;
        }
        public Long getStartSchedule() {
            return this.startSchedule;
        }

        public ListFlowsResponseBodyFlowFlow setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowsResponseBodyFlowFlow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListFlowsResponseBodyFlow extends TeaModel {
        @NameInMap("Flow")
        public java.util.List<ListFlowsResponseBodyFlowFlow> flow;

        public static ListFlowsResponseBodyFlow build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlow self = new ListFlowsResponseBodyFlow();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlow setFlow(java.util.List<ListFlowsResponseBodyFlowFlow> flow) {
            this.flow = flow;
            return this;
        }
        public java.util.List<ListFlowsResponseBodyFlowFlow> getFlow() {
            return this.flow;
        }

    }

}
