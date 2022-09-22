// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitTableUnderstandingJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitTableUnderstandingJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitTableUnderstandingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTableUnderstandingJobResponseBody self = new SubmitTableUnderstandingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTableUnderstandingJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitTableUnderstandingJobResponseBody setData(SubmitTableUnderstandingJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTableUnderstandingJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitTableUnderstandingJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTableUnderstandingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitTableUnderstandingJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitTableUnderstandingJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTableUnderstandingJobResponseBodyData self = new SubmitTableUnderstandingJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTableUnderstandingJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
