// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupDetailedConfigRequest extends TeaModel {
    // appKey
    @NameInMap("AppName")
    public String appName;

    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // apgroupId
    @NameInMap("ApgroupId")
    public Long apgroupId;

    // apgroupUuid
    @NameInMap("ApgroupUuid")
    public String apgroupUuid;

    public static GetApgroupDetailedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupDetailedConfigRequest self = new GetApgroupDetailedConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetApgroupDetailedConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetApgroupDetailedConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetApgroupDetailedConfigRequest setApgroupId(Long apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public Long getApgroupId() {
        return this.apgroupId;
    }

    public GetApgroupDetailedConfigRequest setApgroupUuid(String apgroupUuid) {
        this.apgroupUuid = apgroupUuid;
        return this;
    }
    public String getApgroupUuid() {
        return this.apgroupUuid;
    }

}
