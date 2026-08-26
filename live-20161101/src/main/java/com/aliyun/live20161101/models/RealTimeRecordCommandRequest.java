// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RealTimeRecordCommandRequest extends TeaModel {
    /**
     * <p>The name of the application to which the stream belongs. You can view the AppName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The operation action. Valid values:</p>
     * <ul>
     * <li><strong>start</strong>: forcibly starts recording. This must be called as the first operation and cannot be called again before stopping.</li>
     * <li><strong>stop</strong>: forcibly pauses recording. After the stream interruption delay (180 seconds by default) elapses, a recording is generated. This can only be called after start or restart. To generate the file immediately after calling stop, call cancel_delay.</li>
     * <li><strong>cancel_delay</strong>: immediately terminates the wait and generates a recording, completely stopping recording. This must be called after stop to generate the file in advance.</li>
     * <li><strong>restart</strong>: forcibly restarts recording. If recording is in progress before restart, a file is immediately generated. This can only be called when the task is in the started or stopped state.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The streamer\&quot;s streaming domain.</p>
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
     * <p>The stream name. Make sure that the StreamName is correct. You can view the StreamName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * <blockquote>
     * <p>This operation supports only single-stream operations and does not support wildcards.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static RealTimeRecordCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RealTimeRecordCommandRequest self = new RealTimeRecordCommandRequest();
        return TeaModel.build(map, self);
    }

    public RealTimeRecordCommandRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
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

    public RealTimeRecordCommandRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RealTimeRecordCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RealTimeRecordCommandRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
