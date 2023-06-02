// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitCertificateOfOriginExtractJobAdvanceRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    public static SubmitCertificateOfOriginExtractJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCertificateOfOriginExtractJobAdvanceRequest self = new SubmitCertificateOfOriginExtractJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCertificateOfOriginExtractJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitCertificateOfOriginExtractJobAdvanceRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitCertificateOfOriginExtractJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

}
