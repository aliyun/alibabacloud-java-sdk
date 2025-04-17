// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ExtractDocumentTextShrinkRequest extends TeaModel {
    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/477051.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The type of the filename extension of the source data. By default, the filename extension of the source data is the same as the filename extension of the input document. If the input document has no extension, you can specify this parameter. Valid values:</p>
     * <ul>
     * <li>Text documents: doc, docx, wps, wpss, docm, dotm, dot, dotx, and html</li>
     * <li>Presentation documents: pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, and dpss</li>
     * <li>Table documents: xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, and ets</li>
     * <li>PDF documents: pdf.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>docx</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The URI of the Object Storage Service (OSS) bucket in which the document is stored.</p>
     * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the complete path to the file that has an extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    public static ExtractDocumentTextShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractDocumentTextShrinkRequest self = new ExtractDocumentTextShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExtractDocumentTextShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public ExtractDocumentTextShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ExtractDocumentTextShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ExtractDocumentTextShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}
