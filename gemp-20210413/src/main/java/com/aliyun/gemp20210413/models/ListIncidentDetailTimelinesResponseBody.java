// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailTimelinesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<ListIncidentDetailTimelinesResponseBodyData> data;

    // 总数
    @NameInMap("totalCount")
    public Integer totalCount;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListIncidentDetailTimelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentDetailTimelinesResponseBody self = new ListIncidentDetailTimelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIncidentDetailTimelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIncidentDetailTimelinesResponseBody setData(java.util.List<ListIncidentDetailTimelinesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIncidentDetailTimelinesResponseBodyData> getData() {
        return this.data;
    }

    public ListIncidentDetailTimelinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public static class ListIncidentDetailTimelinesResponseBodyData extends TeaModel {
        // 主题
        @NameInMap("title")
        public String title;

        // 描述
        @NameInMap("description")
        public String description;

        // 备注
        @NameInMap("remark")
        public String remark;

        // 服务名称
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 事件Id
        @NameInMap("incidentId")
        public Long incidentId;

        // 事件action
        @NameInMap("action")
        public String action;

        public static ListIncidentDetailTimelinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailTimelinesResponseBodyData self = new ListIncidentDetailTimelinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailTimelinesResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListIncidentDetailTimelinesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIncidentDetailTimelinesResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListIncidentDetailTimelinesResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListIncidentDetailTimelinesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIncidentDetailTimelinesResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public ListIncidentDetailTimelinesResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

    }

}
