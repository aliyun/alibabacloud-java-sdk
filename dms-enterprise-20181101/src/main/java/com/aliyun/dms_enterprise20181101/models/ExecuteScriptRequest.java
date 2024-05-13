// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteScriptRequest extends TeaModel {
    /**
     * <p>The ID of the database.</p>
     * <br>
     * <p>>  This parameter is equivalent to the DatabaseId parameter in the SearchDatabase, ListDatabases, and GetDatabase operations. You can call one of these operations to obtain the required database ID. For more information, see [SearchDatabase](https://help.aliyun.com/document_detail/141876.html), [ListDatabases](https://help.aliyun.com/document_detail/141873.html), and [GetDatabase](https://help.aliyun.com/document_detail/141869.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>Specifies whether the database is a logical database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The SQL statements to be executed. Data query language (DQL) statements, data definition language (DDL) statements, and data manipulation language (DML) statements are supported. The control mode of the instance that you want to query determines whether you can execute DDL and DML statements.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Script")
    public String script;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To obtain the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Tenant information](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ExecuteScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScriptRequest self = new ExecuteScriptRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteScriptRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public ExecuteScriptRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ExecuteScriptRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public ExecuteScriptRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
