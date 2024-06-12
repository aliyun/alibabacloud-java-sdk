// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("IconUrl")
    public String iconUrl;

    @NameInMap("InstallParam")
    public String installParam;

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
