// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSecFuncInfoResponseBody extends TeaModel {
    /**
     * <p>Queried data.</p>
     */
    @NameInMap("Content")
    public java.util.List<DescribeCdnSecFuncInfoResponseBodyContent> content;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatus")
    public String httpStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP request response code.</p>
     * <br>
     * <p>*   0: OK.</p>
     * <p>*   Values other than 0: an error.</p>
     */
    @NameInMap("RetCode")
    public String retCode;

    public static DescribeCdnSecFuncInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSecFuncInfoResponseBody self = new DescribeCdnSecFuncInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSecFuncInfoResponseBody setContent(java.util.List<DescribeCdnSecFuncInfoResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeCdnSecFuncInfoResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeCdnSecFuncInfoResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeCdnSecFuncInfoResponseBody setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }
    public String getHttpStatus() {
        return this.httpStatus;
    }

    public DescribeCdnSecFuncInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnSecFuncInfoResponseBody setRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }
    public String getRetCode() {
        return this.retCode;
    }

    public static class DescribeCdnSecFuncInfoResponseBodyContent extends TeaModel {
        /**
         * <p>The tag.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCdnSecFuncInfoResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnSecFuncInfoResponseBodyContent self = new DescribeCdnSecFuncInfoResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeCdnSecFuncInfoResponseBodyContent setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeCdnSecFuncInfoResponseBodyContent setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
