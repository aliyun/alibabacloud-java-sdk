// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateScreenshotRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <strong>example:</strong>
     * <p>cloudphone-saved-bucket-cn-shanghai-default</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
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
