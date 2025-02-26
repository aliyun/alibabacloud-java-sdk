// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateScreenshotRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud phone instances. You can create multiple snapshots simultaneously.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>The name of the OSS bucket. The name must start with &quot;cloudphone-saved-bucket-&quot;. The OSS bucket and the cloud phone instance must be in the same region. If you leave this parameter empty, the system will create a default OSS bucket named “cloudphone-saved-bucket-{Region of the cloud phone instance}-{AliUid}.”</p>
     * 
     * <strong>example:</strong>
     * <p>cloudphone-saved-bucket-cn-shanghai-default</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>Specifies whether to bypass the snapshot policy control. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipCheckPolicyConfig")
    public String skipCheckPolicyConfig;

    public static CreateScreenshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenshotRequest self = new CreateScreenshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateScreenshotRequest setAndroidInstanceIdList(java.util.List<String> androidInstanceIdList) {
        this.androidInstanceIdList = androidInstanceIdList;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    public CreateScreenshotRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateScreenshotRequest setSkipCheckPolicyConfig(String skipCheckPolicyConfig) {
        this.skipCheckPolicyConfig = skipCheckPolicyConfig;
        return this;
    }
    public String getSkipCheckPolicyConfig() {
        return this.skipCheckPolicyConfig;
    }

}
