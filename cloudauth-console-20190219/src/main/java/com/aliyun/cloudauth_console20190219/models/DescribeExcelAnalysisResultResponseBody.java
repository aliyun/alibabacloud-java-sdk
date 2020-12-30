// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeExcelAnalysisResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExcelResult")
    public DescribeExcelAnalysisResultResponseBodyExcelResult excelResult;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeExcelAnalysisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcelAnalysisResultResponseBody self = new DescribeExcelAnalysisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExcelAnalysisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExcelAnalysisResultResponseBody setExcelResult(DescribeExcelAnalysisResultResponseBodyExcelResult excelResult) {
        this.excelResult = excelResult;
        return this;
    }
    public DescribeExcelAnalysisResultResponseBodyExcelResult getExcelResult() {
        return this.excelResult;
    }

    public DescribeExcelAnalysisResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeExcelAnalysisResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeExcelAnalysisResultResponseBodyExcelResult extends TeaModel {
        @NameInMap("InsertCount")
        public Integer insertCount;

        @NameInMap("UpdateCount")
        public Integer updateCount;

        @NameInMap("ErrorCount")
        public Integer errorCount;

        @NameInMap("ErrorLine")
        public java.util.List<String> errorLine;

        @NameInMap("Total")
        public Integer total;

        public static DescribeExcelAnalysisResultResponseBodyExcelResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeExcelAnalysisResultResponseBodyExcelResult self = new DescribeExcelAnalysisResultResponseBodyExcelResult();
            return TeaModel.build(map, self);
        }

        public DescribeExcelAnalysisResultResponseBodyExcelResult setInsertCount(Integer insertCount) {
            this.insertCount = insertCount;
            return this;
        }
        public Integer getInsertCount() {
            return this.insertCount;
        }

        public DescribeExcelAnalysisResultResponseBodyExcelResult setUpdateCount(Integer updateCount) {
            this.updateCount = updateCount;
            return this;
        }
        public Integer getUpdateCount() {
            return this.updateCount;
        }

        public DescribeExcelAnalysisResultResponseBodyExcelResult setErrorCount(Integer errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Integer getErrorCount() {
            return this.errorCount;
        }

        public DescribeExcelAnalysisResultResponseBodyExcelResult setErrorLine(java.util.List<String> errorLine) {
            this.errorLine = errorLine;
            return this;
        }
        public java.util.List<String> getErrorLine() {
            return this.errorLine;
        }

        public DescribeExcelAnalysisResultResponseBodyExcelResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
