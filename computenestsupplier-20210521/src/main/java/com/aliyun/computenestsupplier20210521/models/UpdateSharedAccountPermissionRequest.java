// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateSharedAccountPermissionRequest extends TeaModel {
    /**
     * <p>Client token, used to ensure the idempotence of requests. Generate a unique value for this parameter from your client to ensure it is unique across different requests. ClientToken supports only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>10CM943JP0EN9D51H</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Permission type. Possible values:</p>
     * <ul>
     * <li>Deployable: Can be deployed.</li>
     * <li>Accessible: Can be accessed.</li>
     * <li>AccessibleIncludeBeta: Can access all versions, including Beta versions.</li>
     * <li>DeployableIncludeBeta: Can deploy all versions, including Beta versions.</li>
     * <li>Authorized: Authorized (for reselling scenarios)</li>
     * <li>Unauthorized: Unauthorized (for reselling scenarios)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Deployable</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0d6e1d846e4c4axxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Service sharing type, with a default value of SharedAccount. Available options:</p>
     * <ul>
     * <li><p>SharedAccount: Regular sharing type.</p>
     * </li>
     * <li><p>Reseller: Reselling sharing type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SharedAccount</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Whitelist account for service sharing.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1563457855xxxxxx</p>
     */
    @NameInMap("UserAliUid")
    public Long userAliUid;

    public static UpdateSharedAccountPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSharedAccountPermissionRequest self = new UpdateSharedAccountPermissionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSharedAccountPermissionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSharedAccountPermissionRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public UpdateSharedAccountPermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSharedAccountPermissionRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateSharedAccountPermissionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateSharedAccountPermissionRequest setUserAliUid(Long userAliUid) {
        this.userAliUid = userAliUid;
        return this;
    }
    public Long getUserAliUid() {
        return this.userAliUid;
    }

}
