// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetIntlCommissionDetailFileListRequest extends TeaModel {
    /**
     * <p>The billing month.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202502</p>
     */
    @NameInMap("BillMonth")
    public String billMonth;

    /**
     * <p>The AccessKey ID used to upload files to OSS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAccessKeyID</p>
     */
    @NameInMap("OssAccessKeyId")
    public String ossAccessKeyId;

    /**
     * <p>The AccessKey secret used to upload files to OSS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAccessKeySecret</p>
     */
    @NameInMap("OssAccessKeySecret")
    public String ossAccessKeySecret;

    /**
     * <p>The name of the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourBucketName</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The endpoint of the region where the Object Storage Service (OSS) bucket for the file sharing resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://oss-cn-beijing.aliyuncs.com">http://oss-cn-beijing.aliyuncs.com</a></p>
     */
    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    /**
     * <p>The region where the current OSS bucket resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("OssRegion")
    public String ossRegion;

    /**
     * <p>The STS token used to upload files to OSS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourSecurityToken</p>
     */
    @NameInMap("OssSecurityToken")
    public String ossSecurityToken;

    public static GetIntlCommissionDetailFileListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntlCommissionDetailFileListRequest self = new GetIntlCommissionDetailFileListRequest();
        return TeaModel.build(map, self);
    }

    public GetIntlCommissionDetailFileListRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public GetIntlCommissionDetailFileListRequest setOssAccessKeyId(String ossAccessKeyId) {
        this.ossAccessKeyId = ossAccessKeyId;
        return this;
    }
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    public GetIntlCommissionDetailFileListRequest setOssAccessKeySecret(String ossAccessKeySecret) {
        this.ossAccessKeySecret = ossAccessKeySecret;
        return this;
    }
    public String getOssAccessKeySecret() {
        return this.ossAccessKeySecret;
    }

    public GetIntlCommissionDetailFileListRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public GetIntlCommissionDetailFileListRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public GetIntlCommissionDetailFileListRequest setOssRegion(String ossRegion) {
        this.ossRegion = ossRegion;
        return this;
    }
    public String getOssRegion() {
        return this.ossRegion;
    }

    public GetIntlCommissionDetailFileListRequest setOssSecurityToken(String ossSecurityToken) {
        this.ossSecurityToken = ossSecurityToken;
        return this;
    }
    public String getOssSecurityToken() {
        return this.ossSecurityToken;
    }

}
