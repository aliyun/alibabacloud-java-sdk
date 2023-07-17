// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteRetcodeAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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

    public DeleteRetcodeAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
