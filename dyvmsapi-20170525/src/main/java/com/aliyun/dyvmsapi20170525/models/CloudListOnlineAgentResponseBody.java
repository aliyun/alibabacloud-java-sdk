// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListOnlineAgentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListOnlineAgentResponseBodyData data;

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

    public static CloudListOnlineAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListOnlineAgentResponseBody self = new CloudListOnlineAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListOnlineAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListOnlineAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListOnlineAgentResponseBody setData(CloudListOnlineAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListOnlineAgentResponseBodyData getData() {
        return this.data;
    }

    public CloudListOnlineAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListOnlineAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListOnlineAgentResponseBodyDataAgentStatuses extends TeaModel {
        /**
         * <p>绑定电话</p>
         * 
         * <strong>example:</strong>
         * <p>22223333</p>
         */
        @NameInMap("BindTel")
        public String bindTel;

        /**
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>设备状态，-1 失效，0 空闲，1 已锁定，2 呼叫中，3 响铃，4 通话中</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeviceStatus")
        public Long deviceStatus;

        /**
         * <p>设备状态时长</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeviceStatusDuration")
        public Long deviceStatusDuration;

        /**
         * <p>登录状态，0离线，1在线，2置忙，3整理</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoginStatus")
        public Long loginStatus;

        /**
         * <p>登录状态时长</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("LoginStatusDuration")
        public Long loginStatusDuration;

        /**
         * <p>登录时间</p>
         * 
         * <strong>example:</strong>
         * <p>1774821736</p>
         */
        @NameInMap("LoginTime")
        public String loginTime;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>座席状态（结合了登录状态和设备状态），失效，空闲，置忙，整理，呼叫中，响铃，通话</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("State")
        public String state;

        public static CloudListOnlineAgentResponseBodyDataAgentStatuses build(java.util.Map<String, ?> map) throws Exception {
            CloudListOnlineAgentResponseBodyDataAgentStatuses self = new CloudListOnlineAgentResponseBodyDataAgentStatuses();
            return TeaModel.build(map, self);
        }

        public CloudListOnlineAgentResponseBodyDataAgentStatuses setBindTel(String bindTel) {
            this.bindTel = bindTel;
            return this;
        }
        public String getBindTel() {
            return this.bindTel;
        }

        public CloudListOnlineAgentResponseBodyDataAgentStatuses setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudListOnlineAgentResponseBodyDataAgentStatuses setDeviceStatus(Long deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public Long getDeviceStatus() {
            return this.deviceStatus;
        }

        public CloudListOnlineAgentResponseBodyDataAgentStatuses setDeviceStatusDuration(Long deviceStatusDuration) {
            this.deviceStatusDuration = deviceStatusDuration;
            return this;
        }
        public Long getDeviceStatusDuration() {
            return this.deviceStatusDuration;
        }

        public CloudListOnlineAgentResponseBodyDataAgentStatuses setLoginStatus(Long loginStatus) {
            this.loginStatus = loginStatus;
            return this;
        }
        public Long getLoginStatus() {
            return this.loginStatus;
        }

        public CloudListOnlineAgentResponseBodyDataAgentStatuses setLoginStatusDuration(Long loginStatusDuration) {
            this.loginStatusDuration = loginStatusDuration;
            return this;
        }
        public Long getLoginStatusDuration() {
            return this.loginStatusDuration;
        }

        public CloudListOnlineAgentResponseBodyDataAgentStatuses setLoginTime(String loginTime) {
            this.loginTime = loginTime;
            return this;
        }
        public String getLoginTime() {
            return this.loginTime;
        }

        public CloudListOnlineAgentResponseBodyDataAgentStatuses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudListOnlineAgentResponseBodyDataAgentStatuses setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class CloudListOnlineAgentResponseBodyData extends TeaModel {
        /**
         * <p>座席状态数组</p>
         */
        @NameInMap("AgentStatuses")
        public java.util.List<CloudListOnlineAgentResponseBodyDataAgentStatuses> agentStatuses;

        public static CloudListOnlineAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListOnlineAgentResponseBodyData self = new CloudListOnlineAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListOnlineAgentResponseBodyData setAgentStatuses(java.util.List<CloudListOnlineAgentResponseBodyDataAgentStatuses> agentStatuses) {
            this.agentStatuses = agentStatuses;
            return this;
        }
        public java.util.List<CloudListOnlineAgentResponseBodyDataAgentStatuses> getAgentStatuses() {
            return this.agentStatuses;
        }

    }

}
