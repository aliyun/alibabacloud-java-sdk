// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitCertificateOfOriginExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitCertificateOfOriginExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitCertificateOfOriginExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitCertificateOfOriginExtractJobResponseBody self = new SubmitCertificateOfOriginExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitCertificateOfOriginExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitCertificateOfOriginExtractJobResponseBody setData(SubmitCertificateOfOriginExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitCertificateOfOriginExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitCertificateOfOriginExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCertificateOfOriginExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitCertificateOfOriginExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitCertificateOfOriginExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitCertificateOfOriginExtractJobResponseBodyData self = new SubmitCertificateOfOriginExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitCertificateOfOriginExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
