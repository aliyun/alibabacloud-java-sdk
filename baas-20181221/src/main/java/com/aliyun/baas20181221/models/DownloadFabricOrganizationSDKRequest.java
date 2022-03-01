// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DownloadFabricOrganizationSDKRequest extends TeaModel {
    @NameInMap("Location")
    public String location;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Username")
    public String username;

    public static DownloadFabricOrganizationSDKRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadFabricOrganizationSDKRequest self = new DownloadFabricOrganizationSDKRequest();
        return TeaModel.build(map, self);
    }

    public DownloadFabricOrganizationSDKRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DownloadFabricOrganizationSDKRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DownloadFabricOrganizationSDKRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
