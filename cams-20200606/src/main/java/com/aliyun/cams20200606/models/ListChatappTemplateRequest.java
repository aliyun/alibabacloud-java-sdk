// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateRequest extends TeaModel {
    /**
     * <p>The review status of the message template. Valid values:</p>
     * <ul>
     * <li><strong>pass</strong>: The message template is approved.</li>
     * <li><strong>fail</strong>: The message template is rejected.</li>
     * <li><strong>auditing</strong>: The message template is being reviewed.</li>
     * <li><strong>unaudit</strong>: The review is suspended.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("AuditStatus")
    public String auditStatus;

    /**
     * <p>Template encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>838888822*****</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The space ID of the user under the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>28251486512358****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
     * <blockquote>
     * <p> CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65921621816****</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikdkkdk</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the message template.</p>
     * 
     * <strong>example:</strong>
     * <p>hello_whatsapp</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination settings.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;page&quot;: &quot;{\&quot;index\&quot;: 1,\&quot;size\&quot;: 20}</p>
     */
    @NameInMap("Page")
    public ListChatappTemplateRequestPage page;

    /**
     * <p>The type of the message template.</p>
     * <ul>
     * <li><strong>WHATSAPP</strong></li>
     * <li><strong>VIBER</strong></li>
     * <li>LINE: the Line message template. This type of message template will be released later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ListChatappTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatappTemplateRequest self = new ListChatappTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListChatappTemplateRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public ListChatappTemplateRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatappTemplateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    @Deprecated
    public ListChatappTemplateRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public ListChatappTemplateRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public ListChatappTemplateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListChatappTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListChatappTemplateRequest setPage(ListChatappTemplateRequestPage page) {
        this.page = page;
        return this;
    }
    public ListChatappTemplateRequestPage getPage() {
        return this.page;
    }

    public ListChatappTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public static class ListChatappTemplateRequestPage extends TeaModel {
        /**
         * <p>The page number. Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static ListChatappTemplateRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListChatappTemplateRequestPage self = new ListChatappTemplateRequestPage();
            return TeaModel.build(map, self);
        }

        public ListChatappTemplateRequestPage setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListChatappTemplateRequestPage setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
