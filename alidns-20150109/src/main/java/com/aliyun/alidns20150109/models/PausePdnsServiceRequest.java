// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class PausePdnsServiceRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ServiceType")
    public String serviceType;

    public static PausePdnsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PausePdnsServiceRequest self = new PausePdnsServiceRequest();
        return TeaModel.build(map, self);
    }

    public PausePdnsServiceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PausePdnsServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
