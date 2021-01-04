// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteScriptRequest extends TeaModel {
    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("Script")
    public String script;

    @NameInMap("Logic")
    public Boolean logic;

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

    public ExecuteScriptRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public ExecuteScriptRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ExecuteScriptRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
