// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRealTimeDeliveryFieldResponseBody extends TeaModel {
    @NameInMap("Content")
    public DescribeDcdnRealTimeDeliveryFieldResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnRealTimeDeliveryFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRealTimeDeliveryFieldResponseBody self = new DescribeDcdnRealTimeDeliveryFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRealTimeDeliveryFieldResponseBody setContent(DescribeDcdnRealTimeDeliveryFieldResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeDcdnRealTimeDeliveryFieldResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeDcdnRealTimeDeliveryFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnRealTimeDeliveryFieldResponseBodyContentFields extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeDcdnRealTimeDeliveryFieldResponseBodyContentFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnRealTimeDeliveryFieldResponseBodyContentFields self = new DescribeDcdnRealTimeDeliveryFieldResponseBodyContentFields();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnRealTimeDeliveryFieldResponseBodyContentFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnRealTimeDeliveryFieldResponseBodyContentFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

    public static class DescribeDcdnRealTimeDeliveryFieldResponseBodyContent extends TeaModel {
        @NameInMap("Fields")
        public java.util.List<DescribeDcdnRealTimeDeliveryFieldResponseBodyContentFields> fields;

        public static DescribeDcdnRealTimeDeliveryFieldResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnRealTimeDeliveryFieldResponseBodyContent self = new DescribeDcdnRealTimeDeliveryFieldResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnRealTimeDeliveryFieldResponseBodyContent setFields(java.util.List<DescribeDcdnRealTimeDeliveryFieldResponseBodyContentFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<DescribeDcdnRealTimeDeliveryFieldResponseBodyContentFields> getFields() {
            return this.fields;
        }

    }

}
