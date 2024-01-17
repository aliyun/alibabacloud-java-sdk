// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetAccessPageSessionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAccessPageSessionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetAccessPageSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessPageSessionResponseBody self = new GetAccessPageSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessPageSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccessPageSessionResponseBody setData(GetAccessPageSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccessPageSessionResponseBodyData getData() {
        return this.data;
    }

    public GetAccessPageSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccessPageSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccessPageSessionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAccessPageSessionResponseBodyData extends TeaModel {
        @NameInMap("ConnectTicket")
        public String connectTicket;

        /**
         * <p>flow ID</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        public static GetAccessPageSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccessPageSessionResponseBodyData self = new GetAccessPageSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccessPageSessionResponseBodyData setConnectTicket(String connectTicket) {
            this.connectTicket = connectTicket;
            return this;
        }
        public String getConnectTicket() {
            return this.connectTicket;
        }

        public GetAccessPageSessionResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

}
