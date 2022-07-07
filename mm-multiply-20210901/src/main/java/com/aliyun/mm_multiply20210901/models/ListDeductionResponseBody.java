// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListDeductionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    // 代扣协议
    @NameInMap("LmShopSupplierModels")
    public java.util.List<ListDeductionResponseBodyLmShopSupplierModels> lmShopSupplierModels;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeductionResponseBody self = new ListDeductionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeductionResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListDeductionResponseBody setLmShopSupplierModels(java.util.List<ListDeductionResponseBodyLmShopSupplierModels> lmShopSupplierModels) {
        this.lmShopSupplierModels = lmShopSupplierModels;
        return this;
    }
    public java.util.List<ListDeductionResponseBodyLmShopSupplierModels> getLmShopSupplierModels() {
        return this.lmShopSupplierModels;
    }

    public ListDeductionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeductionResponseBodyLmShopSupplierModels extends TeaModel {
        @NameInMap("CommissionStatus")
        public String commissionStatus;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndAt")
        public String endAt;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("ItemService")
        public Boolean itemService;

        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("LmSupplierId")
        public Long lmSupplierId;

        @NameInMap("PinYin")
        public String pinYin;

        @NameInMap("StartAt")
        public String startAt;

        @NameInMap("Status")
        public String status;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static ListDeductionResponseBodyLmShopSupplierModels build(java.util.Map<String, ?> map) throws Exception {
            ListDeductionResponseBodyLmShopSupplierModels self = new ListDeductionResponseBodyLmShopSupplierModels();
            return TeaModel.build(map, self);
        }

        public ListDeductionResponseBodyLmShopSupplierModels setCommissionStatus(String commissionStatus) {
            this.commissionStatus = commissionStatus;
            return this;
        }
        public String getCommissionStatus() {
            return this.commissionStatus;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setEndAt(String endAt) {
            this.endAt = endAt;
            return this;
        }
        public String getEndAt() {
            return this.endAt;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setItemService(Boolean itemService) {
            this.itemService = itemService;
            return this;
        }
        public Boolean getItemService() {
            return this.itemService;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setLmSupplierId(Long lmSupplierId) {
            this.lmSupplierId = lmSupplierId;
            return this;
        }
        public Long getLmSupplierId() {
            return this.lmSupplierId;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setPinYin(String pinYin) {
            this.pinYin = pinYin;
            return this;
        }
        public String getPinYin() {
            return this.pinYin;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setStartAt(String startAt) {
            this.startAt = startAt;
            return this;
        }
        public String getStartAt() {
            return this.startAt;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListDeductionResponseBodyLmShopSupplierModels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
