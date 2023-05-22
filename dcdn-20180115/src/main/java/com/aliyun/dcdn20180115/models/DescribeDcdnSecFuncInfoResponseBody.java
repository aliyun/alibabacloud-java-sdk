// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSecFuncInfoResponseBody extends TeaModel {
    /**
     * <p>The parameters required by the code.</p>
     */
    @NameInMap("Content")
    public java.util.List<DescribeDcdnSecFuncInfoResponseBodyContent> content;

    /**
     * <p>The description of HTTP responses.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatus")
    public String httpStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return value for HTTP requests. Valid values:</p>
     * <br>
     * <p>*   0: OK.</p>
     * <p>*   Values other than 0: an error.</p>
     */
    @NameInMap("RetCode")
    public String retCode;

    public static DescribeDcdnSecFuncInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSecFuncInfoResponseBody self = new DescribeDcdnSecFuncInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSecFuncInfoResponseBody setContent(java.util.List<DescribeDcdnSecFuncInfoResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeDcdnSecFuncInfoResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeDcdnSecFuncInfoResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDcdnSecFuncInfoResponseBody setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }
    public String getHttpStatus() {
        return this.httpStatus;
    }

    public DescribeDcdnSecFuncInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnSecFuncInfoResponseBody setRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }
    public String getRetCode() {
        return this.retCode;
    }

    public static class DescribeDcdnSecFuncInfoResponseBodyContent extends TeaModel {
        /**
         * <p>The language (Chinese or English).</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The options in the drop-down list.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnSecFuncInfoResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSecFuncInfoResponseBodyContent self = new DescribeDcdnSecFuncInfoResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSecFuncInfoResponseBodyContent setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDcdnSecFuncInfoResponseBodyContent setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
