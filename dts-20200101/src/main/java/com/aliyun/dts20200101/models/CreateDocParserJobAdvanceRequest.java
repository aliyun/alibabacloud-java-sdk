// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDocParserJobAdvanceRequest extends TeaModel {
    /**
     * <p>The name of the document to be parsed.</p>
     * <blockquote>
     * <p>The name must include the file name extension. Only .pdf is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The OSS URL of the document to be parsed.</p>
     * <blockquote>
     * <p>This parameter is automatically populated when you use an SDK to call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-cn-hangzhou.aliyuncs.com/storage/pdf/40184458-fbb0-44cf-a391-350628ceccdd17375122">https://oss-cn-hangzhou.aliyuncs.com/storage/pdf/40184458-fbb0-44cf-a391-350628ceccdd17375122</a>****</p>
     */
    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("RagInstanceId")
    public String ragInstanceId;

    /**
     * <p>The region ID of the document parsing task. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The format of the output result after the parsing task is completed. Valid values:</p>
     * <ul>
     * <li><strong>zip</strong>: ZIP archive.</li>
     * <li><strong>content</strong>: Plain text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zip</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    public static CreateDocParserJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocParserJobAdvanceRequest self = new CreateDocParserJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocParserJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateDocParserJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public CreateDocParserJobAdvanceRequest setRagInstanceId(String ragInstanceId) {
        this.ragInstanceId = ragInstanceId;
        return this;
    }
    public String getRagInstanceId() {
        return this.ragInstanceId;
    }

    public CreateDocParserJobAdvanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDocParserJobAdvanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDocParserJobAdvanceRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

}
