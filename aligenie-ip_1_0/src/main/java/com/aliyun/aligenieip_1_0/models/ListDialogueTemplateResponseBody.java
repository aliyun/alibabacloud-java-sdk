// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListDialogueTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDialogueTemplateResponseBodyResult> result;

    public static ListDialogueTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDialogueTemplateResponseBody self = new ListDialogueTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDialogueTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDialogueTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDialogueTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDialogueTemplateResponseBody setResult(java.util.List<ListDialogueTemplateResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDialogueTemplateResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate extends TeaModel {
        @NameInMap("NonzeroPriceYesAnswer")
        public String nonzeroPriceYesAnswer;

        @NameInMap("ZeroPriceNoAnswer")
        public String zeroPriceNoAnswer;

        @NameInMap("ZeroPriceYesAnswer")
        public String zeroPriceYesAnswer;

        public static ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate self = new ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate();
            return TeaModel.build(map, self);
        }

        public ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate setNonzeroPriceYesAnswer(String nonzeroPriceYesAnswer) {
            this.nonzeroPriceYesAnswer = nonzeroPriceYesAnswer;
            return this;
        }
        public String getNonzeroPriceYesAnswer() {
            return this.nonzeroPriceYesAnswer;
        }

        public ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate setZeroPriceNoAnswer(String zeroPriceNoAnswer) {
            this.zeroPriceNoAnswer = zeroPriceNoAnswer;
            return this;
        }
        public String getZeroPriceNoAnswer() {
            return this.zeroPriceNoAnswer;
        }

        public ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate setZeroPriceYesAnswer(String zeroPriceYesAnswer) {
            this.zeroPriceYesAnswer = zeroPriceYesAnswer;
            return this;
        }
        public String getZeroPriceYesAnswer() {
            return this.zeroPriceYesAnswer;
        }

    }

    public static class ListDialogueTemplateResponseBodyResultTemplateDetailSecondDialogueTemplate extends TeaModel {
        @NameInMap("NonzeroPriceNoAnswer")
        public String nonzeroPriceNoAnswer;

        @NameInMap("NonzeroPriceYesAnswer")
        public String nonzeroPriceYesAnswer;

        public static ListDialogueTemplateResponseBodyResultTemplateDetailSecondDialogueTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListDialogueTemplateResponseBodyResultTemplateDetailSecondDialogueTemplate self = new ListDialogueTemplateResponseBodyResultTemplateDetailSecondDialogueTemplate();
            return TeaModel.build(map, self);
        }

        public ListDialogueTemplateResponseBodyResultTemplateDetailSecondDialogueTemplate setNonzeroPriceNoAnswer(String nonzeroPriceNoAnswer) {
            this.nonzeroPriceNoAnswer = nonzeroPriceNoAnswer;
            return this;
        }
        public String getNonzeroPriceNoAnswer() {
            return this.nonzeroPriceNoAnswer;
        }

        public ListDialogueTemplateResponseBodyResultTemplateDetailSecondDialogueTemplate setNonzeroPriceYesAnswer(String nonzeroPriceYesAnswer) {
            this.nonzeroPriceYesAnswer = nonzeroPriceYesAnswer;
            return this;
        }
        public String getNonzeroPriceYesAnswer() {
            return this.nonzeroPriceYesAnswer;
        }

    }

    public static class ListDialogueTemplateResponseBodyResultTemplateDetail extends TeaModel {
        @NameInMap("FirstDialogueTemplate")
        public ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate firstDialogueTemplate;

        @NameInMap("SecondDialogueTemplate")
        public ListDialogueTemplateResponseBodyResultTemplateDetailSecondDialogueTemplate secondDialogueTemplate;

        public static ListDialogueTemplateResponseBodyResultTemplateDetail build(java.util.Map<String, ?> map) throws Exception {
            ListDialogueTemplateResponseBodyResultTemplateDetail self = new ListDialogueTemplateResponseBodyResultTemplateDetail();
            return TeaModel.build(map, self);
        }

        public ListDialogueTemplateResponseBodyResultTemplateDetail setFirstDialogueTemplate(ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate firstDialogueTemplate) {
            this.firstDialogueTemplate = firstDialogueTemplate;
            return this;
        }
        public ListDialogueTemplateResponseBodyResultTemplateDetailFirstDialogueTemplate getFirstDialogueTemplate() {
            return this.firstDialogueTemplate;
        }

        public ListDialogueTemplateResponseBodyResultTemplateDetail setSecondDialogueTemplate(ListDialogueTemplateResponseBodyResultTemplateDetailSecondDialogueTemplate secondDialogueTemplate) {
            this.secondDialogueTemplate = secondDialogueTemplate;
            return this;
        }
        public ListDialogueTemplateResponseBodyResultTemplateDetailSecondDialogueTemplate getSecondDialogueTemplate() {
            return this.secondDialogueTemplate;
        }

    }

    public static class ListDialogueTemplateResponseBodyResult extends TeaModel {
        @NameInMap("TemplateDetail")
        public ListDialogueTemplateResponseBodyResultTemplateDetail templateDetail;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Type")
        public String type;

        public static ListDialogueTemplateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDialogueTemplateResponseBodyResult self = new ListDialogueTemplateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDialogueTemplateResponseBodyResult setTemplateDetail(ListDialogueTemplateResponseBodyResultTemplateDetail templateDetail) {
            this.templateDetail = templateDetail;
            return this;
        }
        public ListDialogueTemplateResponseBodyResultTemplateDetail getTemplateDetail() {
            return this.templateDetail;
        }

        public ListDialogueTemplateResponseBodyResult setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListDialogueTemplateResponseBodyResult setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListDialogueTemplateResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
