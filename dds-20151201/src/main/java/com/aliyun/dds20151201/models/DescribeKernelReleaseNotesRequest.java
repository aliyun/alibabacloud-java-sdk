// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeKernelReleaseNotesRequest extends TeaModel {
    /**
     * <p>The number of the minor database version. For example: **mongodb\_20180522\_0.4.8**.</p>
     * <br>
     * <p>*   If you specify this parameter, a list of version numbers later than the version specified is returned.</p>
     * <p>*   If you do not specify this parameter, a list of all the version numbers is returned.</p>
     */
    @NameInMap("KernelVersion")
    public String kernelVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeKernelReleaseNotesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKernelReleaseNotesRequest self = new DescribeKernelReleaseNotesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKernelReleaseNotesRequest setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public DescribeKernelReleaseNotesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeKernelReleaseNotesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeKernelReleaseNotesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeKernelReleaseNotesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
