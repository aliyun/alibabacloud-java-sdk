// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QuerySensNodeInfoResponseBody extends TeaModel {
    /**
     * <p>The returned business data in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;success&quot;: true, &quot;httpStatusCode&quot;: 200, &quot;data&quot;: { &quot;result&quot;: [ { &quot;sensitiveName&quot;: &quot;certificate expiration date&quot;, &quot;sensitiveId&quot;: &quot;fd4ff5a2-9537-43d1-8e4f-1d0b5ffaac12&quot;, &quot;status&quot;: 0, &quot;templateName&quot;: &quot;built-in classification and grading template&quot;, &quot;keyRuleId&quot;: &quot;228248921215042 certificate expiration date&quot;} ], &quot;totalCount&quot;: 1, &quot;currentPage&quot;: 1, &quot;pageSize&quot;: 10 }, &quot;requestId&quot;: 10000001}</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>9990030003</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Missing parameter</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
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

    public static QuerySensNodeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySensNodeInfoResponseBody self = new QuerySensNodeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySensNodeInfoResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public QuerySensNodeInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QuerySensNodeInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySensNodeInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QuerySensNodeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySensNodeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
