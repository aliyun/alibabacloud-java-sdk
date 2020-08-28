// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class UploadMcubeMiniPackageRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("AutoInstall")
    @Validation(required = true)
    public Long autoInstall;

    @NameInMap("ClientVersionMax")
    public String clientVersionMax;

    @NameInMap("ClientVersionMin")
    @Validation(required = true)
    public String clientVersionMin;

    @NameInMap("EnableKeepAlive")
    @Validation(required = true)
    public String enableKeepAlive;

    @NameInMap("EnableOptionMenu")
    @Validation(required = true)
    public String enableOptionMenu;

    @NameInMap("EnableTabBar")
    @Validation(required = true)
    public Long enableTabBar;

    @NameInMap("ExtendInfo")
    public String extendInfo;

    @NameInMap("H5Id")
    @Validation(required = true)
    public String h5Id;

    @NameInMap("H5Name")
    @Validation(required = true)
    public String h5Name;

    @NameInMap("H5Version")
    @Validation(required = true)
    public String h5Version;

    @NameInMap("IconFileUrl")
    @Validation(required = true)
    public String iconFileUrl;

    @NameInMap("InstallType")
    @Validation(required = true)
    public Long installType;

    @NameInMap("MainUrl")
    @Validation(required = true)
    public String mainUrl;

    @NameInMap("OnexFlag")
    @Validation(required = true)
    public Boolean onexFlag;

    @NameInMap("PackageType")
    @Validation(required = true)
    public Long packageType;

    @NameInMap("Platform")
    @Validation(required = true)
    public String platform;

    @NameInMap("ResourceFileUrl")
    @Validation(required = true)
    public String resourceFileUrl;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public Long resourceType;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("Vhost")
    @Validation(required = true)
    public String vhost;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static UploadMcubeMiniPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeMiniPackageRequest self = new UploadMcubeMiniPackageRequest();
        return TeaModel.build(map, self);
    }

}
