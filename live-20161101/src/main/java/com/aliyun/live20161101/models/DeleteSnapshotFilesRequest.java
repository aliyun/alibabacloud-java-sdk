// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteSnapshotFilesRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The timestamps when the snapshots that you want to delete were captured.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1653641526637</p>
     */
    @NameInMap("CreateTimestampList")
    public java.util.List<Long> createTimestampList;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to also delete the corresponding file in Object Storage Service (OSS) at the same time. Value values:</p>
     * <ul>
     * <li><strong>true</strong>: deletes the corresponding file in OSS.</li>
     * <li><strong>false</strong>: does not delete the corresponding file in OSS.</li>
     * </ul>
     * <blockquote>
     * <p> To delete the corresponding file in OSS, you must have the permissions on the OSS bucket.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RemoveFile")
    public Boolean removeFile;

    /**
     * <p>The name of the live stream.</p>
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
