// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAlipayTransferStatusResponseBody extends TeaModel {
    @NameInMap("data")
    public GetAlipayTransferStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>6a71f2d9-f1c9-913b-818b-11402910xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAlipayTransferStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayTransferStatusResponseBody self = new GetAlipayTransferStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlipayTransferStatusResponseBody setData(GetAlipayTransferStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlipayTransferStatusResponseBodyData getData() {
        return this.data;
    }

    public GetAlipayTransferStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlipayTransferStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1348393307144609</p>
         */
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("alipayOrderDetail")
        public String alipayOrderDetail;

        @NameInMap("alipayOrderId")
        public String alipayOrderId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("code")
        public String code;

        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>1007576424487905</p>
         */
        @NameInMap("mainAccountId")
        public String mainAccountId;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("qrURL")
        public String qrURL;

        @NameInMap("scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Long status;

        @NameInMap("title")
        public String title;

        @NameInMap("transAmount")
        public String transAmount;

        @NameInMap("walletItemCode")
        public String walletItemCode;

        public static GetAlipayTransferStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlipayTransferStatusResponseBodyData self = new GetAlipayTransferStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlipayTransferStatusResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAlipayTransferStatusResponseBodyData setAlipayOrderDetail(String alipayOrderDetail) {
            this.alipayOrderDetail = alipayOrderDetail;
            return this;
        }
        public String getAlipayOrderDetail() {
            return this.alipayOrderDetail;
        }

        public GetAlipayTransferStatusResponseBodyData setAlipayOrderId(String alipayOrderId) {
            this.alipayOrderId = alipayOrderId;
            return this;
        }
        public String getAlipayOrderId() {
            return this.alipayOrderId;
        }

        public GetAlipayTransferStatusResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAlipayTransferStatusResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetAlipayTransferStatusResponseBodyData setMainAccountId(String mainAccountId) {
            this.mainAccountId = mainAccountId;
            return this;
        }
        public String getMainAccountId() {
            return this.mainAccountId;
        }

        public GetAlipayTransferStatusResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetAlipayTransferStatusResponseBodyData setQrURL(String qrURL) {
            this.qrURL = qrURL;
            return this;
        }
        public String getQrURL() {
            return this.qrURL;
        }

        public GetAlipayTransferStatusResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetAlipayTransferStatusResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetAlipayTransferStatusResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetAlipayTransferStatusResponseBodyData setTransAmount(String transAmount) {
            this.transAmount = transAmount;
            return this;
        }
        public String getTransAmount() {
            return this.transAmount;
        }

        public GetAlipayTransferStatusResponseBodyData setWalletItemCode(String walletItemCode) {
            this.walletItemCode = walletItemCode;
            return this;
        }
        public String getWalletItemCode() {
            return this.walletItemCode;
        }

    }

}
