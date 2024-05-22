// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class ConfirmLogisticsRequest extends TeaModel {
    @NameInMap("LogisticsDocuments")
    public String logisticsDocuments;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PoNumber")
    public String poNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PrNumber")
    public String prNumber;

    @NameInMap("Status")
    public String status;

    public static ConfirmLogisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLogisticsRequest self = new ConfirmLogisticsRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmLogisticsRequest setLogisticsDocuments(String logisticsDocuments) {
        this.logisticsDocuments = logisticsDocuments;
        return this;
    }
    public String getLogisticsDocuments() {
        return this.logisticsDocuments;
    }

    public ConfirmLogisticsRequest setPoNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }
    public String getPoNumber() {
        return this.poNumber;
    }

    public ConfirmLogisticsRequest setPrNumber(String prNumber) {
        this.prNumber = prNumber;
        return this;
    }
    public String getPrNumber() {
        return this.prNumber;
    }

    public ConfirmLogisticsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
