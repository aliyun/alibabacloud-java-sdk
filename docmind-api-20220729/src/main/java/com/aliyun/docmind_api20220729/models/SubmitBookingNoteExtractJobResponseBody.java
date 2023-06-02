// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitBookingNoteExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitBookingNoteExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitBookingNoteExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitBookingNoteExtractJobResponseBody self = new SubmitBookingNoteExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitBookingNoteExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitBookingNoteExtractJobResponseBody setData(SubmitBookingNoteExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitBookingNoteExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitBookingNoteExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitBookingNoteExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitBookingNoteExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitBookingNoteExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitBookingNoteExtractJobResponseBodyData self = new SubmitBookingNoteExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitBookingNoteExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
