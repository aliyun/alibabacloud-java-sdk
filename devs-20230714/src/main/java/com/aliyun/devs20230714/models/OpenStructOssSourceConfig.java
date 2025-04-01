// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class OpenStructOssSourceConfig extends TeaModel {
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

    public static OpenStructOssSourceConfig build(java.util.Map<String, ?> map) throws Exception {
        OpenStructOssSourceConfig self = new OpenStructOssSourceConfig();
        return TeaModel.build(map, self);
    }

    public OpenStructOssSourceConfig setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public OpenStructOssSourceConfig setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

}
