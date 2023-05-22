// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnAclFieldsResponseBody extends TeaModel {
    /**
     * <p>Details about the rules.</p>
     */
    @NameInMap("Content")
    public java.util.List<DescribeDcdnAclFieldsResponseBodyContent> content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnAclFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnAclFieldsResponseBody self = new DescribeDcdnAclFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnAclFieldsResponseBody setContent(java.util.List<DescribeDcdnAclFieldsResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeDcdnAclFieldsResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeDcdnAclFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnAclFieldsResponseBodyContent extends TeaModel {
        /**
         * <p>The rules and policies that were configured. The JSON string is decoded.</p>
         */
        @NameInMap("Fields")
        public String fields;

        public static DescribeDcdnAclFieldsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnAclFieldsResponseBodyContent self = new DescribeDcdnAclFieldsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnAclFieldsResponseBodyContent setFields(String fields) {
            this.fields = fields;
            return this;
        }
        public String getFields() {
            return this.fields;
        }

    }

}
