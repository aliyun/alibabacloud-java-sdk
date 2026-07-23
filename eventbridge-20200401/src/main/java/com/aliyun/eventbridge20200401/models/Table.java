// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Table extends TeaModel {
    /**
     * <p>The name of the data catalog to which the table belongs</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The column definition list of the table. Each column contains Name (column name), Type (data type), and Comment (remarks)</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;主键&quot;}]</p>
     */
    @NameInMap("Columns")
    public java.util.List<TableColumns> columns;

    /**
     * <p>Comment description of the table</p>
     * 
     * <strong>example:</strong>
     * <p>测试事件表</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time of the table (Unix timestamp, in milliseconds)</p>
     * 
     * <strong>example:</strong>
     * <p>1717948800000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The unique identifier name of the event table</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the namespace to which the table belongs</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Data retention policy. Includes the retention days for hot data and cold data</p>
     */
    @NameInMap("RetentionPolicy")
    public TableRetentionPolicy retentionPolicy;

    /**
     * <p>The last update time of the table (Unix timestamp, in milliseconds)</p>
     * 
     * <strong>example:</strong>
     * <p>1717948800000</p>
     */
    @NameInMap("UpdateTime")
    public Long updateTime;

    public static Table build(java.util.Map<String, ?> map) throws Exception {
        Table self = new Table();
        return TeaModel.build(map, self);
    }

    public Table setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public Table setColumns(java.util.List<TableColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<TableColumns> getColumns() {
        return this.columns;
    }

    public Table setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Table setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Table setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Table setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Table setRetentionPolicy(TableRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
    public TableRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    public Table setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class TableColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>主键ID</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("Type")
        public String type;

        public static TableColumns build(java.util.Map<String, ?> map) throws Exception {
            TableColumns self = new TableColumns();
            return TeaModel.build(map, self);
        }

        public TableColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public TableColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TableColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class TableRetentionPolicy extends TeaModel {
        /**
         * <p>Retention days for cold data, used for low-cost archival storage</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ColdTTL")
        public Integer coldTTL;

        /**
         * <p>Retention days for hot data, used for high-performance query storage</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("HotTTL")
        public Integer hotTTL;

        public static TableRetentionPolicy build(java.util.Map<String, ?> map) throws Exception {
            TableRetentionPolicy self = new TableRetentionPolicy();
            return TeaModel.build(map, self);
        }

        public TableRetentionPolicy setColdTTL(Integer coldTTL) {
            this.coldTTL = coldTTL;
            return this;
        }
        public Integer getColdTTL() {
            return this.coldTTL;
        }

        public TableRetentionPolicy setHotTTL(Integer hotTTL) {
            this.hotTTL = hotTTL;
            return this;
        }
        public Integer getHotTTL() {
            return this.hotTTL;
        }

    }

}
