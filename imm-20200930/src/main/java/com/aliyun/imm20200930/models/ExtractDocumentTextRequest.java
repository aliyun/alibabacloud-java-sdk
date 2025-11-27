// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ExtractDocumentTextRequest extends TeaModel {
    /**
     * <p><strong>If there are no special requirements, leave it blank.</strong></p>
     * <p>Chain authorization configuration, optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Using Chain Authorization to Access Other Entity Resources</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>Project name. For how to obtain it, see <a href="https://help.aliyun.com/document_detail/477051.html">Creating a Project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Suffix type of the source data. By default, the type of the source data is determined based on the suffix of the input object. When the input object does not have a suffix, you can set this parameter. The available values are as follows:</p>
     * <ul>
     * <li>Word Documents: doc, docx, wps, wpss, docm, dotm, dot, dotx, html</li>
     * <li>Presentation Documents (PPT): pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, dpss</li>
     * <li>Spreadsheet Documents (Excel): xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, ets</li>
     * <li>PDF Documents: pdf</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>docx</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>Storage address of the source data.</p>
     * <p>The OSS address rule is oss://${Bucket}/${Object}, where <code>${Bucket}</code> is the name of the OSS Bucket in the same region (Region) as the current project, and <code>${Object}</code> is the complete path of the file including the file extension.</p>
     * <blockquote>
     * <p>Notice: Currently, only HTTP protocol addresses are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    public static ExtractDocumentTextRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractDocumentTextRequest self = new ExtractDocumentTextRequest();
        return TeaModel.build(map, self);
    }

    public ExtractDocumentTextRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public ExtractDocumentTextRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ExtractDocumentTextRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ExtractDocumentTextRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}
