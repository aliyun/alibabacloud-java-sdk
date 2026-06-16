// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class CreateDocParserJobRequest extends TeaModel {
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
    public String fileUrl;

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

    public static CreateDocParserJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocParserJobRequest self = new CreateDocParserJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocParserJobRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public CreateDocParserJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateDocParserJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateDocParserJobRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public CreateDocParserJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
