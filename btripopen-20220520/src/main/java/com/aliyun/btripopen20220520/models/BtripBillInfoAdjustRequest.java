// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BtripBillInfoAdjustRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("primary_id")
    public Long primaryId;

    /**
     * <strong>example:</strong>
     * <p>GA15131</p>
     */
    @NameInMap("third_part_cost_center_id")
    public String thirdPartCostCenterId;

    /**
     * <strong>example:</strong>
     * <p>GA15131</p>
     */
    @NameInMap("third_part_department_id")
    public String thirdPartDepartmentId;

    /**
     * <strong>example:</strong>
     * <p>GA15131</p>
     */
    @NameInMap("third_part_invoice_id")
    public String thirdPartInvoiceId;

    /**
     * <strong>example:</strong>
     * <p>GA15131</p>
     */
    @NameInMap("third_part_project_id")
    public String thirdPartProjectId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static BtripBillInfoAdjustRequest build(java.util.Map<String, ?> map) throws Exception {
        BtripBillInfoAdjustRequest self = new BtripBillInfoAdjustRequest();
        return TeaModel.build(map, self);
    }

    public BtripBillInfoAdjustRequest setPrimaryId(Long primaryId) {
        this.primaryId = primaryId;
        return this;
    }
    public Long getPrimaryId() {
        return this.primaryId;
    }

    public BtripBillInfoAdjustRequest setThirdPartCostCenterId(String thirdPartCostCenterId) {
        this.thirdPartCostCenterId = thirdPartCostCenterId;
        return this;
    }
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    public BtripBillInfoAdjustRequest setThirdPartDepartmentId(String thirdPartDepartmentId) {
        this.thirdPartDepartmentId = thirdPartDepartmentId;
        return this;
    }
    public String getThirdPartDepartmentId() {
        return this.thirdPartDepartmentId;
    }

    public BtripBillInfoAdjustRequest setThirdPartInvoiceId(String thirdPartInvoiceId) {
        this.thirdPartInvoiceId = thirdPartInvoiceId;
        return this;
    }
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

    public BtripBillInfoAdjustRequest setThirdPartProjectId(String thirdPartProjectId) {
        this.thirdPartProjectId = thirdPartProjectId;
        return this;
    }
    public String getThirdPartProjectId() {
        return this.thirdPartProjectId;
    }

    public BtripBillInfoAdjustRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
