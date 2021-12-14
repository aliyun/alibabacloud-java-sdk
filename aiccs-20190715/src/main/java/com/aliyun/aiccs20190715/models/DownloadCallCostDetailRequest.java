// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class DownloadCallCostDetailRequest extends TeaModel {
    @NameInMap("BillCycle")
    public String billCycle;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DownloadCallCostDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadCallCostDetailRequest self = new DownloadCallCostDetailRequest();
        return TeaModel.build(map, self);
    }

    public DownloadCallCostDetailRequest setBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }
    public String getBillCycle() {
        return this.billCycle;
    }

    public DownloadCallCostDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DownloadCallCostDetailRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public DownloadCallCostDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DownloadCallCostDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
