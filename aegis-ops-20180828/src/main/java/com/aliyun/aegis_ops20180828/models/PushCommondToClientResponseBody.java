// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class PushCommondToClientResponseBody extends TeaModel {
    @NameInMap("AegisRemoteCmdPushResponse")
    public PushCommondToClientResponseBodyAegisRemoteCmdPushResponse aegisRemoteCmdPushResponse;

    public static PushCommondToClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushCommondToClientResponseBody self = new PushCommondToClientResponseBody();
        return TeaModel.build(map, self);
    }

    public PushCommondToClientResponseBody setAegisRemoteCmdPushResponse(PushCommondToClientResponseBodyAegisRemoteCmdPushResponse aegisRemoteCmdPushResponse) {
        this.aegisRemoteCmdPushResponse = aegisRemoteCmdPushResponse;
        return this;
    }
    public PushCommondToClientResponseBodyAegisRemoteCmdPushResponse getAegisRemoteCmdPushResponse() {
        return this.aegisRemoteCmdPushResponse;
    }

    public static class PushCommondToClientResponseBodyAegisRemoteCmdPushResponse extends TeaModel {
        @NameInMap("CommandId")
        public String commandId;

        public static PushCommondToClientResponseBodyAegisRemoteCmdPushResponse build(java.util.Map<String, ?> map) throws Exception {
            PushCommondToClientResponseBodyAegisRemoteCmdPushResponse self = new PushCommondToClientResponseBodyAegisRemoteCmdPushResponse();
            return TeaModel.build(map, self);
        }

        public PushCommondToClientResponseBodyAegisRemoteCmdPushResponse setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

    }

}
