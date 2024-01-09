// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDigitalDocStructureJobAdvanceRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("ImageStrategy")
    public String imageStrategy;

    @NameInMap("RevealMarkdown")
    public Boolean revealMarkdown;

    public static SubmitDigitalDocStructureJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDigitalDocStructureJobAdvanceRequest self = new SubmitDigitalDocStructureJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDigitalDocStructureJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDigitalDocStructureJobAdvanceRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitDigitalDocStructureJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public SubmitDigitalDocStructureJobAdvanceRequest setImageStrategy(String imageStrategy) {
        this.imageStrategy = imageStrategy;
        return this;
    }
    public String getImageStrategy() {
        return this.imageStrategy;
    }

    public SubmitDigitalDocStructureJobAdvanceRequest setRevealMarkdown(Boolean revealMarkdown) {
        this.revealMarkdown = revealMarkdown;
        return this;
    }
    public Boolean getRevealMarkdown() {
        return this.revealMarkdown;
    }

}
