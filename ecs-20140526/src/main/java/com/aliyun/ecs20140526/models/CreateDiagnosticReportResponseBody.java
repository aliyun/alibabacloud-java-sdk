// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiagnosticReportResponseBody extends TeaModel {
    @NameInMap("CommandInvokeResults")
    public CreateDiagnosticReportResponseBodyCommandInvokeResults commandInvokeResults;

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

    public CreateDiagnosticReportResponseBody setCommandInvokeResults(CreateDiagnosticReportResponseBodyCommandInvokeResults commandInvokeResults) {
        this.commandInvokeResults = commandInvokeResults;
        return this;
    }
    public CreateDiagnosticReportResponseBodyCommandInvokeResults getCommandInvokeResults() {
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

    public static class CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult extends TeaModel {
        @NameInMap("CommandName")
        public String commandName;

        @NameInMap("DataFileDir")
        public String dataFileDir;

        @NameInMap("InvokeResult")
        public String invokeResult;

        public static CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult self = new CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult();
            return TeaModel.build(map, self);
        }

        public CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult setCommandName(String commandName) {
            this.commandName = commandName;
            return this;
        }
        public String getCommandName() {
            return this.commandName;
        }

        public CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult setDataFileDir(String dataFileDir) {
            this.dataFileDir = dataFileDir;
            return this;
        }
        public String getDataFileDir() {
            return this.dataFileDir;
        }

        public CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult setInvokeResult(String invokeResult) {
            this.invokeResult = invokeResult;
            return this;
        }
        public String getInvokeResult() {
            return this.invokeResult;
        }

    }

    public static class CreateDiagnosticReportResponseBodyCommandInvokeResults extends TeaModel {
        @NameInMap("InvokeResult")
        public java.util.List<CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult> invokeResult;

        public static CreateDiagnosticReportResponseBodyCommandInvokeResults build(java.util.Map<String, ?> map) throws Exception {
            CreateDiagnosticReportResponseBodyCommandInvokeResults self = new CreateDiagnosticReportResponseBodyCommandInvokeResults();
            return TeaModel.build(map, self);
        }

        public CreateDiagnosticReportResponseBodyCommandInvokeResults setInvokeResult(java.util.List<CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult> invokeResult) {
            this.invokeResult = invokeResult;
            return this;
        }
        public java.util.List<CreateDiagnosticReportResponseBodyCommandInvokeResultsInvokeResult> getInvokeResult() {
            return this.invokeResult;
        }

    }

}
