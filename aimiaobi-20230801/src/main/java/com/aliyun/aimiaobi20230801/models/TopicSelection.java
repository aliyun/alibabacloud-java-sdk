// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class TopicSelection extends TeaModel {
    @NameInMap("Outlines")
    public java.util.List<TopicSelectionOutlines> outlines;

    @NameInMap("Point")
    public String point;

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
        @NameInMap("Outline")
        public String outline;

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
