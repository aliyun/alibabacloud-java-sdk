// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeCancelHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>access_token</p>
     */
    @NameInMap("x-acs-airticket-access-token")
    public String xAcsAirticketAccessToken;

    @NameInMap("x-acs-airticket-language")
    public String xAcsAirticketLanguage;

    public static ChangeCancelHeaders build(java.util.Map<String, ?> map) throws Exception {
        ChangeCancelHeaders self = new ChangeCancelHeaders();
        return TeaModel.build(map, self);
    }

    public ChangeCancelHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ChangeCancelHeaders setXAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
        this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
        return this;
    }
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    public ChangeCancelHeaders setXAcsAirticketLanguage(String xAcsAirticketLanguage) {
        this.xAcsAirticketLanguage = xAcsAirticketLanguage;
        return this;
    }
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

}
