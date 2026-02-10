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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Name")
        public String name;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("TemplateId")
        public String templateId;

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
