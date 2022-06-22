// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUnFinishedPublishOrderRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("SwitchName")
    public String switchName;

    @NameInMap("SwitchNameSpace")
    public String switchNameSpace;

    public static GetUnFinishedPublishOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnFinishedPublishOrderRequest self = new GetUnFinishedPublishOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetUnFinishedPublishOrderRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public GetUnFinishedPublishOrderRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetUnFinishedPublishOrderRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public GetUnFinishedPublishOrderRequest setSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }
    public String getSwitchName() {
        return this.switchName;
    }

    public GetUnFinishedPublishOrderRequest setSwitchNameSpace(String switchNameSpace) {
        this.switchNameSpace = switchNameSpace;
        return this;
    }
    public String getSwitchNameSpace() {
        return this.switchNameSpace;
    }

}
