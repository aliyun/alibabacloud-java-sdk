// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
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
    public CreateAppRequestCustomAppInfo customAppInfo;

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
         * <p>The download URL of the application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://testApp.apk">http://testApp.apk</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The MD5 value of the .apk package.</p>
         * 
         * <strong>example:</strong>
         * <p>df3f46ce5844ddb278f14c5a9cd2****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The application package name.</p>
         * 
         * <strong>example:</strong>
         * <p>com.example.demo</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The application version code.</p>
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
