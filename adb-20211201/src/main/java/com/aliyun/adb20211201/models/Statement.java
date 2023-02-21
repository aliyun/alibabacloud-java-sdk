// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class Statement extends TeaModel {
    @NameInMap("AliyunUid")
    public Long aliyunUid;

    @NameInMap("Code")
    public String code;

    @NameInMap("CodeState")
    public String codeState;

    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Error")
    public String error;

    @NameInMap("HaveRows")
    public Boolean haveRows;

    @NameInMap("Output")
    public String output;

    @NameInMap("ResourceGroup")
    public String resourceGroup;

    @NameInMap("SessionId")
    public Long sessionId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StatementId")
    public Long statementId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static Statement build(java.util.Map<String, ?> map) throws Exception {
        Statement self = new Statement();
        return TeaModel.build(map, self);
    }

    public Statement setAliyunUid(Long aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public Long getAliyunUid() {
        return this.aliyunUid;
    }

    public Statement setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Statement setCodeState(String codeState) {
        this.codeState = codeState;
        return this;
    }
    public String getCodeState() {
        return this.codeState;
    }

    public Statement setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public Statement setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public Statement setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public Statement setHaveRows(Boolean haveRows) {
        this.haveRows = haveRows;
        return this;
    }
    public Boolean getHaveRows() {
        return this.haveRows;
    }

    public Statement setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public Statement setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public Statement setSessionId(Long sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public Long getSessionId() {
        return this.sessionId;
    }

    public Statement setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public Statement setStatementId(Long statementId) {
        this.statementId = statementId;
        return this;
    }
    public Long getStatementId() {
        return this.statementId;
    }

    public Statement setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
