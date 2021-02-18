// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceDataInfosRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LocationDataType")
    public String locationDataType;

    public static DescribeGeoipInstanceDataInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceDataInfosRequest self = new DescribeGeoipInstanceDataInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceDataInfosRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGeoipInstanceDataInfosRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeGeoipInstanceDataInfosRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGeoipInstanceDataInfosRequest setLocationDataType(String locationDataType) {
        this.locationDataType = locationDataType;
        return this;
    }
    public String getLocationDataType() {
        return this.locationDataType;
    }

}
