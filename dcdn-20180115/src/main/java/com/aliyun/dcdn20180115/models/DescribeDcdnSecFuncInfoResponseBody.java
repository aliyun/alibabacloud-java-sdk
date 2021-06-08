// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSecFuncInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("RetCode")
    public String retCode;

    @NameInMap("HttpStatus")
    public String httpStatus;

    @NameInMap("Content")
    public java.util.List<DescribeDcdnSecFuncInfoResponseBodyContent> content;

    public static DescribeDcdnSecFuncInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSecFuncInfoResponseBody self = new DescribeDcdnSecFuncInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSecFuncInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnSecFuncInfoResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDcdnSecFuncInfoResponseBody setRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }
    public String getRetCode() {
        return this.retCode;
    }

    public DescribeDcdnSecFuncInfoResponseBody setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }
    public String getHttpStatus() {
        return this.httpStatus;
    }

    public DescribeDcdnSecFuncInfoResponseBody setContent(java.util.List<DescribeDcdnSecFuncInfoResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeDcdnSecFuncInfoResponseBodyContent> getContent() {
        return this.content;
    }

    public static class DescribeDcdnSecFuncInfoResponseBodyContent extends TeaModel {
        @NameInMap("Label")
        public String label;

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
