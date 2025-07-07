// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseTodoDealAccountTodoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Status")
    public String status;

    @NameInMap("TodoId")
    public String todoId;

    public static EnterpriseTodoDealAccountTodoRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseTodoDealAccountTodoRequest self = new EnterpriseTodoDealAccountTodoRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseTodoDealAccountTodoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseTodoDealAccountTodoRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseTodoDealAccountTodoRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseTodoDealAccountTodoRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseTodoDealAccountTodoRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public EnterpriseTodoDealAccountTodoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public EnterpriseTodoDealAccountTodoRequest setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

}
