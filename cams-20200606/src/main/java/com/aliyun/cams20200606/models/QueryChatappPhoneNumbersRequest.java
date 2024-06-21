// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappPhoneNumbersRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ISV verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>aksik93kdkkxmwol93939</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <strong>example:</strong>
     * <p>VERIFIED</p>
     */
    @NameInMap("Status")
    public String status;

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

    public QueryChatappPhoneNumbersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
