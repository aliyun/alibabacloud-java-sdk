// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCardSmsTemplateResponseBody extends TeaModel {
    /**
     * <p>The request status code. Valid values:</p>
     * <ul>
     * <li><p>OK: The request was successful.</p>
     * </li>
     * <li><p>For a list of other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned by the operation.</p>
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
         * <p>The code for the card SMS template. You can view the <strong>Template Code</strong> on the <strong>Card SMS</strong> &gt; <a href="https://dysms.console.aliyun.com/domestic/card">template management</a> page in the console.</p>
         * <blockquote>
         * <p>The card SMS template must be approved before it can be used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CARD_SMS_2****</p>
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
