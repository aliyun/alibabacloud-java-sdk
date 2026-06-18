// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetSubPartnerOrderListShrinkRequest extends TeaModel {
    /**
     * <p>The start timestamp of the order creation time range. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1727789348000</p>
     */
    @NameInMap("OrderCreateAfter")
    public Long orderCreateAfter;

    /**
     * <p>The end timestamp of the order creation time range. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1741008566000</p>
     */
    @NameInMap("OrderCreateBefore")
    public Long orderCreateBefore;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>209335720330622</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The start timestamp of the order payment time range. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1727789348000</p>
     */
    @NameInMap("OrderPayAfter")
    public Long orderPayAfter;

    /**
     * <p>The end timestamp of the order payment time range. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1741008566000</p>
     */
    @NameInMap("OrderPayBefore")
    public Long orderPayBefore;

    /**
     * <p>The order status. Valid values:</p>
     * <ul>
     * <li>1: unpaid</li>
     * <li>2: paid</li>
     * <li>3: voided.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OrderStatus")
    public Long orderStatus;

    /**
     * <p>The list of order types.
     * Valid values: BUY, UPGRADE, DOWNGRADE, RENEW, REFUND, and OTHERS.</p>
     */
    @NameInMap("OrderTypeList")
    public String orderTypeListShrink;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The minimum actual payment amount.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayAmountAfter")
    public Long payAmountAfter;

    /**
     * <p>The maximum actual payment amount.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PayAmountBefore")
    public Long payAmountBefore;

    /**
     * <p>The payment type. Valid values:</p>
     * <ul>
     * <li>1: non-delegated payment</li>
     * <li>2: delegated payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayType")
    public Long payType;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product name.</p>
     * 
     * <strong>example:</strong>
     * <p>弹性计算</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The opportunity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>202501101023</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the secondary partner.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX有限公司</p>
     */
    @NameInMap("SubPartnerName")
    public String subPartnerName;

    /**
     * <p>The UID of the secondary partner.</p>
     * 
     * <strong>example:</strong>
     * <p>123432311</p>
     */
    @NameInMap("SubPartnerUid")
    public Long subPartnerUid;

    public static GetSubPartnerOrderListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubPartnerOrderListShrinkRequest self = new GetSubPartnerOrderListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSubPartnerOrderListShrinkRequest setOrderCreateAfter(Long orderCreateAfter) {
        this.orderCreateAfter = orderCreateAfter;
        return this;
    }
    public Long getOrderCreateAfter() {
        return this.orderCreateAfter;
    }

    public GetSubPartnerOrderListShrinkRequest setOrderCreateBefore(Long orderCreateBefore) {
        this.orderCreateBefore = orderCreateBefore;
        return this;
    }
    public Long getOrderCreateBefore() {
        return this.orderCreateBefore;
    }

    public GetSubPartnerOrderListShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetSubPartnerOrderListShrinkRequest setOrderPayAfter(Long orderPayAfter) {
        this.orderPayAfter = orderPayAfter;
        return this;
    }
    public Long getOrderPayAfter() {
        return this.orderPayAfter;
    }

    public GetSubPartnerOrderListShrinkRequest setOrderPayBefore(Long orderPayBefore) {
        this.orderPayBefore = orderPayBefore;
        return this;
    }
    public Long getOrderPayBefore() {
        return this.orderPayBefore;
    }

    public GetSubPartnerOrderListShrinkRequest setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public GetSubPartnerOrderListShrinkRequest setOrderTypeListShrink(String orderTypeListShrink) {
        this.orderTypeListShrink = orderTypeListShrink;
        return this;
    }
    public String getOrderTypeListShrink() {
        return this.orderTypeListShrink;
    }

    public GetSubPartnerOrderListShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetSubPartnerOrderListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSubPartnerOrderListShrinkRequest setPayAmountAfter(Long payAmountAfter) {
        this.payAmountAfter = payAmountAfter;
        return this;
    }
    public Long getPayAmountAfter() {
        return this.payAmountAfter;
    }

    public GetSubPartnerOrderListShrinkRequest setPayAmountBefore(Long payAmountBefore) {
        this.payAmountBefore = payAmountBefore;
        return this;
    }
    public Long getPayAmountBefore() {
        return this.payAmountBefore;
    }

    public GetSubPartnerOrderListShrinkRequest setPayType(Long payType) {
        this.payType = payType;
        return this;
    }
    public Long getPayType() {
        return this.payType;
    }

    public GetSubPartnerOrderListShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetSubPartnerOrderListShrinkRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetSubPartnerOrderListShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetSubPartnerOrderListShrinkRequest setSubPartnerName(String subPartnerName) {
        this.subPartnerName = subPartnerName;
        return this;
    }
    public String getSubPartnerName() {
        return this.subPartnerName;
    }

    public GetSubPartnerOrderListShrinkRequest setSubPartnerUid(Long subPartnerUid) {
        this.subPartnerUid = subPartnerUid;
        return this;
    }
    public Long getSubPartnerUid() {
        return this.subPartnerUid;
    }

}
