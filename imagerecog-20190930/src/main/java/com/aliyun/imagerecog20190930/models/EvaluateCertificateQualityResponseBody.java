// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class EvaluateCertificateQualityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public EvaluateCertificateQualityResponseBodyData data;

    public static EvaluateCertificateQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateCertificateQualityResponseBody self = new EvaluateCertificateQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateCertificateQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EvaluateCertificateQualityResponseBody setData(EvaluateCertificateQualityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EvaluateCertificateQualityResponseBodyData getData() {
        return this.data;
    }

    public static class EvaluateCertificateQualityResponseBodyDataElements extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Pass")
        public String pass;

        @NameInMap("Score")
        public String score;

        public static EvaluateCertificateQualityResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            EvaluateCertificateQualityResponseBodyDataElements self = new EvaluateCertificateQualityResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public EvaluateCertificateQualityResponseBodyDataElements setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public EvaluateCertificateQualityResponseBodyDataElements setPass(String pass) {
            this.pass = pass;
            return this;
        }
        public String getPass() {
            return this.pass;
        }

        public EvaluateCertificateQualityResponseBodyDataElements setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

    public static class EvaluateCertificateQualityResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<EvaluateCertificateQualityResponseBodyDataElements> elements;

        public static EvaluateCertificateQualityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EvaluateCertificateQualityResponseBodyData self = new EvaluateCertificateQualityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EvaluateCertificateQualityResponseBodyData setElements(java.util.List<EvaluateCertificateQualityResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<EvaluateCertificateQualityResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
