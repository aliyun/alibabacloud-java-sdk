// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateLakeStorageRequest extends TeaModel {
    /**
     * <p>The ADB instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-*******</p>
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
     * <p>The unique identifier of the lake storage.</p>
     * 
     * <strong>example:</strong>
     * <p>adb-lake-cn-hangzhou-1a1aaaa11a</p>
     */
    @NameInMap("LakeStorageId")
    public String lakeStorageId;

    /**
     * <p>The permissions of the lake storage.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Account&quot;:&quot;1234567890123456&quot;,&quot;Read&quot;:true,&quot;Type&quot;:&quot;User&quot;,&quot;Write&quot;:true}]</p>
     */
    @NameInMap("Permissions")
    public java.util.List<UpdateLakeStorageRequestPermissions> permissions;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateLakeStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLakeStorageRequest self = new UpdateLakeStorageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLakeStorageRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateLakeStorageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLakeStorageRequest setLakeStorageId(String lakeStorageId) {
        this.lakeStorageId = lakeStorageId;
        return this;
    }
    public String getLakeStorageId() {
        return this.lakeStorageId;
    }

    public UpdateLakeStorageRequest setPermissions(java.util.List<UpdateLakeStorageRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<UpdateLakeStorageRequestPermissions> getPermissions() {
        return this.permissions;
    }

    public UpdateLakeStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateLakeStorageRequestPermissions extends TeaModel {
        /**
         * <p>The account ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The read permission.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Read")
        public Boolean read;

        /**
         * <p>The account type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The write permission.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Write")
        public Boolean write;

        public static UpdateLakeStorageRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            UpdateLakeStorageRequestPermissions self = new UpdateLakeStorageRequestPermissions();
            return TeaModel.build(map, self);
        }

        public UpdateLakeStorageRequestPermissions setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public UpdateLakeStorageRequestPermissions setRead(Boolean read) {
            this.read = read;
            return this;
        }
        public Boolean getRead() {
            return this.read;
        }

        public UpdateLakeStorageRequestPermissions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateLakeStorageRequestPermissions setWrite(Boolean write) {
            this.write = write;
            return this;
        }
        public Boolean getWrite() {
            return this.write;
        }

    }

}
