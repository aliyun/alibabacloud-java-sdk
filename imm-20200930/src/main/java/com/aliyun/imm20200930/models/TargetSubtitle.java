// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetSubtitle extends TeaModel {
    @NameInMap("DisableSubtitle")
    public Boolean disableSubtitle;

    @NameInMap("ExtractSubtitle")
    public TargetSubtitleExtractSubtitle extractSubtitle;

    @NameInMap("Stream")
    public java.util.List<Integer> stream;

    public static TargetSubtitle build(java.util.Map<String, ?> map) throws Exception {
        TargetSubtitle self = new TargetSubtitle();
        return TeaModel.build(map, self);
    }

    public TargetSubtitle setDisableSubtitle(Boolean disableSubtitle) {
        this.disableSubtitle = disableSubtitle;
        return this;
    }
    public Boolean getDisableSubtitle() {
        return this.disableSubtitle;
    }

    public TargetSubtitle setExtractSubtitle(TargetSubtitleExtractSubtitle extractSubtitle) {
        this.extractSubtitle = extractSubtitle;
        return this;
    }
    public TargetSubtitleExtractSubtitle getExtractSubtitle() {
        return this.extractSubtitle;
    }

    public TargetSubtitle setStream(java.util.List<Integer> stream) {
        this.stream = stream;
        return this;
    }
    public java.util.List<Integer> getStream() {
        return this.stream;
    }

    public static class TargetSubtitleExtractSubtitle extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("URI")
        public String URI;

        public static TargetSubtitleExtractSubtitle build(java.util.Map<String, ?> map) throws Exception {
            TargetSubtitleExtractSubtitle self = new TargetSubtitleExtractSubtitle();
            return TeaModel.build(map, self);
        }

        public TargetSubtitleExtractSubtitle setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public TargetSubtitleExtractSubtitle setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
