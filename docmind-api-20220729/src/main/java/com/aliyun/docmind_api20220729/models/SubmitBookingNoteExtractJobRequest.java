// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitBookingNoteExtractJobRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("ParserConfigId")
    public Integer parserConfigId;

    public static SubmitBookingNoteExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBookingNoteExtractJobRequest self = new SubmitBookingNoteExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBookingNoteExtractJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitBookingNoteExtractJobRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitBookingNoteExtractJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitBookingNoteExtractJobRequest setParserConfigId(Integer parserConfigId) {
        this.parserConfigId = parserConfigId;
        return this;
    }
    public Integer getParserConfigId() {
        return this.parserConfigId;
    }

}
