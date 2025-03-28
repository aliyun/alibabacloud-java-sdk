// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ArtifactCode extends TeaModel {
    @NameInMap("checksum")
    public String checksum;

    @NameInMap("url")
    public String url;

    public static ArtifactCode build(java.util.Map<String, ?> map) throws Exception {
        ArtifactCode self = new ArtifactCode();
        return TeaModel.build(map, self);
    }

    public ArtifactCode setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public ArtifactCode setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
