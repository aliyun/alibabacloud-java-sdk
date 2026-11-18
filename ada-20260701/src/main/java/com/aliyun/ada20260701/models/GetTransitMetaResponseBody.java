// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetTransitMetaResponseBody extends TeaModel {
    /**
     * <p>The temporary download URL. If Network is not specified, null is returned. If the file is not yet available, the URL may be unavailable. Do not write this URL to logs, store it for a long time, or forward it to unrelated users.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://download.example.invalid/code-review.zip?signature=">https://download.example.invalid/code-review.zip?signature=</a><REDACTED></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The expiration time of the transit record. The value is a UTC UNIX timestamp in milliseconds, which indicates the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970. You can directly compare it with the current UNIX timestamp in milliseconds without adding or subtracting 8 hours. Do not continue to use the record after this time.</p>
     * 
     * <strong>example:</strong>
     * <p>1787734800000</p>
     */
    @NameInMap("ExpireAt")
    public Long expireAt;

    /**
     * <p>The opaque object path corresponding to the file. Callers must not parse or construct this value.</p>
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
     * <p>The file size in bytes. If no available file is detected, null may be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The status of the transit file. A value of PENDING indicates that the file is not yet available and the caller can query again later. A value of SUCCESS indicates that the file is available.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The transit ID.</p>
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
