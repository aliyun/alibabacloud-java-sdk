// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class DuplexDecisionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DuplexDecisionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DuplexDecisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DuplexDecisionResponseBody self = new DuplexDecisionResponseBody();
        return TeaModel.build(map, self);
    }

    public DuplexDecisionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DuplexDecisionResponseBody setData(DuplexDecisionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DuplexDecisionResponseBodyData getData() {
        return this.data;
    }

    public DuplexDecisionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DuplexDecisionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DuplexDecisionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DuplexDecisionResponseBodyData extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("GrabType")
        public String grabType;

        @NameInMap("OutputText")
        public String outputText;

        public static DuplexDecisionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DuplexDecisionResponseBodyData self = new DuplexDecisionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DuplexDecisionResponseBodyData setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public DuplexDecisionResponseBodyData setGrabType(String grabType) {
            this.grabType = grabType;
            return this;
        }
        public String getGrabType() {
            return this.grabType;
        }

        public DuplexDecisionResponseBodyData setOutputText(String outputText) {
            this.outputText = outputText;
            return this;
        }
        public String getOutputText() {
            return this.outputText;
        }

    }

}
