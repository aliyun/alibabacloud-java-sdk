// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestOssStsRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("ExpireSeconds")
    public Long expireSeconds;

    public static RequestOssStsRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestOssStsRequest self = new RequestOssStsRequest();
        return TeaModel.build(map, self);
    }

    public RequestOssStsRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public RequestOssStsRequest setExpireSeconds(Long expireSeconds) {
        this.expireSeconds = expireSeconds;
        return this;
    }
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

}
