// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxnExtensionBindFixedLineResponseBody extends TeaModel {
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
     * <p>查询绑定对象集合，具体对象字段见绑定请求</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryAxnExtensionBindFixedLineResponseBodyData> data;

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
     * <p>74EFA0E8-CFCA-54D9-BFE5-904F9FA88DBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAxnExtensionBindFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAxnExtensionBindFixedLineResponseBody self = new QueryAxnExtensionBindFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAxnExtensionBindFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAxnExtensionBindFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAxnExtensionBindFixedLineResponseBody setData(java.util.List<QueryAxnExtensionBindFixedLineResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAxnExtensionBindFixedLineResponseBodyData> getData() {
        return this.data;
    }

    public QueryAxnExtensionBindFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAxnExtensionBindFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAxnExtensionBindFixedLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAxnExtensionBindFixedLineResponseBodyDataExtraaxx extends TeaModel {
        /**
         * <p>回拨控制</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <p>录音控制</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Callrecording")
        public String callrecording;

        public static QueryAxnExtensionBindFixedLineResponseBodyDataExtraaxx build(java.util.Map<String, ?> map) throws Exception {
            QueryAxnExtensionBindFixedLineResponseBodyDataExtraaxx self = new QueryAxnExtensionBindFixedLineResponseBodyDataExtraaxx();
            return TeaModel.build(map, self);
        }

        public QueryAxnExtensionBindFixedLineResponseBodyDataExtraaxx setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyDataExtraaxx setCallrecording(String callrecording) {
            this.callrecording = callrecording;
            return this;
        }
        public String getCallrecording() {
            return this.callrecording;
        }

    }

    public static class QueryAxnExtensionBindFixedLineResponseBodyData extends TeaModel {
        /**
         * <p>放音编码</p>
         * 
         * <strong>example:</strong>
         * <p>10001,10002,10003</p>
         */
        @NameInMap("Anucode")
        public String anucode;

        /**
         * <p>被叫侧放音</p>
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
         * <p>10</p>
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
        @NameInMap("Extraaxx")
        public QueryAxnExtensionBindFixedLineResponseBodyDataExtraaxx extraaxx;

        /**
         * <p>接入商自有字段</p>
         * 
         * <strong>example:</strong>
         * <p>12444</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>绑定ID</p>
         * 
         * <strong>example:</strong>
         * <p>可参考绑定响应</p>
         */
        @NameInMap("Subid")
        public String subid;

        /**
         * <p>绑定时间</p>
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
         * <p>小号号码</p>
         * 
         * <strong>example:</strong>
         * <p>19700002222</p>
         */
        @NameInMap("TelX")
        public String telX;

        /**
         * <p>分机号</p>
         * 
         * <strong>example:</strong>
         * <p>1009</p>
         */
        @NameInMap("TelXext")
        public String telXext;

        public static QueryAxnExtensionBindFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAxnExtensionBindFixedLineResponseBodyData self = new QueryAxnExtensionBindFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setAnucode(String anucode) {
            this.anucode = anucode;
            return this;
        }
        public String getAnucode() {
            return this.anucode;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setAnucodecalled(String anucodecalled) {
            this.anucodecalled = anucodecalled;
            return this;
        }
        public String getAnucodecalled() {
            return this.anucodecalled;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setAreacode(String areacode) {
            this.areacode = areacode;
            return this;
        }
        public String getAreacode() {
            return this.areacode;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setExtraaxx(QueryAxnExtensionBindFixedLineResponseBodyDataExtraaxx extraaxx) {
            this.extraaxx = extraaxx;
            return this;
        }
        public QueryAxnExtensionBindFixedLineResponseBodyDataExtraaxx getExtraaxx() {
            return this.extraaxx;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setSubid(String subid) {
            this.subid = subid;
            return this;
        }
        public String getSubid() {
            return this.subid;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setSubts(String subts) {
            this.subts = subts;
            return this;
        }
        public String getSubts() {
            return this.subts;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setTAnucodeConnect(String TAnucodeConnect) {
            this.TAnucodeConnect = TAnucodeConnect;
            return this;
        }
        public String getTAnucodeConnect() {
            return this.TAnucodeConnect;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setTelA(String telA) {
            this.telA = telA;
            return this;
        }
        public String getTelA() {
            return this.telA;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

        public QueryAxnExtensionBindFixedLineResponseBodyData setTelXext(String telXext) {
            this.telXext = telXext;
            return this;
        }
        public String getTelXext() {
            return this.telXext;
        }

    }

}
