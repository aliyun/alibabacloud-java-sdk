// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeletePlayInfoRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the physical file of the media stream.</p>
     * <p>If the media asset is stored in your own Object Storage Service (OSS) bucket, you must authorize the service role AliyunICEDefaultRole in advance. &lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/449331.html#p-ko2-wc7-iad">Authorize IMS to delete recording files in OSS</a>.</p>
     * <p>You can delete only the physical files of transcoded streams, but not the physical files of source files.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletePhysicalFiles")
    public Boolean deletePhysicalFiles;

    /**
     * <p>The URL of the media stream file that you want to delete. Separate multiple URLs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ice-test001.oss-cn-shanghai.aliyuncs.com/%E6%8E%A5%E5%8F%A3%E6%B5%8B%E8%AF%95/%E5%B0%8F%E7%8C%AA%E4%BD%A9%E5%A5%87640*360.mp4">https://ice-test001.oss-cn-shanghai.aliyuncs.com/%E6%8E%A5%E5%8F%A3%E6%B5%8B%E8%AF%95/%E5%B0%8F%E7%8C%AA%E4%BD%A9%E5%A5%87640*360.mp4</a></p>
     */
    @NameInMap("FileURLs")
    public String fileURLs;

    /**
     * <p>The ID of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>1d3518e0027d71ed80cd909598416303</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    public static DeletePlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePlayInfoRequest self = new DeletePlayInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeletePlayInfoRequest setDeletePhysicalFiles(Boolean deletePhysicalFiles) {
        this.deletePhysicalFiles = deletePhysicalFiles;
        return this;
    }
    public Boolean getDeletePhysicalFiles() {
        return this.deletePhysicalFiles;
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
