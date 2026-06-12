// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillFileDetectRequest extends TeaModel {
    /**
     * <p>A unique, client-generated token to ensure request idempotence. <strong>ClientToken</strong> must contain only ASCII characters and be no longer than 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The OSS URL of the compressed Skill package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570.zip">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570.zip</a></p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateSkillFileDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillFileDetectRequest self = new CreateSkillFileDetectRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillFileDetectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSkillFileDetectRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public CreateSkillFileDetectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
