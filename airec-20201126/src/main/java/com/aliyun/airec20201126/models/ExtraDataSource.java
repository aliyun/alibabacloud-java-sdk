// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ExtraDataSource extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E01D574F-ABD0-4C55-A5E3-8D24FD8D42EA</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>2021-12-07T13:26:29.000Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2021-12-07T13:26:29.000Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Meta")
    public ExtraDataSourceMeta meta;

    /**
     * <strong>example:</strong>
     * <p>Ready 待应用；Online 已应用；Failed失败</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>UserCustomDataSource、ItemCustomDataSource、BehaviorCustomDataSource、SampleCustomDataSource</p>
     */
    @NameInMap("Type")
    public String type;

    public static ExtraDataSource build(java.util.Map<String, ?> map) throws Exception {
        ExtraDataSource self = new ExtraDataSource();
        return TeaModel.build(map, self);
    }

    public ExtraDataSource setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ExtraDataSource setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ExtraDataSource setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ExtraDataSource setMeta(ExtraDataSourceMeta meta) {
        this.meta = meta;
        return this;
    }
    public ExtraDataSourceMeta getMeta() {
        return this.meta;
    }

    public ExtraDataSource setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExtraDataSource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ExtraDataSourceMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Internal")
        public Boolean internal;

        /**
         * <strong>example:</strong>
         * <p>ExtraDataSource</p>
         */
        @NameInMap("MetaType")
        public String metaType;

        /**
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("UpdateFrequency")
        public Long updateFrequency;

        public static ExtraDataSourceMeta build(java.util.Map<String, ?> map) throws Exception {
            ExtraDataSourceMeta self = new ExtraDataSourceMeta();
            return TeaModel.build(map, self);
        }

        public ExtraDataSourceMeta setInternal(Boolean internal) {
            this.internal = internal;
            return this;
        }
        public Boolean getInternal() {
            return this.internal;
        }

        public ExtraDataSourceMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public ExtraDataSourceMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ExtraDataSourceMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ExtraDataSourceMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExtraDataSourceMeta setUpdateFrequency(Long updateFrequency) {
            this.updateFrequency = updateFrequency;
            return this;
        }
        public Long getUpdateFrequency() {
            return this.updateFrequency;
        }

    }

}
