// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class PublishCatCopyChildValue extends TeaModel {
    @NameInMap("Trust")
    public java.util.Map<String, java.util.List<String>> trust;

    public static PublishCatCopyChildValue build(java.util.Map<String, ?> map) throws Exception {
        PublishCatCopyChildValue self = new PublishCatCopyChildValue();
        return TeaModel.build(map, self);
    }

    public PublishCatCopyChildValue setTrust(java.util.Map<String, java.util.List<String>> trust) {
        this.trust = trust;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getTrust() {
        return this.trust;
    }

}
