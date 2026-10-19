// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeKernelReleaseNotesRequest extends TeaModel {
    /**
     * <p>The minor engine version of the database. Example: <strong>mongodb_20180522_0.4.8</strong>.</p>
     * <p>You can obtain the minor engine version in the <strong>Specifications</strong> section on the <strong>Basic Information</strong> page of the instance in the MongoDB console.</p>
     * <blockquote>
     * <p>This parameter is required. The response includes a list of versions that are later than the specified version.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mongodb_20180522_0.4.8</p>
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
