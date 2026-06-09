// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Table extends TeaModel {
    /**
     * <p>表所属的数据目录名称</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>表的列定义列表。每列包含 Name（列名）、Type（数据类型）、Comment（备注）</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;主键&quot;}]</p>
     */
    @NameInMap("Columns")
    public java.util.List<TableColumns> columns;

    /**
     * <p>表的备注描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>测试事件表</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>表的创建时间（Unix 时间戳，毫秒）</p>
     * 
     * <strong>example:</strong>
     * <p>1717948800000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>事件表的唯一标识名称</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>表所属的命名空间名称</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>数据保留策略。包含热数据和冷数据的保留天数</p>
     */
    @NameInMap("RetentionPolicy")
    public TableRetentionPolicy retentionPolicy;

    /**
     * <p>表的最后更新时间（Unix 时间戳，毫秒）</p>
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
         * <p>冷数据保留天数，低成本归档存储</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ColdTTL")
        public Integer coldTTL;

        /**
         * <p>热数据保留天数，高性能查询存储</p>
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
