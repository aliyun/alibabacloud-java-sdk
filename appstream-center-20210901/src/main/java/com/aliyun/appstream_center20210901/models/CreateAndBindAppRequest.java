// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAndBindAppRequest extends TeaModel {
    /**
     * <p>The URL of the application icon. Specify an accessible icon URL to display a custom icon.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/apps/business/icon.png">https://example.com/apps/business/icon.png</a></p>
     */
    @NameInMap("AppIconUrl")
    public String appIconUrl;

    /**
     * <p>The name of the application to be created, which is used to identify the application in the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business management platform</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the image to which the application is bound. The image must be a custom image or community image that can be managed by the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1example****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The application type. If omitted, the default value is CLIENT_BASE. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_BASE</strong>: Client application.</li>
     * <li><strong>WEB_BASE</strong>: Browser application.</li>
     * <li><strong>CLOUD_NATIVE_BASE</strong>: Cloud-native application.</li>
     * <li><strong>PORT_SERVICE_BASE</strong>: Port service application.</li>
     * <li><strong>AGENT_SERVICE_BASE</strong>: Agent application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PORT_SERVICE_BASE</p>
     */
    @NameInMap("OriginAppType")
    public String originAppType;

    /**
     * <p>The application service port. For applications that require port-based access, specify the actual port number that the application listens on.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The path suffix of the application access URL, which is used together with the application service port to describe the access entry point.</p>
     * 
     * <strong>example:</strong>
     * <p>/console</p>
     */
    @NameInMap("UrlSuffix")
    public String urlSuffix;

    /**
     * <p>The ID of the image version to which the application is bound. If omitted, the current active version of the image specified by ImageId is used. If specified, the version must belong to the image.</p>
     * 
     * <strong>example:</strong>
     * <p>iv-bp1example****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static CreateAndBindAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndBindAppRequest self = new CreateAndBindAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndBindAppRequest setAppIconUrl(String appIconUrl) {
        this.appIconUrl = appIconUrl;
        return this;
    }
    public String getAppIconUrl() {
        return this.appIconUrl;
    }

    public CreateAndBindAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAndBindAppRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateAndBindAppRequest setOriginAppType(String originAppType) {
        this.originAppType = originAppType;
        return this;
    }
    public String getOriginAppType() {
        return this.originAppType;
    }

    public CreateAndBindAppRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateAndBindAppRequest setUrlSuffix(String urlSuffix) {
        this.urlSuffix = urlSuffix;
        return this;
    }
    public String getUrlSuffix() {
        return this.urlSuffix;
    }

    public CreateAndBindAppRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
