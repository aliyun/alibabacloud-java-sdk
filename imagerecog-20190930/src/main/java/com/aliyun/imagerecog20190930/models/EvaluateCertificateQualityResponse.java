// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class EvaluateCertificateQualityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public EvaluateCertificateQualityResponseData data;

    public static EvaluateCertificateQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateCertificateQualityResponse self = new EvaluateCertificateQualityResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateCertificateQualityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EvaluateCertificateQualityResponse setData(EvaluateCertificateQualityResponseData data) {
        this.data = data;
        return this;
    }
    public EvaluateCertificateQualityResponseData getData() {
        return this.data;
    }

    public static class EvaluateCertificateQualityResponseDataElements extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Pass")
        @Validation(required = true)
        public String pass;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        public static EvaluateCertificateQualityResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            EvaluateCertificateQualityResponseDataElements self = new EvaluateCertificateQualityResponseDataElements();
            return TeaModel.build(map, self);
        }

        public EvaluateCertificateQualityResponseDataElements setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public EvaluateCertificateQualityResponseDataElements setPass(String pass) {
            this.pass = pass;
            return this;
        }
        public String getPass() {
            return this.pass;
        }

        public EvaluateCertificateQualityResponseDataElements setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

    public static class EvaluateCertificateQualityResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<EvaluateCertificateQualityResponseDataElements> elements;

        public static EvaluateCertificateQualityResponseData build(java.util.Map<String, ?> map) throws Exception {
            EvaluateCertificateQualityResponseData self = new EvaluateCertificateQualityResponseData();
            return TeaModel.build(map, self);
        }

        public EvaluateCertificateQualityResponseData setElements(java.util.List<EvaluateCertificateQualityResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<EvaluateCertificateQualityResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
