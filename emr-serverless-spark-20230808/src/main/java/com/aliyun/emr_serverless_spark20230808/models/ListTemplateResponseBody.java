// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListTemplateResponseBody extends TeaModel {
    /**
     * <p>The data list.</p>
     */
    @NameInMap("data")
    public java.util.List<Template> data;

    /**
     * <ul>
     * <li><p>If the value of success is false, an error code is returned.</p>
     * </li>
     * <li><p>If the value of success is true, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ERR-00000000</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <ul>
     * <li><p>If the value of success is false, an error message is returned.</p>
     * </li>
     * <li><p>If the value of success is true, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateResponseBody self = new ListTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateResponseBody setData(java.util.List<Template> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Template> getData() {
        return this.data;
    }

    public ListTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTemplateResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
