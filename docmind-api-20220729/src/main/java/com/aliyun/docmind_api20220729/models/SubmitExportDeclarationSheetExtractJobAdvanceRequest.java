// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitExportDeclarationSheetExtractJobAdvanceRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("ParserConfigId")
    public Integer parserConfigId;

    public static SubmitExportDeclarationSheetExtractJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitExportDeclarationSheetExtractJobAdvanceRequest self = new SubmitExportDeclarationSheetExtractJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitExportDeclarationSheetExtractJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitExportDeclarationSheetExtractJobAdvanceRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitExportDeclarationSheetExtractJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public SubmitExportDeclarationSheetExtractJobAdvanceRequest setParserConfigId(Integer parserConfigId) {
        this.parserConfigId = parserConfigId;
        return this;
    }
    public Integer getParserConfigId() {
        return this.parserConfigId;
    }

}
