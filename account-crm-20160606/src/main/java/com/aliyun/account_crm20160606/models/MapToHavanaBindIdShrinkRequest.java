// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapToHavanaBindIdShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("HavanaBindStations")
    public String havanaBindStationsShrink;

    @NameInMap("Pk")
    public String pk;

    public static MapToHavanaBindIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MapToHavanaBindIdShrinkRequest self = new MapToHavanaBindIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MapToHavanaBindIdShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public MapToHavanaBindIdShrinkRequest setHavanaBindStationsShrink(String havanaBindStationsShrink) {
        this.havanaBindStationsShrink = havanaBindStationsShrink;
        return this;
    }
    public String getHavanaBindStationsShrink() {
        return this.havanaBindStationsShrink;
    }

    public MapToHavanaBindIdShrinkRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
