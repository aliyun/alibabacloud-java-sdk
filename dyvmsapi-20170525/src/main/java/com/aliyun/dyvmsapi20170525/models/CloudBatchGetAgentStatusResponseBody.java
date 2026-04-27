// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudBatchGetAgentStatusResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudBatchGetAgentStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudBatchGetAgentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudBatchGetAgentStatusResponseBody self = new CloudBatchGetAgentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudBatchGetAgentStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudBatchGetAgentStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudBatchGetAgentStatusResponseBody setData(CloudBatchGetAgentStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudBatchGetAgentStatusResponseBodyData getData() {
        return this.data;
    }

    public CloudBatchGetAgentStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudBatchGetAgentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudBatchGetAgentStatusResponseBodyData extends TeaModel {
        /**
         * <p>座席设备状态，座席登录状态不是离线时返回  -1：错误的状态  0：空闲状态  1：锁定状态   2：邀请中状态  3：响铃状态  4：使用中状态</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <p>座席登录状态   0：离线状态  1：在线状态  2：置忙状态  3：整理状态</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoginStatus")
        public String loginStatus;

        /**
         * <p>座席当前参与的通话唯一标识，座席设备状态为1/2/3/4时返回</p>
         * 
         * <strong>example:</strong>
         * <p>test3321.sip33</p>
         */
        @NameInMap("MainUniqueId")
        public String mainUniqueId;

        /**
         * <p>座席状态描述（结合了登录状态和设备状态），离线，空闲，置忙，整理，呼叫中，响铃，保持，通话</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>状态对应的动作，座席登录状态不是离线时返回。详见<a href="../../%E5%B7%A5%E5%85%B7%E6%9D%A1/%E5%BA%A7%E5%B8%AD%E7%8A%B6%E6%80%81%E5%8A%A8%E4%BD%9C.md">座席状态动作说明</a></p>
         * 
         * <strong>example:</strong>
         * <p>Idle</p>
         */
        @NameInMap("StateAction")
        public String stateAction;

        public static CloudBatchGetAgentStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudBatchGetAgentStatusResponseBodyData self = new CloudBatchGetAgentStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudBatchGetAgentStatusResponseBodyData setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public CloudBatchGetAgentStatusResponseBodyData setLoginStatus(String loginStatus) {
            this.loginStatus = loginStatus;
            return this;
        }
        public String getLoginStatus() {
            return this.loginStatus;
        }

        public CloudBatchGetAgentStatusResponseBodyData setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public CloudBatchGetAgentStatusResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CloudBatchGetAgentStatusResponseBodyData setStateAction(String stateAction) {
            this.stateAction = stateAction;
            return this;
        }
        public String getStateAction() {
            return this.stateAction;
        }

    }

}
