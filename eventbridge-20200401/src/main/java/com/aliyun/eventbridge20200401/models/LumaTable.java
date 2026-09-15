// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class LumaTable extends TeaModel {
    /**
     * <p>The name of the data catalog to which the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The list of column definitions for the table. Each column contains Name (column name), Type (data type), and Comment (comment).</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;Primary key&quot;}]</p>
     */
    @NameInMap("Columns")
    public java.util.List<LumaTableColumns> columns;

    /**
     * <p>The comment of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>Test event table</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time of the table. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1717948800000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The unique name of the event table.</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the namespace to which the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The data retention policy, including the retention days for hot data and cold data.</p>
     */
    @NameInMap("RetentionPolicy")
    public LumaTableRetentionPolicy retentionPolicy;

    /**
     * <p>The last update time of the table. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1717948800000</p>
     */
    @NameInMap("UpdateTime")
    public Long updateTime;

    public static LumaTable build(java.util.Map<String, ?> map) throws Exception {
        LumaTable self = new LumaTable();
        return TeaModel.build(map, self);
    }

    public LumaTable setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public LumaTable setColumns(java.util.List<LumaTableColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<LumaTableColumns> getColumns() {
        return this.columns;
    }

    public LumaTable setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public LumaTable setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public LumaTable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LumaTable setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public LumaTable setRetentionPolicy(LumaTableRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
    public LumaTableRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    public LumaTable setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class LumaTableColumns extends TeaModel {
        /**
         * <p>The comment of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary key ID</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("Type")
        public String type;

        public static LumaTableColumns build(java.util.Map<String, ?> map) throws Exception {
            LumaTableColumns self = new LumaTableColumns();
            return TeaModel.build(map, self);
        }

        public LumaTableColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public LumaTableColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LumaTableColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class LumaTableRetentionPolicy extends TeaModel {
        /**
         * <p>The number of days to retain cold data in low-cost archival storage.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ColdTTL")
        public Integer coldTTL;

        /**
         * <p>The number of days to retain hot data in high-performance query storage.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("HotTTL")
        public Integer hotTTL;

        public static LumaTableRetentionPolicy build(java.util.Map<String, ?> map) throws Exception {
            LumaTableRetentionPolicy self = new LumaTableRetentionPolicy();
            return TeaModel.build(map, self);
        }

        public LumaTableRetentionPolicy setColdTTL(Integer coldTTL) {
            this.coldTTL = coldTTL;
            return this;
        }
        public Integer getColdTTL() {
            return this.coldTTL;
        }

        public LumaTableRetentionPolicy setHotTTL(Integer hotTTL) {
            this.hotTTL = hotTTL;
            return this;
        }
        public Integer getHotTTL() {
            return this.hotTTL;
        }

    }

}
