// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class PushRtapTaskByUuidResponseBody extends TeaModel {
    @NameInMap("AegisRtapTaskResponse")
    public PushRtapTaskByUuidResponseBodyAegisRtapTaskResponse aegisRtapTaskResponse;

    public static PushRtapTaskByUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushRtapTaskByUuidResponseBody self = new PushRtapTaskByUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public PushRtapTaskByUuidResponseBody setAegisRtapTaskResponse(PushRtapTaskByUuidResponseBodyAegisRtapTaskResponse aegisRtapTaskResponse) {
        this.aegisRtapTaskResponse = aegisRtapTaskResponse;
        return this;
    }
    public PushRtapTaskByUuidResponseBodyAegisRtapTaskResponse getAegisRtapTaskResponse() {
        return this.aegisRtapTaskResponse;
    }

    public static class PushRtapTaskByUuidResponseBodyAegisRtapTaskResponse extends TeaModel {
        @NameInMap("CmdIdx")
        public String cmdIdx;

        @NameInMap("Result")
        public Boolean result;

        public static PushRtapTaskByUuidResponseBodyAegisRtapTaskResponse build(java.util.Map<String, ?> map) throws Exception {
            PushRtapTaskByUuidResponseBodyAegisRtapTaskResponse self = new PushRtapTaskByUuidResponseBodyAegisRtapTaskResponse();
            return TeaModel.build(map, self);
        }

        public PushRtapTaskByUuidResponseBodyAegisRtapTaskResponse setCmdIdx(String cmdIdx) {
            this.cmdIdx = cmdIdx;
            return this;
        }
        public String getCmdIdx() {
            return this.cmdIdx;
        }

        public PushRtapTaskByUuidResponseBodyAegisRtapTaskResponse setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
