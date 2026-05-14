// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkAgentStatusDetailResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkAgentStatusDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9927CD06-C33A-50CC-A9BB-A3427967A66F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkAgentStatusDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkAgentStatusDetailResponseBody self = new ClinkAgentStatusDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkAgentStatusDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkAgentStatusDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkAgentStatusDetailResponseBody setData(ClinkAgentStatusDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkAgentStatusDetailResponseBodyData getData() {
        return this.data;
    }

    public ClinkAgentStatusDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkAgentStatusDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail extends TeaModel {
        /**
         * <p>绑定号码</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("BindTel")
        public String bindTel;

        /**
         * <p>电话类型，1:电话；2:IP话机；3:软电话</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BindType")
        public Long bindType;

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>企业id</p>
         * 
         * <strong>example:</strong>
         * <p>8004970</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>登录终端，1:工具条；2:座席；3:管理员；4:接口；6:APP；9:移动SDK</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LoginType")
        public Long loginType;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>name3</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>座席状态， IDLE：空闲； PAUSE：置忙； WRAPUP：整理； CALLING： 呼叫中； RINGING：响铃； BUSY：通话</p>
         * 
         * <strong>example:</strong>
         * <p>IDLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>座席状态详情，空闲，忙碌，整理，呼叫中，响铃，呼入振铃，外呼振铃，通话，呼入通话，外呼通话，自定义置忙状态</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("StatusDetails")
        public String statusDetails;

        public static ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail self = new ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail();
            return TeaModel.build(map, self);
        }

        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail setBindTel(String bindTel) {
            this.bindTel = bindTel;
            return this;
        }
        public String getBindTel() {
            return this.bindTel;
        }

        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail setBindType(Long bindType) {
            this.bindType = bindType;
            return this;
        }
        public Long getBindType() {
            return this.bindType;
        }

        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail setLoginType(Long loginType) {
            this.loginType = loginType;
            return this;
        }
        public Long getLoginType() {
            return this.loginType;
        }

        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail setStatusDetails(String statusDetails) {
            this.statusDetails = statusDetails;
            return this;
        }
        public String getStatusDetails() {
            return this.statusDetails;
        }

    }

    public static class ClinkAgentStatusDetailResponseBodyData extends TeaModel {
        /**
         * <p>座席状态详情</p>
         */
        @NameInMap("AgentStatusDetail")
        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail agentStatusDetail;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkAgentStatusDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkAgentStatusDetailResponseBodyData self = new ClinkAgentStatusDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkAgentStatusDetailResponseBodyData setAgentStatusDetail(ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail agentStatusDetail) {
            this.agentStatusDetail = agentStatusDetail;
            return this;
        }
        public ClinkAgentStatusDetailResponseBodyDataAgentStatusDetail getAgentStatusDetail() {
            return this.agentStatusDetail;
        }

        public ClinkAgentStatusDetailResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
