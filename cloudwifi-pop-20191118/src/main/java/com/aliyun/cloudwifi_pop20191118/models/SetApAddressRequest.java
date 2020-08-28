// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SetApAddressRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("ApCityName")
    public String apCityName;

    @NameInMap("Lng")
    public String lng;

    @NameInMap("ApCampusName")
    public String apCampusName;

    @NameInMap("ApGroup")
    public String apGroup;

    @NameInMap("Language")
    @Validation(required = true)
    public String language;

    @NameInMap("ApAreaName")
    public String apAreaName;

    @NameInMap("ApProvinceName")
    public String apProvinceName;

    @NameInMap("Mac")
    @Validation(required = true)
    public String mac;

    @NameInMap("ApName")
    public String apName;

    @NameInMap("ApUnitName")
    public String apUnitName;

    @NameInMap("ApFloor")
    public String apFloor;

    @NameInMap("ApBuildingName")
    public String apBuildingName;

    @NameInMap("ApUnitId")
    public Long apUnitId;

    @NameInMap("ApNationName")
    public String apNationName;

    @NameInMap("Lat")
    public String lat;

    @NameInMap("Direction")
    public String direction;

    public static SetApAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApAddressRequest self = new SetApAddressRequest();
        return TeaModel.build(map, self);
    }

}
