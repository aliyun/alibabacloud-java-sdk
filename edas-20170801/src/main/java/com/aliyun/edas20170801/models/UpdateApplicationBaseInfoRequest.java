// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationBaseInfoRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application. The name must start with a letter, and can contain letters, digits, underscores (\_), and hyphens (-). The name can be up to 36 characters in length.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The description of the application. The description can be up to 256 characters in length.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The owner of the application. The value can be up to 127 characters in length.</p>
     */
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
