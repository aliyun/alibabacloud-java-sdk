// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionTemplatesResponseBody extends TeaModel {
    @NameInMap("DataIngestionTemplates")
    public java.util.List<ListDataIngestionTemplatesResponseBodyDataIngestionTemplates> dataIngestionTemplates;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDataIngestionTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataIngestionTemplatesResponseBody self = new ListDataIngestionTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataIngestionTemplatesResponseBody setDataIngestionTemplates(java.util.List<ListDataIngestionTemplatesResponseBodyDataIngestionTemplates> dataIngestionTemplates) {
        this.dataIngestionTemplates = dataIngestionTemplates;
        return this;
    }
    public java.util.List<ListDataIngestionTemplatesResponseBodyDataIngestionTemplates> getDataIngestionTemplates() {
        return this.dataIngestionTemplates;
    }

    public ListDataIngestionTemplatesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDataIngestionTemplatesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDataIngestionTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataIngestionTemplatesResponseBodyDataIngestionTemplates extends TeaModel {
        @NameInMap("CapacityCount")
        public String capacityCount;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DataIngestionMode")
        public String dataIngestionMode;

        @NameInMap("DataIngestionStatus")
        public String dataIngestionStatus;

        @NameInMap("DataIngestionTemplateId")
        public String dataIngestionTemplateId;

        @NameInMap("DataIngestionTemplateName")
        public String dataIngestionTemplateName;

        @NameInMap("DataIngestionTemplateStatus")
        public String dataIngestionTemplateStatus;

        @NameInMap("DataSourceTemplateId")
        public String dataSourceTemplateId;

        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        @NameInMap("NormalizationRuleName")
        public String normalizationRuleName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDataIngestionTemplatesResponseBodyDataIngestionTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListDataIngestionTemplatesResponseBodyDataIngestionTemplates self = new ListDataIngestionTemplatesResponseBodyDataIngestionTemplates();
            return TeaModel.build(map, self);
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setCapacityCount(String capacityCount) {
            this.capacityCount = capacityCount;
            return this;
        }
        public String getCapacityCount() {
            return this.capacityCount;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setDataIngestionMode(String dataIngestionMode) {
            this.dataIngestionMode = dataIngestionMode;
            return this;
        }
        public String getDataIngestionMode() {
            return this.dataIngestionMode;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setDataIngestionStatus(String dataIngestionStatus) {
            this.dataIngestionStatus = dataIngestionStatus;
            return this;
        }
        public String getDataIngestionStatus() {
            return this.dataIngestionStatus;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setDataIngestionTemplateId(String dataIngestionTemplateId) {
            this.dataIngestionTemplateId = dataIngestionTemplateId;
            return this;
        }
        public String getDataIngestionTemplateId() {
            return this.dataIngestionTemplateId;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setDataIngestionTemplateName(String dataIngestionTemplateName) {
            this.dataIngestionTemplateName = dataIngestionTemplateName;
            return this;
        }
        public String getDataIngestionTemplateName() {
            return this.dataIngestionTemplateName;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setDataIngestionTemplateStatus(String dataIngestionTemplateStatus) {
            this.dataIngestionTemplateStatus = dataIngestionTemplateStatus;
            return this;
        }
        public String getDataIngestionTemplateStatus() {
            return this.dataIngestionTemplateStatus;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setDataSourceTemplateId(String dataSourceTemplateId) {
            this.dataSourceTemplateId = dataSourceTemplateId;
            return this;
        }
        public String getDataSourceTemplateId() {
            return this.dataSourceTemplateId;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setNormalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setNormalizationRuleName(String normalizationRuleName) {
            this.normalizationRuleName = normalizationRuleName;
            return this;
        }
        public String getNormalizationRuleName() {
            return this.normalizationRuleName;
        }

        public ListDataIngestionTemplatesResponseBodyDataIngestionTemplates setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
