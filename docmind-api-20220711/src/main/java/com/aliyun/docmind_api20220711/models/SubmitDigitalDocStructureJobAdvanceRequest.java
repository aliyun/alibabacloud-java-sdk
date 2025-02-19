// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDigitalDocStructureJobAdvanceRequest extends TeaModel {
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
    public java.io.InputStream fileUrlObject;

    @NameInMap("ImageStrategy")
    public String imageStrategy;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("RevealMarkdown")
    public Boolean revealMarkdown;

    @NameInMap("UseUrlResponseBody")
    public Boolean useUrlResponseBody;

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

    public SubmitDigitalDocStructureJobAdvanceRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public SubmitDigitalDocStructureJobAdvanceRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public SubmitDigitalDocStructureJobAdvanceRequest setRevealMarkdown(Boolean revealMarkdown) {
        this.revealMarkdown = revealMarkdown;
        return this;
    }
    public Boolean getRevealMarkdown() {
        return this.revealMarkdown;
    }

    public SubmitDigitalDocStructureJobAdvanceRequest setUseUrlResponseBody(Boolean useUrlResponseBody) {
        this.useUrlResponseBody = useUrlResponseBody;
        return this;
    }
    public Boolean getUseUrlResponseBody() {
        return this.useUrlResponseBody;
    }

}
