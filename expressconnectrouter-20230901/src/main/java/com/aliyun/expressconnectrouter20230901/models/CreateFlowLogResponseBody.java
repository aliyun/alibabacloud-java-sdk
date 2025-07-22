// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateFlowLogResponseBody extends TeaModel {
    /**
     * <p>The queried information about the request denial.</p>
     * 
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed. For more information, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message. This parameter is used to replace the % <strong>s</strong> in the <strong>ErrMessage</strong> error message of the response parameter.</p>
     * <blockquote>
     * <p>For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter</strong> %<strong>s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The ID of the flow log.</p>
     * 
     * <strong>example:</strong>
     * <p>flowlog-m5evbtbpt****</p>
     */
    @NameInMap("FlowLogId")
    public String flowLogId;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
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
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>True</strong></li>
     * <li><strong>False</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogResponseBody self = new CreateFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowLogResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateFlowLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFlowLogResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CreateFlowLogResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CreateFlowLogResponseBody setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public CreateFlowLogResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateFlowLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
