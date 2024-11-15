// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <ul>
     * <li>A value of OK indicates that the call is successful.</li>
     * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of the templates.</p>
     */
    @NameInMap("ListTemplate")
    public java.util.List<ListChatappTemplateResponseBodyListTemplate> listTemplate;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatappTemplateResponseBody self = new ListChatappTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatappTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListChatappTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatappTemplateResponseBody setListTemplate(java.util.List<ListChatappTemplateResponseBodyListTemplate> listTemplate) {
        this.listTemplate = listTemplate;
        return this;
    }
    public java.util.List<ListChatappTemplateResponseBodyListTemplate> getListTemplate() {
        return this.listTemplate;
    }

    public ListChatappTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatappTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatappTemplateResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListChatappTemplateResponseBodyListTemplate extends TeaModel {
        /**
         * <p>The review state of the message template. Valid values:</p>
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
         * <p>The category of the WhatsApp template. Valid values:</p>
         * <ul>
         * <li><strong>UTILITY</strong>: utility template</li>
         * <li><strong>MARKETING</strong>: marketing template</li>
         * <li><strong>AUTHENTICATION</strong>: authentication template</li>
         * </ul>
         * <p>The category of the Viber template. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: template that contains only text</li>
         * <li><strong>image</strong>: template that contains only an image</li>
         * <li><strong>text_image_button</strong>: template that contains text, an image, and a button</li>
         * <li><strong>text_button</strong>: template that contains text and a button</li>
         * <li><strong>document</strong>: template that contains only a document</li>
         * <li><strong>video</strong>: template that contains only a video</li>
         * <li><strong>text_video</strong>: template that contains text and a video</li>
         * <li><strong>text_video_button</strong>: template that contains text, a video, and a button</li>
         * <li><strong>text_image</strong>: template that contains text and an image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRANSACTIONAL</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The time when the template was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1711006633000</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <p>The reason for the review failure.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>744c4b5c79c9432497a075bdfca3****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The name of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_whatsapp</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of the template. Valid values: WHATSAPP and VIBER.</p>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static ListChatappTemplateResponseBodyListTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListChatappTemplateResponseBodyListTemplate self = new ListChatappTemplateResponseBodyListTemplate();
            return TeaModel.build(map, self);
        }

        public ListChatappTemplateResponseBodyListTemplate setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public ListChatappTemplateResponseBodyListTemplate setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListChatappTemplateResponseBodyListTemplate setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListChatappTemplateResponseBodyListTemplate setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public ListChatappTemplateResponseBodyListTemplate setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListChatappTemplateResponseBodyListTemplate setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListChatappTemplateResponseBodyListTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListChatappTemplateResponseBodyListTemplate setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
