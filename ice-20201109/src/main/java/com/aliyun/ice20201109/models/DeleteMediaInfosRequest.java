// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaInfosRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the physical files of the media assets. If the storage address of a media asset is a user-owned OSS bucket, you must authorize the AliyunICEDefaultRole service role in advance&lt;props=&quot;china&quot;&gt;. For more information, see <a href="https://www.alibabacloud.com/help/en/ims/user-guide/record#0737d9c437bmn">Delete recorded files (OSS authorization management)</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletePhysicalFiles")
    public Boolean deletePhysicalFiles;

    /**
     * <p>The URLs of the media assets to be deleted in the corresponding system. The files corresponding to the URLs must be registered in IMS first. Separate multiple URLs with commas (,). Two formats are supported: 1. http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4? 2. OSS://example-bucket/example.mp4? In the second format, the default OSS region is the same as the service registration area.</p>
     * 
     * <strong>example:</strong>
     * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?</p>
     */
    @NameInMap("InputURLs")
    public String inputURLs;

    /**
     * <p>The IMS media asset IDs. Separate multiple IDs with commas (,). If the MediaIds parameter is empty, the InputURLs parameter must not be empty.</p>
     * 
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
