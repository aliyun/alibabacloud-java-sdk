// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetSmsCodeLimitConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSmsCodeLimitConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSmsCodeLimitConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsCodeLimitConfigResponseBody self = new GetSmsCodeLimitConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsCodeLimitConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsCodeLimitConfigResponseBody setData(GetSmsCodeLimitConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSmsCodeLimitConfigResponseBodyData getData() {
        return this.data;
    }

    public GetSmsCodeLimitConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsCodeLimitConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSmsCodeLimitConfigResponseBodyData extends TeaModel {
        @NameInMap("LimitDay")
        public Integer limitDay;

        @NameInMap("LimitHour")
        public Integer limitHour;

        @NameInMap("LimitId")
        public Long limitId;

        @NameInMap("LimitMinute")
        public Integer limitMinute;

        @NameInMap("LimitOther")
        public String limitOther;

        public static GetSmsCodeLimitConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSmsCodeLimitConfigResponseBodyData self = new GetSmsCodeLimitConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSmsCodeLimitConfigResponseBodyData setLimitDay(Integer limitDay) {
            this.limitDay = limitDay;
            return this;
        }
        public Integer getLimitDay() {
            return this.limitDay;
        }

        public GetSmsCodeLimitConfigResponseBodyData setLimitHour(Integer limitHour) {
            this.limitHour = limitHour;
            return this;
        }
        public Integer getLimitHour() {
            return this.limitHour;
        }

        public GetSmsCodeLimitConfigResponseBodyData setLimitId(Long limitId) {
            this.limitId = limitId;
            return this;
        }
        public Long getLimitId() {
            return this.limitId;
        }

        public GetSmsCodeLimitConfigResponseBodyData setLimitMinute(Integer limitMinute) {
            this.limitMinute = limitMinute;
            return this;
        }
        public Integer getLimitMinute() {
            return this.limitMinute;
        }

        public GetSmsCodeLimitConfigResponseBodyData setLimitOther(String limitOther) {
            this.limitOther = limitOther;
            return this;
        }
        public String getLimitOther() {
            return this.limitOther;
        }

    }

}
