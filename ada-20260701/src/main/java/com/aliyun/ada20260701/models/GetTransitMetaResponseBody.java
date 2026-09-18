// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetTransitMetaResponseBody extends TeaModel {
    /**
     * <p>The temporary download URL. If <code>Network</code> is not specified, <code>null</code> is returned. If the file is not yet available, the URL may not be accessible. Do not write this URL to logs, persist it for long-term use, or share it with unauthorized users.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://download.example.invalid/code-review.zip?signature=">https://download.example.invalid/code-review.zip?signature=</a><REDACTED></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The expiration time of the Transit record, expressed as a UTC UNIX timestamp in milliseconds (the number of milliseconds elapsed since 1970-01-01 00:00:00 UTC). You can compare this value directly with the current UNIX timestamp in milliseconds without adding or subtracting 8 hours. Do not use the record after this time.</p>
     * 
     * <strong>example:</strong>
     * <p>1787734800000</p>
     */
    @NameInMap("ExpireAt")
    public Long expireAt;

    /**
     * <p>The opaque object path of the file. Do not parse or manually construct this value.</p>
     * 
     * <strong>example:</strong>
     * <p>skill-bundle/tenant-demo/user-demo/20260904120000_code-review.zip</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The request ID, which is used for Tracing Analysis and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The file size in bytes. <code>null</code> may be returned if no available file has been detected.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The Transit file status. Valid values:</p>
     * <ul>
     * <li>PENDING: The file is not yet available. You can query again later.</li>
     * <li>SUCCESS: The file is available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Transit ID。</p>
     * 
     * <strong>example:</strong>
     * <p>transit_0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("TransitId")
    public String transitId;

    public static GetTransitMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTransitMetaResponseBody self = new GetTransitMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTransitMetaResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetTransitMetaResponseBody setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public Long getExpireAt() {
        return this.expireAt;
    }

    public GetTransitMetaResponseBody setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public GetTransitMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTransitMetaResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GetTransitMetaResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTransitMetaResponseBody setTransitId(String transitId) {
        this.transitId = transitId;
        return this;
    }
    public String getTransitId() {
        return this.transitId;
    }

}
