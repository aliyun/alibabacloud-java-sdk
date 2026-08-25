// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSoftwarelibVersionRequest extends TeaModel {
    /**
     * <p>The MD5 value of the software package. The value can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0b5824cdd509d3ed560e2d20d29a1bcb</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The operating system to which the software package applies. Valid values:</p>
     * <ul>
     * <li><strong>Windows</strong>: Windows.</li>
     * <li><strong>Mac(Apple)</strong>: macOS with Apple silicon.</li>
     * <li><strong>Mac(Intel)</strong>: macOS with Intel processors.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The software publisher type. Valid values:</p>
     * <ul>
     * <li><strong>local</strong>: local upload.</li>
     * <li><strong>thirdparty</strong>: third-party link.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("PublisherType")
    public String publisherType;

    /**
     * <p>The software ID in the software library. The value can be up to 64 characters in length. You can call <a href="~~ListSoftwarelibSoftware~~">ListSoftwarelibSoftware</a> to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>softwarelib-software-2c51808a3cc8****</p>
     */
    @NameInMap("SoftwareId")
    public String softwareId;

    /**
     * <p>The software name. The value can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Thunder</p>
     */
    @NameInMap("SoftwareName")
    public String softwareName;

    /**
     * <p>The file name of the software package. The value can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>TestSoftware.exe</p>
     */
    @NameInMap("SoftwarePkgName")
    public String softwarePkgName;

    /**
     * <p>The size of the software package.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SoftwarePkgSize")
    public Long softwarePkgSize;

    /**
     * <p>The download URL of the software package. If the publisher type is local, the value is the relative path of the software package in the OSS bucket. If the publisher type is thirdparty, the value is a third-party download URL.</p>
     */
    @NameInMap("SoftwareUrl")
    public String softwareUrl;

    /**
     * <p>The software version number. The value can be up to 64 characters in length. The combination of operating system and version number must be unique within the same software. If a duplicate exists, a ResourceDuplicated error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("SoftwareVersion")
    public String softwareVersion;

    public static CreateSoftwarelibVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSoftwarelibVersionRequest self = new CreateSoftwarelibVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSoftwarelibVersionRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public CreateSoftwarelibVersionRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public CreateSoftwarelibVersionRequest setPublisherType(String publisherType) {
        this.publisherType = publisherType;
        return this;
    }
    public String getPublisherType() {
        return this.publisherType;
    }

    public CreateSoftwarelibVersionRequest setSoftwareId(String softwareId) {
        this.softwareId = softwareId;
        return this;
    }
    public String getSoftwareId() {
        return this.softwareId;
    }

    public CreateSoftwarelibVersionRequest setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
        return this;
    }
    public String getSoftwareName() {
        return this.softwareName;
    }

    public CreateSoftwarelibVersionRequest setSoftwarePkgName(String softwarePkgName) {
        this.softwarePkgName = softwarePkgName;
        return this;
    }
    public String getSoftwarePkgName() {
        return this.softwarePkgName;
    }

    public CreateSoftwarelibVersionRequest setSoftwarePkgSize(Long softwarePkgSize) {
        this.softwarePkgSize = softwarePkgSize;
        return this;
    }
    public Long getSoftwarePkgSize() {
        return this.softwarePkgSize;
    }

    public CreateSoftwarelibVersionRequest setSoftwareUrl(String softwareUrl) {
        this.softwareUrl = softwareUrl;
        return this;
    }
    public String getSoftwareUrl() {
        return this.softwareUrl;
    }

    public CreateSoftwarelibVersionRequest setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

}
