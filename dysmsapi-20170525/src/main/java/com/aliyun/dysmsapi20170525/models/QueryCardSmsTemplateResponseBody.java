// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/101346.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryCardSmsTemplateResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsTemplateResponseBody self = new QueryCardSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsTemplateResponseBody setData(QueryCardSmsTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCardSmsTemplateResponseBodyData getData() {
        return this.data;
    }

    public QueryCardSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSmsTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The array of objects.</p>
         */
        @NameInMap("Templates")
        public java.util.List<java.util.Map<String, ?>> templates;

        public static QueryCardSmsTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsTemplateResponseBodyData self = new QueryCardSmsTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsTemplateResponseBodyData setTemplates(java.util.List<java.util.Map<String, ?>> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTemplates() {
            return this.templates;
        }

    }

}
