// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCreateCustomerInfomationResponseBody extends TeaModel {
    @NameInMap("CanBuyCard")
    public String canBuyCard;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("URL")
    public String URL;

    public static GetCreateCustomerInfomationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCreateCustomerInfomationResponseBody self = new GetCreateCustomerInfomationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCreateCustomerInfomationResponseBody setCanBuyCard(String canBuyCard) {
        this.canBuyCard = canBuyCard;
        return this;
    }
    public String getCanBuyCard() {
        return this.canBuyCard;
    }

    public GetCreateCustomerInfomationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCreateCustomerInfomationResponseBody setURL(String URL) {
        this.URL = URL;
        return this;
    }
    public String getURL() {
        return this.URL;
    }

}
