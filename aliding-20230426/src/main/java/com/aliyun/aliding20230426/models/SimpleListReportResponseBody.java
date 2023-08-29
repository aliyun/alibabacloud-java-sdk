// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SimpleListReportResponseBody extends TeaModel {
    @NameInMap("dataList")
    public java.util.List<SimpleListReportResponseBodyDataList> dataList;

    @NameInMap("hasMore")
    public Boolean hasMore;

    @NameInMap("nextCursor")
    public Long nextCursor;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("size")
    public Long size;

    public static SimpleListReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SimpleListReportResponseBody self = new SimpleListReportResponseBody();
        return TeaModel.build(map, self);
    }

    public SimpleListReportResponseBody setDataList(java.util.List<SimpleListReportResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<SimpleListReportResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public SimpleListReportResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public SimpleListReportResponseBody setNextCursor(Long nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public Long getNextCursor() {
        return this.nextCursor;
    }

    public SimpleListReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SimpleListReportResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public static class SimpleListReportResponseBodyDataList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("DeptName")
        public String deptName;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ReportId")
        public String reportId;

        @NameInMap("TemplateName")
        public String templateName;

        public static SimpleListReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            SimpleListReportResponseBodyDataList self = new SimpleListReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public SimpleListReportResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SimpleListReportResponseBodyDataList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public SimpleListReportResponseBodyDataList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public SimpleListReportResponseBodyDataList setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public SimpleListReportResponseBodyDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SimpleListReportResponseBodyDataList setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public SimpleListReportResponseBodyDataList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
