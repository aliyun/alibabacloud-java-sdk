// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RealTimeRecordCommandRequest extends TeaModel {
    @NameInMap("Command")
    @Validation(required = true)
    public String command;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("StreamName")
    @Validation(required = true)
    public String streamName;

    public static RealTimeRecordCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RealTimeRecordCommandRequest self = new RealTimeRecordCommandRequest();
        return TeaModel.build(map, self);
    }

    public RealTimeRecordCommandRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public RealTimeRecordCommandRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RealTimeRecordCommandRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RealTimeRecordCommandRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
