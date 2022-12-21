// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListProductsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-accept-language")
    public String xAcsAcceptLanguage;

    public static ListProductsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListProductsHeaders self = new ListProductsHeaders();
        return TeaModel.build(map, self);
    }

    public ListProductsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListProductsHeaders setXAcsAcceptLanguage(String xAcsAcceptLanguage) {
        this.xAcsAcceptLanguage = xAcsAcceptLanguage;
        return this;
    }
    public String getXAcsAcceptLanguage() {
        return this.xAcsAcceptLanguage;
    }

}
