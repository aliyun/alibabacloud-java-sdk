// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFlashSmsTemplatesResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListFlashSmsTemplatesResponseBodyData> data;

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
     * <p>List of error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BEEA660-A45A-45E3-98CC-AFC65E715C23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFlashSmsTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsTemplatesResponseBody self = new ListFlashSmsTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlashSmsTemplatesResponseBody setData(java.util.List<ListFlashSmsTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFlashSmsTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListFlashSmsTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFlashSmsTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlashSmsTemplatesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListFlashSmsTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlashSmsTemplatesResponseBodyData extends TeaModel {
        @NameInMap("TemplateDetails")
        public String templateDetails;

        /**
         * <p>Template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1715*****38</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>Template name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试模板</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static ListFlashSmsTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsTemplatesResponseBodyData self = new ListFlashSmsTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsTemplatesResponseBodyData setTemplateDetails(String templateDetails) {
            this.templateDetails = templateDetails;
            return this;
        }
        public String getTemplateDetails() {
            return this.templateDetails;
        }

        public ListFlashSmsTemplatesResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListFlashSmsTemplatesResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
