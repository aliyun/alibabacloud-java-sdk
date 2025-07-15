// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEdgeTranscodeTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the edge transcoding template.</p>
     */
    @NameInMap("Template")
    public GetEdgeTranscodeTemplateResponseBodyTemplate template;

    public static GetEdgeTranscodeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeTranscodeTemplateResponseBody self = new GetEdgeTranscodeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeTranscodeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeTranscodeTemplateResponseBody setTemplate(GetEdgeTranscodeTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public GetEdgeTranscodeTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class GetEdgeTranscodeTemplateResponseBodyTemplate extends TeaModel {
        /**
         * <p>The bitrate. If a numeric value is returned, a fixed bitrate is configured for the output stream. If ws is returned, the output stream maintains the same bitrate as the input stream.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The video encoding format. Valid values:</p>
         * <ul>
         * <li>H.264</li>
         * <li>H.265</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-25T02:48:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The frame rate. If a numeric value is returned, a fixed frame rate is configured for the output stream. If ws is returned, the output stream maintains the same frame rate as the input stream.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The group of pictures (GOP) size. The GOP size can be defined by the number of frames or the time interval between I-frames. If ws is returned, the output stream maintains the same GOP size as the input stream.</p>
         * 
         * <strong>example:</strong>
         * <p>2s</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>my_template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The resolution. If width and height values are returned, a fixed resolution is configured for the output stream. If ws is returned, the output stream maintains the same resolution as the input stream.</p>
         * <blockquote>
         * <p> If the width value is -1, the width of the output stream is adapted to the height. If the height value is -2, the height of the output stream is adapted to the width.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1920*1080</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9b1571b513cb44f7a1ba6ae561ff****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The type of edge transcoding.</p>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetEdgeTranscodeTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeTranscodeTemplateResponseBodyTemplate self = new GetEdgeTranscodeTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public GetEdgeTranscodeTemplateResponseBodyTemplate setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetEdgeTranscodeTemplateResponseBodyTemplate setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetEdgeTranscodeTemplateResponseBodyTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEdgeTranscodeTemplateResponseBodyTemplate setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetEdgeTranscodeTemplateResponseBodyTemplate setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public GetEdgeTranscodeTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEdgeTranscodeTemplateResponseBodyTemplate setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetEdgeTranscodeTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetEdgeTranscodeTemplateResponseBodyTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
