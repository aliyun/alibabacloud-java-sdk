// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneBookItemsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-aligenie-access-token")
    public String xAcsAligenieAccessToken;

    @NameInMap("Authorization")
    public String authorization;

    public static ListHotelSceneBookItemsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneBookItemsHeaders self = new ListHotelSceneBookItemsHeaders();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneBookItemsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListHotelSceneBookItemsHeaders setXAcsAligenieAccessToken(String xAcsAligenieAccessToken) {
        this.xAcsAligenieAccessToken = xAcsAligenieAccessToken;
        return this;
    }
    public String getXAcsAligenieAccessToken() {
        return this.xAcsAligenieAccessToken;
    }

    public ListHotelSceneBookItemsHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
