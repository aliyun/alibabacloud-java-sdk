// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteSnapshotFilesRequest extends TeaModel {
    /**
     * <p>The AppName of the live stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>A list of timestamps of the snapshots to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1653641526637</p>
     */
    @NameInMap("CreateTimestampList")
    public java.util.List<Long> createTimestampList;

    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to also delete the snapshot files from OSS. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Deletes.</p>
     * </li>
     * <li><p><strong>false</strong>: Does not delete.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To delete files from OSS, you must have the required permissions for OSS file operations.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RemoveFile")
    public Boolean removeFile;

    /**
     * <p>The stream name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DeleteSnapshotFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotFilesRequest self = new DeleteSnapshotFilesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotFilesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteSnapshotFilesRequest setCreateTimestampList(java.util.List<Long> createTimestampList) {
        this.createTimestampList = createTimestampList;
        return this;
    }
    public java.util.List<Long> getCreateTimestampList() {
        return this.createTimestampList;
    }

    public DeleteSnapshotFilesRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteSnapshotFilesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSnapshotFilesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSnapshotFilesRequest setRemoveFile(Boolean removeFile) {
        this.removeFile = removeFile;
        return this;
    }
    public Boolean getRemoveFile() {
        return this.removeFile;
    }

    public DeleteSnapshotFilesRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
