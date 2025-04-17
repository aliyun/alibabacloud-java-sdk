// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetBillDetailFileListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202502</p>
     */
    @NameInMap("BillMonth")
    public String billMonth;

    @NameInMap("OssAccessKeyId")
    public String ossAccessKeyId;

    @NameInMap("OssAccessKeySecret")
    public String ossAccessKeySecret;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OssRegion")
    public String ossRegion;

    @NameInMap("OssSecurityToken")
    public String ossSecurityToken;

    public static GetBillDetailFileListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBillDetailFileListRequest self = new GetBillDetailFileListRequest();
        return TeaModel.build(map, self);
    }

    public GetBillDetailFileListRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public GetBillDetailFileListRequest setOssAccessKeyId(String ossAccessKeyId) {
        this.ossAccessKeyId = ossAccessKeyId;
        return this;
    }
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    public GetBillDetailFileListRequest setOssAccessKeySecret(String ossAccessKeySecret) {
        this.ossAccessKeySecret = ossAccessKeySecret;
        return this;
    }
    public String getOssAccessKeySecret() {
        return this.ossAccessKeySecret;
    }

    public GetBillDetailFileListRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public GetBillDetailFileListRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public GetBillDetailFileListRequest setOssRegion(String ossRegion) {
        this.ossRegion = ossRegion;
        return this;
    }
    public String getOssRegion() {
        return this.ossRegion;
    }

    public GetBillDetailFileListRequest setOssSecurityToken(String ossSecurityToken) {
        this.ossSecurityToken = ossSecurityToken;
        return this;
    }
    public String getOssSecurityToken() {
        return this.ossSecurityToken;
    }

}
