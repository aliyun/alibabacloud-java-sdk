// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaInfosRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletePhysicalFiles")
    public Boolean deletePhysicalFiles;

    @NameInMap("InputURLs")
    public String inputURLs;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong>,<strong><strong>15d4a4b0448391508f2cb486</strong></strong></p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    public static DeleteMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaInfosRequest self = new DeleteMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaInfosRequest setDeletePhysicalFiles(Boolean deletePhysicalFiles) {
        this.deletePhysicalFiles = deletePhysicalFiles;
        return this;
    }
    public Boolean getDeletePhysicalFiles() {
        return this.deletePhysicalFiles;
    }

    public DeleteMediaInfosRequest setInputURLs(String inputURLs) {
        this.inputURLs = inputURLs;
        return this;
    }
    public String getInputURLs() {
        return this.inputURLs;
    }

    public DeleteMediaInfosRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
