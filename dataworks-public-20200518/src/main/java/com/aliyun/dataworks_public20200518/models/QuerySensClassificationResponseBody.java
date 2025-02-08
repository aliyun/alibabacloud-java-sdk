// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QuerySensClassificationResponseBody extends TeaModel {
    /**
     * <p>The returned data about data categories. The data is in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{         &quot;nodeName&quot;: &quot;teset1&quot;,         &quot;sensitiveNotNull&quot;: true,         &quot;nodeId&quot;: &quot;1aac2e35-b437-486b-95c7-a5ae48371024&quot;,         &quot;nodeOldId&quot;: &quot;1aac2e35-b437-486b-95c7-a5ae48371024&quot;,         &quot;parentId&quot;: &quot;0&quot;     }]</p>
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
     * <p>400</p>
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

    public static QuerySensClassificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySensClassificationResponseBody self = new QuerySensClassificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySensClassificationResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public QuerySensClassificationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QuerySensClassificationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySensClassificationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QuerySensClassificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySensClassificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
