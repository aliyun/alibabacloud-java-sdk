// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class TopicSelection extends TeaModel {
    /**
     * <p>A list of topic outlines.</p>
     */
    @NameInMap("Outlines")
    public java.util.List<TopicSelectionOutlines> outlines;

    /**
     * <p>The perspective of the topic.</p>
     * 
     * <strong>example:</strong>
     * <p>选题视角</p>
     */
    @NameInMap("Point")
    public String point;

    /**
     * <p>The summary of the topic.</p>
     * 
     * <strong>example:</strong>
     * <p>摘要</p>
     */
    @NameInMap("Summary")
    public String summary;

    public static TopicSelection build(java.util.Map<String, ?> map) throws Exception {
        TopicSelection self = new TopicSelection();
        return TeaModel.build(map, self);
    }

    public TopicSelection setOutlines(java.util.List<TopicSelectionOutlines> outlines) {
        this.outlines = outlines;
        return this;
    }
    public java.util.List<TopicSelectionOutlines> getOutlines() {
        return this.outlines;
    }

    public TopicSelection setPoint(String point) {
        this.point = point;
        return this;
    }
    public String getPoint() {
        return this.point;
    }

    public TopicSelection setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public static class TopicSelectionOutlines extends TeaModel {
        /**
         * <p>The topic outline.</p>
         * 
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <p>The summary of the outline.</p>
         * 
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static TopicSelectionOutlines build(java.util.Map<String, ?> map) throws Exception {
            TopicSelectionOutlines self = new TopicSelectionOutlines();
            return TeaModel.build(map, self);
        }

        public TopicSelectionOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public TopicSelectionOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

}
