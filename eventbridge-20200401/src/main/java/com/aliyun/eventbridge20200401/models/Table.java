// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Table extends TeaModel {
    @NameInMap("Catalog")
    public String catalog;

    @NameInMap("Columns")
    public java.util.List<TableColumns> columns;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RetentionPolicy")
    public TableRetentionPolicy retentionPolicy;

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
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("ColdTTL")
        public Integer coldTTL;

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
