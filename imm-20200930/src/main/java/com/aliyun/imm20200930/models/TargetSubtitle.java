// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetSubtitle extends TeaModel {
    /**
     * <p>Specifies whether to disable subtitle generation. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * <blockquote>
     * <p> If you call the GenerateVideoPlaylist operation and subtitles are required, you must set this parameter to false.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableSubtitle")
    public Boolean disableSubtitle;

    /**
     * <p>The subtitle extraction settings.</p>
     * <blockquote>
     * <p> The GenerateVideoPlaylist operation does not support this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ExtractSubtitle")
    public TargetSubtitleExtractSubtitle extractSubtitle;

    /**
     * <p>The index numbers of subtitle streams that need to be processed. If you set this parameter to null (default) or a value greater than 100, all subtitle streams are processed.</p>
     * <ul>
     * <li>For example, you can set the parameter to <code>[0,1]</code> to process subtitle streams with index numbers 0 and 1, <code>[1]</code> to process only the subtitle stream with the index number 1, and <code>[101]</code> to process all subtitle streams.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify an index number but no subtitle stream with the index number is found, the index number is ignored.</p>
     * </blockquote>
     */
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
        /**
         * <p>The format of the extracted subtitle file. Valid values:</p>
         * <ul>
         * <li>ass</li>
         * <li>srt</li>
         * <li>webvtt</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>webvtt</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The prefix of the OSS URI where the extracted subtitles are stored. The OSS URI is in the oss://bucket/object format, where bucket specifies the name of the OSS bucket that is in the same region as the current project and object specifies the full file path that includes the file name extension.</p>
         * <ul>
         * <li>Example: If the prefix is oss://examplebucket/outputSubtitle, an output subtitle file has a URI in the format of oss://examplebucket/outputSubitile_${index}.${ext}. In the URI format, ${ext} is the file name extension of the output subtitle file, and ${index} is the same 0-based index number as that of the corresponding source subtitle stream file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/extractsubtitle</p>
         */
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
