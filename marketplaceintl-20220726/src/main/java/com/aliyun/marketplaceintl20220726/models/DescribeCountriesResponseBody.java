// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeCountriesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeCountriesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCountriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountriesResponseBody self = new DescribeCountriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCountriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCountriesResponseBody setData(DescribeCountriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCountriesResponseBodyData getData() {
        return this.data;
    }

    public DescribeCountriesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeCountriesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeCountriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCountriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCountriesResponseBodyData extends TeaModel {
        @NameInMap("Countries")
        public java.util.List<String> countries;

        @NameInMap("EncryptData")
        public String encryptData;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Uid")
        public String uid;

        public static DescribeCountriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCountriesResponseBodyData self = new DescribeCountriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCountriesResponseBodyData setCountries(java.util.List<String> countries) {
            this.countries = countries;
            return this;
        }
        public java.util.List<String> getCountries() {
            return this.countries;
        }

        public DescribeCountriesResponseBodyData setEncryptData(String encryptData) {
            this.encryptData = encryptData;
            return this;
        }
        public String getEncryptData() {
            return this.encryptData;
        }

        public DescribeCountriesResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeCountriesResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
