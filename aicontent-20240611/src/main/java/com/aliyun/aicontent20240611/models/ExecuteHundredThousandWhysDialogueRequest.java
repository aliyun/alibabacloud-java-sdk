// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteHundredThousandWhysDialogueRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CHILDREN</p>
     */
    @NameInMap("ageGroup")
    public String ageGroup;

    /**
     * <strong>example:</strong>
     * <p>2f28670c-eba6-4afb-9610-0942c434a021</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>700d4d9411efbe6e0</p>
     */
    @NameInMap("deviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00:1A:2B:3C:4D:5E</p>
     */
    @NameInMap("macAddress")
    public String macAddress;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<ExecuteHundredThousandWhysDialogueRequestMessages> messages;

    public static ExecuteHundredThousandWhysDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteHundredThousandWhysDialogueRequest self = new ExecuteHundredThousandWhysDialogueRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteHundredThousandWhysDialogueRequest setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
        return this;
    }
    public String getAgeGroup() {
        return this.ageGroup;
    }

    public ExecuteHundredThousandWhysDialogueRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ExecuteHundredThousandWhysDialogueRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ExecuteHundredThousandWhysDialogueRequest setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public ExecuteHundredThousandWhysDialogueRequest setMessages(java.util.List<ExecuteHundredThousandWhysDialogueRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<ExecuteHundredThousandWhysDialogueRequestMessages> getMessages() {
        return this.messages;
    }

    public static class ExecuteHundredThousandWhysDialogueRequestMessages extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static ExecuteHundredThousandWhysDialogueRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            ExecuteHundredThousandWhysDialogueRequestMessages self = new ExecuteHundredThousandWhysDialogueRequestMessages();
            return TeaModel.build(map, self);
        }

        public ExecuteHundredThousandWhysDialogueRequestMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExecuteHundredThousandWhysDialogueRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
