// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateViewRequest extends TeaModel {
    @NameInMap("AppGuid")
    public String appGuid;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("SelectColumn")
    public String selectColumn;

    @NameInMap("SelectSQL")
    public String selectSQL;

    @NameInMap("SelectTableName")
    public String selectTableName;

    @NameInMap("SelectWhere")
    public String selectWhere;

    @NameInMap("ViewColumn")
    public java.util.List<CreateViewRequestViewColumn> viewColumn;

    @NameInMap("ViewName")
    public String viewName;

    public static CreateViewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateViewRequest self = new CreateViewRequest();
        return TeaModel.build(map, self);
    }

    public CreateViewRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public CreateViewRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateViewRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateViewRequest setSelectColumn(String selectColumn) {
        this.selectColumn = selectColumn;
        return this;
    }
    public String getSelectColumn() {
        return this.selectColumn;
    }

    public CreateViewRequest setSelectSQL(String selectSQL) {
        this.selectSQL = selectSQL;
        return this;
    }
    public String getSelectSQL() {
        return this.selectSQL;
    }

    public CreateViewRequest setSelectTableName(String selectTableName) {
        this.selectTableName = selectTableName;
        return this;
    }
    public String getSelectTableName() {
        return this.selectTableName;
    }

    public CreateViewRequest setSelectWhere(String selectWhere) {
        this.selectWhere = selectWhere;
        return this;
    }
    public String getSelectWhere() {
        return this.selectWhere;
    }

    public CreateViewRequest setViewColumn(java.util.List<CreateViewRequestViewColumn> viewColumn) {
        this.viewColumn = viewColumn;
        return this;
    }
    public java.util.List<CreateViewRequestViewColumn> getViewColumn() {
        return this.viewColumn;
    }

    public CreateViewRequest setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

    public static class CreateViewRequestViewColumn extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("Comment")
        public String comment;

        public static CreateViewRequestViewColumn build(java.util.Map<String, ?> map) throws Exception {
            CreateViewRequestViewColumn self = new CreateViewRequestViewColumn();
            return TeaModel.build(map, self);
        }

        public CreateViewRequestViewColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateViewRequestViewColumn setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

    }

}
