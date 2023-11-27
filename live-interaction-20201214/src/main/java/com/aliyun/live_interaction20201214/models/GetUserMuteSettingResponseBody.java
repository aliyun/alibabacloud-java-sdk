// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetUserMuteSettingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetUserMuteSettingResponseBodyResult result;

    public static GetUserMuteSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserMuteSettingResponseBody self = new GetUserMuteSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserMuteSettingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserMuteSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserMuteSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserMuteSettingResponseBody setResult(GetUserMuteSettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetUserMuteSettingResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetUserMuteSettingResponseBodyResult extends TeaModel {
        @NameInMap("UserMuteSettings")
        public java.util.Map<String, ResultUserMuteSettingsValue> userMuteSettings;

        public static GetUserMuteSettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserMuteSettingResponseBodyResult self = new GetUserMuteSettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetUserMuteSettingResponseBodyResult setUserMuteSettings(java.util.Map<String, ResultUserMuteSettingsValue> userMuteSettings) {
            this.userMuteSettings = userMuteSettings;
            return this;
        }
        public java.util.Map<String, ResultUserMuteSettingsValue> getUserMuteSettings() {
            return this.userMuteSettings;
        }

    }

}
