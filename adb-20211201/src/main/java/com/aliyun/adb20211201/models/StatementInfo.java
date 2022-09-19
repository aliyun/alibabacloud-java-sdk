// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StatementInfo extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CompletedTimeInMills")
    public Long completedTimeInMills;

    @NameInMap("Output")
    public String output;

    @NameInMap("Process")
    public Float process;

    @NameInMap("StartedTimeInMills")
    public Long startedTimeInMills;

    @NameInMap("State")
    public String state;

    @NameInMap("StatementId")
    public String statementId;

    public static StatementInfo build(java.util.Map<String, ?> map) throws Exception {
        StatementInfo self = new StatementInfo();
        return TeaModel.build(map, self);
    }

    public StatementInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StatementInfo setCompletedTimeInMills(Long completedTimeInMills) {
        this.completedTimeInMills = completedTimeInMills;
        return this;
    }
    public Long getCompletedTimeInMills() {
        return this.completedTimeInMills;
    }

    public StatementInfo setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public StatementInfo setProcess(Float process) {
        this.process = process;
        return this;
    }
    public Float getProcess() {
        return this.process;
    }

    public StatementInfo setStartedTimeInMills(Long startedTimeInMills) {
        this.startedTimeInMills = startedTimeInMills;
        return this;
    }
    public Long getStartedTimeInMills() {
        return this.startedTimeInMills;
    }

    public StatementInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public StatementInfo setStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }
    public String getStatementId() {
        return this.statementId;
    }

}
