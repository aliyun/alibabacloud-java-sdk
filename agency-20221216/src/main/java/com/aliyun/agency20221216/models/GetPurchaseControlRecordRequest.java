// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetPurchaseControlRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>292828565558721922</p>
     */
    @NameInMap("CustomerUID")
    public Long customerUID;

    /**
     * <strong>example:</strong>
     * <p>2023-12-15 10:34:36</p>
     */
    @NameInMap("OperationTime")
    public String operationTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetPurchaseControlRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPurchaseControlRecordRequest self = new GetPurchaseControlRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetPurchaseControlRecordRequest setCustomerUID(Long customerUID) {
        this.customerUID = customerUID;
        return this;
    }
    public Long getCustomerUID() {
        return this.customerUID;
    }

    public GetPurchaseControlRecordRequest setOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }
    public String getOperationTime() {
        return this.operationTime;
    }

    public GetPurchaseControlRecordRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetPurchaseControlRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
