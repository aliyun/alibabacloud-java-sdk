// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentTimelinesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListIncidentTimelinesResponseBodyData> data;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

    // 总数
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListIncidentTimelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentTimelinesResponseBody self = new ListIncidentTimelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIncidentTimelinesResponseBody setData(java.util.List<ListIncidentTimelinesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIncidentTimelinesResponseBodyData> getData() {
        return this.data;
    }

    public ListIncidentTimelinesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIncidentTimelinesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIncidentTimelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIncidentTimelinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIncidentTimelinesResponseBodyData extends TeaModel {
        // 动态类型  触发新增 INCIDENT_ADD 响应 INCIDENT_RESPONSE 转交 INCIDENT_DELIVER 变更 INCIDENT_UPDATE 添加小计 INCIDENT_ADD_SUBTOTAL 完结 INCIDENT_FINISH 分配 INCIDENT_ASSIGN 升级 INCIDENT_UPGRAD
        @NameInMap("action")
        public String action;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 描述
        @NameInMap("description")
        public Long description;

        // 事件Id
        @NameInMap("incidentId")
        public Long incidentId;

        // 事件编号
        @NameInMap("incidentNumber")
        public String incidentNumber;

        // 事件标题
        @NameInMap("incidentTitle")
        public String incidentTitle;

        // 服务名称
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 备注
        @NameInMap("remark")
        public String remark;

        // 动态快照数据
        @NameInMap("snapshotData")
        public String snapshotData;

        // 动态
        @NameInMap("title")
        public String title;

        public static ListIncidentTimelinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentTimelinesResponseBodyData self = new ListIncidentTimelinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIncidentTimelinesResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListIncidentTimelinesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIncidentTimelinesResponseBodyData setDescription(Long description) {
            this.description = description;
            return this;
        }
        public Long getDescription() {
            return this.description;
        }

        public ListIncidentTimelinesResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public ListIncidentTimelinesResponseBodyData setIncidentNumber(String incidentNumber) {
            this.incidentNumber = incidentNumber;
            return this;
        }
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        public ListIncidentTimelinesResponseBodyData setIncidentTitle(String incidentTitle) {
            this.incidentTitle = incidentTitle;
            return this;
        }
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        public ListIncidentTimelinesResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListIncidentTimelinesResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListIncidentTimelinesResponseBodyData setSnapshotData(String snapshotData) {
            this.snapshotData = snapshotData;
            return this;
        }
        public String getSnapshotData() {
            return this.snapshotData;
        }

        public ListIncidentTimelinesResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
