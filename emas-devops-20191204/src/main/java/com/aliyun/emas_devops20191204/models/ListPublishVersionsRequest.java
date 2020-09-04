// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPublishVersionsRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    public static ListPublishVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishVersionsRequest self = new ListPublishVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishVersionsRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
