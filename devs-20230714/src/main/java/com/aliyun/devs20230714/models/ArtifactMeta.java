// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ArtifactMeta extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CRC-64 code</p>
     */
    @NameInMap("checksum")
    public String checksum;

    /**
     * <strong>example:</strong>
     * <p>my-artifact</p>
     */
    @NameInMap("name")
    public String name;

    public static ArtifactMeta build(java.util.Map<String, ?> map) throws Exception {
        ArtifactMeta self = new ArtifactMeta();
        return TeaModel.build(map, self);
    }

    public ArtifactMeta setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public ArtifactMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
