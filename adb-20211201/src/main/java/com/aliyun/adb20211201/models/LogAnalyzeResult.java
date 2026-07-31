// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class LogAnalyzeResult extends TeaModel {
    /**
     * <p>The solution for the error log.</p>
     * 
     * <strong>example:</strong>
     * <p>Please increase cpu quota for your resource group</p>
     */
    @NameInMap("AppErrorAdvice")
    public String appErrorAdvice;

    /**
     * <p>The error type if an analysis error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>EXCEEDED_QUOTA</p>
     */
    @NameInMap("AppErrorCode")
    public String appErrorCode;

    /**
     * <p>The error log of the Spark log analysis task.</p>
     * 
     * <strong>example:</strong>
     * <p>exception: cpu is exceeded limits 12/10</p>
     */
    @NameInMap("AppErrorLog")
    public String appErrorLog;

    public static LogAnalyzeResult build(java.util.Map<String, ?> map) throws Exception {
        LogAnalyzeResult self = new LogAnalyzeResult();
        return TeaModel.build(map, self);
    }

    public LogAnalyzeResult setAppErrorAdvice(String appErrorAdvice) {
        this.appErrorAdvice = appErrorAdvice;
        return this;
    }
    public String getAppErrorAdvice() {
        return this.appErrorAdvice;
    }

    public LogAnalyzeResult setAppErrorCode(String appErrorCode) {
        this.appErrorCode = appErrorCode;
        return this;
    }
    public String getAppErrorCode() {
        return this.appErrorCode;
    }

    public LogAnalyzeResult setAppErrorLog(String appErrorLog) {
        this.appErrorLog = appErrorLog;
        return this;
    }
    public String getAppErrorLog() {
        return this.appErrorLog;
    }

}
