// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutLogMonitorResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the log monitoring metric.</p>
     * 
     * <strong>example:</strong>
     * <p>16****</p>
     */
    @NameInMap("LogId")
    public String logId;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request was successful, <code>successful</code> is returned.</li>
     * <li>If the request failed, an error message is returned. Example: <code>alias of aggreate must be set value.</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91561287-0802-5F9C-9BDE-404C50D41B06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
