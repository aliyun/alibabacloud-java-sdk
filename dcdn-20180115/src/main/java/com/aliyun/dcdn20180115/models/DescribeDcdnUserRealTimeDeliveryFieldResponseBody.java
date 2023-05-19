// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserRealTimeDeliveryFieldResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Content")
    public DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnUserRealTimeDeliveryFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserRealTimeDeliveryFieldResponseBody self = new DescribeDcdnUserRealTimeDeliveryFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserRealTimeDeliveryFieldResponseBody setContent(DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeDcdnUserRealTimeDeliveryFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields extends TeaModel {
        /**
         * <p>The description of the field.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the field.</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>Indicates whether the field was selected.</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields self = new DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContent extends TeaModel {
        @NameInMap("Fields")
        public java.util.List<DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields> fields;

        public static DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContent self = new DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContent setFields(java.util.List<DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<DescribeDcdnUserRealTimeDeliveryFieldResponseBodyContentFields> getFields() {
            return this.fields;
        }

    }

}
