// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ProjectModifyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pro_code</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("project_name")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("third_part_cost_center_id")
    public String thirdPartCostCenterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340049</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("third_part_invoice_id")
    public String thirdPartInvoiceId;

    public static ProjectModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ProjectModifyRequest self = new ProjectModifyRequest();
        return TeaModel.build(map, self);
    }

    public ProjectModifyRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProjectModifyRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ProjectModifyRequest setThirdPartCostCenterId(String thirdPartCostCenterId) {
        this.thirdPartCostCenterId = thirdPartCostCenterId;
        return this;
    }
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    public ProjectModifyRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public ProjectModifyRequest setThirdPartInvoiceId(String thirdPartInvoiceId) {
        this.thirdPartInvoiceId = thirdPartInvoiceId;
        return this;
    }
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

}
