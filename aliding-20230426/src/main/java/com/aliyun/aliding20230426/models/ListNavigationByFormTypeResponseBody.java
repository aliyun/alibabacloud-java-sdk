// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListNavigationByFormTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListNavigationByFormTypeResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static ListNavigationByFormTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNavigationByFormTypeResponseBody self = new ListNavigationByFormTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNavigationByFormTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNavigationByFormTypeResponseBody setResult(java.util.List<ListNavigationByFormTypeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListNavigationByFormTypeResponseBodyResult> getResult() {
        return this.result;
    }

    public ListNavigationByFormTypeResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListNavigationByFormTypeResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class ListNavigationByFormTypeResponseBodyResultTitle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("NameInChinese")
        public String nameInChinese;

        /**
         * <strong>example:</strong>
         * <p>ZhangSan</p>
         */
        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>未知</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListNavigationByFormTypeResponseBodyResultTitle build(java.util.Map<String, ?> map) throws Exception {
            ListNavigationByFormTypeResponseBodyResultTitle self = new ListNavigationByFormTypeResponseBodyResultTitle();
            return TeaModel.build(map, self);
        }

        public ListNavigationByFormTypeResponseBodyResultTitle setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public ListNavigationByFormTypeResponseBodyResultTitle setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public ListNavigationByFormTypeResponseBodyResultTitle setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListNavigationByFormTypeResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FORM-EF6Yxxx</p>
         */
        @NameInMap("FormUuid")
        public String formUuid;

        /**
         * <strong>example:</strong>
         * <p>TPROC--X1Gxxx</p>
         */
        @NameInMap("ProcessCode")
        public String processCode;

        @NameInMap("Title")
        public ListNavigationByFormTypeResponseBodyResultTitle title;

        public static ListNavigationByFormTypeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListNavigationByFormTypeResponseBodyResult self = new ListNavigationByFormTypeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListNavigationByFormTypeResponseBodyResult setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public ListNavigationByFormTypeResponseBodyResult setProcessCode(String processCode) {
            this.processCode = processCode;
            return this;
        }
        public String getProcessCode() {
            return this.processCode;
        }

        public ListNavigationByFormTypeResponseBodyResult setTitle(ListNavigationByFormTypeResponseBodyResultTitle title) {
            this.title = title;
            return this;
        }
        public ListNavigationByFormTypeResponseBodyResultTitle getTitle() {
            return this.title;
        }

    }

}
