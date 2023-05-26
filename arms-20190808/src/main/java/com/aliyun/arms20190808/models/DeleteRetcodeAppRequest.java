// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteRetcodeAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteRetcodeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRetcodeAppRequest self = new DeleteRetcodeAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRetcodeAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteRetcodeAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteRetcodeAppRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DeleteRetcodeAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
