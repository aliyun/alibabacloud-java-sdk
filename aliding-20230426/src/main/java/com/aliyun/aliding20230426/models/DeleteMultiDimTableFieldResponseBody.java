// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMultiDimTableFieldResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static DeleteMultiDimTableFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiDimTableFieldResponseBody self = new DeleteMultiDimTableFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMultiDimTableFieldResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteMultiDimTableFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMultiDimTableFieldResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public DeleteMultiDimTableFieldResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
