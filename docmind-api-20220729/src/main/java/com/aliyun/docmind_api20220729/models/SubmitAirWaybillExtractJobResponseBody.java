// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitAirWaybillExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitAirWaybillExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAirWaybillExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAirWaybillExtractJobResponseBody self = new SubmitAirWaybillExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAirWaybillExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitAirWaybillExtractJobResponseBody setData(SubmitAirWaybillExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitAirWaybillExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitAirWaybillExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitAirWaybillExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAirWaybillExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitAirWaybillExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitAirWaybillExtractJobResponseBodyData self = new SubmitAirWaybillExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitAirWaybillExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
