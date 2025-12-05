// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateParamsResponseBody extends TeaModel {
    /**
     * <p>The queried parameters.</p>
     */
    @NameInMap("ParamList")
    public java.util.List<GetTemplateParamsResponseBodyParamList> paramList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>419c8741c1b4325f035b</strong></strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetTemplateParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParamsResponseBody self = new GetTemplateParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateParamsResponseBody setParamList(java.util.List<GetTemplateParamsResponseBodyParamList> paramList) {
        this.paramList = paramList;
        return this;
    }
    public java.util.List<GetTemplateParamsResponseBodyParamList> getParamList() {
        return this.paramList;
    }

    public GetTemplateParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateParamsResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class GetTemplateParamsResponseBodyParamList extends TeaModel {
        /**
         * <p>The original subtitle content.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The thumbnail URL of the original material.</p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>video1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The URL of the original material.</p>
         */
        @NameInMap("MediaUrl")
        public String mediaUrl;

        @NameInMap("TimelineIn")
        public Float timelineIn;

        @NameInMap("TimelineOut")
        public Float timelineOut;

        /**
         * <p>The material type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Video</li>
         * <li>Text</li>
         * <li>Image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static GetTemplateParamsResponseBodyParamList build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateParamsResponseBodyParamList self = new GetTemplateParamsResponseBodyParamList();
            return TeaModel.build(map, self);
        }

        public GetTemplateParamsResponseBodyParamList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTemplateParamsResponseBodyParamList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public GetTemplateParamsResponseBodyParamList setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetTemplateParamsResponseBodyParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTemplateParamsResponseBodyParamList setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            return this;
        }
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        public GetTemplateParamsResponseBodyParamList setTimelineIn(Float timelineIn) {
            this.timelineIn = timelineIn;
            return this;
        }
        public Float getTimelineIn() {
            return this.timelineIn;
        }

        public GetTemplateParamsResponseBodyParamList setTimelineOut(Float timelineOut) {
            this.timelineOut = timelineOut;
            return this;
        }
        public Float getTimelineOut() {
            return this.timelineOut;
        }

        public GetTemplateParamsResponseBodyParamList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTemplateParamsResponseBodyParamList setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public GetTemplateParamsResponseBodyParamList setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public GetTemplateParamsResponseBodyParamList setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

}
