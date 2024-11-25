// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotTemplatesResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sorting order of the results by creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The list of the templates.</p>
     */
    @NameInMap("TemplateList")
    public java.util.List<ListLiveSnapshotTemplatesResponseBodyTemplateList> templateList;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T02:48:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The interval between two adjacent snapshots. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        /**
         * <p>The type of the template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>system</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
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
