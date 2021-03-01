// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationBaseInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Owner")
    public String owner;

    public static UpdateApplicationBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationBaseInfoRequest self = new UpdateApplicationBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationBaseInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateApplicationBaseInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateApplicationBaseInfoRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateApplicationBaseInfoRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
