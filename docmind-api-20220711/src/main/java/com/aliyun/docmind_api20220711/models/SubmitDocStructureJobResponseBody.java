// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocStructureJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitDocStructureJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDocStructureJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocStructureJobResponseBody self = new SubmitDocStructureJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDocStructureJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitDocStructureJobResponseBody setData(SubmitDocStructureJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitDocStructureJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitDocStructureJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitDocStructureJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDocStructureJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitDocStructureJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocStructureJobResponseBodyData self = new SubmitDocStructureJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitDocStructureJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
