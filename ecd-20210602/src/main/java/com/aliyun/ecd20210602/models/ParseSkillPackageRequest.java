// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ParseSkillPackageRequest extends TeaModel {
    /**
     * <p>The OSS ETag returned after the file is uploaded to OSS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1D9920C4858A60B70705A8765A******</p>
     */
    @NameInMap("OssObjectETag")
    public String ossObjectETag;

    /**
     * <p>The OSS path of the skill package.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssObjectKey")
    public String ossObjectKey;

    public static ParseSkillPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ParseSkillPackageRequest self = new ParseSkillPackageRequest();
        return TeaModel.build(map, self);
    }

    public ParseSkillPackageRequest setOssObjectETag(String ossObjectETag) {
        this.ossObjectETag = ossObjectETag;
        return this;
    }
    public String getOssObjectETag() {
        return this.ossObjectETag;
    }

    public ParseSkillPackageRequest setOssObjectKey(String ossObjectKey) {
        this.ossObjectKey = ossObjectKey;
        return this;
    }
    public String getOssObjectKey() {
        return this.ossObjectKey;
    }

}
