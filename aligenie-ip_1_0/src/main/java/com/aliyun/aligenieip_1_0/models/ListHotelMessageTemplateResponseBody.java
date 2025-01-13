// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelMessageTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListHotelMessageTemplateResponseBodyResult> result;

    public static ListHotelMessageTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelMessageTemplateResponseBody self = new ListHotelMessageTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelMessageTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHotelMessageTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelMessageTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelMessageTemplateResponseBody setResult(java.util.List<ListHotelMessageTemplateResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListHotelMessageTemplateResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListHotelMessageTemplateResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>不通过</p>
         */
        @NameInMap("AuditMark")
        public String auditMark;

        /**
         * <strong>example:</strong>
         * <p>COMMIT</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <strong>example:</strong>
         * <p>这是${hotel}的一个测试模板</p>
         */
        @NameInMap("TemplateDetail")
        public String templateDetail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <strong>example:</strong>
         * <p>测试模板</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static ListHotelMessageTemplateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelMessageTemplateResponseBodyResult self = new ListHotelMessageTemplateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelMessageTemplateResponseBodyResult setAuditMark(String auditMark) {
            this.auditMark = auditMark;
            return this;
        }
        public String getAuditMark() {
            return this.auditMark;
        }

        public ListHotelMessageTemplateResponseBodyResult setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public ListHotelMessageTemplateResponseBodyResult setTemplateDetail(String templateDetail) {
            this.templateDetail = templateDetail;
            return this;
        }
        public String getTemplateDetail() {
            return this.templateDetail;
        }

        public ListHotelMessageTemplateResponseBodyResult setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListHotelMessageTemplateResponseBodyResult setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
