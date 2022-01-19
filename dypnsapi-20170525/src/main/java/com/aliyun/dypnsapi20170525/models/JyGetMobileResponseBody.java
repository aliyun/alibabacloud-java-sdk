// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class JyGetMobileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GetMobileResultData")
    public JyGetMobileResponseBodyGetMobileResultData getMobileResultData;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static JyGetMobileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JyGetMobileResponseBody self = new JyGetMobileResponseBody();
        return TeaModel.build(map, self);
    }

    public JyGetMobileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public JyGetMobileResponseBody setGetMobileResultData(JyGetMobileResponseBodyGetMobileResultData getMobileResultData) {
        this.getMobileResultData = getMobileResultData;
        return this;
    }
    public JyGetMobileResponseBodyGetMobileResultData getGetMobileResultData() {
        return this.getMobileResultData;
    }

    public JyGetMobileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JyGetMobileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class JyGetMobileResponseBodyGetMobileResultData extends TeaModel {
        @NameInMap("Mobile")
        public String mobile;

        public static JyGetMobileResponseBodyGetMobileResultData build(java.util.Map<String, ?> map) throws Exception {
            JyGetMobileResponseBodyGetMobileResultData self = new JyGetMobileResponseBodyGetMobileResultData();
            return TeaModel.build(map, self);
        }

        public JyGetMobileResponseBodyGetMobileResultData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

    }

}
