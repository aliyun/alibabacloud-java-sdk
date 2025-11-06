// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetUserSettingResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetUserSettingResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserSettingResponseBody self = new GetUserSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserSettingResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetUserSettingResponseBody setData(GetUserSettingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserSettingResponseBodyData getData() {
        return this.data;
    }

    public GetUserSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserSettingResponseBodyData extends TeaModel {
        @NameInMap("Logstore")
        public String logstore;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UserId")
        public Long userId;

        public static GetUserSettingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserSettingResponseBodyData self = new GetUserSettingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserSettingResponseBodyData setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetUserSettingResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetUserSettingResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
