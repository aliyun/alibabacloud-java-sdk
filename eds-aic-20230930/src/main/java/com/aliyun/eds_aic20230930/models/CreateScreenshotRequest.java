// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateScreenshotRequest extends TeaModel {
    /**
     * <p>The list of instance IDs. Batch screenshots are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>The custom OSS bucket. The bucket name must start with the cloudphone-saved-bucket- prefix. The cloud phone instance and the OSS bucket must be in the same region. If you leave this parameter empty, a default bucket named cloudphone-saved-bucket-{RegionOfCloudPhone}-{AliUid} is created.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudphone-saved-bucket-cn-shanghai-default</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The screenshot ID. The generated screenshot is named &quot;ScreenshotId_AndroidInstanceId.png.&quot;</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The ScreenshotId must be 2 to 128 characters long, beginning with a letter, but cannot start with http\:// or https\://. Allowed characters include letters, digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("ScreenshotId")
    public String screenshotId;

    /**
     * <p>Specifies whether to skip the screenshot policy check. The default value is false.</p>
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

    public CreateScreenshotRequest setScreenshotId(String screenshotId) {
        this.screenshotId = screenshotId;
        return this;
    }
    public String getScreenshotId() {
        return this.screenshotId;
    }

    public CreateScreenshotRequest setSkipCheckPolicyConfig(String skipCheckPolicyConfig) {
        this.skipCheckPolicyConfig = skipCheckPolicyConfig;
        return this;
    }
    public String getSkipCheckPolicyConfig() {
        return this.skipCheckPolicyConfig;
    }

}
