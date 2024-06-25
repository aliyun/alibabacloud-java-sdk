// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCardSmsTemplateResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
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
    public CreateCardSmsTemplateResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
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

    public static CreateCardSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCardSmsTemplateResponseBody self = new CreateCardSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCardSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCardSmsTemplateResponseBody setData(CreateCardSmsTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCardSmsTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateCardSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCardSmsTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCardSmsTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The code of the message template.</p>
         * <p>You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the <a href="https://dysms.console.aliyun.com/dysms.htm?spm=5176.12818093.categories-n-products.ddysms.3b2816d0xml2NA#/overview">Alibaba Cloud SMS console</a>.</p>
         * <blockquote>
         * <p>Make sure that the message template has been approved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CARD_SMS_60000****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static CreateCardSmsTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCardSmsTemplateResponseBodyData self = new CreateCardSmsTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCardSmsTemplateResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

}
