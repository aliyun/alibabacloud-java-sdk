// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapFromHavanaBindIdRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("HavanaBindId")
    public String havanaBindId;

    @NameInMap("HavanaBindStations")
    public java.util.Map<String, ?> havanaBindStations;

    public static MapFromHavanaBindIdRequest build(java.util.Map<String, ?> map) throws Exception {
        MapFromHavanaBindIdRequest self = new MapFromHavanaBindIdRequest();
        return TeaModel.build(map, self);
    }

    public MapFromHavanaBindIdRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public MapFromHavanaBindIdRequest setHavanaBindId(String havanaBindId) {
        this.havanaBindId = havanaBindId;
        return this;
    }
    public String getHavanaBindId() {
        return this.havanaBindId;
    }

    public MapFromHavanaBindIdRequest setHavanaBindStations(java.util.Map<String, ?> havanaBindStations) {
        this.havanaBindStations = havanaBindStations;
        return this;
    }
    public java.util.Map<String, ?> getHavanaBindStations() {
        return this.havanaBindStations;
    }

}
