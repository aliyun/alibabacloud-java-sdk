// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class CreateDocParserJobAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileFormat")
    public String fileFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateDocParserJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocParserJobAdvanceRequest self = new CreateDocParserJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocParserJobAdvanceRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
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

    public CreateDocParserJobAdvanceRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public CreateDocParserJobAdvanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
