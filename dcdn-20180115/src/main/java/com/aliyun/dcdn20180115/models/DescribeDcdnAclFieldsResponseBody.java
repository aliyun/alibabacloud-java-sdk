// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnAclFieldsResponseBody extends TeaModel {
    /**
     * <p>The details about the rules.</p>
     */
    @NameInMap("Content")
    public java.util.List<DescribeDcdnAclFieldsResponseBodyContent> content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30A3A25A-86B3-4C1D-BAA8-12B8607A5CFD</p>
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
         * 
         * <strong>example:</strong>
         * <p>\&quot;fieldList\&quot;:[{\&quot;name\&quot;:\&quot;alert\&quot;,\&quot;display\&quot;:\&quot;observe\&quot;,\&quot;tip\&quot;:\&quot;mark the request in the log without blocking it\&quot;},{\&quot;name\&quot;:\&quot;bypass\&quot;,\&quot;display\&quot;:\&quot;bypass\&quot;,\&quot;tip\&quot;:\&quot;bypass security modules\&quot;}],\&quot;module\&quot;:[{\&quot;name\&quot;:\&quot;cc\&quot;,\&quot;display\&quot;:\&quot;Rate Limit\&quot;,\&quot;tip\&quot;:\&quot;bypass Rate Limit\&quot;},{\&quot;name\&quot;:\&quot;bot\&quot;,\&quot;display\&quot;:\&quot;Bot Traffic Management\&quot;,\&quot;tip\&quot;:\&quot;bypass Bot Manager\&quot;}]</p>
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
