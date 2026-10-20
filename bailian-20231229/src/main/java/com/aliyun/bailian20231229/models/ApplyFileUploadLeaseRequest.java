// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ApplyFileUploadLeaseRequest extends TeaModel {
    /**
     * <p>The category type. If this parameter is not specified, the default value is UNSTRUCTURED. Valid values:</p>
     * <p>UNSTRUCTURED: category, used for building <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a> scenarios.
     * &lt;props=&quot;china&quot;&gt;
     * SESSION_FILE: upload a file for agent application <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a>.</p>
     * <blockquote>
     * <p>To create a new data table and upload data, use the Alibaba Cloud Model Studio console. This is not supported through the API.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>When uploading a file for building a <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a>:</p>
     * <ul>
     * <li><p>This parameter specifies the name of the file to upload. The file name extension must match the file format. Supported formats:</p>
     * <ul>
     * <li>Documents (less than 150 MB): doc, docx, wps, ppt, pptx, xls, xlsx, md, txt, pdf, epub, mobi.</li>
     * <li>Spreadsheets (10 MB or less recommended, 100,000 rows or less): xls, xlsx.</li>
     * <li>Plain text (10 MB or less recommended): md, txt.</li>
     * <li>Images (less than 20 MB, shortest side &gt; 15 px, longest side &lt; 8192 px, aspect ratio &lt; 50): png, jpg, jpeg, bmp, gif.</li>
     * <li>Audio: aac, amr, flac, flv, m4a, mp3, mpeg, ogg, opus, wav, webm, wma.</li>
     * <li>Video: mp4, mkv, avi, mov, wmv.</li>
     * </ul>
     * </li>
     * <li><p>The file name must be 4 to 128 characters in length. For other limits, see <a href="https://help.aliyun.com/document_detail/2880605.html">Knowledge base quotas and limits</a>.</p>
     * <blockquote>
     * <p>To create a new data table and upload data, use the Alibaba Cloud Model Studio console. This is not supported through the API.</p>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;
     * When uploading a file for agent application <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a>:</p>
     * </li>
     * <li><p>This parameter specifies the name of the file to upload. The file name extension must match the file format. Supported formats:</p>
     * <ul>
     * <li>Documents: doc, docx, wps, ppt, pptx, xls, xlsx, md, txt, pdf, epub, mobi.</li>
     * <li>Images: png, jpg, jpeg, bmp, gif.</li>
     * <li>Audio: aac, amr, flac, flv, m4a, mp3, mpeg, ogg, opus, wav, webm, wma.</li>
     * <li>Video: mp4, mkv, avi, mov, wmv.</li>
     * </ul>
     * </li>
     * <li><p>The file name must be 4 to 128 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ProductList.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The MD5 value of the file to upload. The server validates this parameter (validation is not currently enabled). Specify the correct value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19657c391f6c70bcea63c154d8606bb3</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The size of the file to upload, in bytes. The server validates this parameter (validation is not currently enabled). Specify the correct value. Valid values: 1 B to 100 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SizeInBytes")
    public String sizeInBytes;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>If you use <a href="https://www.alibabacloud.com/help/en/model-studio/configure-resources-in-private-network">Alibaba Cloud Model Studio secure storage</a> and need to generate a lease URL accessible only from the Alibaba Cloud internal network in the same region, set this parameter to true for improved security. If this parameter is not specified, the default value is false, which generates a publicly accessible lease URL.</p>
     * <blockquote>
     * <p>If you have not activated Alibaba Cloud Model Studio secure storage, or are unsure whether you are using it, do not set this parameter to true (the upload will fail).</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>If you use Alibaba Cloud Model Studio secure storage and need to generate a lease URL accessible only from the Alibaba Cloud internal network in the same region, set this parameter to true for improved security. If this parameter is not specified, the default value is false, which generates a publicly accessible lease URL.</p>
     * <blockquote>
     * <p>If you have not activated Alibaba Cloud Model Studio secure storage, or are unsure whether you are using it, do not set this parameter to true (the upload will fail).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseInternalEndpoint")
    public Boolean useInternalEndpoint;

    public static ApplyFileUploadLeaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyFileUploadLeaseRequest self = new ApplyFileUploadLeaseRequest();
        return TeaModel.build(map, self);
    }

    public ApplyFileUploadLeaseRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public ApplyFileUploadLeaseRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ApplyFileUploadLeaseRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public ApplyFileUploadLeaseRequest setSizeInBytes(String sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }
    public String getSizeInBytes() {
        return this.sizeInBytes;
    }

    public ApplyFileUploadLeaseRequest setUseInternalEndpoint(Boolean useInternalEndpoint) {
        this.useInternalEndpoint = useInternalEndpoint;
        return this;
    }
    public Boolean getUseInternalEndpoint() {
        return this.useInternalEndpoint;
    }

}
