// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CouponApprovalStatusListRequest extends TeaModel {
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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the coupon template.</p>
     * 
     * <strong>example:</strong>
     * <p>5093156</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>Test coupon template</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The status of the coupon template. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: application revoked</li>
     * <li><strong>2</strong>: under review</li>
     * <li><strong>3</strong>: review rejected</li>
     * <li><strong>4</strong>: review approved</li>
     * <li><strong>5</strong>: review approved but issuance failed</li>
     * <li><strong>6</strong>: automatically approved</li>
     * <li><strong>7</strong>: automatically approved but issuance failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TemplateStatus")
    public String templateStatus;

    public static CouponApprovalStatusListRequest build(java.util.Map<String, ?> map) throws Exception {
        CouponApprovalStatusListRequest self = new CouponApprovalStatusListRequest();
        return TeaModel.build(map, self);
    }

    public CouponApprovalStatusListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public CouponApprovalStatusListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CouponApprovalStatusListRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CouponApprovalStatusListRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CouponApprovalStatusListRequest setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

}
