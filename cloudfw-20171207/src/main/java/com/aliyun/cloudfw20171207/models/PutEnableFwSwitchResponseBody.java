// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableFwSwitchResponseBody extends TeaModel {
    @NameInMap("AbnormalResourceStatusList")
    public java.util.List<PutEnableFwSwitchResponseBodyAbnormalResourceStatusList> abnormalResourceStatusList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutEnableFwSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEnableFwSwitchResponseBody self = new PutEnableFwSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEnableFwSwitchResponseBody setAbnormalResourceStatusList(java.util.List<PutEnableFwSwitchResponseBodyAbnormalResourceStatusList> abnormalResourceStatusList) {
        this.abnormalResourceStatusList = abnormalResourceStatusList;
        return this;
    }
    public java.util.List<PutEnableFwSwitchResponseBodyAbnormalResourceStatusList> getAbnormalResourceStatusList() {
        return this.abnormalResourceStatusList;
    }

    public PutEnableFwSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PutEnableFwSwitchResponseBodyAbnormalResourceStatusList extends TeaModel {
        @NameInMap("Msg")
        public String msg;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("Status")
        public String status;

        public static PutEnableFwSwitchResponseBodyAbnormalResourceStatusList build(java.util.Map<String, ?> map) throws Exception {
            PutEnableFwSwitchResponseBodyAbnormalResourceStatusList self = new PutEnableFwSwitchResponseBodyAbnormalResourceStatusList();
            return TeaModel.build(map, self);
        }

        public PutEnableFwSwitchResponseBodyAbnormalResourceStatusList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public PutEnableFwSwitchResponseBodyAbnormalResourceStatusList setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public PutEnableFwSwitchResponseBodyAbnormalResourceStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
