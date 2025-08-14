// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInvoiceForIsvResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>3v3mzZN1QdVsTPNiT0OkD36LC9I+AJHU9z2oXBmJJOyy4nQl7MIUZUYG6fdbYBk+</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeInvoiceForIsvResponseBodyResult> result;

    /**
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
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Agent")
        public Boolean agent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("BizTimeStr")
        public String bizTimeStr;

        /**
         * <strong>example:</strong>
         * <p>9540765</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>2024091610072000****</p>
         */
        @NameInMap("OutBizId")
        public String outBizId;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("RealAliyunId")
        public String realAliyunId;

        /**
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
         * <strong>example:</strong>
         * <p>50000018</p>
         */
        @NameInMap("Id")
        public String id;

        /**
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
        @NameInMap("TaxNumber")
        public String taxNumber;

        public static DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto self = new DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto();
            return TeaModel.build(map, self);
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
        @NameInMap("Addressee")
        public String addressee;

        @NameInMap("AliyunPk")
        public String aliyunPk;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("DeliveryAddress")
        public String deliveryAddress;

        @NameInMap("Emails")
        public String emails;

        @NameInMap("Phone")
        public String phone;

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
         * <strong>example:</strong>
         * <p>102277855749****</p>
         */
        @NameInMap("AliyunPk")
        public String aliyunPk;

        @NameInMap("CheckNotice")
        public String checkNotice;

        @NameInMap("CreateTimeStr")
        public String createTimeStr;

        @NameInMap("EvaluateList")
        public java.util.List<DescribeInvoiceForIsvResponseBodyResultEvaluateList> evaluateList;

        /**
         * <strong>example:</strong>
         * <p>58050005</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("InvoiceId")
        public String invoiceId;

        @NameInMap("InvoiceList")
        public java.util.List<DescribeInvoiceForIsvResponseBodyResultInvoiceList> invoiceList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaterialType")
        public String materialType;

        /**
         * <strong>example:</strong>
         * <p>2025-03-04T09:43:18+08:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("ModifiedTimeStr")
        public String modifiedTimeStr;

        /**
         * <strong>example:</strong>
         * <p>99.99</p>
         */
        @NameInMap("Price")
        public String price;

        @NameInMap("ReceiptUserInfoDto")
        public DescribeInvoiceForIsvResponseBodyResultReceiptUserInfoDto receiptUserInfoDto;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("UserAddressDto")
        public DescribeInvoiceForIsvResponseBodyResultUserAddressDto userAddressDto;

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
