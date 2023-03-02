// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailTimelinesResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListIncidentDetailTimelinesResponseBodyData> data;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListIncidentDetailTimelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentDetailTimelinesResponseBody self = new ListIncidentDetailTimelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIncidentDetailTimelinesResponseBody setData(java.util.List<ListIncidentDetailTimelinesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIncidentDetailTimelinesResponseBodyData> getData() {
        return this.data;
    }

    public ListIncidentDetailTimelinesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIncidentDetailTimelinesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIncidentDetailTimelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIncidentDetailTimelinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIncidentDetailTimelinesResponseBodyData extends TeaModel {
        @NameInMap("action")
        public String action;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("incidentId")
        public Long incidentId;

        @NameInMap("relRouteRuleDeleteType")
        public Integer relRouteRuleDeleteType;

        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        @NameInMap("remark")
        public String remark;

        @NameInMap("snapshotData")
        public String snapshotData;

        @NameInMap("title")
        public String title;

        public static ListIncidentDetailTimelinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailTimelinesResponseBodyData self = new ListIncidentDetailTimelinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailTimelinesResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListIncidentDetailTimelinesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIncidentDetailTimelinesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIncidentDetailTimelinesResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public ListIncidentDetailTimelinesResponseBodyData setRelRouteRuleDeleteType(Integer relRouteRuleDeleteType) {
            this.relRouteRuleDeleteType = relRouteRuleDeleteType;
            return this;
        }
        public Integer getRelRouteRuleDeleteType() {
            return this.relRouteRuleDeleteType;
        }

        public ListIncidentDetailTimelinesResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListIncidentDetailTimelinesResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListIncidentDetailTimelinesResponseBodyData setSnapshotData(String snapshotData) {
            this.snapshotData = snapshotData;
            return this;
        }
        public String getSnapshotData() {
            return this.snapshotData;
        }

        public ListIncidentDetailTimelinesResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
