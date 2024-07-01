// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class LogAnalyzeResult extends TeaModel {
    @NameInMap("AppErrorAdvice")
    public String appErrorAdvice;

    /**
     * <strong>example:</strong>
     * <p>EXCEEDED_QUOTA</p>
     */
    @NameInMap("AppErrorCode")
    public String appErrorCode;

    /**
     * <strong>example:</strong>
     * <p>exception: xxxx</p>
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
