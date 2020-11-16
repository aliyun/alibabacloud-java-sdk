// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveLazyPullStreamInfoConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    public static DeleteLiveLazyPullStreamInfoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveLazyPullStreamInfoConfigRequest self = new DeleteLiveLazyPullStreamInfoConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveLazyPullStreamInfoConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteLiveLazyPullStreamInfoConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
