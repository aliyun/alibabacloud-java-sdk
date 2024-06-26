// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>testApp.apk</p>
     */
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FilePath")
    public String filePath;

    /**
     * <strong>example:</strong>
     * <p><a href="https://test.png">https://test.png</a></p>
     */
    @NameInMap("IconUrl")
    public String iconUrl;

    /**
     * <strong>example:</strong>
     * <p>-d</p>
     */
    @NameInMap("InstallParam")
    public String installParam;

    /**
     * <strong>example:</strong>
     * <p><a href="http://testApp.apk">http://testApp.apk</a></p>
     */
    @NameInMap("OssAppUrl")
    public String ossAppUrl;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateAppRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateAppRequest setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public CreateAppRequest setInstallParam(String installParam) {
        this.installParam = installParam;
        return this;
    }
    public String getInstallParam() {
        return this.installParam;
    }

    public CreateAppRequest setOssAppUrl(String ossAppUrl) {
        this.ossAppUrl = ossAppUrl;
        return this;
    }
    public String getOssAppUrl() {
        return this.ossAppUrl;
    }

}
