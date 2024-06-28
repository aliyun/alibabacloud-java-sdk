// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDigitalDocStructureJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>docStructure.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    /**
     * <strong>example:</strong>
     * <p><a href="https://gw.alipayobjects.com/os/basement_prod/598b9edf-5287-4065-9e36-464305c60698.pdf">https://gw.alipayobjects.com/os/basement_prod/598b9edf-5287-4065-9e36-464305c60698.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("ImageStrategy")
    public String imageStrategy;

    @NameInMap("RevealMarkdown")
    public Boolean revealMarkdown;

    public static SubmitDigitalDocStructureJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDigitalDocStructureJobRequest self = new SubmitDigitalDocStructureJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDigitalDocStructureJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDigitalDocStructureJobRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitDigitalDocStructureJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitDigitalDocStructureJobRequest setImageStrategy(String imageStrategy) {
        this.imageStrategy = imageStrategy;
        return this;
    }
    public String getImageStrategy() {
        return this.imageStrategy;
    }

    public SubmitDigitalDocStructureJobRequest setRevealMarkdown(Boolean revealMarkdown) {
        this.revealMarkdown = revealMarkdown;
        return this;
    }
    public Boolean getRevealMarkdown() {
        return this.revealMarkdown;
    }

}
