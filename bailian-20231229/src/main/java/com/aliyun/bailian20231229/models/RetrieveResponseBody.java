// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class RetrieveResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Index.InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data field returned by the operation.</p>
     */
    @NameInMap("Data")
    public RetrieveResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-7734-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: The operation was successful.</li>
     * <li>false: The operation failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RetrieveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveResponseBody self = new RetrieveResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetrieveResponseBody setData(RetrieveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetrieveResponseBodyData getData() {
        return this.data;
    }

    public RetrieveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetrieveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetrieveResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RetrieveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RetrieveResponseBodyDataNodes extends TeaModel {
        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The metadata map of the text chunk.</p>
         * <blockquote>
         * <p>The file_path field in the metadata map of a document search knowledge base is meaningless. Do not use it in your business code.</p>
         * </blockquote>
         * <blockquote>
         * <p>When you retrieve a document search knowledge base, if a chunk contains an image, the image is returned in the image_url field of the metadata map, along with an expiration time.</p>
         * </blockquote>
         * <blockquote>
         * <p>When you retrieve an audio and video search knowledge base, if a chunk contains audio, the audio is returned in the audio_url field of the metadata map, along with an expiration time.</p>
         * </blockquote>
         * <blockquote>
         * <p>When you retrieve an audio and video search knowledge base, if a chunk contains a video, the video is returned in the video_url field of the metadata map, along with an expiration time.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>The metadata map of the text chunk.</p>
         * <blockquote>
         * <p>The file_path field in the metadata map of a document search knowledge base is meaningless. Do not use it in your business code.</p>
         * </blockquote>
         * <blockquote>
         * <p>When you retrieve a document search knowledge base, if a chunk contains an image, the image is returned in the image_url field of the metadata map, along with an expiration time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;parent&quot;: &quot;&quot;,
         *   &quot;file_path&quot;: &quot;https://<em><strong>&quot;,
         *   &quot;image_url&quot;: [
         *     &quot;http://</strong></em>&quot;
         *   ],
         *   &quot;nid&quot;: &quot;<em><strong>&quot;,
         *   &quot;title&quot;: &quot;Alibaba Cloud Model Studio Documentation&quot;,
         *   &quot;doc_id&quot;: &quot;doc_</strong></em>&quot;,
         *   &quot;content&quot;: &quot;Alibaba Cloud Model Studio is a one-stop large model development platform based on Tongyi large models, industry large models, and third-party large models. It provides enterprise customers and individual developers with a complete set of model service tools and full-link application development kits, pre-installed with rich capability plugins, and offers convenient integration methods such as APIs and SDKs to efficiently build large model applications.&quot;,
         *   &quot;workspace_id&quot;: &quot;ws_***&quot;,
         *   &quot;hier_title&quot;: &quot;Alibaba Cloud Model Studio Documentation&quot;,
         *   &quot;doc_name&quot;: &quot;Introduction to Alibaba Cloud Model Studio Documentation.pdpf&quot;,
         *   &quot;pipeline_id&quot;: &quot;rhd***&quot;,
         *   &quot;<em>id&quot;: &quot;ws</em>***&quot;
         * }</p>
         */
        @NameInMap("Metadata")
        public Object metadata;

        /**
         * <p>The similarity score of the text chunk. Valid values: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The content of the text chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Model Studio is a one-stop large model development platform based on Tongyi large models, industry large models, and third-party large models. It provides enterprise customers and individual developers with a complete set of model service tools and full-link application development kits, pre-installed with rich capability plugins, and offers convenient integration methods such as APIs and SDKs to efficiently build large model applications</p>
         */
        @NameInMap("Text")
        public String text;

        public static RetrieveResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            RetrieveResponseBodyDataNodes self = new RetrieveResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public RetrieveResponseBodyDataNodes setMetadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Object getMetadata() {
            return this.metadata;
        }

        public RetrieveResponseBodyDataNodes setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RetrieveResponseBodyDataNodes setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RetrieveResponseBodyData extends TeaModel {
        /**
         * <p>The list of matched text chunks.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<RetrieveResponseBodyDataNodes> nodes;

        public static RetrieveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetrieveResponseBodyData self = new RetrieveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetrieveResponseBodyData setNodes(java.util.List<RetrieveResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<RetrieveResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
