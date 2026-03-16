// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class CheckImageExistsResponseBody extends TeaModel {
    @NameInMap("Auctions")
    public CheckImageExistsResponseBodyAuctions auctions;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Exists")
    public Boolean exists;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>B3137727-7D6E-488C-BA21-0E034C38A879</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckImageExistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckImageExistsResponseBody self = new CheckImageExistsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckImageExistsResponseBody setAuctions(CheckImageExistsResponseBodyAuctions auctions) {
        this.auctions = auctions;
        return this;
    }
    public CheckImageExistsResponseBodyAuctions getAuctions() {
        return this.auctions;
    }

    public CheckImageExistsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CheckImageExistsResponseBody setExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    public Boolean getExists() {
        return this.exists;
    }

    public CheckImageExistsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CheckImageExistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckImageExistsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckImageExistsResponseBodyAuctions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>88888888</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <strong>example:</strong>
         * <p>zidingyi</p>
         */
        @NameInMap("CustomContent")
        public String customContent;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr")
        public Integer intAttr;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr2")
        public Integer intAttr2;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr3")
        public Integer intAttr3;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr4")
        public Integer intAttr4;

        /**
         * <strong>example:</strong>
         * <p>2092061_1.jpg</p>
         */
        @NameInMap("PicName")
        public String picName;

        /**
         * <strong>example:</strong>
         * <p>2092061_1</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr")
        public String strAttr;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr2")
        public String strAttr2;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr3")
        public String strAttr3;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr4")
        public String strAttr4;

        public static CheckImageExistsResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            CheckImageExistsResponseBodyAuctions self = new CheckImageExistsResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

        public CheckImageExistsResponseBodyAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public CheckImageExistsResponseBodyAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public CheckImageExistsResponseBodyAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public CheckImageExistsResponseBodyAuctions setIntAttr2(Integer intAttr2) {
            this.intAttr2 = intAttr2;
            return this;
        }
        public Integer getIntAttr2() {
            return this.intAttr2;
        }

        public CheckImageExistsResponseBodyAuctions setIntAttr3(Integer intAttr3) {
            this.intAttr3 = intAttr3;
            return this;
        }
        public Integer getIntAttr3() {
            return this.intAttr3;
        }

        public CheckImageExistsResponseBodyAuctions setIntAttr4(Integer intAttr4) {
            this.intAttr4 = intAttr4;
            return this;
        }
        public Integer getIntAttr4() {
            return this.intAttr4;
        }

        public CheckImageExistsResponseBodyAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public CheckImageExistsResponseBodyAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public CheckImageExistsResponseBodyAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

        public CheckImageExistsResponseBodyAuctions setStrAttr2(String strAttr2) {
            this.strAttr2 = strAttr2;
            return this;
        }
        public String getStrAttr2() {
            return this.strAttr2;
        }

        public CheckImageExistsResponseBodyAuctions setStrAttr3(String strAttr3) {
            this.strAttr3 = strAttr3;
            return this;
        }
        public String getStrAttr3() {
            return this.strAttr3;
        }

        public CheckImageExistsResponseBodyAuctions setStrAttr4(String strAttr4) {
            this.strAttr4 = strAttr4;
            return this;
        }
        public String getStrAttr4() {
            return this.strAttr4;
        }

    }

}
