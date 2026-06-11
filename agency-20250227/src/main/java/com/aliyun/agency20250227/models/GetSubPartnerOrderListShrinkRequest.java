// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetSubPartnerOrderListShrinkRequest extends TeaModel {
    /**
     * <p>The UNIX timestamp of the start time for order creation. The time range must not exceed six months.<br>The time range for order creation and the time range for order payment cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1727789348000</p>
     */
    @NameInMap("OrderCreateAfter")
    public Long orderCreateAfter;

    /**
     * <p>The UNIX timestamp of the end time for order creation. The time range must not exceed six months.<br>The time range for order creation and the time range for order payment cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1741008566000</p>
     */
    @NameInMap("OrderCreateBefore")
    public Long orderCreateBefore;

    /**
     * <p>Order ID</p>
     * 
     * <strong>example:</strong>
     * <p>209335720330622</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The UNIX timestamp of the start time for order payment. The time range must not exceed six months.<br>The time range for order creation and the time range for order payment cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1727789348000</p>
     */
    @NameInMap("OrderPayAfter")
    public Long orderPayAfter;

    /**
     * <p>UNIX timestamp of the order payment deadline. The time range cannot exceed six months.
     * The time range for order creation and the time range for order payment cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1741008566000</p>
     */
    @NameInMap("OrderPayBefore")
    public Long orderPayBefore;

    /**
     * <p>Order status. Valid values:
     * 1: Unpaid
     * 2: Paid
     * 3: Canceled</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OrderStatus")
    public Long orderStatus;

    /**
     * <p>List of order types.
     * Valid order types include: BUY, UPGRADE, DOWNGRADE, RENEW, REFUND, OTHERS</p>
     */
    @NameInMap("OrderTypeList")
    public String orderTypeListShrink;

    /**
     * <p>Page number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Page size</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Minimum paid amount</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayAmountAfter")
    public Long payAmountAfter;

    /**
     * <p>Maximum paid amount</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PayAmountBefore")
    public Long payAmountBefore;

    /**
     * <p>Payment Type:<br>1: Non-agent payment<br>2: Agent payment</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayType")
    public Long payType;

    /**
     * <p>Product code</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Product Name</p>
     * 
     * <strong>example:</strong>
     * <p>弹性计算</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>Opportunity ID</p>
     * 
     * <strong>example:</strong>
     * <p>202501101023</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Sub-partner name</p>
     * 
     * <strong>example:</strong>
     * <p>XXX有限公司</p>
     */
    @NameInMap("SubPartnerName")
    public String subPartnerName;

    /**
     * <p>Sub-partner UID</p>
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
