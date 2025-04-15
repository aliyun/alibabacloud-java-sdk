// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateLakeStorageRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.
     * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the AnalyticDB for MySQL cluster with which you want to associate the lake storage.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the lake storage.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The permissions that you want to grant on the lake storage to the Alibaba Cloud account besides the permissions that are automatically granted to the Resource Access Management (RAM) user or the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Permissions")
    public java.util.List<CreateLakeStorageRequestPermissions> permissions;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateLakeStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLakeStorageRequest self = new CreateLakeStorageRequest();
        return TeaModel.build(map, self);
    }

    public CreateLakeStorageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLakeStorageRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateLakeStorageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLakeStorageRequest setPermissions(java.util.List<CreateLakeStorageRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<CreateLakeStorageRequestPermissions> getPermissions() {
        return this.permissions;
    }

    public CreateLakeStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateLakeStorageRequestPermissions extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The read permissions.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Read")
        public Boolean read;

        /**
         * <p>The account type.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The write permissions.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Write")
        public Boolean write;

        public static CreateLakeStorageRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            CreateLakeStorageRequestPermissions self = new CreateLakeStorageRequestPermissions();
            return TeaModel.build(map, self);
        }

        public CreateLakeStorageRequestPermissions setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public CreateLakeStorageRequestPermissions setRead(Boolean read) {
            this.read = read;
            return this;
        }
        public Boolean getRead() {
            return this.read;
        }

        public CreateLakeStorageRequestPermissions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLakeStorageRequestPermissions setWrite(Boolean write) {
            this.write = write;
            return this;
        }
        public Boolean getWrite() {
            return this.write;
        }

    }

}
