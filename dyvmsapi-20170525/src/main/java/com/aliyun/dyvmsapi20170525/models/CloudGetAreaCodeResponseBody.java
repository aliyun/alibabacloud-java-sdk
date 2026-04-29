// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAreaCodeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudGetAreaCodeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>44D40F36-32D9-555E-89A6-26D39C3044D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudGetAreaCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAreaCodeResponseBody self = new CloudGetAreaCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudGetAreaCodeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudGetAreaCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudGetAreaCodeResponseBody setData(CloudGetAreaCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudGetAreaCodeResponseBodyData getData() {
        return this.data;
    }

    public CloudGetAreaCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudGetAreaCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudGetAreaCodeResponseBodyData extends TeaModel {
        /**
         * <p>区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>号码所属城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>号码所属省份</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>手机号</p>
         * 
         * <strong>example:</strong>
         * <p>183xxxx7093</p>
         */
        @NameInMap("Tel")
        public String tel;

        public static CloudGetAreaCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAreaCodeResponseBodyData self = new CloudGetAreaCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudGetAreaCodeResponseBodyData setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public CloudGetAreaCodeResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public CloudGetAreaCodeResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public CloudGetAreaCodeResponseBodyData setTel(String tel) {
            this.tel = tel;
            return this;
        }
        public String getTel() {
            return this.tel;
        }

    }

}
