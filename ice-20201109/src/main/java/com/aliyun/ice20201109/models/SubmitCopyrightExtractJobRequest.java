// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractJobRequest extends TeaModel {
    /**
     * <p>The video file for watermark extraction.</p>
     * <blockquote>
     * <ul>
     * <li>The region of the Object Storage Service (OSS) file or media asset must match the region of the current Intelligent Media Service (IMS) instance.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitCopyrightExtractJobRequestInput input;

    /**
     * <p>The watermark job parameters, specified as a JSON string.</p>
     * <ul>
     * <li><p>algoType: The algorithm type. Default value: v1. The extraction algorithm type must match the algorithm type used for embedding the watermark.</p>
     * <ul>
     * <li><p>v1: The copyright extraction algorithm for long-form videos.</p>
     * </li>
     * <li><p>v2: The copyright extraction algorithm for short-form videos.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;algoType&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The user-defined data. The maximum length is 1,024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitCopyrightExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightExtractJobRequest self = new SubmitCopyrightExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightExtractJobRequest setInput(SubmitCopyrightExtractJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitCopyrightExtractJobRequestInput getInput() {
        return this.input;
    }

    public SubmitCopyrightExtractJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitCopyrightExtractJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitCopyrightExtractJobRequestInput extends TeaModel {
        /**
         * <p>Specifies the URL of an Object Storage Service (OSS) object or the ID of a media asset.
         * OSS URLs can be in the following formats:</p>
         * <p>1\. oss\://bucket/object</p>
         * <p>2\. http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
         * <p>In these formats, <code>bucket</code> is the name of a bucket in the same region as your IMS instance, and <code>object</code> is the file path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <ol>
         * <li><p>OSS: The URL of a file in Object Storage Service (OSS).</p>
         * </li>
         * <li><p>Media: The ID of a media asset.</p>
         * </li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitCopyrightExtractJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitCopyrightExtractJobRequestInput self = new SubmitCopyrightExtractJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitCopyrightExtractJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitCopyrightExtractJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
