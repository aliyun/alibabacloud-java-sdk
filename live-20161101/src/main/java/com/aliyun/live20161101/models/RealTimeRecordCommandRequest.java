// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RealTimeRecordCommandRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The action to be performed. Valid values:</p>
     * <ul>
     * <li><strong>start</strong>: forcibly starts recording.</li>
     * <li><strong>stop</strong>: forcibly stops recording. If the live stream is interrupted for longer than a specific latency, a recording is generated.</li>
     * <li><strong>cancel_delay</strong>: resets the latency for stream interruption and completely stops recording. If the recording task is stopped when you perform this action, a recording is generated.</li>
     * <li><strong>restart</strong>: forcibly restarts recording. If the live stream is being recorded when you perform this action, a recording is generated.</li>
     * </ul>
     * <blockquote>
     * <p> <strong>stop</strong> forcibly stops recording. By default, a recording is generated after 180 seconds. <strong>cancel_delay</strong> resets the latency for stream interruption from 180 seconds to 0 seconds. This means that a recording is generated immediately.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("Command")
    public String command;

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
     * <p>The name of the live stream. Make sure that you specify the correct stream name. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
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
