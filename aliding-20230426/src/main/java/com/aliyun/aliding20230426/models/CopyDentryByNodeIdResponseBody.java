// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CopyDentryByNodeIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>doc</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("createdTime")
    public Long createdTime;

    /**
     * <strong>example:</strong>
     * <p>cdefg</p>
     */
    @NameInMap("dentryUuid")
    public String dentryUuid;

    /**
     * <strong>example:</strong>
     * <p>alidoc</p>
     */
    @NameInMap("extension")
    public String extension;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>bcd</p>
     */
    @NameInMap("spaceId")
    public String spaceId;

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

    public static CopyDentryByNodeIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyDentryByNodeIdResponseBody self = new CopyDentryByNodeIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyDentryByNodeIdResponseBody setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CopyDentryByNodeIdResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public CopyDentryByNodeIdResponseBody setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public CopyDentryByNodeIdResponseBody setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public CopyDentryByNodeIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyDentryByNodeIdResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public CopyDentryByNodeIdResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public CopyDentryByNodeIdResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
