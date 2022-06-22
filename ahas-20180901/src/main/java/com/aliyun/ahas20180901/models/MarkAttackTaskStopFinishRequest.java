// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class MarkAttackTaskStopFinishRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("TaskId")
    public String taskId;

    public static MarkAttackTaskStopFinishRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkAttackTaskStopFinishRequest self = new MarkAttackTaskStopFinishRequest();
        return TeaModel.build(map, self);
    }

    public MarkAttackTaskStopFinishRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public MarkAttackTaskStopFinishRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MarkAttackTaskStopFinishRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public MarkAttackTaskStopFinishRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
