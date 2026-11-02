// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractJobRequest extends TeaModel {
    /**
     * <p>The video file from which the watermark is to be extracted.</p>
     * <blockquote>
     * <ul>
     * <li>The region of the OSS file or media asset must be the same as the region of the current IMS instance.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitCopyrightExtractJobRequestInput input;

    /**
     * <p>The watermark job parameters in JSON string format. The following parameters are supported:</p>
     * <ul>
     * <li><p>algoType: the algorithm type. Default value: v1. The extraction algorithm type must be the same as the algorithm type used for embedding.</p>
     * <ul>
     * <li>v1: the copyright extraction API operation for long videos.</li>
     * <li>v2: the copyright extraction API operation for short videos.</li>
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
     * <p>The custom user data. The maximum length is 1,024 bytes.</p>
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
         * <p>The information about the input file. Both OSS URLs and media asset IDs are supported.
         * The OSS URL must be in one of the following formats:</p>
         * <ol>
         * <li><p>oss://bucket/object</p>
         * </li>
         * <li><p>http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
         * </li>
         * </ol>
         * <p>where bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <ul>
         * <li>OSS: the URL of an OSS file.</li>
         * <li>Media: the ID of a media asset.</li>
         * </ul>
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
