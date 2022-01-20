// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aquila20200104.models;

import com.aliyun.tea.*;

public class DoInferenceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DoInferenceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DoInferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoInferenceResponseBody self = new DoInferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public DoInferenceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DoInferenceResponseBody setData(DoInferenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DoInferenceResponseBodyData getData() {
        return this.data;
    }

    public DoInferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DoInferenceResponseBodyData extends TeaModel {
        @NameInMap("Risk")
        public String risk;

        public static DoInferenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DoInferenceResponseBodyData self = new DoInferenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DoInferenceResponseBodyData setRisk(String risk) {
            this.risk = risk;
            return this;
        }
        public String getRisk() {
            return this.risk;
        }

    }

}
