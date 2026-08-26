// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamRecordIndexFilesRequest extends TeaModel {
    /**
     * <p>The name of the application to which the stream belongs. The AppName must match the AppName in the ingest URL for the template to take effect. To match all AppName values, set this parameter to *.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The streamer streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time of the index file. TS files uploaded before this time are included in the index file. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to include the end time. If you set this parameter to true, the system attempts to include one additional TS file so that the created index file fully covers the period between StartTime and EndTime.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EndTimeIncluded")
    public Boolean endTimeIncluded;

    /**
     * <p>The name of the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveBucket****</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The endpoint of the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-oss-****.aliyuncs.com</p>
     */
    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    /**
     * <p>The name of the recording file stored in OSS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{AppName}/{StreamName}/{Date}/{Hour}/{Minute}_{Second}.m3u8</p>
     */
    @NameInMap("OssObject")
    public String ossObject;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The start time of the index file. TS files uploaded after this time are included in the index file. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The stream name. The StreamName must match the StreamName in the ingest URL for the template to take effect. To match all StreamName values, set this parameter to *.</p>
     * <p>The stream must have had actual stream ingest activity under the specified DomainName and AppName. Otherwise, the InvalidStream.NotFound error is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static CreateLiveStreamRecordIndexFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamRecordIndexFilesRequest self = new CreateLiveStreamRecordIndexFilesRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamRecordIndexFilesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateLiveStreamRecordIndexFilesRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateLiveStreamRecordIndexFilesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateLiveStreamRecordIndexFilesRequest setEndTimeIncluded(Boolean endTimeIncluded) {
        this.endTimeIncluded = endTimeIncluded;
        return this;
    }
    public Boolean getEndTimeIncluded() {
        return this.endTimeIncluded;
    }

    public CreateLiveStreamRecordIndexFilesRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public CreateLiveStreamRecordIndexFilesRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public CreateLiveStreamRecordIndexFilesRequest setOssObject(String ossObject) {
        this.ossObject = ossObject;
        return this;
    }
    public String getOssObject() {
        return this.ossObject;
    }

    public CreateLiveStreamRecordIndexFilesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLiveStreamRecordIndexFilesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateLiveStreamRecordIndexFilesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateLiveStreamRecordIndexFilesRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
