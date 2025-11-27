// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetShutdownPolicyRecordRequest extends TeaModel {
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
     * <p>2025-12-15 10:34:36</p>
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

    public static GetShutdownPolicyRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShutdownPolicyRecordRequest self = new GetShutdownPolicyRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetShutdownPolicyRecordRequest setCustomerUID(Long customerUID) {
        this.customerUID = customerUID;
        return this;
    }
    public Long getCustomerUID() {
        return this.customerUID;
    }

    public GetShutdownPolicyRecordRequest setOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }
    public String getOperationTime() {
        return this.operationTime;
    }

    public GetShutdownPolicyRecordRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetShutdownPolicyRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
