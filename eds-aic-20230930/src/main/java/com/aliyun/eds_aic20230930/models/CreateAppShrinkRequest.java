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
     * <p>The name used by the application file in OSS. This parameter, combined with <code>FilePath</code>, uniquely identifies the OSS path of the application file.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">Cloud Phone console</a> and follow the on-screen instructions to upload the application file to Application Center to obtain the value of this parameter.</p>
     * </li>
     * <li><p>If you do not specify <code>OssAppUrl</code>, you must specify <code>FileName</code> and <code>FilePath</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testApp.apk</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The OSS bucket path to the application file. This parameter, combined with <code>FileName</code>, uniquely identifies the OSS path of the application file.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">Cloud Phone console</a> and follow the on-screen instructions to upload the application file to Application Center to obtain the value of this parameter.</p>
     * </li>
     * <li><p>If you do not specify <code>OssAppUrl</code>, you must specify <code>FileName</code> and <code>FilePath</code>.</p>
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
     * <p>The endpoint of the OSS bucket to which you want to upload the application file.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">Cloud Phone console</a> and follow the on-screen instructions to upload the application file to Application Center to obtain the value of this parameter.</p>
     * </li>
     * <li><p>If you do not specify <code>FileName</code> or <code>FilePath</code>, you must specify this parameter.</p>
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
