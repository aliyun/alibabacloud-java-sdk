// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of data ingestion templates.</p>
     */
    @NameInMap("DataIngestionTemplates")
    public java.util.List<ListDataIngestionTemplatesResponseBodyDataIngestionTemplates> dataIngestionTemplates;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
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
        /**
         * <p>The number of associated security capabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CapacityCount")
        public String capacityCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data ingestion mode. Valid values:</p>
         * <ul>
         * <li>realtime</li>
         * <li>scan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>realtime</p>
         */
        @NameInMap("DataIngestionMode")
        public String dataIngestionMode;

        /**
         * <p>The accessed state of data ingestion. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("DataIngestionStatus")
        public String dataIngestionStatus;

        /**
         * <p>The data ingestion template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_account_snapshot_log</p>
         */
        @NameInMap("DataIngestionTemplateId")
        public String dataIngestionTemplateId;

        /**
         * <p>The data source template name.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_account_snapshot_log</p>
         */
        @NameInMap("DataIngestionTemplateName")
        public String dataIngestionTemplateName;

        /**
         * <p>The status of the data ingestion template. Valid values:</p>
         * <ul>
         * <li>pending</li>
         * <li>running</li>
         * <li>success</li>
         * <li>failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("DataIngestionTemplateStatus")
        public String dataIngestionTemplateStatus;

        /**
         * <p>The data source template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_account_snapshot_log_173326*******</p>
         */
        @NameInMap("DataSourceTemplateId")
        public String dataSourceTemplateId;

        /**
         * <p>The normalization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_actiontrail_event_rule</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        /**
         * <p>The normalization rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>normalization_rule_ke1RN</p>
         */
        @NameInMap("NormalizationRuleName")
        public String normalizationRuleName;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
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
