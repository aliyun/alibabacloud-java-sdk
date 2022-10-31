// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamRecordIndexFilesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RecordId")
    public java.util.List<String> recordId;

    @NameInMap("RemoveFile")
    public String removeFile;

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
