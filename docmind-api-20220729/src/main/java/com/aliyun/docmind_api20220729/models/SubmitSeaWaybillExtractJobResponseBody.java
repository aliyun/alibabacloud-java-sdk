// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitSeaWaybillExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitSeaWaybillExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSeaWaybillExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSeaWaybillExtractJobResponseBody self = new SubmitSeaWaybillExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSeaWaybillExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitSeaWaybillExtractJobResponseBody setData(SubmitSeaWaybillExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitSeaWaybillExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitSeaWaybillExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitSeaWaybillExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitSeaWaybillExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitSeaWaybillExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitSeaWaybillExtractJobResponseBodyData self = new SubmitSeaWaybillExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitSeaWaybillExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
