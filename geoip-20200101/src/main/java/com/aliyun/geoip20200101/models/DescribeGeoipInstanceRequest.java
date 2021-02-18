// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeGeoipInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceRequest self = new DescribeGeoipInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGeoipInstanceRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeGeoipInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
