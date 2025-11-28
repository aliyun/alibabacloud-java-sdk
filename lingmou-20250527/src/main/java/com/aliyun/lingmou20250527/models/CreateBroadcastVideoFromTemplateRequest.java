// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBroadcastVideoFromTemplateRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>BS1b2WNnRMu4ouRzT4clY9Jhg</p>
     */
    @NameInMap("templateId")
    public String templateId;

    @NameInMap("variables")
    public java.util.List<TemplateVariable> variables;

    @NameInMap("videoOptions")
    public CreateBroadcastVideoFromTemplateRequestVideoOptions videoOptions;

    public static CreateBroadcastVideoFromTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBroadcastVideoFromTemplateRequest self = new CreateBroadcastVideoFromTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateBroadcastVideoFromTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBroadcastVideoFromTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateBroadcastVideoFromTemplateRequest setVariables(java.util.List<TemplateVariable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<TemplateVariable> getVariables() {
        return this.variables;
    }

    public CreateBroadcastVideoFromTemplateRequest setVideoOptions(CreateBroadcastVideoFromTemplateRequestVideoOptions videoOptions) {
        this.videoOptions = videoOptions;
        return this;
    }
    public CreateBroadcastVideoFromTemplateRequestVideoOptions getVideoOptions() {
        return this.videoOptions;
    }

    public static class CreateBroadcastVideoFromTemplateRequestVideoOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("fps")
        public Integer fps;

        /**
         * <strong>example:</strong>
         * <p>720p</p>
         */
        @NameInMap("resolution")
        public String resolution;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("watermark")
        public Boolean watermark;

        public static CreateBroadcastVideoFromTemplateRequestVideoOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateBroadcastVideoFromTemplateRequestVideoOptions self = new CreateBroadcastVideoFromTemplateRequestVideoOptions();
            return TeaModel.build(map, self);
        }

        public CreateBroadcastVideoFromTemplateRequestVideoOptions setFps(Integer fps) {
            this.fps = fps;
            return this;
        }
        public Integer getFps() {
            return this.fps;
        }

        public CreateBroadcastVideoFromTemplateRequestVideoOptions setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public CreateBroadcastVideoFromTemplateRequestVideoOptions setWatermark(Boolean watermark) {
            this.watermark = watermark;
            return this;
        }
        public Boolean getWatermark() {
            return this.watermark;
        }

    }

}
