// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteSnapshotFilesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("CreateTimestampList")
    public java.util.List<Long> createTimestampList;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RemoveFile")
    public Boolean removeFile;

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
