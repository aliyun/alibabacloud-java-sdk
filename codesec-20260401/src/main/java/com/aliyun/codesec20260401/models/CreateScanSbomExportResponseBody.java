// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateScanSbomExportResponseBody extends TeaModel {
    /**
     * <p>短时签名的 GET URL（有效期见 <strong><code>url_expires_at</code></strong>），对象上已带 Content-Disposition</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://krypton-codesafe.oss-cn-hangzhou.aliyuncs.com/1609837153086803%2F1000108%2F1000893%2F1001080%2Fartifacts%2Fcyclonedx-json%2F1f8dc54097780e9c32941289d2aff5161df694b5bfb2d0aa3fe87fe72a751363.cdx.json?Expires=1789713461&OSSAccessKeyId=STS.NYDdfgGGhFqA4XBNu2EQebMeV&Signature=pnZPAML9CPKOIDyC4b1DK6gQmhs%3D&response-content-disposition=attachment%3B%20filename%3D%22test-sbom-cyclonedx.cdx.json%22%3B%20filename%2A%3DUTF-8%27%27test-sbom-cyclonedx.cdx.json&security-token=CAIS">https://krypton-codesafe.oss-cn-hangzhou.aliyuncs.com/1609837153086803%2F1000108%2F1000893%2F1001080%2Fartifacts%2Fcyclonedx-json%2F1f8dc54097780e9c32941289d2aff5161df694b5bfb2d0aa3fe87fe72a751363.cdx.json?Expires=1789713461&amp;OSSAccessKeyId=STS.NYDdfgGGhFqA4XBNu2EQebMeV&amp;Signature=pnZPAML9CPKOIDyC4b1DK6gQmhs%3D&amp;response-content-disposition=attachment%3B%20filename%3D%22test-sbom-cyclonedx.cdx.json%22%3B%20filename%2A%3DUTF-8%27%27test-sbom-cyclonedx.cdx.json&amp;security-token=CAIS</a>*</p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>最终生效的文件名（客户端指定或后端默认），已签进 <strong><code>download_url</code></strong> 的 <strong><code>Content-Disposition</code></strong>， 浏览器直连下载即按此落盘。</p>
     * 
     * <strong>example:</strong>
     * <p>test-sbom-cyclonedx.cdx.json</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>cyclonedx-json</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <p>交付文件 MIME 类型</p>
     * 
     * <strong>example:</strong>
     * <p>application/vnd.cyclonedx+json</p>
     */
    @NameInMap("mediaType")
    public String mediaType;

    /**
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>交付文件本身（注入后重算）的摘要，供下载完整性校验；与源制品的 sha256 不同</p>
     * 
     * <strong>example:</strong>
     * <p>1f8dc54097780e9c32941289d2aff5161df694b5bfb2d0aa3fe87fe72a751363</p>
     */
    @NameInMap("sha256")
    public String sha256;

    /**
     * <p>交付文件字节数</p>
     * 
     * <strong>example:</strong>
     * <p>791355</p>
     */
    @NameInMap("sizeBytes")
    public Long sizeBytes;

    public static CreateScanSbomExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScanSbomExportResponseBody self = new CreateScanSbomExportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScanSbomExportResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public CreateScanSbomExportResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateScanSbomExportResponseBody setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public CreateScanSbomExportResponseBody setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public CreateScanSbomExportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScanSbomExportResponseBody setSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }
    public String getSha256() {
        return this.sha256;
    }

    public CreateScanSbomExportResponseBody setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

}
