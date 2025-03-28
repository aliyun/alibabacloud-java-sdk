// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ArtifactStatus extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:devs:cn-hangzhou:123456:artifacts/my-first-artifact</p>
     */
    @NameInMap("arn")
    public String arn;

    /**
     * <strong>example:</strong>
     * <p>2825179536350****</p>
     */
    @NameInMap("checksum")
    public String checksum;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("size")
    public Long size;

    public static ArtifactStatus build(java.util.Map<String, ?> map) throws Exception {
        ArtifactStatus self = new ArtifactStatus();
        return TeaModel.build(map, self);
    }

    public ArtifactStatus setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public ArtifactStatus setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public ArtifactStatus setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
