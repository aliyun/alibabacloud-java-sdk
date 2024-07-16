// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCreateCustomerInfomationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("CanBuyCard")
    public String canBuyCard;

    /**
     * <strong>example:</strong>
     * <p>2E759287-F208-589B-82D8-6D7A30F417E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>https://*******</p>
     */
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
