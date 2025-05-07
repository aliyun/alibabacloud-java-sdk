// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxbBindFixedLineResponseBody extends TeaModel {
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
     * <p>绑定信息</p>
     */
    @NameInMap("Data")
    public QueryAxbBindFixedLineResponseBodyData data;

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
     * <p>3179F199-C6C5-5963-85A6-21CBA2F47592</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>处理是否成功 true-成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAxbBindFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAxbBindFixedLineResponseBody self = new QueryAxbBindFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAxbBindFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAxbBindFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAxbBindFixedLineResponseBody setData(QueryAxbBindFixedLineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAxbBindFixedLineResponseBodyData getData() {
        return this.data;
    }

    public QueryAxbBindFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAxbBindFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAxbBindFixedLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAxbBindFixedLineResponseBodyDataExtra extends TeaModel {
        /**
         * <p>录音控制，仅下列值有效。默认是0（不开通录音功能）。 0：不录音 1：录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Callrecording")
        public String callrecording;

        public static QueryAxbBindFixedLineResponseBodyDataExtra build(java.util.Map<String, ?> map) throws Exception {
            QueryAxbBindFixedLineResponseBodyDataExtra self = new QueryAxbBindFixedLineResponseBodyDataExtra();
            return TeaModel.build(map, self);
        }

        public QueryAxbBindFixedLineResponseBodyDataExtra setCallrecording(String callrecording) {
            this.callrecording = callrecording;
            return this;
        }
        public String getCallrecording() {
            return this.callrecording;
        }

    }

    public static class QueryAxbBindFixedLineResponseBodyData extends TeaModel {
        /**
         * <p>接通前放音编码，放音编码必须包含3个场景的编码。按照“B-&gt;X,A-&gt;X,其他号码-&gt;X”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2,3”表示B-&gt;X放音编号为1，A-&gt;X放音编号为2， 其他号码-&gt;X放音编号为3</p>
         * 
         * <strong>example:</strong>
         * <p>10001,10002,10003</p>
         */
        @NameInMap("Anucode")
        public String anucode;

        /**
         * <p>接通后被叫侧放音编码</p>
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
         * <p>绑定过期时间</p>
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
        public QueryAxbBindFixedLineResponseBodyDataExtra extra;

        /**
         * <p>接入商自有字段，最大100字符长度</p>
         * 
         * <strong>example:</strong>
         * <p>19394</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>绑定id</p>
         * 
         * <strong>example:</strong>
         * <p>GHX0534X202504221531579290029-2-1-aliaxb</p>
         */
        @NameInMap("Subid")
        public String subid;

        /**
         * <p>绑定时间，格式为yyyyMMddHHmmss。时间采用北京时间，24小时制。</p>
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
         * <p>示例值示例值</p>
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
         * <p>B号码</p>
         * 
         * <strong>example:</strong>
         * <p>15500002222</p>
         */
        @NameInMap("TelB")
        public String telB;

        /**
         * <p>小号号码</p>
         * 
         * <strong>example:</strong>
         * <p>19700002222</p>
         */
        @NameInMap("TelX")
        public String telX;

        public static QueryAxbBindFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAxbBindFixedLineResponseBodyData self = new QueryAxbBindFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAxbBindFixedLineResponseBodyData setAnucode(String anucode) {
            this.anucode = anucode;
            return this;
        }
        public String getAnucode() {
            return this.anucode;
        }

        public QueryAxbBindFixedLineResponseBodyData setAnucodecalled(String anucodecalled) {
            this.anucodecalled = anucodecalled;
            return this;
        }
        public String getAnucodecalled() {
            return this.anucodecalled;
        }

        public QueryAxbBindFixedLineResponseBodyData setAreacode(String areacode) {
            this.areacode = areacode;
            return this;
        }
        public String getAreacode() {
            return this.areacode;
        }

        public QueryAxbBindFixedLineResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public QueryAxbBindFixedLineResponseBodyData setExtra(QueryAxbBindFixedLineResponseBodyDataExtra extra) {
            this.extra = extra;
            return this;
        }
        public QueryAxbBindFixedLineResponseBodyDataExtra getExtra() {
            return this.extra;
        }

        public QueryAxbBindFixedLineResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryAxbBindFixedLineResponseBodyData setSubid(String subid) {
            this.subid = subid;
            return this;
        }
        public String getSubid() {
            return this.subid;
        }

        public QueryAxbBindFixedLineResponseBodyData setSubts(String subts) {
            this.subts = subts;
            return this;
        }
        public String getSubts() {
            return this.subts;
        }

        public QueryAxbBindFixedLineResponseBodyData setTAnucodeConnect(String TAnucodeConnect) {
            this.TAnucodeConnect = TAnucodeConnect;
            return this;
        }
        public String getTAnucodeConnect() {
            return this.TAnucodeConnect;
        }

        public QueryAxbBindFixedLineResponseBodyData setTelA(String telA) {
            this.telA = telA;
            return this;
        }
        public String getTelA() {
            return this.telA;
        }

        public QueryAxbBindFixedLineResponseBodyData setTelB(String telB) {
            this.telB = telB;
            return this;
        }
        public String getTelB() {
            return this.telB;
        }

        public QueryAxbBindFixedLineResponseBodyData setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

    }

}
