// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AppsDomain extends TeaModel {
    // 域名
    @NameInMap("Domain")
    public String domain;

    public static AppsDomain build(java.util.Map<String, ?> map) throws Exception {
        AppsDomain self = new AppsDomain();
        return TeaModel.build(map, self);
    }

    public AppsDomain setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
