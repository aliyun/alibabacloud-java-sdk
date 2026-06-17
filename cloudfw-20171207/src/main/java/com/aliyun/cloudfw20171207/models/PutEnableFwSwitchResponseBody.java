// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableFwSwitchResponseBody extends TeaModel {
    /**
     * <p>Information about unsynchronized assets.</p>
     */
    @NameInMap("AbnormalResourceStatusList")
    public java.util.List<PutEnableFwSwitchResponseBodyAbnormalResourceStatusList> abnormalResourceStatusList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
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
        /**
         * <p>A message that provides details about why an asset was not synchronized. Valid value:</p>
         * <ul>
         * <li><code>cloudfirewall do not sync this ip address</code>: Cloud Firewall does not synchronize the IP address of the asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloudfirewall do not sync this ip address</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.0</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The synchronization status of the asset. Valid value:</p>
         * <ul>
         * <li><code>ip_not_sync</code>: The asset is not synchronized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip_not_sync</p>
         */
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
