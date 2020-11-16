// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppRecordConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("OssEndpoint")
    @Validation(required = true)
    public String ossEndpoint;

    @NameInMap("OssBucket")
    @Validation(required = true)
    public String ossBucket;

    @NameInMap("RecordFormat")
    @Validation(required = true)
    public java.util.List<AddLiveAppRecordConfigRequestRecordFormat> recordFormat;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OnDemand")
    public Integer onDemand;

    public static AddLiveAppRecordConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAppRecordConfigRequest self = new AddLiveAppRecordConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveAppRecordConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddLiveAppRecordConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveAppRecordConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveAppRecordConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public AddLiveAppRecordConfigRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public AddLiveAppRecordConfigRequest setRecordFormat(java.util.List<AddLiveAppRecordConfigRequestRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public java.util.List<AddLiveAppRecordConfigRequestRecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public AddLiveAppRecordConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddLiveAppRecordConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
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

    public static class AddLiveAppRecordConfigRequestRecordFormat extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        public static AddLiveAppRecordConfigRequestRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            AddLiveAppRecordConfigRequestRecordFormat self = new AddLiveAppRecordConfigRequestRecordFormat();
            return TeaModel.build(map, self);
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

        public AddLiveAppRecordConfigRequestRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public AddLiveAppRecordConfigRequestRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

    }

}
