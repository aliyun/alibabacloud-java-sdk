// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberConvertServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PhoneNumberConvertServiceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberConvertServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberConvertServiceResponseBody self = new PhoneNumberConvertServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberConvertServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberConvertServiceResponseBody setData(java.util.List<PhoneNumberConvertServiceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PhoneNumberConvertServiceResponseBodyData> getData() {
        return this.data;
    }

    public PhoneNumberConvertServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberConvertServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberConvertServiceResponseBodyData extends TeaModel {
        @NameInMap("ConverResult")
        public Boolean converResult;

        @NameInMap("Number")
        public String number;

        @NameInMap("NumberMd5")
        public String numberMd5;

        @NameInMap("NumberSha256")
        public String numberSha256;

        public static PhoneNumberConvertServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberConvertServiceResponseBodyData self = new PhoneNumberConvertServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberConvertServiceResponseBodyData setConverResult(Boolean converResult) {
            this.converResult = converResult;
            return this;
        }
        public Boolean getConverResult() {
            return this.converResult;
        }

        public PhoneNumberConvertServiceResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PhoneNumberConvertServiceResponseBodyData setNumberMd5(String numberMd5) {
            this.numberMd5 = numberMd5;
            return this;
        }
        public String getNumberMd5() {
            return this.numberMd5;
        }

        public PhoneNumberConvertServiceResponseBodyData setNumberSha256(String numberSha256) {
            this.numberSha256 = numberSha256;
            return this;
        }
        public String getNumberSha256() {
            return this.numberSha256;
        }

    }

}
