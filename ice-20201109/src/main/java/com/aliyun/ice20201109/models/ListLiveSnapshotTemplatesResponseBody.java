// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotTemplatesResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("TemplateList")
    public java.util.List<ListLiveSnapshotTemplatesResponseBodyTemplateList> templateList;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLiveSnapshotTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveSnapshotTemplatesResponseBody self = new ListLiveSnapshotTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveSnapshotTemplatesResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListLiveSnapshotTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveSnapshotTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveSnapshotTemplatesResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveSnapshotTemplatesResponseBody setTemplateList(java.util.List<ListLiveSnapshotTemplatesResponseBodyTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<ListLiveSnapshotTemplatesResponseBodyTemplateList> getTemplateList() {
        return this.templateList;
    }

    public ListLiveSnapshotTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLiveSnapshotTemplatesResponseBodyTemplateList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

        @NameInMap("Type")
        public String type;

        public static ListLiveSnapshotTemplatesResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveSnapshotTemplatesResponseBodyTemplateList self = new ListLiveSnapshotTemplatesResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public ListLiveSnapshotTemplatesResponseBodyTemplateList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLiveSnapshotTemplatesResponseBodyTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListLiveSnapshotTemplatesResponseBodyTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListLiveSnapshotTemplatesResponseBodyTemplateList setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public ListLiveSnapshotTemplatesResponseBodyTemplateList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
