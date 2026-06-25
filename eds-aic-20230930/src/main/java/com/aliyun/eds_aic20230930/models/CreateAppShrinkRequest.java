// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAppShrinkRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>Application name 1</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The custom application information.</p>
     * <blockquote>
     * <ul>
     * <li><p>If you pass a custom application, pass the <code>CustomAppInfo</code> parameter. All six fields in this object parameter are required.</p>
     * </li>
     * <li><p>Custom applications have a higher priority than applications from the WUYING Workspace app center. If you pass the <code>CustomAppInfo</code> parameter, <code>FileName</code> and <code>FilePath</code>, or <code>OssAppUrl</code> will be invalid.</p>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("CustomAppInfo")
    public String customAppInfoShrink;

    /**
     * <p>The application description.</p>
     * 
     * <strong>example:</strong>
     * <p>Application description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the application file stored in Object Storage Service (OSS). This parameter and <code>FilePath</code> together determine the unique OSS address.</p>
     * <blockquote>
     * <ul>
     * <li><p>If you pass an application from the WUYING Workspace app center, you must pass <code>FileName</code> and <code>FilePath</code>, or <code>OssAppUrl</code>. The former takes precedence.</p>
     * </li>
     * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">WUYING Workspace console</a>. Follow the on-screen instructions to upload your application file to the WUYING Workspace app center to obtain this parameter.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testApp.apk</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The storage address of the application file in an OSS bucket. This parameter and <code>FileName</code> together determine the unique OSS address.</p>
     * <blockquote>
     * <ul>
     * <li><p>If you pass an application from the WUYING Workspace app center, you must pass <code>FileName</code> and <code>FilePath</code>, or <code>OssAppUrl</code>. The former takes precedence.</p>
     * </li>
     * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">WUYING Workspace console</a>. Follow the on-screen instructions to upload your application file to the WUYING Workspace app center to obtain this parameter.</p>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The URL of the application icon.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com/icon.png">https://www.example.com/icon.png</a></p>
     */
    @NameInMap("IconUrl")
    public String iconUrl;

    /**
     * <p>The installation parameters. The <code>-r</code> installation parameter is included by default when you install the application.</p>
     * 
     * <strong>example:</strong>
     * <p>-d</p>
     */
    @NameInMap("InstallParam")
    public String installParam;

    /**
     * <p>The OSS address of the application.</p>
     * <blockquote>
     * <ul>
     * <li><p>If you pass an application from the WUYING Workspace app center, you must pass <code>FileName</code> and <code>FilePath</code>, or <code>OssAppUrl</code>. The former takes precedence.</p>
     * </li>
     * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">WUYING Workspace console</a>. Follow the on-screen instructions to upload your application file to the WUYING Workspace app center to obtain this parameter.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://testApp.apk">http://testApp.apk</a></p>
     */
    @NameInMap("OssAppUrl")
    public String ossAppUrl;

    /**
     * <p>Specifies whether to perform a system signature.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SignApk")
    public String signApk;

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

    public CreateAppShrinkRequest setSignApk(String signApk) {
        this.signApk = signApk;
        return this;
    }
    public String getSignApk() {
        return this.signApk;
    }

}
