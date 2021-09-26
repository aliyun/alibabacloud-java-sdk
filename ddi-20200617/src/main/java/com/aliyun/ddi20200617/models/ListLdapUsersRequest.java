// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListLdapUsersRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("UserNameSearch")
    public String userNameSearch;

    public static ListLdapUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLdapUsersRequest self = new ListLdapUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListLdapUsersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListLdapUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListLdapUsersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListLdapUsersRequest setUserNameSearch(String userNameSearch) {
        this.userNameSearch = userNameSearch;
        return this;
    }
    public String getUserNameSearch() {
        return this.userNameSearch;
    }

}
