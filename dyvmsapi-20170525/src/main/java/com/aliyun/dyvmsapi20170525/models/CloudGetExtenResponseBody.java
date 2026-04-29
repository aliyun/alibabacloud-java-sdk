// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetExtenResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudGetExtenResponseBodyData data;

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

    public static CloudGetExtenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudGetExtenResponseBody self = new CloudGetExtenResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudGetExtenResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudGetExtenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudGetExtenResponseBody setData(CloudGetExtenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudGetExtenResponseBodyData getData() {
        return this.data;
    }

    public CloudGetExtenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudGetExtenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudGetExtenResponseBodyData extends TeaModel {
        /**
         * <p>语音编码</p>
         * 
         * <strong>example:</strong>
         * <p>alaw,ulaw</p>
         */
        @NameInMap("Allow")
        public String allow;

        /**
         * <p>区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>绑定的agent-gateway</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("BindGatewayId")
        public Long bindGatewayId;

        /**
         * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallPower")
        public String callPower;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-30 06:09:04</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>降噪开关 0:关闭 1:开启 默认关闭(该参数只有在类型为注册到webrtc才有效)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Denoise")
        public Long denoise;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>分机号，3-11位</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("Exten")
        public String exten;

        /**
         * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IbRecord")
        public Long ibRecord;

        /**
         * <p>分机号id</p>
         * 
         * <strong>example:</strong>
         * <p>336450</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>是否允许摘机外呼，0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDirect")
        public String isDirect;

        /**
         * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsOb")
        public String isOb;

        /**
         * <p>网络防抖</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JitterBuffer")
        public Long jitterBuffer;

        /**
         * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObRecord")
        public Long obRecord;

        /**
         * <p>密码</p>
         * 
         * <strong>example:</strong>
         * <p>Aa248236</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>类型，1. 注册到IAD分机 2.注册到webrtc 3.注册到远程话机</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Long type;

        public static CloudGetExtenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudGetExtenResponseBodyData self = new CloudGetExtenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudGetExtenResponseBodyData setAllow(String allow) {
            this.allow = allow;
            return this;
        }
        public String getAllow() {
            return this.allow;
        }

        public CloudGetExtenResponseBodyData setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public CloudGetExtenResponseBodyData setBindGatewayId(Long bindGatewayId) {
            this.bindGatewayId = bindGatewayId;
            return this;
        }
        public Long getBindGatewayId() {
            return this.bindGatewayId;
        }

        public CloudGetExtenResponseBodyData setCallPower(String callPower) {
            this.callPower = callPower;
            return this;
        }
        public String getCallPower() {
            return this.callPower;
        }

        public CloudGetExtenResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudGetExtenResponseBodyData setDenoise(Long denoise) {
            this.denoise = denoise;
            return this;
        }
        public Long getDenoise() {
            return this.denoise;
        }

        public CloudGetExtenResponseBodyData setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudGetExtenResponseBodyData setExten(String exten) {
            this.exten = exten;
            return this;
        }
        public String getExten() {
            return this.exten;
        }

        public CloudGetExtenResponseBodyData setIbRecord(Long ibRecord) {
            this.ibRecord = ibRecord;
            return this;
        }
        public Long getIbRecord() {
            return this.ibRecord;
        }

        public CloudGetExtenResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudGetExtenResponseBodyData setIsDirect(String isDirect) {
            this.isDirect = isDirect;
            return this;
        }
        public String getIsDirect() {
            return this.isDirect;
        }

        public CloudGetExtenResponseBodyData setIsOb(String isOb) {
            this.isOb = isOb;
            return this;
        }
        public String getIsOb() {
            return this.isOb;
        }

        public CloudGetExtenResponseBodyData setJitterBuffer(Long jitterBuffer) {
            this.jitterBuffer = jitterBuffer;
            return this;
        }
        public Long getJitterBuffer() {
            return this.jitterBuffer;
        }

        public CloudGetExtenResponseBodyData setObRecord(Long obRecord) {
            this.obRecord = obRecord;
            return this;
        }
        public Long getObRecord() {
            return this.obRecord;
        }

        public CloudGetExtenResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CloudGetExtenResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
