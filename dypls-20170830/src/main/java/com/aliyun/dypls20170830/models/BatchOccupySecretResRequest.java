// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class BatchOccupySecretResRequest extends TeaModel {
    @NameInMap("BatchOccupyList")
    public java.util.List<BatchOccupySecretResRequestBatchOccupyList> batchOccupyList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static BatchOccupySecretResRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchOccupySecretResRequest self = new BatchOccupySecretResRequest();
        return TeaModel.build(map, self);
    }

    public BatchOccupySecretResRequest setBatchOccupyList(java.util.List<BatchOccupySecretResRequestBatchOccupyList> batchOccupyList) {
        this.batchOccupyList = batchOccupyList;
        return this;
    }
    public java.util.List<BatchOccupySecretResRequestBatchOccupyList> getBatchOccupyList() {
        return this.batchOccupyList;
    }

    public BatchOccupySecretResRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchOccupySecretResRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public BatchOccupySecretResRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BatchOccupySecretResRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class BatchOccupySecretResRequestBatchOccupyList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("OrderDetailId")
        public Long orderDetailId;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("PartnerKey")
        public String partnerKey;

        @NameInMap("ResType")
        public Long resType;

        @NameInMap("SecretNoType")
        public Long secretNoType;

        public static BatchOccupySecretResRequestBatchOccupyList build(java.util.Map<String, ?> map) throws Exception {
            BatchOccupySecretResRequestBatchOccupyList self = new BatchOccupySecretResRequestBatchOccupyList();
            return TeaModel.build(map, self);
        }

        public BatchOccupySecretResRequestBatchOccupyList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public BatchOccupySecretResRequestBatchOccupyList setOrderDetailId(Long orderDetailId) {
            this.orderDetailId = orderDetailId;
            return this;
        }
        public Long getOrderDetailId() {
            return this.orderDetailId;
        }

        public BatchOccupySecretResRequestBatchOccupyList setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public BatchOccupySecretResRequestBatchOccupyList setPartnerKey(String partnerKey) {
            this.partnerKey = partnerKey;
            return this;
        }
        public String getPartnerKey() {
            return this.partnerKey;
        }

        public BatchOccupySecretResRequestBatchOccupyList setResType(Long resType) {
            this.resType = resType;
            return this;
        }
        public Long getResType() {
            return this.resType;
        }

        public BatchOccupySecretResRequestBatchOccupyList setSecretNoType(Long secretNoType) {
            this.secretNoType = secretNoType;
            return this;
        }
        public Long getSecretNoType() {
            return this.secretNoType;
        }

    }

}
