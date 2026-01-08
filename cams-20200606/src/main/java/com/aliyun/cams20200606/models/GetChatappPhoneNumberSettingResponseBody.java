// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappPhoneNumberSettingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetChatappPhoneNumberSettingResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>42602478-F7C1-58D2-AFFE-88F7A18***6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetChatappPhoneNumberSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatappPhoneNumberSettingResponseBody self = new GetChatappPhoneNumberSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatappPhoneNumberSettingResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetChatappPhoneNumberSettingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChatappPhoneNumberSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatappPhoneNumberSettingResponseBody setModel(GetChatappPhoneNumberSettingResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetChatappPhoneNumberSettingResponseBodyModel getModel() {
        return this.model;
    }

    public GetChatappPhoneNumberSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChatappPhoneNumberSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetChatappPhoneNumberSettingResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("MarketingPaused")
        public String marketingPaused;

        /**
         * <strong>example:</strong>
         * <p>86138****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        public static GetChatappPhoneNumberSettingResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetChatappPhoneNumberSettingResponseBodyModel self = new GetChatappPhoneNumberSettingResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetChatappPhoneNumberSettingResponseBodyModel setMarketingPaused(String marketingPaused) {
            this.marketingPaused = marketingPaused;
            return this;
        }
        public String getMarketingPaused() {
            return this.marketingPaused;
        }

        public GetChatappPhoneNumberSettingResponseBodyModel setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    }

}
