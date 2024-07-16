// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCreateCustomerInformationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("CanBuyCard")
    public String canBuyCard;

    /**
     * <strong>example:</strong>
     * <p>AE0BA8E5-1E0C-5171-852F-826301C76BBE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>https://*******</p>
     */
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
