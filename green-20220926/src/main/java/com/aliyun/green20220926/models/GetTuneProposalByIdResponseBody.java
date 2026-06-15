// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetTuneProposalByIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTuneProposalByIdResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTuneProposalByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTuneProposalByIdResponseBody self = new GetTuneProposalByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTuneProposalByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTuneProposalByIdResponseBody setData(GetTuneProposalByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTuneProposalByIdResponseBodyData getData() {
        return this.data;
    }

    public GetTuneProposalByIdResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetTuneProposalByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTuneProposalByIdResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;example&quot;:&quot;xxxx&quot;}</p>
         */
        @NameInMap("JsonContent")
        public String jsonContent;

        public static GetTuneProposalByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTuneProposalByIdResponseBodyData self = new GetTuneProposalByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTuneProposalByIdResponseBodyData setJsonContent(String jsonContent) {
            this.jsonContent = jsonContent;
            return this;
        }
        public String getJsonContent() {
            return this.jsonContent;
        }

    }

}
