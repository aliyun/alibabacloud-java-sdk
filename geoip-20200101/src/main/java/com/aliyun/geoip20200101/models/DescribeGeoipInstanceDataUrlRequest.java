// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceDataUrlRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DataType")
    public String dataType;

    public static DescribeGeoipInstanceDataUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceDataUrlRequest self = new DescribeGeoipInstanceDataUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceDataUrlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGeoipInstanceDataUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGeoipInstanceDataUrlRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

}
