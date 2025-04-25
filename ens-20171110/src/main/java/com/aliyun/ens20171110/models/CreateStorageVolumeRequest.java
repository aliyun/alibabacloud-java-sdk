// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateStorageVolumeRequest extends TeaModel {
    /**
     * <p>The password of the CHAP protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>Password</p>
     */
    @NameInMap("AuthPassword")
    public String authPassword;

    /**
     * <p>The authentication protocol. Set the value to <strong>CHAP</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>CHAP</p>
     */
    @NameInMap("AuthProtocol")
    public String authProtocol;

    /**
     * <p>The username of the CHAP protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("AuthUser")
    public String authUser;

    /**
     * <p>The description of the volume. The description must be 2 to 128 characters in length. The description cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-3</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgw-****</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>Specifies whether to enable authentication. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Authentication is enabled.</li>
     * <li><strong>0</strong> (default): Authentication is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsAuth")
    public String isAuth;

    /**
     * <p>Indicates whether the volume is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> (default): The volume is enabled.</li>
     * <li><strong>0</strong>: The volume is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsEnable")
    public String isEnable;

    /**
     * <p>The ID of the storage medium.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-****</p>
     */
    @NameInMap("StorageId")
    public String storageId;

    /**
     * <p>The name of the volume. The name must be 2 to 128 characters in length. The name cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testVolumeName</p>
     */
    @NameInMap("VolumeName")
    public String volumeName;

    public static CreateStorageVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageVolumeRequest self = new CreateStorageVolumeRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageVolumeRequest setAuthPassword(String authPassword) {
        this.authPassword = authPassword;
        return this;
    }
    public String getAuthPassword() {
        return this.authPassword;
    }

    public CreateStorageVolumeRequest setAuthProtocol(String authProtocol) {
        this.authProtocol = authProtocol;
        return this;
    }
    public String getAuthProtocol() {
        return this.authProtocol;
    }

    public CreateStorageVolumeRequest setAuthUser(String authUser) {
        this.authUser = authUser;
        return this;
    }
    public String getAuthUser() {
        return this.authUser;
    }

    public CreateStorageVolumeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStorageVolumeRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateStorageVolumeRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateStorageVolumeRequest setIsAuth(String isAuth) {
        this.isAuth = isAuth;
        return this;
    }
    public String getIsAuth() {
        return this.isAuth;
    }

    public CreateStorageVolumeRequest setIsEnable(String isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public String getIsEnable() {
        return this.isEnable;
    }

    public CreateStorageVolumeRequest setStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }
    public String getStorageId() {
        return this.storageId;
    }

    public CreateStorageVolumeRequest setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

}
