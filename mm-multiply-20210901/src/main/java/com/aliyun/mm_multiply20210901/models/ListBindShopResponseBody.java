// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListBindShopResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("List")
    public java.util.List<ListBindShopResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBindShopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindShopResponseBody self = new ListBindShopResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindShopResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListBindShopResponseBody setList(java.util.List<ListBindShopResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListBindShopResponseBodyList> getList() {
        return this.list;
    }

    public ListBindShopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBindShopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBindShopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBindShopResponseBodyList extends TeaModel {
        @NameInMap("Approver")
        public String approver;

        @NameInMap("DealTime")
        public String dealTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("OperatorId")
        public String operatorId;

        @NameInMap("PinYin")
        public String pinYin;

        @NameInMap("Response")
        public String response;

        @NameInMap("Status")
        public String status;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("TbPayAccount")
        public String tbPayAccount;

        @NameInMap("TbShopDescription")
        public String tbShopDescription;

        @NameInMap("TbShopId")
        public Long tbShopId;

        @NameInMap("TbShopName")
        public String tbShopName;

        public static ListBindShopResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListBindShopResponseBodyList self = new ListBindShopResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListBindShopResponseBodyList setApprover(String approver) {
            this.approver = approver;
            return this;
        }
        public String getApprover() {
            return this.approver;
        }

        public ListBindShopResponseBodyList setDealTime(String dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public String getDealTime() {
            return this.dealTime;
        }

        public ListBindShopResponseBodyList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListBindShopResponseBodyList setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public ListBindShopResponseBodyList setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public ListBindShopResponseBodyList setPinYin(String pinYin) {
            this.pinYin = pinYin;
            return this;
        }
        public String getPinYin() {
            return this.pinYin;
        }

        public ListBindShopResponseBodyList setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public ListBindShopResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBindShopResponseBodyList setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public ListBindShopResponseBodyList setTbPayAccount(String tbPayAccount) {
            this.tbPayAccount = tbPayAccount;
            return this;
        }
        public String getTbPayAccount() {
            return this.tbPayAccount;
        }

        public ListBindShopResponseBodyList setTbShopDescription(String tbShopDescription) {
            this.tbShopDescription = tbShopDescription;
            return this;
        }
        public String getTbShopDescription() {
            return this.tbShopDescription;
        }

        public ListBindShopResponseBodyList setTbShopId(Long tbShopId) {
            this.tbShopId = tbShopId;
            return this;
        }
        public Long getTbShopId() {
            return this.tbShopId;
        }

        public ListBindShopResponseBodyList setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

    }

}
