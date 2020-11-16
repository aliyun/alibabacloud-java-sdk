// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddTrancodeSEIRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("StreamName")
    @Validation(required = true)
    public String streamName;

    @NameInMap("Text")
    @Validation(required = true)
    public String text;

    @NameInMap("Pattern")
    @Validation(required = true)
    public String pattern;

    @NameInMap("Repeat")
    @Validation(required = true)
    public Integer repeat;

    @NameInMap("Delay")
    @Validation(required = true)
    public Integer delay;

    public static AddTrancodeSEIRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTrancodeSEIRequest self = new AddTrancodeSEIRequest();
        return TeaModel.build(map, self);
    }

    public AddTrancodeSEIRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddTrancodeSEIRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
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

    public AddTrancodeSEIRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public AddTrancodeSEIRequest setRepeat(Integer repeat) {
        this.repeat = repeat;
        return this;
    }
    public Integer getRepeat() {
        return this.repeat;
    }

    public AddTrancodeSEIRequest setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }
    public Integer getDelay() {
        return this.delay;
    }

}
