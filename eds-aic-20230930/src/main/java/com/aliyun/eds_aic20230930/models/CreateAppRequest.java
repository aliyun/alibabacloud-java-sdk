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

    @NameInMap("SignApk")
    public String signApk;

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

    public CreateAppRequest setSignApk(String signApk) {
        this.signApk = signApk;
        return this;
    }
    public String getSignApk() {
        return this.signApk;
    }

    public static class CreateAppRequestCustomAppInfo extends TeaModel {
        /**
         * <p>The size of the .apk file. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ApkSize")
        public String apkSize;

        /**
         * <p>The download URL of the app.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://testApp.apk">http://testApp.apk</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The MD5 value of the .apk file.</p>
         * 
         * <strong>example:</strong>
         * <p>df3f46ce5844ddb278f14c5a9cd2****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The name of the app package.</p>
         * 
         * <strong>example:</strong>
         * <p>com.example.demo</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The version of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The code of the app version.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
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
