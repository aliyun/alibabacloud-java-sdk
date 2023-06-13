// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterConnectionTypesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static ListClusterConnectionTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterConnectionTypesRequest self = new ListClusterConnectionTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterConnectionTypesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
