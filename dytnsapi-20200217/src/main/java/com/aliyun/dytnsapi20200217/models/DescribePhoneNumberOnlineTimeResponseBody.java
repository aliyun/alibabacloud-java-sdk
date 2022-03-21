// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOnlineTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneNumberOnlineTimeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberOnlineTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOnlineTimeResponseBody self = new DescribePhoneNumberOnlineTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOnlineTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberOnlineTimeResponseBody setData(DescribePhoneNumberOnlineTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneNumberOnlineTimeResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneNumberOnlineTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberOnlineTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneNumberOnlineTimeResponseBodyData extends TeaModel {
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static DescribePhoneNumberOnlineTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberOnlineTimeResponseBodyData self = new DescribePhoneNumberOnlineTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberOnlineTimeResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
