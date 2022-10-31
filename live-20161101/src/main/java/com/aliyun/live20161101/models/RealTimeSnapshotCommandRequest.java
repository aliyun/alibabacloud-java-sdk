// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RealTimeSnapshotCommandRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Command")
    public String command;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("Mode")
    public Integer mode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Source")
    public Integer source;

    @NameInMap("StreamName")
    public String streamName;

    public static RealTimeSnapshotCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RealTimeSnapshotCommandRequest self = new RealTimeSnapshotCommandRequest();
        return TeaModel.build(map, self);
    }

    public RealTimeSnapshotCommandRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RealTimeSnapshotCommandRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public RealTimeSnapshotCommandRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RealTimeSnapshotCommandRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public RealTimeSnapshotCommandRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public RealTimeSnapshotCommandRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RealTimeSnapshotCommandRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public RealTimeSnapshotCommandRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
