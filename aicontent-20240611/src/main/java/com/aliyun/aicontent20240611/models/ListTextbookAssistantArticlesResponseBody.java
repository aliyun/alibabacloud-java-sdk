// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantArticlesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListTextbookAssistantArticlesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>70412360-4272-571A-827D-84C2C07C450F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
