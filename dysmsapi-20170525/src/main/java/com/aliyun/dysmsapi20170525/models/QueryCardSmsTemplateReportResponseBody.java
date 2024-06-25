// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateReportResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
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
    public QueryCardSmsTemplateReportResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CC89A90C-978F-46AC-B80D-54738371E7CA</p>
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

    public static QueryCardSmsTemplateReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsTemplateReportResponseBody self = new QueryCardSmsTemplateReportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsTemplateReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsTemplateReportResponseBody setData(QueryCardSmsTemplateReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCardSmsTemplateReportResponseBodyData getData() {
        return this.data;
    }

    public QueryCardSmsTemplateReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsTemplateReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSmsTemplateReportResponseBodyData extends TeaModel {
        /**
         * <p>The details of the data returned.</p>
         */
        @NameInMap("model")
        public java.util.List<java.util.Map<String, ?>> model;

        public static QueryCardSmsTemplateReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsTemplateReportResponseBodyData self = new QueryCardSmsTemplateReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsTemplateReportResponseBodyData setModel(java.util.List<java.util.Map<String, ?>> model) {
            this.model = model;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getModel() {
            return this.model;
        }

    }

}
