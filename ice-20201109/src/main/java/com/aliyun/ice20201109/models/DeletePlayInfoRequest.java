// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeletePlayInfoRequest extends TeaModel {
    @NameInMap("FileURLs")
    public String fileURLs;

    @NameInMap("MediaId")
    public String mediaId;

    public static DeletePlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePlayInfoRequest self = new DeletePlayInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeletePlayInfoRequest setFileURLs(String fileURLs) {
        this.fileURLs = fileURLs;
        return this;
    }
    public String getFileURLs() {
        return this.fileURLs;
    }

    public DeletePlayInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
