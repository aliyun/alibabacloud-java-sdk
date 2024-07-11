// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4384****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleVersion</p>
     */
    @NameInMap("AppVersionName")
    public String appVersionName;

    public static CreateAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionRequest self = new CreateAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppVersionRequest setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

}
