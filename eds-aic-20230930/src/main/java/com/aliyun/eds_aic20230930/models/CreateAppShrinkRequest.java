// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAppShrinkRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>Application Name 1</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The information about the custom app.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you want to pass in a custom app, configure the <code>CustomAppInfo</code> parameter. Take note that the six fields within it are mandatory.</p>
     * </li>
     * <li><p>A custom app has a higher priority than an app from the Alibaba Cloud Workspace Application Center. If you configure the <code>CustomAppInfo</code> parameter, the <code>FileName</code> and <code>FilePath</code> pair or the <code>OssAppUrl</code> will not take effect.</p>
     * </li>
     * </ul>
     */
    @NameInMap("CustomAppInfo")
    public String customAppInfoShrink;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name used by the app file in Object Storage Service (OSS). This parameter, combined with <code>FilePath</code>, uniquely identifies the OSS path of the app file.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you want to pass in an app from the Alibaba Cloud Workspace Application Center, configure the <code>FileName</code> and <code>FilePath</code> parameters. Alternatively, configure the <code>OssAppUrl</code> parameter. The FileName and FilePath parameters takes precedence over the OssAppUrl parameter.</p>
     * </li>
     * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">Elastic Desktop Service (EDS) Enterprise</a> console, upload the app file to the Application Center according to the on-screen instructions, and then retrieve the parameter value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testApp.apk</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The OSS bucket path to the app file. This parameter, combined with <code>FileName</code>, uniquely identifies the OSS path of the app file.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you want to pass in an app from the Alibaba Cloud Workspace Application Center, configure the <code>FileName</code> and <code>FilePath</code> parameters. Alternatively, configure the <code>OssAppUrl</code> parameter. The FileName and FilePath parameters takes precedence over the OssAppUrl parameter.</p>
     * </li>
     * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">EDS Enterprise</a> console, upload the app file to the Application Center according to the on-screen instructions, and then retrieve the parameter value.</p>
     * </li>
     * </ul>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The icon URL of the application.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com/icon.png">https://www.example.com/icon.png</a></p>
     */
    @NameInMap("IconUrl")
    public String iconUrl;

    /**
     * <p>The parameters used for installing the application. By default, the <code>-r</code> parameter is included when you install an application.</p>
     * 
     * <strong>example:</strong>
     * <p>-d</p>
     */
    @NameInMap("InstallParam")
    public String installParam;

    /**
     * <p>The OSS bucket endpoint of the app file.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you want to pass in an app from the Alibaba Cloud Workspace Application Center, configure the <code>FileName</code> and <code>FilePath</code> parameters. Alternatively, configure the <code>OssAppUrl</code> parameter. The FileName and FilePath parameters takes precedence over the OssAppUrl parameter.</p>
     * </li>
     * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">EDS Enterprise</a> console, upload the app file to the Application Center according to the on-screen instructions, and then retrieve the parameter value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://testApp.apk">http://testApp.apk</a></p>
     */
    @NameInMap("OssAppUrl")
    public String ossAppUrl;

    public static CreateAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppShrinkRequest self = new CreateAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppShrinkRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateAppShrinkRequest setCustomAppInfoShrink(String customAppInfoShrink) {
        this.customAppInfoShrink = customAppInfoShrink;
        return this;
    }
    public String getCustomAppInfoShrink() {
        return this.customAppInfoShrink;
    }

    public CreateAppShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateAppShrinkRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateAppShrinkRequest setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public CreateAppShrinkRequest setInstallParam(String installParam) {
        this.installParam = installParam;
        return this;
    }
    public String getInstallParam() {
        return this.installParam;
    }

    public CreateAppShrinkRequest setOssAppUrl(String ossAppUrl) {
        this.ossAppUrl = ossAppUrl;
        return this;
    }
    public String getOssAppUrl() {
        return this.ossAppUrl;
    }

}
