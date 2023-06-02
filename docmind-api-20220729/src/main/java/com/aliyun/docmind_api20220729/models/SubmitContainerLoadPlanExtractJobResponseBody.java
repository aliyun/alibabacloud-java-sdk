// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitContainerLoadPlanExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitContainerLoadPlanExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitContainerLoadPlanExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitContainerLoadPlanExtractJobResponseBody self = new SubmitContainerLoadPlanExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitContainerLoadPlanExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitContainerLoadPlanExtractJobResponseBody setData(SubmitContainerLoadPlanExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitContainerLoadPlanExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitContainerLoadPlanExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitContainerLoadPlanExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitContainerLoadPlanExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitContainerLoadPlanExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitContainerLoadPlanExtractJobResponseBodyData self = new SubmitContainerLoadPlanExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitContainerLoadPlanExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
