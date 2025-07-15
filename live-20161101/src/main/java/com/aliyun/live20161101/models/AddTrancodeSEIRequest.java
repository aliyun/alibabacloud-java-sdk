// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddTrancodeSEIRequest extends TeaModel {
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
     * <p>The time period after which the SEI is inserted after the request is received. Unit: milliseconds.</p>
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
     * <p>Specifies whether to append the SEI to each keyframe or frame. Valid values:</p>
     * <ul>
     * <li><strong>keyframe</strong></li>
     * <li><strong>frame</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>keyframe</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of times that the SEI is repeatedly inserted. A value of -1 specifies infinite times.</p>
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
     * <p> The value of this parameter must be the name of the source stream. This way, the SEI is inserted to all the transcoded streams.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The SEI text. It can be up to 4,000 bytes in length.</p>
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
