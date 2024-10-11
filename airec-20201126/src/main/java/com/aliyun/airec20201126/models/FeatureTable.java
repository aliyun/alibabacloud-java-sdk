// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class FeatureTable extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30E70118-FC7C-4438-9287-583CE47266A9</p>
     */
    @NameInMap("FeatureTableId")
    public String featureTableId;

    /**
     * <strong>example:</strong>
     * <p>2021-12-10T02:59:54.000Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2021-12-10T02:59:54.000Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Meta")
    public FeatureTableMeta meta;

    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>ItemFeatureTable 物品特征表 UserFeatureTable 用户特征表</p>
     */
    @NameInMap("Type")
    public String type;

    public static FeatureTable build(java.util.Map<String, ?> map) throws Exception {
        FeatureTable self = new FeatureTable();
        return TeaModel.build(map, self);
    }

    public FeatureTable setFeatureTableId(String featureTableId) {
        this.featureTableId = featureTableId;
        return this;
    }
    public String getFeatureTableId() {
        return this.featureTableId;
    }

    public FeatureTable setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public FeatureTable setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public FeatureTable setMeta(FeatureTableMeta meta) {
        this.meta = meta;
        return this;
    }
    public FeatureTableMeta getMeta() {
        return this.meta;
    }

    public FeatureTable setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FeatureTable setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class FeatureTableMetaFeatureList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>com11</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>fn11</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <strong>example:</strong>
         * <p>fieldName11</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <strong>example:</strong>
         * <p>NotApplied 未应用 Applied 已应用</p>
         */
        @NameInMap("Status")
        public String status;

        public static FeatureTableMetaFeatureList build(java.util.Map<String, ?> map) throws Exception {
            FeatureTableMetaFeatureList self = new FeatureTableMetaFeatureList();
            return TeaModel.build(map, self);
        }

        public FeatureTableMetaFeatureList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public FeatureTableMetaFeatureList setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public FeatureTableMetaFeatureList setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public FeatureTableMetaFeatureList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class FeatureTableMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>907648f5-abae-44fd-a4c4-525cc25947e9</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("FeatureList")
        public java.util.List<FeatureTableMetaFeatureList> featureList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Internal")
        public Boolean internal;

        /**
         * <strong>example:</strong>
         * <p>FeatureTable</p>
         */
        @NameInMap("MetaType")
        public String metaType;

        /**
         * <strong>example:</strong>
         * <p>test_project.test_table</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("UpdateFrequency")
        public Long updateFrequency;

        public static FeatureTableMeta build(java.util.Map<String, ?> map) throws Exception {
            FeatureTableMeta self = new FeatureTableMeta();
            return TeaModel.build(map, self);
        }

        public FeatureTableMeta setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public FeatureTableMeta setFeatureList(java.util.List<FeatureTableMetaFeatureList> featureList) {
            this.featureList = featureList;
            return this;
        }
        public java.util.List<FeatureTableMetaFeatureList> getFeatureList() {
            return this.featureList;
        }

        public FeatureTableMeta setInternal(Boolean internal) {
            this.internal = internal;
            return this;
        }
        public Boolean getInternal() {
            return this.internal;
        }

        public FeatureTableMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public FeatureTableMeta setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public FeatureTableMeta setUpdateFrequency(Long updateFrequency) {
            this.updateFrequency = updateFrequency;
            return this;
        }
        public Long getUpdateFrequency() {
            return this.updateFrequency;
        }

    }

}
