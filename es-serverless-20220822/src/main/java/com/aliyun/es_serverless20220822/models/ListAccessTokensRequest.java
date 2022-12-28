// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class ListAccessTokensRequest extends TeaModel {
    @NameInMap("tokenId")
    public String tokenId;

    public static ListAccessTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessTokensRequest self = new ListAccessTokensRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessTokensRequest setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }
    public String getTokenId() {
        return this.tokenId;
    }

}
