// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class DescribeNumberMccMncResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeNumberMccMncResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNumberMccMncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNumberMccMncResponseBody self = new DescribeNumberMccMncResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNumberMccMncResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeNumberMccMncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNumberMccMncResponseBody setData(DescribeNumberMccMncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeNumberMccMncResponseBodyData getData() {
        return this.data;
    }

    public DescribeNumberMccMncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNumberMccMncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNumberMccMncResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CountryIso3")
        public String countryIso3;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Mcc")
        public String mcc;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Mnc")
        public String mnc;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Ported")
        public Boolean ported;

        public static DescribeNumberMccMncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNumberMccMncResponseBodyData self = new DescribeNumberMccMncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNumberMccMncResponseBodyData setCountryIso3(String countryIso3) {
            this.countryIso3 = countryIso3;
            return this;
        }
        public String getCountryIso3() {
            return this.countryIso3;
        }

        public DescribeNumberMccMncResponseBodyData setMcc(String mcc) {
            this.mcc = mcc;
            return this;
        }
        public String getMcc() {
            return this.mcc;
        }

        public DescribeNumberMccMncResponseBodyData setMnc(String mnc) {
            this.mnc = mnc;
            return this;
        }
        public String getMnc() {
            return this.mnc;
        }

        public DescribeNumberMccMncResponseBodyData setPorted(Boolean ported) {
            this.ported = ported;
            return this;
        }
        public Boolean getPorted() {
            return this.ported;
        }

    }

}
