// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaInfosRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the physical file of the media asset.</p>
     * <p>If the media asset is stored in your own OSS bucket, you must authorize the service role AliyunICEDefaultRole in advance. For more information&lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/zh/ims/user-guide/record?spm=a2c4g.11186623.0.i8#0737d9c437bmn">Authorize IMS to delete recording files in OSS</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletePhysicalFiles")
    public Boolean deletePhysicalFiles;

    /**
     * <p>The URL of the media asset that you want to delete. The file corresponding to the URL must be registered with IMS. Separate multiple URLs with commas (,). The following two formats are supported:</p>
     * <ol>
     * <li>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?</li>
     * <li>OSS://example-bucket/example.mp4?\
     * In this format, it is considered by default that the region of the OSS bucket in which the media asset resides is the same as the region in which IMS is activated.</li>
     * </ol>
     */
    @NameInMap("InputURLs")
    public String inputURLs;

    /**
     * <p>The ID of the media asset that you want to delete from Intelligent Media Services (IMS).</p>
     * <ul>
     * <li>Separate multiple IDs with commas (,).</li>
     * </ul>
     * <p>If you leave MediaIds empty, you must specify InputURLs.</p>
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
