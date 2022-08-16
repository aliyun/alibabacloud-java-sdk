// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCreateCustomerInformationResponseBody extends TeaModel {
    @NameInMap("CanBuyCard")
    public String canBuyCard;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("URL")
    public String URL;

    public static GetCreateCustomerInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCreateCustomerInformationResponseBody self = new GetCreateCustomerInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCreateCustomerInformationResponseBody setCanBuyCard(String canBuyCard) {
        this.canBuyCard = canBuyCard;
        return this;
    }
    public String getCanBuyCard() {
        return this.canBuyCard;
    }

    public GetCreateCustomerInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCreateCustomerInformationResponseBody setURL(String URL) {
        this.URL = URL;
        return this;
    }
    public String getURL() {
        return this.URL;
    }

}
