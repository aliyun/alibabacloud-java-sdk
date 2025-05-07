// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxnBindFixedLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>响应码</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>绑定对象</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryAxnBindFixedLineResponseBodyData> data;

    /**
     * <p>描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E8B9C3ED-D9BD-5E27-9588-6D84D3070160</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAxnBindFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAxnBindFixedLineResponseBody self = new QueryAxnBindFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAxnBindFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAxnBindFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAxnBindFixedLineResponseBody setData(java.util.List<QueryAxnBindFixedLineResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAxnBindFixedLineResponseBodyData> getData() {
        return this.data;
    }

    public QueryAxnBindFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAxnBindFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAxnBindFixedLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAxnBindFixedLineResponseBodyDataExtra extends TeaModel {
        /**
         * <p>A通过X呼叫，即A主叫X，仅下列值有效。默认是0。 0：不能外呼 1：接续最近的N号码 2：回拨固定号码：telB</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <p>录音控制，仅下列值有效。默认是0（不开通录音功能）。 0：不录音 1：录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Callrecording")
        public String callrecording;

        public static QueryAxnBindFixedLineResponseBodyDataExtra build(java.util.Map<String, ?> map) throws Exception {
            QueryAxnBindFixedLineResponseBodyDataExtra self = new QueryAxnBindFixedLineResponseBodyDataExtra();
            return TeaModel.build(map, self);
        }

        public QueryAxnBindFixedLineResponseBodyDataExtra setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public QueryAxnBindFixedLineResponseBodyDataExtra setCallrecording(String callrecording) {
            this.callrecording = callrecording;
            return this;
        }
        public String getCallrecording() {
            return this.callrecording;
        }

    }

    public static class QueryAxnBindFixedLineResponseBodyData extends TeaModel {
        /**
         * <p>接通前放音啊编码</p>
         * 
         * <strong>example:</strong>
         * <p>10001,10002,10003</p>
         */
        @NameInMap("Anucode")
        public String anucode;

        /**
         * <p>被叫侧放音编码</p>
         * 
         * <strong>example:</strong>
         * <p>10001,10002</p>
         */
        @NameInMap("Anucodecalled")
        public String anucodecalled;

        /**
         * <p>隐私号码区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("Areacode")
        public String areacode;

        /**
         * <p>过期时间</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <p>额外字段</p>
         */
        @NameInMap("Extra")
        public QueryAxnBindFixedLineResponseBodyDataExtra extra;

        /**
         * <p>接入商自有字段，最大100字符长度</p>
         * 
         * <strong>example:</strong>
         * <p>12444</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>绑定id</p>
         * 
         * <strong>example:</strong>
         * <p>GHX0534X202504221531579290029-2-1-aliaxn</p>
         */
        @NameInMap("Subid")
        public String subid;

        /**
         * <p>格式为yyyyMMddHHmmss。时间采用北京时间，24小时制。</p>
         * 
         * <strong>example:</strong>
         * <p>20250421141723</p>
         */
        @NameInMap("Subts")
        public String subts;

        /**
         * <p>接通后主叫侧放音编码</p>
         * 
         * <strong>example:</strong>
         * <p>10001,10002</p>
         */
        @NameInMap("TAnucodeConnect")
        public String TAnucodeConnect;

        /**
         * <p>A号码</p>
         * 
         * <strong>example:</strong>
         * <p>15500001111</p>
         */
        @NameInMap("TelA")
        public String telA;

        /**
         * <p>N号码</p>
         * 
         * <strong>example:</strong>
         * <p>15500002222</p>
         */
        @NameInMap("TelB")
        public String telB;

        /**
         * <p>隐私号码</p>
         * 
         * <strong>example:</strong>
         * <p>057112345678</p>
         */
        @NameInMap("TelX")
        public String telX;

        public static QueryAxnBindFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAxnBindFixedLineResponseBodyData self = new QueryAxnBindFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAxnBindFixedLineResponseBodyData setAnucode(String anucode) {
            this.anucode = anucode;
            return this;
        }
        public String getAnucode() {
            return this.anucode;
        }

        public QueryAxnBindFixedLineResponseBodyData setAnucodecalled(String anucodecalled) {
            this.anucodecalled = anucodecalled;
            return this;
        }
        public String getAnucodecalled() {
            return this.anucodecalled;
        }

        public QueryAxnBindFixedLineResponseBodyData setAreacode(String areacode) {
            this.areacode = areacode;
            return this;
        }
        public String getAreacode() {
            return this.areacode;
        }

        public QueryAxnBindFixedLineResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public QueryAxnBindFixedLineResponseBodyData setExtra(QueryAxnBindFixedLineResponseBodyDataExtra extra) {
            this.extra = extra;
            return this;
        }
        public QueryAxnBindFixedLineResponseBodyDataExtra getExtra() {
            return this.extra;
        }

        public QueryAxnBindFixedLineResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryAxnBindFixedLineResponseBodyData setSubid(String subid) {
            this.subid = subid;
            return this;
        }
        public String getSubid() {
            return this.subid;
        }

        public QueryAxnBindFixedLineResponseBodyData setSubts(String subts) {
            this.subts = subts;
            return this;
        }
        public String getSubts() {
            return this.subts;
        }

        public QueryAxnBindFixedLineResponseBodyData setTAnucodeConnect(String TAnucodeConnect) {
            this.TAnucodeConnect = TAnucodeConnect;
            return this;
        }
        public String getTAnucodeConnect() {
            return this.TAnucodeConnect;
        }

        public QueryAxnBindFixedLineResponseBodyData setTelA(String telA) {
            this.telA = telA;
            return this;
        }
        public String getTelA() {
            return this.telA;
        }

        public QueryAxnBindFixedLineResponseBodyData setTelB(String telB) {
            this.telB = telB;
            return this;
        }
        public String getTelB() {
            return this.telB;
        }

        public QueryAxnBindFixedLineResponseBodyData setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

    }

}
