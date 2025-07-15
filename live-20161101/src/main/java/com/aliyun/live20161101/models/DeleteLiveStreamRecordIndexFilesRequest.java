// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamRecordIndexFilesRequest extends TeaModel {
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
     * <p>The name of the main streaming domain.</p>
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
     * <p>The index file IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c4d7f0a4-b506-43f9-8de3-07732c3f****</p>
     */
    @NameInMap("RecordId")
    public java.util.List<String> recordId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to delete the corresponding file in Object Storage Service (OSS) synchronously. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The corresponding file in OSS is deleted.</li>
     * <li><strong>false</strong>: The corresponding file in OSS is not deleted.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RemoveFile")
    public String removeFile;

    /**
     * <p>The name of the live stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DeleteLiveStreamRecordIndexFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamRecordIndexFilesRequest self = new DeleteLiveStreamRecordIndexFilesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamRecordIndexFilesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteLiveStreamRecordIndexFilesRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteLiveStreamRecordIndexFilesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveStreamRecordIndexFilesRequest setRecordId(java.util.List<String> recordId) {
        this.recordId = recordId;
        return this;
    }
    public java.util.List<String> getRecordId() {
        return this.recordId;
    }

    public DeleteLiveStreamRecordIndexFilesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLiveStreamRecordIndexFilesRequest setRemoveFile(String removeFile) {
        this.removeFile = removeFile;
        return this;
    }
    public String getRemoveFile() {
        return this.removeFile;
    }

    public DeleteLiveStreamRecordIndexFilesRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
