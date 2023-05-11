// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutLogMonitorResponseBody extends TeaModel {
    /**
     * <p>The name of the Log Service Logstore.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LogId")
    public String logId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PutLogMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutLogMonitorResponseBody self = new PutLogMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public PutLogMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutLogMonitorResponseBody setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public PutLogMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutLogMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutLogMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
