// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitTradeDocumentPackageExtractJobShrinkRequest extends TeaModel {
    @NameInMap("CustomExtractionRange")
    public String customExtractionRangeShrink;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public String fileUrl;

    public static SubmitTradeDocumentPackageExtractJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTradeDocumentPackageExtractJobShrinkRequest self = new SubmitTradeDocumentPackageExtractJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTradeDocumentPackageExtractJobShrinkRequest setCustomExtractionRangeShrink(String customExtractionRangeShrink) {
        this.customExtractionRangeShrink = customExtractionRangeShrink;
        return this;
    }
    public String getCustomExtractionRangeShrink() {
        return this.customExtractionRangeShrink;
    }

    public SubmitTradeDocumentPackageExtractJobShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitTradeDocumentPackageExtractJobShrinkRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitTradeDocumentPackageExtractJobShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
