// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InitMultipartFileUploadResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>DINGTALK</p>
     */
    @NameInMap("storageDriver")
    public String storageDriver;

    /**
     * <strong>example:</strong>
     * <p>xhy89xxxxx</p>
     */
    @NameInMap("uploadKey")
    public String uploadKey;

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

    public static InitMultipartFileUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitMultipartFileUploadResponseBody self = new InitMultipartFileUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public InitMultipartFileUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitMultipartFileUploadResponseBody setStorageDriver(String storageDriver) {
        this.storageDriver = storageDriver;
        return this;
    }
    public String getStorageDriver() {
        return this.storageDriver;
    }

    public InitMultipartFileUploadResponseBody setUploadKey(String uploadKey) {
        this.uploadKey = uploadKey;
        return this;
    }
    public String getUploadKey() {
        return this.uploadKey;
    }

    public InitMultipartFileUploadResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public InitMultipartFileUploadResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
