// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitGeneralContractExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitGeneralContractExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitGeneralContractExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitGeneralContractExtractJobResponseBody self = new SubmitGeneralContractExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitGeneralContractExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitGeneralContractExtractJobResponseBody setData(SubmitGeneralContractExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitGeneralContractExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitGeneralContractExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitGeneralContractExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitGeneralContractExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitGeneralContractExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitGeneralContractExtractJobResponseBodyData self = new SubmitGeneralContractExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitGeneralContractExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
