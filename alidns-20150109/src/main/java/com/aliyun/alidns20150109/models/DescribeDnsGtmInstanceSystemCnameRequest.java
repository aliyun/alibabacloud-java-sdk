// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceSystemCnameRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    public static DescribeDnsGtmInstanceSystemCnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceSystemCnameRequest self = new DescribeDnsGtmInstanceSystemCnameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceSystemCnameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsGtmInstanceSystemCnameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
