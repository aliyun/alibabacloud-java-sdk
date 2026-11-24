// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInvoiceForIsvResponseBody extends TeaModel {
    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>The maximum number of entries per page for a paged query. Maximum value: 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token returned by this call.</p>
     * 
     * <strong>example:</strong>
     * <p>3v3mzZN1QdVsTPNiT0OkD36LC9I+AJHU9z2oXBmJJOyy4nQl7MIUZUYG6fdbYBk+</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the successful flow node.</p>
     */
    @NameInMap("Result")
    public java.util.List<DescribeInvoiceForIsvResponseBodyResult> result;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInvoiceForIsvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvoiceForIsvResponseBody self = new DescribeInvoiceForIsvResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvoiceForIsvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInvoiceForIsvResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public DescribeInvoiceForIsvResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInvoiceForIsvResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInvoiceForIsvResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInvoiceForIsvResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInvoiceForIsvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvoiceForIsvResponseBody setResult(java.util.List<DescribeInvoiceForIsvResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeInvoiceForIsvResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeInvoiceForIsvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInvoiceForIsvResponseBodyResultEvaluateList extends TeaModel {
        /**
         * <p>Specifies whether proxy invoicing is used.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Agent")
        public Boolean agent;

        /**
         * <p>The amount. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The time when the transaction occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("BizTimeStr")
        public String bizTimeStr;

        /**
         * <p>The ID of the invoicing object.</p>
         * 
         * <strong>example:</strong>
         * <p>9540765</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the order or bill. Valid values:</p>
         * <ul>
         * <li>0: Order.</li>
         * <li>1: Bill.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>2024091610072000****</p>
         */
        @NameInMap("OutBizId")
        public String outBizId;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmapi00067***</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p><strong>[Deprecated]</strong> The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>Image recognition OCR***</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:example@alibaba-inc.com">example@alibaba-inc.com</a></p>
         */
        @NameInMap("RealAliyunId")
        public String realAliyunId;

        /**
         * <p>The account to which the order belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>102277855749****</p>
         */
        @NameInMap("RealAliyunPk")
        public String realAliyunPk;

        public static DescribeInvoiceForIsvResponseBodyResultEvaluateList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvoiceForIsvResponseBodyResultEvaluateList self = new DescribeInvoiceForIsvResponseBodyResultEvaluateList();
            return TeaModel.build(map, self);
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setAgent(Boolean agent) {
            this.agent = agent;
            return this;
        }
        public Boolean getAgent() {
            return this.agent;
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setBizTimeStr(String bizTimeStr) {
            this.bizTimeStr = bizTimeStr;
            return this;
        }
        public String getBizTimeStr() {
            return this.bizTimeStr;
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setRealAliyunId(String realAliyunId) {
            this.realAliyunId = realAliyunId;
            return this;
        }
        public String getRealAliyunId() {
            return this.realAliyunId;
        }

        public DescribeInvoiceForIsvResponseBodyResultEvaluateList setRealAliyunPk(String realAliyunPk) {
            this.realAliyunPk = realAliyunPk;
            return this;
        }
        public String getRealAliyunPk() {
            return this.realAliyunPk;
        }

    }

    public static class DescribeInvoiceForIsvResponseBodyResultInvoiceList extends TeaModel {
        /**
         * <p>The ID of the invoice object.</p>
         * 
         * <strong>example:</strong>
         * <p>4072040****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The applied invoicing amount. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>99.99</p>
         */
        @NameInMap("InvoiceAmount")
        public String invoiceAmount;

        public static DescribeInvoiceForIsvResponseBodyResultInvoiceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvoiceForIsvResponseBodyResultInvoiceList self = new DescribeInvoiceForIsvResponseBodyResultInvoiceList();
            return TeaModel.build(map, self);
        }

        public DescribeInvoiceForIsvResponseBodyResultInvoiceList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeInvoiceForIsvResponseBodyResultInvoiceList setInvoiceAmount(String invoiceAmount) {
            this.invoiceAmount = invoiceAmount;
            return this;
        }
        public String getInvoiceAmount() {
            return this.invoiceAmount;
        }

    }

    public static class DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto extends TeaModel {
        /**
         * <p>The bank account.</p>
         * 
         * <strong>example:</strong>
         * <p>000000</p>
         */
        @NameInMap("BankAccount")
        public String bankAccount;

        /**
         * <p>The name of the bank.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("BankName")
        public String bankName;

        /**
         * <p>The registered address.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou ****</p>
         */
        @NameInMap("RegAddress")
        public String regAddress;

        /**
         * <p>The registered landline number.</p>
         * 
         * <strong>example:</strong>
         * <p>0571-****</p>
         */
        @NameInMap("RegPhone")
        public String regPhone;

        /**
         * <p>The unified social credit code of the enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>91420100MA49L5****</p>
         */
        @NameInMap("TaxNumber")
        public String taxNumber;

        public static DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto self = new DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto();
            return TeaModel.build(map, self);
        }

        public DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto setBankAccount(String bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }
        public String getBankAccount() {
            return this.bankAccount;
        }

        public DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }
        public String getBankName() {
            return this.bankName;
        }

        public DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto setRegAddress(String regAddress) {
            this.regAddress = regAddress;
            return this;
        }
        public String getRegAddress() {
            return this.regAddress;
        }

        public DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto setRegPhone(String regPhone) {
            this.regPhone = regPhone;
            return this;
        }
        public String getRegPhone() {
            return this.regPhone;
        }

        public DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto setTaxNumber(String taxNumber) {
            this.taxNumber = taxNumber;
            return this;
        }
        public String getTaxNumber() {
            return this.taxNumber;
        }

    }

    public static class DescribeInvoiceForIsvResponseBodyResultUserAddressDto extends TeaModel {
        /**
         * <p>The recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("Addressee")
        public String addressee;

        /**
         * <p>The Alibaba Cloud user ID of the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>174452687724****</p>
         */
        @NameInMap("AliyunPk")
        public String aliyunPk;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The delivery address.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou ****</p>
         */
        @NameInMap("DeliveryAddress")
        public String deliveryAddress;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:demo@example.com">demo@example.com</a></p>
         */
        @NameInMap("Emails")
        public String emails;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>130********</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The postal code.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("PostalCode")
        public String postalCode;

        public static DescribeInvoiceForIsvResponseBodyResultUserAddressDto build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvoiceForIsvResponseBodyResultUserAddressDto self = new DescribeInvoiceForIsvResponseBodyResultUserAddressDto();
            return TeaModel.build(map, self);
        }

        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto setAddressee(String addressee) {
            this.addressee = addressee;
            return this;
        }
        public String getAddressee() {
            return this.addressee;
        }

        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto setEmails(String emails) {
            this.emails = emails;
            return this;
        }
        public String getEmails() {
            return this.emails;
        }

        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

    }

    public static class DescribeInvoiceForIsvResponseBodyResult extends TeaModel {
        /**
         * <p>The Alibaba Cloud user ID of the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>102277855749****</p>
         */
        @NameInMap("AliyunPk")
        public String aliyunPk;

        /**
         * <p>The service provider invoice remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("CheckNotice")
        public String checkNotice;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("CreateTimeStr")
        public String createTimeStr;

        /**
         * <p>The order, bill, or contract number.</p>
         */
        @NameInMap("EvaluateList")
        public java.util.List<DescribeInvoiceForIsvResponseBodyResultEvaluateList> evaluateList;

        /**
         * <p>The ID of the invoice application. This corresponds to the InvoiceId parameter when you call the ModifyInvoiceForIsv operation.</p>
         * 
         * <strong>example:</strong>
         * <p>4072040****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the invoice object.</p>
         * 
         * <strong>example:</strong>
         * <p>4072040****</p>
         */
        @NameInMap("InvoiceId")
        public String invoiceId;

        /**
         * <p><strong>[Deprecated]</strong> The invoice sub-collection.</p>
         */
        @NameInMap("InvoiceList")
        public java.util.List<DescribeInvoiceForIsvResponseBodyResultInvoiceList> invoiceList;

        /**
         * <p>The relationship between the invoice title and the customer real-name information. Valid values: <code>REAL_NAME_MATCH</code> (The real-name information is consistent), <code>PERSONAL_APPLY_ENTERPRISE_TITLE</code> (An individual applies for an enterprise title), <code>ENTERPRISE_MULTI_TITLE</code> (Multiple titles for an enterprise), <code>MASTER_ACCOUNT_OPERATION</code> (Operated by the main account), and <code>OTHER</code> (Other). If not provided, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>REAL_NAME_MATCH</p>
         */
        @NameInMap("InvoiceTitleRelation")
        public String invoiceTitleRelation;

        /**
         * <p>The invoice issuance type. Valid values:</p>
         * <ul>
         * <li>0: Paper.</li>
         * <li>1: Electronic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaterialType")
        public String materialType;

        /**
         * <p>The time when the order status was modified. The time is displayed in GMT.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-04T09:43:18+08:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The time when the invoice was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("ModifiedTimeStr")
        public String modifiedTimeStr;

        /**
         * <p>The total invoice amount. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>99.99</p>
         */
        @NameInMap("Price")
        public String price;

        /**
         * <p>The user information of the invoice applicant.</p>
         */
        @NameInMap("ReceiptUserInfoDto")
        public DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto receiptUserInfoDto;

        /**
         * <p>The invoice status. Valid values: 0: Pending. 1: Invoiced.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The invoice title.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Computing Ltd</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The invoice type. Valid values:</p>
         * <ul>
         * <li>2: Digital electronic general invoice.</li>
         * <li>3: Digital electronic special invoice.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The address information.</p>
         */
        @NameInMap("UserAddressDto")
        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto userAddressDto;

        /**
         * <p>The user invoice remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("UserNotice")
        public String userNotice;

        public static DescribeInvoiceForIsvResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvoiceForIsvResponseBodyResult self = new DescribeInvoiceForIsvResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvoiceForIsvResponseBodyResult setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public DescribeInvoiceForIsvResponseBodyResult setCheckNotice(String checkNotice) {
            this.checkNotice = checkNotice;
            return this;
        }
        public String getCheckNotice() {
            return this.checkNotice;
        }

        public DescribeInvoiceForIsvResponseBodyResult setCreateTimeStr(String createTimeStr) {
            this.createTimeStr = createTimeStr;
            return this;
        }
        public String getCreateTimeStr() {
            return this.createTimeStr;
        }

        public DescribeInvoiceForIsvResponseBodyResult setEvaluateList(java.util.List<DescribeInvoiceForIsvResponseBodyResultEvaluateList> evaluateList) {
            this.evaluateList = evaluateList;
            return this;
        }
        public java.util.List<DescribeInvoiceForIsvResponseBodyResultEvaluateList> getEvaluateList() {
            return this.evaluateList;
        }

        public DescribeInvoiceForIsvResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeInvoiceForIsvResponseBodyResult setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public String getInvoiceId() {
            return this.invoiceId;
        }

        public DescribeInvoiceForIsvResponseBodyResult setInvoiceList(java.util.List<DescribeInvoiceForIsvResponseBodyResultInvoiceList> invoiceList) {
            this.invoiceList = invoiceList;
            return this;
        }
        public java.util.List<DescribeInvoiceForIsvResponseBodyResultInvoiceList> getInvoiceList() {
            return this.invoiceList;
        }

        public DescribeInvoiceForIsvResponseBodyResult setInvoiceTitleRelation(String invoiceTitleRelation) {
            this.invoiceTitleRelation = invoiceTitleRelation;
            return this;
        }
        public String getInvoiceTitleRelation() {
            return this.invoiceTitleRelation;
        }

        public DescribeInvoiceForIsvResponseBodyResult setMaterialType(String materialType) {
            this.materialType = materialType;
            return this;
        }
        public String getMaterialType() {
            return this.materialType;
        }

        public DescribeInvoiceForIsvResponseBodyResult setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeInvoiceForIsvResponseBodyResult setModifiedTimeStr(String modifiedTimeStr) {
            this.modifiedTimeStr = modifiedTimeStr;
            return this;
        }
        public String getModifiedTimeStr() {
            return this.modifiedTimeStr;
        }

        public DescribeInvoiceForIsvResponseBodyResult setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public DescribeInvoiceForIsvResponseBodyResult setReceiptUserInfoDto(DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto receiptUserInfoDto) {
            this.receiptUserInfoDto = receiptUserInfoDto;
            return this;
        }
        public DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto getReceiptUserInfoDto() {
            return this.receiptUserInfoDto;
        }

        public DescribeInvoiceForIsvResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInvoiceForIsvResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeInvoiceForIsvResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeInvoiceForIsvResponseBodyResult setUserAddressDto(DescribeInvoiceForIsvResponseBodyResultUserAddressDto userAddressDto) {
            this.userAddressDto = userAddressDto;
            return this;
        }
        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto getUserAddressDto() {
            return this.userAddressDto;
        }

        public DescribeInvoiceForIsvResponseBodyResult setUserNotice(String userNotice) {
            this.userNotice = userNotice;
            return this;
        }
        public String getUserNotice() {
            return this.userNotice;
        }

    }

}
