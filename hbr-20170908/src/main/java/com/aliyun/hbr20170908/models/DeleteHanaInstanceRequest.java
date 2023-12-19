// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteHanaInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The SID of the SAP HANA database. You must specify a valid SID. The SID must be three characters in length and start with a letter. For more information, see [How to find sid user and instance number of HANA db?](https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?)</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static DeleteHanaInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHanaInstanceRequest self = new DeleteHanaInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHanaInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteHanaInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteHanaInstanceRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public DeleteHanaInstanceRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
