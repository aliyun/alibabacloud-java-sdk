// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetChatContentResponseBody extends TeaModel {
    /**
     * <p>The category of the message, which helps parse the <code>content</code> field when it is a JSON object. For example,<code>PLAN</code> indicates that the message is an execution plan and conforms to the execution plan schema.</p>
     * 
     * <strong>example:</strong>
     * <p>PLAN</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The checkpoint value.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("checkpoint")
    public Long checkpoint;

    /**
     * <p>The message content.</p>
     * 
     * <strong>example:</strong>
     * <p>Data understanding completed.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The type of the content field. Valid values: <code>[str, json]</code>. If the value is <code>json</code>, the content field can be parsed as a JSON object.</p>
     * 
     * <strong>example:</strong>
     * <p>str</p>
     */
    @NameInMap("content_type")
    public String contentType;

    /**
     * <p>The message type, which distinguishes control signals from message data. For example,<code>CHAT_START</code> indicates the start of an agent\&quot;s reply,<code>CHAT_FINISH</code> indicates the end of the reply,<code>DATA</code> indicates a message that contains content, and<code>DELTA</code> indicates a part of an incremental output.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA</p>
     */
    @NameInMap("event_type")
    public String eventType;

    /**
     * <p>The output level of the message. A higher value indicates greater importance.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("level")
    public Long level;

    @NameInMap("timestamp")
    public String timestamp;

    public static GetChatContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatContentResponseBody self = new GetChatContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatContentResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetChatContentResponseBody setCheckpoint(Long checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public Long getCheckpoint() {
        return this.checkpoint;
    }

    public GetChatContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetChatContentResponseBody setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public GetChatContentResponseBody setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public GetChatContentResponseBody setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public GetChatContentResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
