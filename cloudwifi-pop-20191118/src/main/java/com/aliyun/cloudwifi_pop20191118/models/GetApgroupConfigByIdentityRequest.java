// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupConfigByIdentityRequest extends TeaModel {
    // apgroupId
    @NameInMap("ApgroupId")
    public Long apgroupId;

    // apgroupUuid
    @NameInMap("ApgroupUuid")
    public String apgroupUuid;

    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appKey
    @NameInMap("AppName")
    public String appName;

    public static GetApgroupConfigByIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupConfigByIdentityRequest self = new GetApgroupConfigByIdentityRequest();
        return TeaModel.build(map, self);
    }

    public GetApgroupConfigByIdentityRequest setApgroupId(Long apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public Long getApgroupId() {
        return this.apgroupId;
    }

    public GetApgroupConfigByIdentityRequest setApgroupUuid(String apgroupUuid) {
        this.apgroupUuid = apgroupUuid;
        return this;
    }
    public String getApgroupUuid() {
        return this.apgroupUuid;
    }

    public GetApgroupConfigByIdentityRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetApgroupConfigByIdentityRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
