// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateReportResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>The value OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For information about other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryCardSmsTemplateReportResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B71F06CA-7735-183A-B52E-234EF8AFE14B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
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
         * <p>The list of returned data.</p>
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
