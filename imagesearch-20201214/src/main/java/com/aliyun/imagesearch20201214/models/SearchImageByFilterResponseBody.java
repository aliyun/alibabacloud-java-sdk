// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByFilterResponseBody extends TeaModel {
    /**
     * <p>The product description information returned.</p>
     */
    @NameInMap("Auctions")
    public java.util.List<SearchImageByFilterResponseBodyAuctions> auctions;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li>0: success.</li>
     * <li>Non-zero: failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B3137727-7D6E-488C-BA21-0E034C38A879</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchImageByFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByFilterResponseBody self = new SearchImageByFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageByFilterResponseBody setAuctions(java.util.List<SearchImageByFilterResponseBodyAuctions> auctions) {
        this.auctions = auctions;
        return this;
    }
    public java.util.List<SearchImageByFilterResponseBodyAuctions> getAuctions() {
        return this.auctions;
    }

    public SearchImageByFilterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchImageByFilterResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SearchImageByFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageByFilterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchImageByFilterResponseBodyAuctions extends TeaModel {
        /**
         * <p>The image category.</p>
         * 
         * <strong>example:</strong>
         * <p>8888888</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The user-defined content.</p>
         * 
         * <strong>example:</strong>
         * <p>zidingyi</p>
         */
        @NameInMap("CustomContent")
        public String customContent;

        /**
         * <p>The integer type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr")
        public Integer intAttr;

        /**
         * <p>The integer type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr2")
        public Integer intAttr2;

        /**
         * <p>The integer type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr3")
        public Integer intAttr3;

        /**
         * <p>The integer type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr4")
        public Integer intAttr4;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>2092061_1.jpg</p>
         */
        @NameInMap("PicName")
        public String picName;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2092061_1</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The string type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr")
        public String strAttr;

        /**
         * <p>The string type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr2")
        public String strAttr2;

        /**
         * <p>The string type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr3")
        public String strAttr3;

        /**
         * <p>The string type attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrAttr4")
        public String strAttr4;

        public static SearchImageByFilterResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByFilterResponseBodyAuctions self = new SearchImageByFilterResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

        public SearchImageByFilterResponseBodyAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByFilterResponseBodyAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByFilterResponseBodyAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByFilterResponseBodyAuctions setIntAttr2(Integer intAttr2) {
            this.intAttr2 = intAttr2;
            return this;
        }
        public Integer getIntAttr2() {
            return this.intAttr2;
        }

        public SearchImageByFilterResponseBodyAuctions setIntAttr3(Integer intAttr3) {
            this.intAttr3 = intAttr3;
            return this;
        }
        public Integer getIntAttr3() {
            return this.intAttr3;
        }

        public SearchImageByFilterResponseBodyAuctions setIntAttr4(Integer intAttr4) {
            this.intAttr4 = intAttr4;
            return this;
        }
        public Integer getIntAttr4() {
            return this.intAttr4;
        }

        public SearchImageByFilterResponseBodyAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByFilterResponseBodyAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByFilterResponseBodyAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

        public SearchImageByFilterResponseBodyAuctions setStrAttr2(String strAttr2) {
            this.strAttr2 = strAttr2;
            return this;
        }
        public String getStrAttr2() {
            return this.strAttr2;
        }

        public SearchImageByFilterResponseBodyAuctions setStrAttr3(String strAttr3) {
            this.strAttr3 = strAttr3;
            return this;
        }
        public String getStrAttr3() {
            return this.strAttr3;
        }

        public SearchImageByFilterResponseBodyAuctions setStrAttr4(String strAttr4) {
            this.strAttr4 = strAttr4;
            return this;
        }
        public String getStrAttr4() {
            return this.strAttr4;
        }

    }

}
