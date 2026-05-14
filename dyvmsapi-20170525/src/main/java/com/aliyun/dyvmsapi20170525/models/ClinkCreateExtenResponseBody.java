// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateExtenResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkCreateExtenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkCreateExtenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateExtenResponseBody self = new ClinkCreateExtenResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkCreateExtenResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkCreateExtenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkCreateExtenResponseBody setData(ClinkCreateExtenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkCreateExtenResponseBodyData getData() {
        return this.data;
    }

    public ClinkCreateExtenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkCreateExtenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkCreateExtenResponseBodyDataExten extends TeaModel {
        /**
         * <p>语音编码。 1：g729(已弃用) 2：g729,alaw,ulaw 3：alaw,ulaw,g729 4：myopus,alaw,ulaw,g729 5：alaw,ulaw 6：myopus,alaw,ulaw</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Allow")
        public Long allow;

        /**
         * <p>话机区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>话机号码</p>
         * 
         * <strong>example:</strong>
         * <p>11354</p>
         */
        @NameInMap("ExtenNumber")
        public String extenNumber;

        /**
         * <p>是否允许主叫外呼，1：允许；0：不允许。话机类型为IP话机时，可以开启主叫外呼功能，直接通过IP话机进行外呼。若要使用主叫外呼功能，需要开启企业级开关。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDirect")
        public Long isDirect;

        /**
         * <p>网络防抖开关，0：关闭；1：开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JittBuffer")
        public Long jittBuffer;

        /**
         * <p>话机密码，密码规则参见企业配置</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>话机类型。1: IP话机， 2: 软电话</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Long type;

        public static ClinkCreateExtenResponseBodyDataExten build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateExtenResponseBodyDataExten self = new ClinkCreateExtenResponseBodyDataExten();
            return TeaModel.build(map, self);
        }

        public ClinkCreateExtenResponseBodyDataExten setAllow(Long allow) {
            this.allow = allow;
            return this;
        }
        public Long getAllow() {
            return this.allow;
        }

        public ClinkCreateExtenResponseBodyDataExten setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public ClinkCreateExtenResponseBodyDataExten setExtenNumber(String extenNumber) {
            this.extenNumber = extenNumber;
            return this;
        }
        public String getExtenNumber() {
            return this.extenNumber;
        }

        public ClinkCreateExtenResponseBodyDataExten setIsDirect(Long isDirect) {
            this.isDirect = isDirect;
            return this;
        }
        public Long getIsDirect() {
            return this.isDirect;
        }

        public ClinkCreateExtenResponseBodyDataExten setJittBuffer(Long jittBuffer) {
            this.jittBuffer = jittBuffer;
            return this;
        }
        public Long getJittBuffer() {
            return this.jittBuffer;
        }

        public ClinkCreateExtenResponseBodyDataExten setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ClinkCreateExtenResponseBodyDataExten setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class ClinkCreateExtenResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>分机</p>
         */
        @NameInMap("Exten")
        public ClinkCreateExtenResponseBodyDataExten exten;

        public static ClinkCreateExtenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateExtenResponseBodyData self = new ClinkCreateExtenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkCreateExtenResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkCreateExtenResponseBodyData setExten(ClinkCreateExtenResponseBodyDataExten exten) {
            this.exten = exten;
            return this;
        }
        public ClinkCreateExtenResponseBodyDataExten getExten() {
            return this.exten;
        }

    }

}
