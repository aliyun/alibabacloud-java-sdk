// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateSupplierInformationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Test supplier</p>
     */
    @NameInMap("SupplierDesc")
    public String supplierDesc;

    /**
     * <p>The name of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud</p>
     */
    @NameInMap("SupplierName")
    public String supplierName;

    /**
     * <p>The URL of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.xxx.xxx.cn">http://www.xxx.xxx.cn</a></p>
     */
    @NameInMap("SupplierUrl")
    public String supplierUrl;

    public static UpdateSupplierInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSupplierInformationResponseBody self = new UpdateSupplierInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSupplierInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSupplierInformationResponseBody setSupplierDesc(String supplierDesc) {
        this.supplierDesc = supplierDesc;
        return this;
    }
    public String getSupplierDesc() {
        return this.supplierDesc;
    }

    public UpdateSupplierInformationResponseBody setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public UpdateSupplierInformationResponseBody setSupplierUrl(String supplierUrl) {
        this.supplierUrl = supplierUrl;
        return this;
    }
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

}
