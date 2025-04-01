// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class OssSourceConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo-bucket</p>
     */
    @NameInMap("bucket")
    public String bucket;

    /**
     * <strong>example:</strong>
     * <p>demo-object</p>
     */
    @NameInMap("object")
    public String object;

    public static OssSourceConfig build(java.util.Map<String, ?> map) throws Exception {
        OssSourceConfig self = new OssSourceConfig();
        return TeaModel.build(map, self);
    }

    public OssSourceConfig setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public OssSourceConfig setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

}
