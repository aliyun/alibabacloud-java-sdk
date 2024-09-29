// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class InteractTextResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("end")
    public Boolean end;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("index")
    public Integer index;

    @NameInMap("message")
    public String message;

    @NameInMap("relatedImages")
    public java.util.List<String> relatedImages;

    @NameInMap("relatedVideos")
    public java.util.List<String> relatedVideos;

    /**
     * <strong>example:</strong>
     * <p>79e954faffe2415ebd18188ba787d78e</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("type")
    public Integer type;

    public static InteractTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InteractTextResponseBody self = new InteractTextResponseBody();
        return TeaModel.build(map, self);
    }

    public InteractTextResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public InteractTextResponseBody setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public InteractTextResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InteractTextResponseBody setRelatedImages(java.util.List<String> relatedImages) {
        this.relatedImages = relatedImages;
        return this;
    }
    public java.util.List<String> getRelatedImages() {
        return this.relatedImages;
    }

    public InteractTextResponseBody setRelatedVideos(java.util.List<String> relatedVideos) {
        this.relatedVideos = relatedVideos;
        return this;
    }
    public java.util.List<String> getRelatedVideos() {
        return this.relatedVideos;
    }

    public InteractTextResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public InteractTextResponseBody setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
