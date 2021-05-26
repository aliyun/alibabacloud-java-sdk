// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    @NameInMap("Sid")
    public String sid;

    @NameInMap("SenderId")
    public String senderId;

    @NameInMap("SenderType")
    public Integer senderType;

    @NameInMap("SenderName")
    public String senderName;

    @NameInMap("Head")
    public String head;

    @NameInMap("MsgType")
    public String msgType;

    @NameInMap("Content")
    public String content;

    @NameInMap("MsgKey")
    public String msgKey;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public SendMessageRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public SendMessageRequest setSenderType(Integer senderType) {
        this.senderType = senderType;
        return this;
    }
    public Integer getSenderType() {
        return this.senderType;
    }

    public SendMessageRequest setSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }
    public String getSenderName() {
        return this.senderName;
    }

    public SendMessageRequest setHead(String head) {
        this.head = head;
        return this;
    }
    public String getHead() {
        return this.head;
    }

    public SendMessageRequest setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }
    public String getMsgType() {
        return this.msgType;
    }

    public SendMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendMessageRequest setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

}
