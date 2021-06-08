// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryFieldResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Fields")
    public java.util.List<DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields> fields;

    public static DescribeDcdnOfflineLogDeliveryFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryFieldResponseBody self = new DescribeDcdnOfflineLogDeliveryFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnOfflineLogDeliveryFieldResponseBody setFields(java.util.List<DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields> getFields() {
        return this.fields;
    }

    public static class DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FieldId")
        public String fieldId;

        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields self = new DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields setFieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }
        public String getFieldId() {
            return this.fieldId;
        }

        public DescribeDcdnOfflineLogDeliveryFieldResponseBodyFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

}
