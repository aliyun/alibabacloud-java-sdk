// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapFromHavanaBindIdShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("HavanaBindId")
    public String havanaBindId;

    @NameInMap("HavanaBindStations")
    public String havanaBindStationsShrink;

    public static MapFromHavanaBindIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MapFromHavanaBindIdShrinkRequest self = new MapFromHavanaBindIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MapFromHavanaBindIdShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public MapFromHavanaBindIdShrinkRequest setHavanaBindId(String havanaBindId) {
        this.havanaBindId = havanaBindId;
        return this;
    }
    public String getHavanaBindId() {
        return this.havanaBindId;
    }

    public MapFromHavanaBindIdShrinkRequest setHavanaBindStationsShrink(String havanaBindStationsShrink) {
        this.havanaBindStationsShrink = havanaBindStationsShrink;
        return this;
    }
    public String getHavanaBindStationsShrink() {
        return this.havanaBindStationsShrink;
    }

}
