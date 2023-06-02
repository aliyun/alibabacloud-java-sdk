// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitSalesConfirmationExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitSalesConfirmationExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSalesConfirmationExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSalesConfirmationExtractJobResponseBody self = new SubmitSalesConfirmationExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSalesConfirmationExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitSalesConfirmationExtractJobResponseBody setData(SubmitSalesConfirmationExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitSalesConfirmationExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitSalesConfirmationExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitSalesConfirmationExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitSalesConfirmationExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitSalesConfirmationExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitSalesConfirmationExtractJobResponseBodyData self = new SubmitSalesConfirmationExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitSalesConfirmationExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
