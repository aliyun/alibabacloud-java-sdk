// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AnalyzeConversationResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return Result. The content varies depending on the analysis job.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;订单号&quot;: &quot;1234&quot;,
     *   &quot;商品名称&quot;: &quot;笔记本&quot;
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, which can be used for LogSearch of this API.</p>
     * 
     * <strong>example:</strong>
     * <p>9F766284-F103-4298-8EC5-19F9F9BE5522</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AnalyzeConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeConversationResponseBody self = new AnalyzeConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeConversationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AnalyzeConversationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AnalyzeConversationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AnalyzeConversationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AnalyzeConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
