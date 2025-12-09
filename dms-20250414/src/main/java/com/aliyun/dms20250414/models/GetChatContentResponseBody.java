// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetChatContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PLAN</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("checkpoint")
    public Long checkpoint;

    /**
     * <strong>example:</strong>
     * <p>Data understanding completed.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>str</p>
     */
    @NameInMap("content_type")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>DATA</p>
     */
    @NameInMap("event_type")
    public String eventType;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("level")
    public Long level;

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

}
