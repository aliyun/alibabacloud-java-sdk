// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetOrdersRequest extends TeaModel {
    /**
     * <p>The end of the order creation time range. If not specified, orders created within the most recent hour are queried. Format: YYYY-MM-ddTHH:mm:ssZ. Time zone: UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-05-23T12:00:00Z</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The start of the order creation time range. If not specified, orders created within the most recent hour are queried. Format: YYYY-MM-ddTHH:mm:ssZ. Time zone: UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-05-23T13:00:00Z</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>The UID of a member account in an enterprise with multiple member accounts. Leave this parameter empty if this scenario does not apply.</p>
     * 
     * <strong>example:</strong>
     * <p>1779628988149763</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li>New: new purchase.</li>
     * <li>Renew: renewal.</li>
     * <li>Upgrade: upgrade.</li>
     * <li>TempUpgrade: temporary upgrade.</li>
     * <li>Downgrade: downgrade.</li>
     * <li>Refund: refund.</li>
     * <li>Convert: billing method conversion.</li>
     * <li>ResizeDisk: cloud disk resizing.</li>
     * <li>CompensatoryRenew: compensatory renewal.</li>
     * <li>IncreaseUpgrade: bandwidth upgrade.</li>
     * <li>Exchange: exchange.</li>
     * <li>ChangeOperatingSystem: operating system change.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>New</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The payment status. For non-refund orders, valid values:</p>
     * <ul>
     * <li>Unpaid: unpaid.</li>
     * <li>Paid: paid.</li>
     * <li>Cancelled: canceled.</li>
     * </ul>
     * <blockquote>
     * <p>For refund orders, set this parameter to NULL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Paid</p>
     */
    @NameInMap("PaymentStatus")
    public String paymentStatus;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li>Subscription: upfront.</li>
     * <li>PayAsYouGo: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static GetOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrdersRequest self = new GetOrdersRequest();
        return TeaModel.build(map, self);
    }

    public GetOrdersRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public GetOrdersRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public GetOrdersRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public GetOrdersRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetOrdersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetOrdersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOrdersRequest setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }
    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public GetOrdersRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetOrdersRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetOrdersRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
