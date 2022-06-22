// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSwitchNameSpacesRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("NameSpace")
    public String nameSpace;

    public static GetSwitchNameSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchNameSpacesRequest self = new GetSwitchNameSpacesRequest();
        return TeaModel.build(map, self);
    }

    public GetSwitchNameSpacesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public GetSwitchNameSpacesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetSwitchNameSpacesRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

}
