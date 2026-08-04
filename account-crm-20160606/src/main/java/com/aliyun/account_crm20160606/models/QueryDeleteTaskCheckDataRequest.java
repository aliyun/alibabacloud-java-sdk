// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryDeleteTaskCheckDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgAccountType")
    public String agAccountType;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("LongLang")
    public String longLang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mpk")
    public String mpk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public String pk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static QueryDeleteTaskCheckDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeleteTaskCheckDataRequest self = new QueryDeleteTaskCheckDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeleteTaskCheckDataRequest setAgAccountType(String agAccountType) {
        this.agAccountType = agAccountType;
        return this;
    }
    public String getAgAccountType() {
        return this.agAccountType;
    }

    public QueryDeleteTaskCheckDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryDeleteTaskCheckDataRequest setLongLang(String longLang) {
        this.longLang = longLang;
        return this;
    }
    public String getLongLang() {
        return this.longLang;
    }

    public QueryDeleteTaskCheckDataRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public QueryDeleteTaskCheckDataRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public QueryDeleteTaskCheckDataRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryDeleteTaskCheckDataRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
