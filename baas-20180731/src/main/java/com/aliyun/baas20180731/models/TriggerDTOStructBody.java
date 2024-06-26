// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class TriggerDTOStructBody extends TeaModel {
    @NameInMap("Checkpoint")
    public CheckPointStructBody checkpoint;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Name")
    public String name;

    @NameInMap("Option")
    public String option;

    @NameInMap("PendingErrorLogs")
    public String pendingErrorLogs;

    @NameInMap("Source")
    public String source;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static TriggerDTOStructBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerDTOStructBody self = new TriggerDTOStructBody();
        return TeaModel.build(map, self);
    }

    public TriggerDTOStructBody setCheckpoint(CheckPointStructBody checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public CheckPointStructBody getCheckpoint() {
        return this.checkpoint;
    }

    public TriggerDTOStructBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TriggerDTOStructBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TriggerDTOStructBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TriggerDTOStructBody setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public TriggerDTOStructBody setPendingErrorLogs(String pendingErrorLogs) {
        this.pendingErrorLogs = pendingErrorLogs;
        return this;
    }
    public String getPendingErrorLogs() {
        return this.pendingErrorLogs;
    }

    public TriggerDTOStructBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public TriggerDTOStructBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TriggerDTOStructBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
