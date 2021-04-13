// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class NotifyMessageRepeaterRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("MessageBody")
    public String messageBody;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Driver")
    public String driver;

    public static NotifyMessageRepeaterRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyMessageRepeaterRequest self = new NotifyMessageRepeaterRequest();
        return TeaModel.build(map, self);
    }

    public NotifyMessageRepeaterRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public NotifyMessageRepeaterRequest setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

    public NotifyMessageRepeaterRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public NotifyMessageRepeaterRequest setDriver(String driver) {
        this.driver = driver;
        return this;
    }
    public String getDriver() {
        return this.driver;
    }

}
