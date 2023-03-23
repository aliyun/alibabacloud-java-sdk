// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class PublishVectorRequest extends TeaModel {
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("Name")
    public String name;

    public static PublishVectorRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishVectorRequest self = new PublishVectorRequest();
        return TeaModel.build(map, self);
    }

    public PublishVectorRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public PublishVectorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
