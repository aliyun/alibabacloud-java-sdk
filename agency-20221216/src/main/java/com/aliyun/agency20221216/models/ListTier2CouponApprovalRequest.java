// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListTier2CouponApprovalRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>d54ca949-9b88-4514-add3-c6029c4027f4</p>
     */
    @NameInMap("ApplicationSheetId")
    public String applicationSheetId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>test account</p>
     */
    @NameInMap("T2PartnerName")
    public String t2PartnerName;

    /**
     * <strong>example:</strong>
     * <p>5248516956402795</p>
     */
    @NameInMap("T2PartnerUid")
    public Long t2PartnerUid;

    public static ListTier2CouponApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTier2CouponApprovalRequest self = new ListTier2CouponApprovalRequest();
        return TeaModel.build(map, self);
    }

    public ListTier2CouponApprovalRequest setApplicationSheetId(String applicationSheetId) {
        this.applicationSheetId = applicationSheetId;
        return this;
    }
    public String getApplicationSheetId() {
        return this.applicationSheetId;
    }

    public ListTier2CouponApprovalRequest setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public ListTier2CouponApprovalRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTier2CouponApprovalRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTier2CouponApprovalRequest setT2PartnerName(String t2PartnerName) {
        this.t2PartnerName = t2PartnerName;
        return this;
    }
    public String getT2PartnerName() {
        return this.t2PartnerName;
    }

    public ListTier2CouponApprovalRequest setT2PartnerUid(Long t2PartnerUid) {
        this.t2PartnerUid = t2PartnerUid;
        return this;
    }
    public Long getT2PartnerUid() {
        return this.t2PartnerUid;
    }

}
