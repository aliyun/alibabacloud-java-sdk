// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitPackingListExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitPackingListExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitPackingListExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitPackingListExtractJobResponseBody self = new SubmitPackingListExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitPackingListExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitPackingListExtractJobResponseBody setData(SubmitPackingListExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitPackingListExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitPackingListExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitPackingListExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitPackingListExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitPackingListExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitPackingListExtractJobResponseBodyData self = new SubmitPackingListExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitPackingListExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
