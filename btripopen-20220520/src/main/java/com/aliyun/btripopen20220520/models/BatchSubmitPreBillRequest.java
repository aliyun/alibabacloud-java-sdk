// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BatchSubmitPreBillRequest extends TeaModel {
    /**
     * <p>A system parameter. You do not need to manually specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>100.66.54.114</p>
     */
    @NameInMap("app_ip")
    public String appIp;

    /**
     * <p>The bill batch date in the format of yyyy-MM-dd, such as 2026-06-21.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-21</p>
     */
    @NameInMap("bill_batch")
    public String billBatch;

    /**
     * <p>The customer decision. Valid values:</p>
     * <ul>
     * <li>1: bill in the current period.</li>
     * <li>2: deferred billing.</li>
     * <li>null: bill based on the current billing decision of the record.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("customer_decision")
    public Integer customerDecision;

    /**
     * <p>The dimension type. Valid values:</p>
     * <ul>
     * <li>1: bill ID.</li>
     * <li>2: order number.</li>
     * <li>3: approval form.</li>
     * <li>4: invoice title.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("dimension")
    public Integer dimension;

    /**
     * <p>The values determined by the dimension parameter. For example, if dimension is set to 1, the values should be bill IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("values")
    public java.util.List<String> values;

    public static BatchSubmitPreBillRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSubmitPreBillRequest self = new BatchSubmitPreBillRequest();
        return TeaModel.build(map, self);
    }

    public BatchSubmitPreBillRequest setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

    public BatchSubmitPreBillRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public BatchSubmitPreBillRequest setCustomerDecision(Integer customerDecision) {
        this.customerDecision = customerDecision;
        return this;
    }
    public Integer getCustomerDecision() {
        return this.customerDecision;
    }

    public BatchSubmitPreBillRequest setDimension(Integer dimension) {
        this.dimension = dimension;
        return this;
    }
    public Integer getDimension() {
        return this.dimension;
    }

    public BatchSubmitPreBillRequest setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
