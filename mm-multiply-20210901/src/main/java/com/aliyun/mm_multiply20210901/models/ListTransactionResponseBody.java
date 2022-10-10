// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListTransactionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("List")
    public java.util.List<ListTransactionResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTransactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransactionResponseBody self = new ListTransactionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransactionResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListTransactionResponseBody setList(java.util.List<ListTransactionResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListTransactionResponseBodyList> getList() {
        return this.list;
    }

    public ListTransactionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTransactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransactionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTransactionResponseBodyList extends TeaModel {
        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("SecurityStatus")
        public Integer securityStatus;

        @NameInMap("TbPayAccount")
        public String tbPayAccount;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("TbSellerNick")
        public String tbSellerNick;

        @NameInMap("TbShopDescription")
        public String tbShopDescription;

        @NameInMap("TbShopId")
        public Long tbShopId;

        @NameInMap("TbShopName")
        public String tbShopName;

        public static ListTransactionResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListTransactionResponseBodyList self = new ListTransactionResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListTransactionResponseBodyList setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public ListTransactionResponseBodyList setSecurityStatus(Integer securityStatus) {
            this.securityStatus = securityStatus;
            return this;
        }
        public Integer getSecurityStatus() {
            return this.securityStatus;
        }

        public ListTransactionResponseBodyList setTbPayAccount(String tbPayAccount) {
            this.tbPayAccount = tbPayAccount;
            return this;
        }
        public String getTbPayAccount() {
            return this.tbPayAccount;
        }

        public ListTransactionResponseBodyList setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public ListTransactionResponseBodyList setTbSellerNick(String tbSellerNick) {
            this.tbSellerNick = tbSellerNick;
            return this;
        }
        public String getTbSellerNick() {
            return this.tbSellerNick;
        }

        public ListTransactionResponseBodyList setTbShopDescription(String tbShopDescription) {
            this.tbShopDescription = tbShopDescription;
            return this;
        }
        public String getTbShopDescription() {
            return this.tbShopDescription;
        }

        public ListTransactionResponseBodyList setTbShopId(Long tbShopId) {
            this.tbShopId = tbShopId;
            return this;
        }
        public Long getTbShopId() {
            return this.tbShopId;
        }

        public ListTransactionResponseBodyList setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

    }

}
