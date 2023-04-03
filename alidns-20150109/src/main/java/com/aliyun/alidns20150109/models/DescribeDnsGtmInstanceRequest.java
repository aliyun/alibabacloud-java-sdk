// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance about which you want to query the information.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeDnsGtmInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceRequest self = new DescribeDnsGtmInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsGtmInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
