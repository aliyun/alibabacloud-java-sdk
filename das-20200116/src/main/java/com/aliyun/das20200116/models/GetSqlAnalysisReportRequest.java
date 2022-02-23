// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlAnalysisReportRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("ModuleNameList")
    public String moduleNameList;

    @NameInMap("TaskId")
    public String taskId;

    public static GetSqlAnalysisReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSqlAnalysisReportRequest self = new GetSqlAnalysisReportRequest();
        return TeaModel.build(map, self);
    }

    public GetSqlAnalysisReportRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetSqlAnalysisReportRequest setModuleNameList(String moduleNameList) {
        this.moduleNameList = moduleNameList;
        return this;
    }
    public String getModuleNameList() {
        return this.moduleNameList;
    }

    public GetSqlAnalysisReportRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
