// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaListByURLRequest extends TeaModel {
    /**
     * <p>The OSS URLs of the media files. To obtain the OSS URL of a media file, you can perform the following operations in the ApsaraVideo Media Processing (MPS) console: In the left-side navigation pane, choose <strong>Media Management</strong> &gt; <strong>Media List</strong>. Find the media file whose OSS URL you want to view and click <strong>Manage</strong> in the <strong>Actions</strong> column. The OSS URL of the media file is displayed on the <strong>Obtain Encoding URL</strong> tab. Separate multiple URLs with commas (,). You can query up to 10 media files at a time.</p>
     * <ul>
     * <li>The URL complies with RFC 3986 and is encoded in UTF-8, with reserved characters being percent-encoded. The value can be up to 3,200 bytes in size. For more information, see <a href="https://help.aliyun.com/document_detail/423796.html">URL encoding</a>.</li>
     * <li>Only OSS HTTP URLs are supported. Alibaba Cloud CDN URLs and HTTPS URLs are not supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("FileURLs")
    public String fileURLs;

    /**
     * <p>Specifies whether to include media information in the returned result.</p>
     * <ul>
     * <li><p>Valid values: true and false.</p>
     * </li>
     * <li><p>Default value: <strong>false</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To obtain detailed information about the media files, set this parameter to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeMediaInfo")
    public Boolean includeMediaInfo;

    /**
     * <p>Specifies whether to include playback information in the returned result.</p>
     * <ul>
     * <li>Valid values: true and false.</li>
     * <li>Default value: <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludePlayList")
    public Boolean includePlayList;

    /**
     * <p>Specifies whether to include snapshot information in the returned result.</p>
     * <ul>
     * <li>Valid values: true and false.</li>
     * <li>Default value: <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeSnapshotList")
    public Boolean includeSnapshotList;

    /**
     * <p>Specifies whether to include summaries in the returned result.</p>
     * <ul>
     * <li>Valid values: true and false.</li>
     * <li>Default value: <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeSummaryList")
    public Boolean includeSummaryList;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryMediaListByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaListByURLRequest self = new QueryMediaListByURLRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaListByURLRequest setFileURLs(String fileURLs) {
        this.fileURLs = fileURLs;
        return this;
    }
    public String getFileURLs() {
        return this.fileURLs;
    }

    public QueryMediaListByURLRequest setIncludeMediaInfo(Boolean includeMediaInfo) {
        this.includeMediaInfo = includeMediaInfo;
        return this;
    }
    public Boolean getIncludeMediaInfo() {
        return this.includeMediaInfo;
    }

    public QueryMediaListByURLRequest setIncludePlayList(Boolean includePlayList) {
        this.includePlayList = includePlayList;
        return this;
    }
    public Boolean getIncludePlayList() {
        return this.includePlayList;
    }

    public QueryMediaListByURLRequest setIncludeSnapshotList(Boolean includeSnapshotList) {
        this.includeSnapshotList = includeSnapshotList;
        return this;
    }
    public Boolean getIncludeSnapshotList() {
        return this.includeSnapshotList;
    }

    public QueryMediaListByURLRequest setIncludeSummaryList(Boolean includeSummaryList) {
        this.includeSummaryList = includeSummaryList;
        return this;
    }
    public Boolean getIncludeSummaryList() {
        return this.includeSummaryList;
    }

    public QueryMediaListByURLRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryMediaListByURLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaListByURLRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaListByURLRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
