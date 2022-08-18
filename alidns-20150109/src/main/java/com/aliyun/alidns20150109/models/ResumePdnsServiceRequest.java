// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ResumePdnsServiceRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ServiceType")
    public String serviceType;

    public static ResumePdnsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumePdnsServiceRequest self = new ResumePdnsServiceRequest();
        return TeaModel.build(map, self);
    }

    public ResumePdnsServiceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ResumePdnsServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
