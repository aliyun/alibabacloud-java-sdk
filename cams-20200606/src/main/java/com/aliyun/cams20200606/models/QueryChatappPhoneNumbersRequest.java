// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappPhoneNumbersRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("IsvCode")
    public String isvCode;

    public static QueryChatappPhoneNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChatappPhoneNumbersRequest self = new QueryChatappPhoneNumbersRequest();
        return TeaModel.build(map, self);
    }

    public QueryChatappPhoneNumbersRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public QueryChatappPhoneNumbersRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

}
