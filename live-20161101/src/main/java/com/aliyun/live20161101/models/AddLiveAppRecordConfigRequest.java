// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppRecordConfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OnDemand")
    public Integer onDemand;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RecordFormat")
    public java.util.List<AddLiveAppRecordConfigRequestRecordFormat> recordFormat;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("TranscodeRecordFormat")
    public java.util.List<AddLiveAppRecordConfigRequestTranscodeRecordFormat> transcodeRecordFormat;

    @NameInMap("TranscodeTemplates")
    public java.util.List<String> transcodeTemplates;

    public static AddLiveAppRecordConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAppRecordConfigRequest self = new AddLiveAppRecordConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveAppRecordConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveAppRecordConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveAppRecordConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AddLiveAppRecordConfigRequest setOnDemand(Integer onDemand) {
        this.onDemand = onDemand;
        return this;
    }
    public Integer getOnDemand() {
        return this.onDemand;
    }

    public AddLiveAppRecordConfigRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public AddLiveAppRecordConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public AddLiveAppRecordConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveAppRecordConfigRequest setRecordFormat(java.util.List<AddLiveAppRecordConfigRequestRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public java.util.List<AddLiveAppRecordConfigRequestRecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public AddLiveAppRecordConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddLiveAppRecordConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddLiveAppRecordConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddLiveAppRecordConfigRequest setTranscodeRecordFormat(java.util.List<AddLiveAppRecordConfigRequestTranscodeRecordFormat> transcodeRecordFormat) {
        this.transcodeRecordFormat = transcodeRecordFormat;
        return this;
    }
    public java.util.List<AddLiveAppRecordConfigRequestTranscodeRecordFormat> getTranscodeRecordFormat() {
        return this.transcodeRecordFormat;
    }

    public AddLiveAppRecordConfigRequest setTranscodeTemplates(java.util.List<String> transcodeTemplates) {
        this.transcodeTemplates = transcodeTemplates;
        return this;
    }
    public java.util.List<String> getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    public static class AddLiveAppRecordConfigRequestRecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        @NameInMap("Format")
        public String format;

        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static AddLiveAppRecordConfigRequestRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            AddLiveAppRecordConfigRequestRecordFormat self = new AddLiveAppRecordConfigRequestRecordFormat();
            return TeaModel.build(map, self);
        }

        public AddLiveAppRecordConfigRequestRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public AddLiveAppRecordConfigRequestRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public AddLiveAppRecordConfigRequestRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public AddLiveAppRecordConfigRequestRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public AddLiveAppRecordConfigRequestRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

    public static class AddLiveAppRecordConfigRequestTranscodeRecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        @NameInMap("Format")
        public String format;

        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static AddLiveAppRecordConfigRequestTranscodeRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            AddLiveAppRecordConfigRequestTranscodeRecordFormat self = new AddLiveAppRecordConfigRequestTranscodeRecordFormat();
            return TeaModel.build(map, self);
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public AddLiveAppRecordConfigRequestTranscodeRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

}
