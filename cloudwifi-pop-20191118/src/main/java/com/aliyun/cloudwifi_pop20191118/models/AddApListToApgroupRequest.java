// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class AddApListToApgroupRequest extends TeaModel {
    @NameInMap("ApGroupId")
    public String apGroupId;

    @NameInMap("ApMacList")
    public java.util.Map<String, ?> apMacList;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    public static AddApListToApgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddApListToApgroupRequest self = new AddApListToApgroupRequest();
        return TeaModel.build(map, self);
    }

    public AddApListToApgroupRequest setApGroupId(String apGroupId) {
        this.apGroupId = apGroupId;
        return this;
    }
    public String getApGroupId() {
        return this.apGroupId;
    }

    public AddApListToApgroupRequest setApMacList(java.util.Map<String, ?> apMacList) {
        this.apMacList = apMacList;
        return this;
    }
    public java.util.Map<String, ?> getApMacList() {
        return this.apMacList;
    }

    public AddApListToApgroupRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public AddApListToApgroupRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
