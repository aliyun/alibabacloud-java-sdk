// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDiagnosticReportResponseBody extends TeaModel {
    @NameInMap("CommandInvokeResults")
    public CommandInvokeResults commandInvokeResults;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CreateDiagnosticReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticReportResponseBody self = new CreateDiagnosticReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticReportResponseBody setCommandInvokeResults(CommandInvokeResults commandInvokeResults) {
        this.commandInvokeResults = commandInvokeResults;
        return this;
    }
    public CommandInvokeResults getCommandInvokeResults() {
        return this.commandInvokeResults;
    }

    public CreateDiagnosticReportResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateDiagnosticReportResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public CreateDiagnosticReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDiagnosticReportResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class InvokeResult extends TeaModel {
        @NameInMap("CommandName")
        public String commandName;

        @NameInMap("DataFileDir")
        public String dataFileDir;

        @NameInMap("InvokeResult")
        public String invokeResult;

        public static InvokeResult build(java.util.Map<String, ?> map) throws Exception {
            InvokeResult self = new InvokeResult();
            return TeaModel.build(map, self);
        }

        public InvokeResult setCommandName(String commandName) {
            this.commandName = commandName;
            return this;
        }
        public String getCommandName() {
            return this.commandName;
        }

        public InvokeResult setDataFileDir(String dataFileDir) {
            this.dataFileDir = dataFileDir;
            return this;
        }
        public String getDataFileDir() {
            return this.dataFileDir;
        }

        public InvokeResult setInvokeResult(String invokeResult) {
            this.invokeResult = invokeResult;
            return this;
        }
        public String getInvokeResult() {
            return this.invokeResult;
        }

    }

    public static class CommandInvokeResults extends TeaModel {
        @NameInMap("InvokeResult")
        public java.util.List<InvokeResult> invokeResult;

        public static CommandInvokeResults build(java.util.Map<String, ?> map) throws Exception {
            CommandInvokeResults self = new CommandInvokeResults();
            return TeaModel.build(map, self);
        }

        public CommandInvokeResults setInvokeResult(java.util.List<InvokeResult> invokeResult) {
            this.invokeResult = invokeResult;
            return this;
        }
        public java.util.List<InvokeResult> getInvokeResult() {
            return this.invokeResult;
        }

    }

}
