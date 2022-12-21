// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListResourceTypesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-accept-language")
    public String xAcsAcceptLanguage;

    public static ListResourceTypesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesHeaders self = new ListResourceTypesHeaders();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListResourceTypesHeaders setXAcsAcceptLanguage(String xAcsAcceptLanguage) {
        this.xAcsAcceptLanguage = xAcsAcceptLanguage;
        return this;
    }
    public String getXAcsAcceptLanguage() {
        return this.xAcsAcceptLanguage;
    }

}
