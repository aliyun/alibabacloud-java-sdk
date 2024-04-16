// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class TaskSnapshot extends TeaModel {
    @NameInMap("bizId")
    public String bizId;

    @NameInMap("commiter")
    public Long commiter;

    @NameInMap("gmtCreated")
    public String gmtCreated;

    @NameInMap("item")
    public Task item;

    @NameInMap("message")
    public String message;

    @NameInMap("taskBizId")
    public String taskBizId;

    @NameInMap("version")
    public String version;

    public static TaskSnapshot build(java.util.Map<String, ?> map) throws Exception {
        TaskSnapshot self = new TaskSnapshot();
        return TeaModel.build(map, self);
    }

    public TaskSnapshot setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public TaskSnapshot setCommiter(Long commiter) {
        this.commiter = commiter;
        return this;
    }
    public Long getCommiter() {
        return this.commiter;
    }

    public TaskSnapshot setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public TaskSnapshot setItem(Task item) {
        this.item = item;
        return this;
    }
    public Task getItem() {
        return this.item;
    }

    public TaskSnapshot setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskSnapshot setTaskBizId(String taskBizId) {
        this.taskBizId = taskBizId;
        return this;
    }
    public String getTaskBizId() {
        return this.taskBizId;
    }

    public TaskSnapshot setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
