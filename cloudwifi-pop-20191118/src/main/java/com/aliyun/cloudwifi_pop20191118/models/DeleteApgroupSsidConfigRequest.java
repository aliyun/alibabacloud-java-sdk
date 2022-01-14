// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApgroupSsidConfigRequest extends TeaModel {
    // apgroupId
    @NameInMap("ApgroupId")
    public Long apgroupId;

    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // id
    @NameInMap("Id")
    public Long id;

    public static DeleteApgroupSsidConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApgroupSsidConfigRequest self = new DeleteApgroupSsidConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApgroupSsidConfigRequest setApgroupId(Long apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public Long getApgroupId() {
        return this.apgroupId;
    }

    public DeleteApgroupSsidConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DeleteApgroupSsidConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteApgroupSsidConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
