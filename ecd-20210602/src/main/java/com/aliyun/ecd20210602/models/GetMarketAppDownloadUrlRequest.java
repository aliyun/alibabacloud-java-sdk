// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetMarketAppDownloadUrlRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("FileRealName")
    public String fileRealName;

    public static GetMarketAppDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMarketAppDownloadUrlRequest self = new GetMarketAppDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetMarketAppDownloadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetMarketAppDownloadUrlRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public GetMarketAppDownloadUrlRequest setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
        return this;
    }
    public String getFileRealName() {
        return this.fileRealName;
    }

}
