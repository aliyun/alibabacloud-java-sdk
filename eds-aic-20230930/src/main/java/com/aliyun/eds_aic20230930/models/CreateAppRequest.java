// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
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
    public CreateAppRequestCustomAppInfo customAppInfo;

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

    public CreateAppRequest setCustomAppInfo(CreateAppRequestCustomAppInfo customAppInfo) {
        this.customAppInfo = customAppInfo;
        return this;
    }
    public CreateAppRequestCustomAppInfo getCustomAppInfo() {
        return this.customAppInfo;
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

    public static class CreateAppRequestCustomAppInfo extends TeaModel {
        @NameInMap("ApkSize")
        public String apkSize;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("Version")
        public String version;

        @NameInMap("VersionCode")
        public String versionCode;

        public static CreateAppRequestCustomAppInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestCustomAppInfo self = new CreateAppRequestCustomAppInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestCustomAppInfo setApkSize(String apkSize) {
            this.apkSize = apkSize;
            return this;
        }
        public String getApkSize() {
            return this.apkSize;
        }

        public CreateAppRequestCustomAppInfo setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public CreateAppRequestCustomAppInfo setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public CreateAppRequestCustomAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public CreateAppRequestCustomAppInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateAppRequestCustomAppInfo setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

}
