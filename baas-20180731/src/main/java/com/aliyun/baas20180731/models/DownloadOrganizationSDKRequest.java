// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadOrganizationSDKRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Username")
    public String username;

    public static DownloadOrganizationSDKRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadOrganizationSDKRequest self = new DownloadOrganizationSDKRequest();
        return TeaModel.build(map, self);
    }

    public DownloadOrganizationSDKRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DownloadOrganizationSDKRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DownloadOrganizationSDKRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
