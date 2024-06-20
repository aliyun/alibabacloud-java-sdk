// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeMaliciousAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeMaliciousAddressResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeMaliciousAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaliciousAddressResponseBody self = new DescribeMaliciousAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMaliciousAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMaliciousAddressResponseBody setData(java.util.List<DescribeMaliciousAddressResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMaliciousAddressResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMaliciousAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMaliciousAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMaliciousAddressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMaliciousAddressResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2017-07-18 00:00:00</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <strong>example:</strong>
         * <p>f6d239ff***df816</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>ETH</p>
         */
        @NameInMap("Coin")
        public String coin;

        /**
         * <strong>example:</strong>
         * <p>FAKE_Coindash_2</p>
         */
        @NameInMap("Detail")
        public String detail;

        @NameInMap("Tag")
        public String tag;

        public static DescribeMaliciousAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMaliciousAddressResponseBodyData self = new DescribeMaliciousAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMaliciousAddressResponseBodyData setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public DescribeMaliciousAddressResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeMaliciousAddressResponseBodyData setCoin(String coin) {
            this.coin = coin;
            return this;
        }
        public String getCoin() {
            return this.coin;
        }

        public DescribeMaliciousAddressResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeMaliciousAddressResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
