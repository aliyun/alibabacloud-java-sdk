// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappUploadAuthorizationRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    public static GetChatappUploadAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatappUploadAuthorizationRequest self = new GetChatappUploadAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public GetChatappUploadAuthorizationRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

}
