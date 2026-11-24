// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateLakeStorageRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure request idempotence. If you use the same token for requests with different parameters, the IdempotentParameterMismatch error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>b2cd****3efg</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID of the ADB instance to which the lake storage is attached.</p>
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
     * <p>When you create a lake storage, permissions are automatically granted to the Resource Access Management (RAM) users and the primary account used for the operation. You can increase additional authorizations for the primary account here.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Account&quot;:&quot;1234567890123456&quot;,&quot;Read&quot;:true,&quot;Type&quot;:&quot;CUSTOMER&quot;,&quot;Write&quot;:true}]</p>
     */
    @NameInMap("Permissions")
    public java.util.List<CreateLakeStorageRequestPermissions> permissions;

    /**
     * <p>RegionId</p>
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
         * <p>1234567890123456</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The read permission.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Read")
        public Boolean read;

        /**
         * <p>The account type.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The write permission.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
