// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateRAMDirectoryRequest extends TeaModel {
    /**
     * <p>The method that you use to connect clients to cloud desktops. Valid values:</p>
     * <br>
     * <p>*   Internet: connects clients to cloud desktops only over the Internet.</p>
     * <p>*   VPC: connects clients to cloud desktops only over a VPC.</p>
     * <p>*   Any: connects clients to cloud desktops over the Internet or a VPC. You can select a connection method when you connect clients to cloud desktops.</p>
     * <br>
     * <p>Default value: Internet.</p>
     * <br>
     * <br>
     * <p>> The VPC connection method is provided by Alibaba Cloud PrivateLink. You are not charged for PrivateLink. If you set this parameter to VPC or Any, PrivateLink is automatically activated.</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    /**
     * <p>Specifies whether to grant the permissions of the local administrator to the desktop users. Default value: true.</p>
     */
    @NameInMap("DirectoryName")
    public String directoryName;

    /**
     * <p>The operation that you want to perform. Set the value to CreateRAMDirectory.</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("EnableInternetAccess")
    public Boolean enableInternetAccess;

    /**
     * <p>Specifies whether to enable the Internet access feature.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>CreateRAMDirectory</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    public static CreateRAMDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRAMDirectoryRequest self = new CreateRAMDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateRAMDirectoryRequest setDesktopAccessType(String desktopAccessType) {
        this.desktopAccessType = desktopAccessType;
        return this;
    }
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    public CreateRAMDirectoryRequest setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }
    public String getDirectoryName() {
        return this.directoryName;
    }

    public CreateRAMDirectoryRequest setEnableAdminAccess(Boolean enableAdminAccess) {
        this.enableAdminAccess = enableAdminAccess;
        return this;
    }
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    public CreateRAMDirectoryRequest setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
        return this;
    }
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    public CreateRAMDirectoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRAMDirectoryRequest setVSwitchId(java.util.List<String> vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

}
