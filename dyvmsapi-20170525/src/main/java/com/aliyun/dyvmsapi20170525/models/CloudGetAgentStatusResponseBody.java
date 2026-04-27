// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAgentStatusResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudGetAgentStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudGetAgentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAgentStatusResponseBody self = new CloudGetAgentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudGetAgentStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudGetAgentStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudGetAgentStatusResponseBody setData(CloudGetAgentStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudGetAgentStatusResponseBodyData getData() {
        return this.data;
    }

    public CloudGetAgentStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudGetAgentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudGetAgentStatusResponseBodyData extends TeaModel {
        /**
         * <p>座席设备状态，座席登录状态不是离线时返回  -1：错误的状态  0：空闲状态  1：锁定状态   2：邀请中状态  3：响铃状态  4：使用中状态</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeviceStatus")
        public Long deviceStatus;

        /**
         * <p>座席登录状态   0：离线状态  1：在线状态  2：置忙状态  3：整理状态</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoginStatus")
        public Long loginStatus;

        /**
         * <p>座席当前参与的通话唯一标识，座席设备状态为1/2/3/4时返回</p>
         * 
         * <strong>example:</strong>
         * <p>medias_1-162046xxxx.12</p>
         */
        @NameInMap("MainUniqueId")
        public String mainUniqueId;

        /**
         * <p>座席状态描述（结合了登录状态和设备状态），离线，空闲，置忙，整理，呼叫中，响铃，保持，通话</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>状态对应的动作，座席登录状态不是离线时返回</p>
         * 
         * <strong>example:</strong>
         * <p>idle</p>
         */
        @NameInMap("StateAction")
        public String stateAction;

        public static CloudGetAgentStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAgentStatusResponseBodyData self = new CloudGetAgentStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudGetAgentStatusResponseBodyData setDeviceStatus(Long deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public Long getDeviceStatus() {
            return this.deviceStatus;
        }

        public CloudGetAgentStatusResponseBodyData setLoginStatus(Long loginStatus) {
            this.loginStatus = loginStatus;
            return this;
        }
        public Long getLoginStatus() {
            return this.loginStatus;
        }

        public CloudGetAgentStatusResponseBodyData setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public CloudGetAgentStatusResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CloudGetAgentStatusResponseBodyData setStateAction(String stateAction) {
            this.stateAction = stateAction;
            return this;
        }
        public String getStateAction() {
            return this.stateAction;
        }

    }

}
