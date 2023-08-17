// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitTradeDocumentPackageExtractJobAdvanceRequest extends TeaModel {
    @NameInMap("CustomExtractionRange")
    public java.util.List<String> customExtractionRange;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    public static SubmitTradeDocumentPackageExtractJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTradeDocumentPackageExtractJobAdvanceRequest self = new SubmitTradeDocumentPackageExtractJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTradeDocumentPackageExtractJobAdvanceRequest setCustomExtractionRange(java.util.List<String> customExtractionRange) {
        this.customExtractionRange = customExtractionRange;
        return this;
    }
    public java.util.List<String> getCustomExtractionRange() {
        return this.customExtractionRange;
    }

    public SubmitTradeDocumentPackageExtractJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitTradeDocumentPackageExtractJobAdvanceRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitTradeDocumentPackageExtractJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

}
