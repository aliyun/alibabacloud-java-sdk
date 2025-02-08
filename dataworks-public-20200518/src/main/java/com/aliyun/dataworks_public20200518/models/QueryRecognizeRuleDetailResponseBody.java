// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryRecognizeRuleDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the sensitive field in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nodeName&quot;:&quot;basic unit overview&quot;,&quot;gmtModified&quot;:1709017449000,&quot;hitThreshold&quot;:30,&quot;sensitiveName&quot;:&quot;mobile-yinni&quot;,&quot;templateId&quot;:&quot;8222abeb-9784-4417-b420-0322926d5cbf&quot;,&quot;recognizeRulesType&quot;:2,&quot;delete&quot;:false,&quot;bydAccuracy&quot;:1,&quot;colScan&quot;:&quot;,&quot; defineType &quot;:1,&quot;: ydAccuracy &quot;:{&quot; contentRule &quot;:)),&quot; operationType &quot;:0},&quot; nodeParent &quot;:&quot; unit/unit basic information/unit basic overview &quot;,&quot; level &quot;:6,&quot; keyRuleId &quot;:&quot; 228248921215042mobile-yinni &quot;,&quot; isDelete &quot;:false,&quot; levelName &quot;:&quot; 6level &quot;,&quot; sensitive &quot;:false,&quot; operationType &quot;:0,&quot; sourceName &quot;: dsg-test-zuoyue&quot;,&quot;nodeId&quot;:&quot;bea2fc81-90c9-45f3-b7a9-26d534208a0d&quot;,&quot;status&quot;:1}</p>
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
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
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

    public static QueryRecognizeRuleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognizeRuleDetailResponseBody self = new QueryRecognizeRuleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecognizeRuleDetailResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public QueryRecognizeRuleDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryRecognizeRuleDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecognizeRuleDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryRecognizeRuleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecognizeRuleDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
