// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryFormationTaskByIDResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task details.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;id&quot;: 123,
     *     &quot;taskName&quot;: &quot;sale_db&quot;,
     *     &quot;scheduleState&quot;: &quot;NORMAL&quot;,
     *     &quot;frequency&quot;: {&quot;type&quot;: &quot;custom&quot;, &quot;cron&quot;: &quot;0 0/1 * * * ?&quot;},
     *     &quot;failedCount&quot;: 0,
     *     &quot;lastTaskInstContent&quot;: &quot;{\&quot;task_inst_id\&quot;:67890,\&quot;state\&quot;:\&quot;SUCCESS\&quot;}&quot;
     *   }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5DC10091-348D-12B1-906D-AB49D658012E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFormationTaskByIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFormationTaskByIDResponseBody self = new QueryFormationTaskByIDResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFormationTaskByIDResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFormationTaskByIDResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryFormationTaskByIDResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryFormationTaskByIDResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFormationTaskByIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFormationTaskByIDResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
