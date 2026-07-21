// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantArticlesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<ListTextbookAssistantArticlesResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>A value of 0 indicates success.</p>
     * </li>
     * <li><p>A value greater than 0 indicates a specific error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70412360-4272-571A-827D-84C2C07C450F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * <ul>
     * <li><p><strong>true</strong>: The call succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListTextbookAssistantArticlesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantArticlesResponseBody self = new ListTextbookAssistantArticlesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantArticlesResponseBody setData(java.util.List<ListTextbookAssistantArticlesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTextbookAssistantArticlesResponseBodyData> getData() {
        return this.data;
    }

    public ListTextbookAssistantArticlesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListTextbookAssistantArticlesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListTextbookAssistantArticlesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTextbookAssistantArticlesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTextbookAssistantArticlesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTextbookAssistantArticlesResponseBodyData extends TeaModel {
        /**
         * <p>The article ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0c05700d4d9411efbe6e0c42a106bb02</p>
         */
        @NameInMap("articleId")
        public String articleId;

        public static ListTextbookAssistantArticlesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantArticlesResponseBodyData self = new ListTextbookAssistantArticlesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantArticlesResponseBodyData setArticleId(String articleId) {
            this.articleId = articleId;
            return this;
        }
        public String getArticleId() {
            return this.articleId;
        }

    }

}
