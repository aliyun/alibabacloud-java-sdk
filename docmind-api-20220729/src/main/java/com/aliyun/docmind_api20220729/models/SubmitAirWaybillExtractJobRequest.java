// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitAirWaybillExtractJobRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileNameExtension")
    public String fileNameExtension;

    @NameInMap("FileUrl")
    public String fileUrl;

    public static SubmitAirWaybillExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAirWaybillExtractJobRequest self = new SubmitAirWaybillExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAirWaybillExtractJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitAirWaybillExtractJobRequest setFileNameExtension(String fileNameExtension) {
        this.fileNameExtension = fileNameExtension;
        return this;
    }
    public String getFileNameExtension() {
        return this.fileNameExtension;
    }

    public SubmitAirWaybillExtractJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
