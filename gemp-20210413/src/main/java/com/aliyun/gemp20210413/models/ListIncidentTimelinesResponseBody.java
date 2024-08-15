// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentTimelinesResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListIncidentTimelinesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>132</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>INCIDENT_ADD</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>2021-06-23 00:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public Long description;

        /**
         * <strong>example:</strong>
         * <p>3321</p>
         */
        @NameInMap("incidentId")
        public Long incidentId;

        /**
         * <strong>example:</strong>
         * <p>I13002001</p>
         */
        @NameInMap("incidentNumber")
        public String incidentNumber;

        @NameInMap("incidentTitle")
        public String incidentTitle;

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

        public ListIncidentTimelinesResponseBodyData setRelRouteRuleDeleteType(Integer relRouteRuleDeleteType) {
            this.relRouteRuleDeleteType = relRouteRuleDeleteType;
            return this;
        }
        public Integer getRelRouteRuleDeleteType() {
            return this.relRouteRuleDeleteType;
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
