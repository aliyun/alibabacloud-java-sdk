// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataSourceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>center。</p>
     */
    @NameInMap("DataSourceFrom")
    public String dataSourceFrom;

    @NameInMap("DataSourceIds")
    public String dataSourceIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>AD_LOG。</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceRecognizeEnabled")
    public Boolean dataSourceRecognizeEnabled;

    @NameInMap("DataSourceRecognizer")
    public String dataSourceRecognizer;

    @NameInMap("DataSourceReferences")
    public String dataSourceReferencesShrink;

    @NameInMap("DataSourceStores")
    public java.util.List<CreateDataSourceShrinkRequestDataSourceStores> dataSourceStores;

    @NameInMap("DataSourceTemplateId")
    public String dataSourceTemplateId;

    /**
     * <strong>example:</strong>
     * <p>preset。</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou。</p>
     */
    @NameInMap("LogProjectName")
    public String logProjectName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("LogRegionId")
    public String logRegionId;

    /**
     * <strong>example:</strong>
     * <p>mde_raw。</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
    @NameInMap("LogUserId")
    public Long logUserId;

    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static CreateDataSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceShrinkRequest self = new CreateDataSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceShrinkRequest setDataSourceFrom(String dataSourceFrom) {
        this.dataSourceFrom = dataSourceFrom;
        return this;
    }
    public String getDataSourceFrom() {
        return this.dataSourceFrom;
    }

    public CreateDataSourceShrinkRequest setDataSourceIdsShrink(String dataSourceIdsShrink) {
        this.dataSourceIdsShrink = dataSourceIdsShrink;
        return this;
    }
    public String getDataSourceIdsShrink() {
        return this.dataSourceIdsShrink;
    }

    public CreateDataSourceShrinkRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public CreateDataSourceShrinkRequest setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
        this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
        return this;
    }
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    public CreateDataSourceShrinkRequest setDataSourceRecognizer(String dataSourceRecognizer) {
        this.dataSourceRecognizer = dataSourceRecognizer;
        return this;
    }
    public String getDataSourceRecognizer() {
        return this.dataSourceRecognizer;
    }

    public CreateDataSourceShrinkRequest setDataSourceReferencesShrink(String dataSourceReferencesShrink) {
        this.dataSourceReferencesShrink = dataSourceReferencesShrink;
        return this;
    }
    public String getDataSourceReferencesShrink() {
        return this.dataSourceReferencesShrink;
    }

    public CreateDataSourceShrinkRequest setDataSourceStores(java.util.List<CreateDataSourceShrinkRequestDataSourceStores> dataSourceStores) {
        this.dataSourceStores = dataSourceStores;
        return this;
    }
    public java.util.List<CreateDataSourceShrinkRequestDataSourceStores> getDataSourceStores() {
        return this.dataSourceStores;
    }

    public CreateDataSourceShrinkRequest setDataSourceTemplateId(String dataSourceTemplateId) {
        this.dataSourceTemplateId = dataSourceTemplateId;
        return this;
    }
    public String getDataSourceTemplateId() {
        return this.dataSourceTemplateId;
    }

    public CreateDataSourceShrinkRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDataSourceShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDataSourceShrinkRequest setLogProjectName(String logProjectName) {
        this.logProjectName = logProjectName;
        return this;
    }
    public String getLogProjectName() {
        return this.logProjectName;
    }

    public CreateDataSourceShrinkRequest setLogRegionId(String logRegionId) {
        this.logRegionId = logRegionId;
        return this;
    }
    public String getLogRegionId() {
        return this.logRegionId;
    }

    public CreateDataSourceShrinkRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public CreateDataSourceShrinkRequest setLogUserId(Long logUserId) {
        this.logUserId = logUserId;
        return this;
    }
    public Long getLogUserId() {
        return this.logUserId;
    }

    public CreateDataSourceShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public CreateDataSourceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataSourceShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static class CreateDataSourceShrinkRequestDataSourceStores extends TeaModel {
        @NameInMap("DataSourceStoreFrom")
        public String dataSourceStoreFrom;

        @NameInMap("DataSourceStoreId")
        public String dataSourceStoreId;

        @NameInMap("DataSourceStoreStatus")
        public String dataSourceStoreStatus;

        /**
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou。</p>
         */
        @NameInMap("LogProjectName")
        public String logProjectName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou。</p>
         */
        @NameInMap("LogRegionId")
        public String logRegionId;

        /**
         * <strong>example:</strong>
         * <p>actiontrail_management-events。</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        public static CreateDataSourceShrinkRequestDataSourceStores build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceShrinkRequestDataSourceStores self = new CreateDataSourceShrinkRequestDataSourceStores();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceShrinkRequestDataSourceStores setDataSourceStoreFrom(String dataSourceStoreFrom) {
            this.dataSourceStoreFrom = dataSourceStoreFrom;
            return this;
        }
        public String getDataSourceStoreFrom() {
            return this.dataSourceStoreFrom;
        }

        public CreateDataSourceShrinkRequestDataSourceStores setDataSourceStoreId(String dataSourceStoreId) {
            this.dataSourceStoreId = dataSourceStoreId;
            return this;
        }
        public String getDataSourceStoreId() {
            return this.dataSourceStoreId;
        }

        public CreateDataSourceShrinkRequestDataSourceStores setDataSourceStoreStatus(String dataSourceStoreStatus) {
            this.dataSourceStoreStatus = dataSourceStoreStatus;
            return this;
        }
        public String getDataSourceStoreStatus() {
            return this.dataSourceStoreStatus;
        }

        public CreateDataSourceShrinkRequestDataSourceStores setLogProjectName(String logProjectName) {
            this.logProjectName = logProjectName;
            return this;
        }
        public String getLogProjectName() {
            return this.logProjectName;
        }

        public CreateDataSourceShrinkRequestDataSourceStores setLogRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }
        public String getLogRegionId() {
            return this.logRegionId;
        }

        public CreateDataSourceShrinkRequestDataSourceStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

    }

}
