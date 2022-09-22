// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateFileSystemResponseBody extends TeaModel {
    @NameInMap("AllocationId")
    public java.util.List<String> allocationId;

    @NameInMap("BizStatusCode")
    public String bizStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UnAllocationId")
    public java.util.List<String> unAllocationId;

    public static CreateFileSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemResponseBody self = new CreateFileSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemResponseBody setAllocationId(java.util.List<String> allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public java.util.List<String> getAllocationId() {
        return this.allocationId;
    }

    public CreateFileSystemResponseBody setBizStatusCode(String bizStatusCode) {
        this.bizStatusCode = bizStatusCode;
        return this;
    }
    public String getBizStatusCode() {
        return this.bizStatusCode;
    }

    public CreateFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFileSystemResponseBody setUnAllocationId(java.util.List<String> unAllocationId) {
        this.unAllocationId = unAllocationId;
        return this;
    }
    public java.util.List<String> getUnAllocationId() {
        return this.unAllocationId;
    }

}
