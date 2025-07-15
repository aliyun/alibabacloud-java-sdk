// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEdgeTranscodeTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the edge transcoding templates.</p>
     */
    @NameInMap("TemplateList")
    public ListEdgeTranscodeTemplateResponseBodyTemplateList templateList;

    /**
     * <p>The total number of templates returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEdgeTranscodeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeTranscodeTemplateResponseBody self = new ListEdgeTranscodeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeTranscodeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeTranscodeTemplateResponseBody setTemplateList(ListEdgeTranscodeTemplateResponseBodyTemplateList templateList) {
        this.templateList = templateList;
        return this;
    }
    public ListEdgeTranscodeTemplateResponseBodyTemplateList getTemplateList() {
        return this.templateList;
    }

    public ListEdgeTranscodeTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate extends TeaModel {
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
         * <p>The time when the image template was created.</p>
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
         * <p> If the width value is -1, the width of the output video is adapted to a fixed height. If the height value is -2, the height of the output video is adapted to a fixed width.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1920*1080</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The ID of the edge transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>9b1571b513cb44f7a1ba6ae561ff46f7</p>
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

        public static ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate self = new ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate();
            return TeaModel.build(map, self);
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListEdgeTranscodeTemplateResponseBodyTemplateList extends TeaModel {
        @NameInMap("Template")
        public java.util.List<ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate> template;

        public static ListEdgeTranscodeTemplateResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeTranscodeTemplateResponseBodyTemplateList self = new ListEdgeTranscodeTemplateResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public ListEdgeTranscodeTemplateResponseBodyTemplateList setTemplate(java.util.List<ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<ListEdgeTranscodeTemplateResponseBodyTemplateListTemplate> getTemplate() {
            return this.template;
        }

    }

}
