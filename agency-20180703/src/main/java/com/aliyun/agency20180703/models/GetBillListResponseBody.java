// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetBillListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBillListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public GetBillListResponseBodyPageInfo pageInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetBillListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBillListResponseBody self = new GetBillListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBillListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBillListResponseBody setData(GetBillListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBillListResponseBodyData getData() {
        return this.data;
    }

    public GetBillListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBillListResponseBody setPageInfo(GetBillListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetBillListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetBillListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBillListResponseBodyDataPopBillJson extends TeaModel {
        @NameInMap("BillId")
        public Long billId;

        @NameInMap("CloudAccount")
        public String cloudAccount;

        @NameInMap("Fee")
        public String fee;

        @NameInMap("GmtPay")
        public String gmtPay;

        @NameInMap("PayStatus")
        public Long payStatus;

        @NameInMap("PostpayBillDetail")
        public String postpayBillDetail;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("RamUid")
        public Long ramUid;

        public static GetBillListResponseBodyDataPopBillJson build(java.util.Map<String, ?> map) throws Exception {
            GetBillListResponseBodyDataPopBillJson self = new GetBillListResponseBodyDataPopBillJson();
            return TeaModel.build(map, self);
        }

        public GetBillListResponseBodyDataPopBillJson setBillId(Long billId) {
            this.billId = billId;
            return this;
        }
        public Long getBillId() {
            return this.billId;
        }

        public GetBillListResponseBodyDataPopBillJson setCloudAccount(String cloudAccount) {
            this.cloudAccount = cloudAccount;
            return this;
        }
        public String getCloudAccount() {
            return this.cloudAccount;
        }

        public GetBillListResponseBodyDataPopBillJson setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

        public GetBillListResponseBodyDataPopBillJson setGmtPay(String gmtPay) {
            this.gmtPay = gmtPay;
            return this;
        }
        public String getGmtPay() {
            return this.gmtPay;
        }

        public GetBillListResponseBodyDataPopBillJson setPayStatus(Long payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Long getPayStatus() {
            return this.payStatus;
        }

        public GetBillListResponseBodyDataPopBillJson setPostpayBillDetail(String postpayBillDetail) {
            this.postpayBillDetail = postpayBillDetail;
            return this;
        }
        public String getPostpayBillDetail() {
            return this.postpayBillDetail;
        }

        public GetBillListResponseBodyDataPopBillJson setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetBillListResponseBodyDataPopBillJson setRamUid(Long ramUid) {
            this.ramUid = ramUid;
            return this;
        }
        public Long getRamUid() {
            return this.ramUid;
        }

    }

    public static class GetBillListResponseBodyData extends TeaModel {
        @NameInMap("PopBillJson")
        public java.util.List<GetBillListResponseBodyDataPopBillJson> popBillJson;

        public static GetBillListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBillListResponseBodyData self = new GetBillListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBillListResponseBodyData setPopBillJson(java.util.List<GetBillListResponseBodyDataPopBillJson> popBillJson) {
            this.popBillJson = popBillJson;
            return this;
        }
        public java.util.List<GetBillListResponseBodyDataPopBillJson> getPopBillJson() {
            return this.popBillJson;
        }

    }

    public static class GetBillListResponseBodyPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static GetBillListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBillListResponseBodyPageInfo self = new GetBillListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetBillListResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetBillListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetBillListResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
