// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListJobTemplatesResponseBody extends TeaModel {
    /**
     * <p>The job templates.</p>
     */
    @NameInMap("JobTemplates")
    public java.util.List<ListJobTemplatesResponseBodyJobTemplates> jobTemplates;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
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
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of templates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListJobTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobTemplatesResponseBody self = new ListJobTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobTemplatesResponseBody setJobTemplates(java.util.List<ListJobTemplatesResponseBodyJobTemplates> jobTemplates) {
        this.jobTemplates = jobTemplates;
        return this;
    }
    public java.util.List<ListJobTemplatesResponseBodyJobTemplates> getJobTemplates() {
        return this.jobTemplates;
    }

    public ListJobTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobTemplatesResponseBodyJobTemplatesTags extends TeaModel {
        /**
         * <p>The job tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The job tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListJobTemplatesResponseBodyJobTemplatesTags build(java.util.Map<String, ?> map) throws Exception {
            ListJobTemplatesResponseBodyJobTemplatesTags self = new ListJobTemplatesResponseBodyJobTemplatesTags();
            return TeaModel.build(map, self);
        }

        public ListJobTemplatesResponseBodyJobTemplatesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobTemplatesResponseBodyJobTemplatesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListJobTemplatesResponseBodyJobTemplates extends TeaModel {
        /**
         * <p>The creation time. The example uses the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 11:09:59</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Demo</p>
         */
        @NameInMap("JobTemplateDescription")
        public String jobTemplateDescription;

        /**
         * <p>The job template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jt-xxxx</p>
         */
        @NameInMap("JobTemplateId")
        public String jobTemplateId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-template</p>
         */
        @NameInMap("JobTemplateName")
        public String jobTemplateName;

        /**
         * <p>The job template status.</p>
         * 
         * <strong>example:</strong>
         * <p>Working</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The job tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListJobTemplatesResponseBodyJobTemplatesTags> tags;

        /**
         * <p>The update time. The example uses the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 11:09:59</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListJobTemplatesResponseBodyJobTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListJobTemplatesResponseBodyJobTemplates self = new ListJobTemplatesResponseBodyJobTemplates();
            return TeaModel.build(map, self);
        }

        public ListJobTemplatesResponseBodyJobTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListJobTemplatesResponseBodyJobTemplates setJobTemplateDescription(String jobTemplateDescription) {
            this.jobTemplateDescription = jobTemplateDescription;
            return this;
        }
        public String getJobTemplateDescription() {
            return this.jobTemplateDescription;
        }

        public ListJobTemplatesResponseBodyJobTemplates setJobTemplateId(String jobTemplateId) {
            this.jobTemplateId = jobTemplateId;
            return this;
        }
        public String getJobTemplateId() {
            return this.jobTemplateId;
        }

        public ListJobTemplatesResponseBodyJobTemplates setJobTemplateName(String jobTemplateName) {
            this.jobTemplateName = jobTemplateName;
            return this;
        }
        public String getJobTemplateName() {
            return this.jobTemplateName;
        }

        public ListJobTemplatesResponseBodyJobTemplates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobTemplatesResponseBodyJobTemplates setTags(java.util.List<ListJobTemplatesResponseBodyJobTemplatesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListJobTemplatesResponseBodyJobTemplatesTags> getTags() {
            return this.tags;
        }

        public ListJobTemplatesResponseBodyJobTemplates setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
