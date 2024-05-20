// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyAppVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppVersionName")
    public String appVersionName;

    public static ModifyAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppVersionRequest self = new ModifyAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppVersionRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public ModifyAppVersionRequest setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

}
