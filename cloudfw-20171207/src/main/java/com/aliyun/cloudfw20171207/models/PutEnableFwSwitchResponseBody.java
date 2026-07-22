// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableFwSwitchResponseBody extends TeaModel {
    /**
     * <p>The status information list of assets that are not synchronized.</p>
     */
    @NameInMap("AbnormalResourceStatusList")
    public java.util.List<PutEnableFwSwitchResponseBodyAbnormalResourceStatusList> abnormalResourceStatusList;

    /**
     * <p>Indicates that this is a successful dry run response. A value of true indicates that only the dry run was completed and no real changes were made. This field is not returned or is set to false for real calls.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

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

    public PutEnableFwSwitchResponseBody setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
         * <p>The message when the asset is not synchronized. Valid values:</p>
         * <ul>
         * <li>cloudfirewall do not sync this ip address: Cloud Firewall has not synchronized this asset IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloudfirewall do not sync this ip address</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The asset IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.0</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The status of the asset that is not synchronized. Valid values:</p>
         * <ul>
         * <li>ip_not_sync: The asset is not synchronized.</li>
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
