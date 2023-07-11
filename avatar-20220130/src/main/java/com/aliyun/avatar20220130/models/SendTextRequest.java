// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendTextRequest extends TeaModel {
    @NameInMap("Feedback")
    public Boolean feedback;

    @NameInMap("Interrupt")
    public Boolean interrupt;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("StreamExtension")
    public SendTextRequestStreamExtension streamExtension;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Text")
    public String text;

    @NameInMap("UniqueCode")
    public String uniqueCode;

    public static SendTextRequest build(java.util.Map<String, ?> map) throws Exception {
        SendTextRequest self = new SendTextRequest();
        return TeaModel.build(map, self);
    }

    public SendTextRequest setFeedback(Boolean feedback) {
        this.feedback = feedback;
        return this;
    }
    public Boolean getFeedback() {
        return this.feedback;
    }

    public SendTextRequest setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public SendTextRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendTextRequest setStreamExtension(SendTextRequestStreamExtension streamExtension) {
        this.streamExtension = streamExtension;
        return this;
    }
    public SendTextRequestStreamExtension getStreamExtension() {
        return this.streamExtension;
    }

    public SendTextRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SendTextRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SendTextRequest setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
        return this;
    }
    public String getUniqueCode() {
        return this.uniqueCode;
    }

    public static class SendTextRequestStreamExtension extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("IsStream")
        public Boolean isStream;

        @NameInMap("Position")
        public String position;

        public static SendTextRequestStreamExtension build(java.util.Map<String, ?> map) throws Exception {
            SendTextRequestStreamExtension self = new SendTextRequestStreamExtension();
            return TeaModel.build(map, self);
        }

        public SendTextRequestStreamExtension setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public SendTextRequestStreamExtension setIsStream(Boolean isStream) {
            this.isStream = isStream;
            return this;
        }
        public Boolean getIsStream() {
            return this.isStream;
        }

        public SendTextRequestStreamExtension setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

}
