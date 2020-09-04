// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DeleteAndroidCertRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    public static DeleteAndroidCertRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAndroidCertRequest self = new DeleteAndroidCertRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAndroidCertRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DeleteAndroidCertRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

}
