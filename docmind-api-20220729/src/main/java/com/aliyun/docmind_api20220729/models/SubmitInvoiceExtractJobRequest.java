// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitInvoiceExtractJobRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("ParserConfigId")
    public Integer parserConfigId;

    public static SubmitInvoiceExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInvoiceExtractJobRequest self = new SubmitInvoiceExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInvoiceExtractJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitInvoiceExtractJobRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitInvoiceExtractJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitInvoiceExtractJobRequest setParserConfigId(Integer parserConfigId) {
        this.parserConfigId = parserConfigId;
        return this;
    }
    public Integer getParserConfigId() {
        return this.parserConfigId;
    }

}
