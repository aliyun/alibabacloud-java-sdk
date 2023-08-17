// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitTradeDocumentPackageExtractJobRequest extends TeaModel {
    @NameInMap("CustomExtractionRange")
    public java.util.List<String> customExtractionRange;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public String fileUrl;

    public static SubmitTradeDocumentPackageExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTradeDocumentPackageExtractJobRequest self = new SubmitTradeDocumentPackageExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTradeDocumentPackageExtractJobRequest setCustomExtractionRange(java.util.List<String> customExtractionRange) {
        this.customExtractionRange = customExtractionRange;
        return this;
    }
    public java.util.List<String> getCustomExtractionRange() {
        return this.customExtractionRange;
    }

    public SubmitTradeDocumentPackageExtractJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitTradeDocumentPackageExtractJobRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitTradeDocumentPackageExtractJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
