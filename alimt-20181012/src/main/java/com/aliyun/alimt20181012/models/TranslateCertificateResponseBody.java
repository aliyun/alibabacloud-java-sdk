// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public TranslateCertificateResponseBodyData data;

    public static TranslateCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateCertificateResponseBody self = new TranslateCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TranslateCertificateResponseBody setData(TranslateCertificateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateCertificateResponseBodyData getData() {
        return this.data;
    }

    public static class TranslateCertificateResponseBodyDataTranslatedValues extends TeaModel {
        @NameInMap("KeyTranslation")
        public String keyTranslation;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueTranslation")
        public String valueTranslation;

        public static TranslateCertificateResponseBodyDataTranslatedValues build(java.util.Map<String, ?> map) throws Exception {
            TranslateCertificateResponseBodyDataTranslatedValues self = new TranslateCertificateResponseBodyDataTranslatedValues();
            return TeaModel.build(map, self);
        }

        public TranslateCertificateResponseBodyDataTranslatedValues setKeyTranslation(String keyTranslation) {
            this.keyTranslation = keyTranslation;
            return this;
        }
        public String getKeyTranslation() {
            return this.keyTranslation;
        }

        public TranslateCertificateResponseBodyDataTranslatedValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TranslateCertificateResponseBodyDataTranslatedValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public TranslateCertificateResponseBodyDataTranslatedValues setValueTranslation(String valueTranslation) {
            this.valueTranslation = valueTranslation;
            return this;
        }
        public String getValueTranslation() {
            return this.valueTranslation;
        }

    }

    public static class TranslateCertificateResponseBodyData extends TeaModel {
        @NameInMap("TranslatedValues")
        public java.util.List<TranslateCertificateResponseBodyDataTranslatedValues> translatedValues;

        public static TranslateCertificateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateCertificateResponseBodyData self = new TranslateCertificateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateCertificateResponseBodyData setTranslatedValues(java.util.List<TranslateCertificateResponseBodyDataTranslatedValues> translatedValues) {
            this.translatedValues = translatedValues;
            return this;
        }
        public java.util.List<TranslateCertificateResponseBodyDataTranslatedValues> getTranslatedValues() {
            return this.translatedValues;
        }

    }

}
