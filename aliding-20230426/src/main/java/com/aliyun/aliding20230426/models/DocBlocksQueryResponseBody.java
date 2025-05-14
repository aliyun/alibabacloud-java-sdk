// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DocBlocksQueryResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

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

    public static DocBlocksQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksQueryResponseBody self = new DocBlocksQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DocBlocksQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DocBlocksQueryResponseBody setResult(DocBlocksQueryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DocBlocksQueryResponseBodyResult getResult() {
        return this.result;
    }

    public DocBlocksQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DocBlocksQueryResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public DocBlocksQueryResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class DocBlocksQueryResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<?> data;

        public static DocBlocksQueryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DocBlocksQueryResponseBodyResult self = new DocBlocksQueryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DocBlocksQueryResponseBodyResult setData(java.util.List<?> data) {
            this.data = data;
            return this;
        }
        public java.util.List<?> getData() {
            return this.data;
        }

    }

}
