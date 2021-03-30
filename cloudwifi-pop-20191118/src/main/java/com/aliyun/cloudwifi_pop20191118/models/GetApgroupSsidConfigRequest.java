// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupSsidConfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("ApGroupUUId")
    public String apGroupUUId;

    public static GetApgroupSsidConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupSsidConfigRequest self = new GetApgroupSsidConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetApgroupSsidConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetApgroupSsidConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetApgroupSsidConfigRequest setApGroupUUId(String apGroupUUId) {
        this.apGroupUUId = apGroupUUId;
        return this;
    }
    public String getApGroupUUId() {
        return this.apGroupUUId;
    }

}
