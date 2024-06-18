// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class AddServiceSharedAccountsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BBBAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-63b8a060e9d54cxxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SharedAccounts")
    public java.util.List<AddServiceSharedAccountsRequestSharedAccounts> sharedAccounts;

    /**
     * <strong>example:</strong>
     * <p>SharedAccount</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Accessible</p>
         */
        @NameInMap("Permission")
        public String permission;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
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
