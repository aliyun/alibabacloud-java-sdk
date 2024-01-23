// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class AddServiceSharedAccountsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("SharedAccounts")
    public java.util.List<AddServiceSharedAccountsRequestSharedAccounts> sharedAccounts;

    @NameInMap("Type")
    public String type;

    public static AddServiceSharedAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddServiceSharedAccountsRequest self = new AddServiceSharedAccountsRequest();
        return TeaModel.build(map, self);
    }

    public AddServiceSharedAccountsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddServiceSharedAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddServiceSharedAccountsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public AddServiceSharedAccountsRequest setSharedAccounts(java.util.List<AddServiceSharedAccountsRequestSharedAccounts> sharedAccounts) {
        this.sharedAccounts = sharedAccounts;
        return this;
    }
    public java.util.List<AddServiceSharedAccountsRequestSharedAccounts> getSharedAccounts() {
        return this.sharedAccounts;
    }

    public AddServiceSharedAccountsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AddServiceSharedAccountsRequestSharedAccounts extends TeaModel {
        @NameInMap("Permission")
        public String permission;

        @NameInMap("UserAliUid")
        public String userAliUid;

        public static AddServiceSharedAccountsRequestSharedAccounts build(java.util.Map<String, ?> map) throws Exception {
            AddServiceSharedAccountsRequestSharedAccounts self = new AddServiceSharedAccountsRequestSharedAccounts();
            return TeaModel.build(map, self);
        }

        public AddServiceSharedAccountsRequestSharedAccounts setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public AddServiceSharedAccountsRequestSharedAccounts setUserAliUid(String userAliUid) {
            this.userAliUid = userAliUid;
            return this;
        }
        public String getUserAliUid() {
            return this.userAliUid;
        }

    }

}
