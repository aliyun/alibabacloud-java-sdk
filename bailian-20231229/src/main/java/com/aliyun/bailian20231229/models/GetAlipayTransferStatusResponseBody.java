// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAlipayTransferStatusResponseBody extends TeaModel {
    /**
     * <p>The tipping result data.</p>
     */
    @NameInMap("data")
    public GetAlipayTransferStatusResponseBodyData data;

    /**
     * <p>The unique ID of the request.</p>
     * 
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
         * <p>The sub-account ID (ignored by the API).</p>
         * 
         * <strong>example:</strong>
         * <p>1348393307144609</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>The payment details (ignored by the API).</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("alipayOrderDetail")
        public String alipayOrderDetail;

        /**
         * <p>The Alipay order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234234</p>
         */
        @NameInMap("alipayOrderId")
        public String alipayOrderId;

        /**
         * <p>The code associated with the tipping.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The creator (ignored by the API).</p>
         * 
         * <strong>example:</strong>
         * <p>234234</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The primary account ID (ignored by the API).</p>
         * 
         * <strong>example:</strong>
         * <p>1007576424487905</p>
         */
        @NameInMap("mainAccountId")
        public String mainAccountId;

        /**
         * <p>The modifier (ignored by the API).</p>
         * 
         * <strong>example:</strong>
         * <p>234234</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <p>The tipping link (ignored by the API).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.aliyun.com">https://xxx.aliyun.com</a></p>
         */
        @NameInMap("qrURL")
        public String qrURL;

        /**
         * <p>The ownership status of the tipping application.</p>
         * 
         * <strong>example:</strong>
         * <p>publish</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The tipping status. Valid values:</p>
         * <ul>
         * <li>1: Succeeded.</li>
         * <li>0: Deleted.</li>
         * <li>2: Pending tipping.</li>
         * <li>3: Canceled.</li>
         * <li>4: Refunded.</li>
         * <li>5: Closed.</li>
         * <li>6: Failed.</li>
         * <li>7: Disputed or abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Long status;

        /**
         * <p>The transfer title.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The total order amount. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>0.22</p>
         */
        @NameInMap("transAmount")
        public String transAmount;

        /**
         * <p>The Alipay product wallet code.</p>
         * 
         * <strong>example:</strong>
         * <p>xsdfsdf</p>
         */
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
