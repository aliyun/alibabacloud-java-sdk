// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ApplyFileUploadLeaseRequest extends TeaModel {
    /**
     * <p>The category type. If this parameter is not specified, the default value is UNSTRUCTURED. Valid values:</p>
     * <p>UNSTRUCTURED: category for building <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a> scenarios.
     * &lt;props=&quot;china&quot;&gt;
     * SESSION_FILE: upload files for agent application <a href="https://help.aliyun.com/zh/model-studio/user-guide/file-interaction">conversational interactions</a>.</p>
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
     * <p>When uploading files for building a <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a>:</p>
     * <ul>
     * <li><p>This field represents the name of the uploaded file. The file name must include the file format extension. Supported formats:</p>
     * <ul>
     * <li>Documents (less than 150 MB): doc, docx, wps, ppt, pptx, xls, xlsx, md, txt, pdf, epub, mobi.</li>
     * <li>Spreadsheets (recommended within 10 MB and 100,000 rows): xls, xlsx.</li>
     * <li>Plain text (recommended not to exceed 10 MB): md, txt.</li>
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
     * When uploading files for agent application <a href="https://help.aliyun.com/zh/model-studio/user-guide/file-interaction">conversational interactions</a>:</p>
     * </li>
     * <li><p>This field represents the name of the uploaded file. The file name must include the file format extension. Supported formats:</p>
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
     * <p>XXXX产品清单.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The MD5 value of the uploaded file. The server will verify this field (currently not enabled). Please fill in the correct value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19657c391f6c70bcea63c154d8606bb3</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The size of the uploaded file in bytes. The server will verify this field (currently not enabled). Please fill in the correct value. Valid values: 1 B to 100 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SizeInBytes")
    public String sizeInBytes;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>If you have enabled <a href="https://help.aliyun.com/zh/model-studio/configure-resources-in-private-network">Alibaba Cloud Model Studio secure storage</a> and need to generate a lease URL that is only accessible from the Alibaba Cloud internal network in the same region, you can set this parameter to true to improve security. If this parameter is not specified, the default value is false, which generates a publicly accessible lease URL.</p>
     * <blockquote>
     * <p>If you have not enabled Alibaba Cloud Model Studio secure storage, or are unsure whether you are using it, do not set this parameter to true (upload will fail).</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>If you have enabled Alibaba Cloud Model Studio secure storage and need to generate a lease URL that is only accessible from the Alibaba Cloud internal network in the same region, you can set this parameter to true to improve security. If this parameter is not specified, the default value is false, which generates a publicly accessible lease URL.</p>
     * <blockquote>
     * <p>If you have not enabled Alibaba Cloud Model Studio secure storage, or are unsure whether you are using it, do not set this parameter to true (upload will fail).</p>
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
