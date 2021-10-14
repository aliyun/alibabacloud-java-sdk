// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApgroupThirdAppRequest extends TeaModel {
    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // param1
    @NameInMap("Id")
    public Long id;

    public static DeleteApgroupThirdAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApgroupThirdAppRequest self = new DeleteApgroupThirdAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApgroupThirdAppRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DeleteApgroupThirdAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteApgroupThirdAppRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
