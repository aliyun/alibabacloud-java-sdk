// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketingCheckHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>access_token</p>
     */
    @NameInMap("x-acs-airticket-access-token")
    public String xAcsAirticketAccessToken;

    @NameInMap("x-acs-airticket-language")
    public String xAcsAirticketLanguage;

    public static TicketingCheckHeaders build(java.util.Map<String, ?> map) throws Exception {
        TicketingCheckHeaders self = new TicketingCheckHeaders();
        return TeaModel.build(map, self);
    }

    public TicketingCheckHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public TicketingCheckHeaders setXAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
        this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
        return this;
    }
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    public TicketingCheckHeaders setXAcsAirticketLanguage(String xAcsAirticketLanguage) {
        this.xAcsAirticketLanguage = xAcsAirticketLanguage;
        return this;
    }
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

}
