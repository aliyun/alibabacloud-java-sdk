// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitBillOfLadingExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitBillOfLadingExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitBillOfLadingExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitBillOfLadingExtractJobResponseBody self = new SubmitBillOfLadingExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitBillOfLadingExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitBillOfLadingExtractJobResponseBody setData(SubmitBillOfLadingExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitBillOfLadingExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitBillOfLadingExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitBillOfLadingExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitBillOfLadingExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitBillOfLadingExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitBillOfLadingExtractJobResponseBodyData self = new SubmitBillOfLadingExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitBillOfLadingExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
