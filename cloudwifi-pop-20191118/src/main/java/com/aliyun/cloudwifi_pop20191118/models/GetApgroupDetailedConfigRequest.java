// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupDetailedConfigRequest extends TeaModel {
    @NameInMap("ApgroupId")
    public Long apgroupId;

    @NameInMap("ApgroupUuid")
    public String apgroupUuid;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    public static GetApgroupDetailedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupDetailedConfigRequest self = new GetApgroupDetailedConfigRequest();
        return TeaModel.build(map, self);
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

    public GetApgroupDetailedConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetApgroupDetailedConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
