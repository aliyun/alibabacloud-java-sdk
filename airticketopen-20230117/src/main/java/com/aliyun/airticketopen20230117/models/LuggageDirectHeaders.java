// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class LuggageDirectHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>access_token</p>
     */
    @NameInMap("x-acs-airticket-access-token")
    public String xAcsAirticketAccessToken;

    @NameInMap("x-acs-airticket-language")
    public String xAcsAirticketLanguage;

    public static LuggageDirectHeaders build(java.util.Map<String, ?> map) throws Exception {
        LuggageDirectHeaders self = new LuggageDirectHeaders();
        return TeaModel.build(map, self);
    }

    public LuggageDirectHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public LuggageDirectHeaders setXAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
        this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
        return this;
    }
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    public LuggageDirectHeaders setXAcsAirticketLanguage(String xAcsAirticketLanguage) {
        this.xAcsAirticketLanguage = xAcsAirticketLanguage;
        return this;
    }
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

}
