// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddTrancodeSEIRequest extends TeaModel {
    /**
     * <p>The AppName of the live stream. View AppNames on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The delay in milliseconds before the SEI is inserted after the command is received.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Delay")
    public Integer delay;

    /**
     * <p>The streaming domain.</p>
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
     * <p>Specifies the insertion pattern for the SEI.</p>
     * <ul>
     * <li><p><strong>keyframe</strong>: Inserts at every keyframe.</p>
     * </li>
     * <li><p><strong>frame</strong>: Inserts at every single frame.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>keyframe</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of times to repeat the insertion. A value of -1 means infinite repetitions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Repeat")
    public Integer repeat;

    /**
     * <p>The name of the live stream.</p>
     * <blockquote>
     * <p>It must be the name of the source stream. This ensures that SEI is inserted into all transcoded streams.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The SEI text. Length limit: 4000 bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveSei****</p>
     */
    @NameInMap("Text")
    public String text;

    public static AddTrancodeSEIRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTrancodeSEIRequest self = new AddTrancodeSEIRequest();
        return TeaModel.build(map, self);
    }

    public AddTrancodeSEIRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddTrancodeSEIRequest setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }
    public Integer getDelay() {
        return this.delay;
    }

    public AddTrancodeSEIRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddTrancodeSEIRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddTrancodeSEIRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public AddTrancodeSEIRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddTrancodeSEIRequest setRepeat(Integer repeat) {
        this.repeat = repeat;
        return this;
    }
    public Integer getRepeat() {
        return this.repeat;
    }

    public AddTrancodeSEIRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddTrancodeSEIRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
