// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToPdfJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitConvertImageToPdfJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitConvertImageToPdfJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToPdfJobResponseBody self = new SubmitConvertImageToPdfJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToPdfJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitConvertImageToPdfJobResponseBody setData(SubmitConvertImageToPdfJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitConvertImageToPdfJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitConvertImageToPdfJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitConvertImageToPdfJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitConvertImageToPdfJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitConvertImageToPdfJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitConvertImageToPdfJobResponseBodyData self = new SubmitConvertImageToPdfJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitConvertImageToPdfJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
