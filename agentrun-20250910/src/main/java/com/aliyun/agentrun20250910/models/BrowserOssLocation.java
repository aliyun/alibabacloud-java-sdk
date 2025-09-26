// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserOssLocation extends TeaModel {
    @NameInMap("bucket")
    public String bucket;

    @NameInMap("prefix")
    public String prefix;

    public static BrowserOssLocation build(java.util.Map<String, ?> map) throws Exception {
        BrowserOssLocation self = new BrowserOssLocation();
        return TeaModel.build(map, self);
    }

    public BrowserOssLocation setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public BrowserOssLocation setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
