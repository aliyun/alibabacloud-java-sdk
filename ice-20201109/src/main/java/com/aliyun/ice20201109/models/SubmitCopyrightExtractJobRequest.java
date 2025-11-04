// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractJobRequest extends TeaModel {
    /**
     * <p>The source video file from which to extract the watermark.</p>
     * <blockquote>
     * <p>The OSS object or media asset must reside in the same region as the IMS service region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitCopyrightExtractJobRequestInput input;

    /**
     * <p>Additional parameters for the watermark job, provided as a JSON string. Supported parameter:</p>
     * <ul>
     * <li><p>algoType: The algorithm type. Defaults to v1. The extraction algorithm must match the one used for embedding.</p>
     * <ul>
     * <li>v1: Copyright watermark extraction algorithm for long videos.</li>
     * <li>v2: Copyright watermark extraction algorithm for short videos.</li>
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
     * <p>The custom data, which can be up to 1,024 bytes in size.</p>
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
         * <p>The specific information for the input file, which can be an OSS URL or a media asset ID. OSS URL formats:</p>
         * <p>1\. oss://bucket/object</p>
         * <p>2\. http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
         * <p>where bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object path in OSS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the source file. Valid values:</p>
         * <ol>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
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
