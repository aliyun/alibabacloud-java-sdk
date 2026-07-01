// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractJobRequest extends TeaModel {
    /**
     * <p>The input video from which to extract the watermark.</p>
     * <blockquote>
     * <ul>
     * <li>The OSS object or media asset must be in the same region as your IMS service.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitTraceExtractJobRequestInput input;

    /**
     * <p>Extraction job parameters, specified as a JSON string. The following parameters are supported:</p>
     * <ul>
     * <li><p><code>m3u8Type</code>: The algorithm type. The default value is <code>v1</code>.</p>
     * <ul>
     * <li><p><code>v1</code>: Extracts an m3u8 playlist with absolute paths.</p>
     * </li>
     * <li><p><code>v2</code>: Extracts an m3u8 playlist with relative paths.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;m3u8Type&quot;:&quot;v1&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The user-defined data. Maximum length: 1,024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitTraceExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceExtractJobRequest self = new SubmitTraceExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceExtractJobRequest setInput(SubmitTraceExtractJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitTraceExtractJobRequestInput getInput() {
        return this.input;
    }

    public SubmitTraceExtractJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitTraceExtractJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitTraceExtractJobRequestInput extends TeaModel {
        /**
         * <p>The input source. Specify an OSS object URL or a media asset ID.</p>
         * <p>An OSS object URL can be in one of the following formats:</p>
         * <p>1\. oss\://bucket/object</p>
         * <p>In these formats, <code>bucket</code> is the name of an OSS bucket in the same region as your IMS service, and <code>object</code> is the path of the OSS object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The input type. Valid values:</p>
         * <ul>
         * <li><p>OSS: An OSS object URL.</p>
         * </li>
         * <li><p>Media: A media asset ID.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitTraceExtractJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceExtractJobRequestInput self = new SubmitTraceExtractJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitTraceExtractJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTraceExtractJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
