// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListChunksResponseBody extends TeaModel {
    /**
     * <p>The error status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Index.InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned by the operation.</p>
     */
    @NameInMap("Data")
    public ListChunksResponseBodyData data;

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
     * <p>8F97A63B-xxxx-527F-9D6E-467B6A7E8CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChunksResponseBody self = new ListChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChunksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChunksResponseBody setData(ListChunksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChunksResponseBodyData getData() {
        return this.data;
    }

    public ListChunksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChunksResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListChunksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChunksResponseBodyDataNodes extends TeaModel {
        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The metadata map of the text chunk.</p>
         * <blockquote>
         * <p>The <code>file_path</code> field in the metadata map of document search knowledge bases is meaningless. Do not use it in your business code.</p>
         * </blockquote>
         * <blockquote>
         * <p>When retrieving a document search knowledge base, if a chunk contains an image, the image is returned through the <code>image_url</code> field in the metadata map, along with an expiration time.</p>
         * </blockquote>
         * <blockquote>
         * <p>When retrieving an audio/video search knowledge base, if a chunk contains audio, the audio is returned through the <code>audio_url</code> field in the metadata map, along with an expiration time.</p>
         * </blockquote>
         * <blockquote>
         * <p>When retrieving an audio/video search knowledge base, if a chunk contains video, the video is returned through the <code>video_url</code> field in the metadata map, along with an expiration time.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>The metadata map of the text chunk.</p>
         * <blockquote>
         * <p>The <code>file_path</code> field in the metadata map of document search knowledge bases is meaningless. Do not use it in your business code.</p>
         * </blockquote>
         * <blockquote>
         * <p>When retrieving a document search knowledge base, if a chunk contains an image, the image is returned through the <code>image_url</code> field in the metadata map, along with an expiration time.</p>
         * </blockquote>
         * <p>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;file_path&quot;: &quot;<a href="https://bailian-">https://bailian-</a><em><strong>&quot;,
         *   &quot;parent&quot;: &quot;阿里云百炼是一站式的大模型开发及应用构建平台。不论是开发者还是业务人员，都能深入参与大模型应用的设计和构建。您可以通过简单的界面操作，在 5分钟内开发出一款大模型应用，或在几小时内训练出一个专属模型，从而将更多精力专注于应用创新。&quot;,
         *   &quot;is_displayed_chunk_content&quot;: &quot;true&quot;,
         *   &quot;image_url&quot;: [],
         *   &quot;nid&quot;: &quot;83</strong></em>&quot;,
         *   &quot;source&quot;: &quot;0&quot;,
         *   &quot;_score&quot;: 0,
         *   &quot;title&quot;: &quot;&quot;,
         *   &quot;doc_id&quot;: &quot;file_24e***&quot;,
         *   &quot;content&quot;: &quot;阿里云百炼是一站式的大模型开发及应用构建平台。不论是开发者还是业务人员，都能深入参与大模型应用的设计和构建。您可以通过简单的界面操作，在 5分钟内开发出一款大模型应用，或在几小时内训练出一个专属模型，从而将更多精力专注于应用创新。&quot;,
         *   &quot;_rc_score&quot;: 0,
         *   &quot;workspace_id&quot;: &quot;llm-zna***&quot;,
         *   &quot;hier_title&quot;: &quot;&quot;,
         *   &quot;doc_name&quot;: &quot;什么是阿里云百炼&quot;,
         *   &quot;pipeline_id&quot;: &quot;j6b***&quot;,
         *   &quot;_id&quot;: &quot;llm-zna5***&quot;
         * }</p>
         */
        @NameInMap("Metadata")
        public Object metadata;

        /**
         * <p>The similarity score of the text chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The content of the text chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云百炼是一站式的大模型开发及应用构建平台。不论是开发者还是业务人员，都能深入参与大模型应用的设计和构建。您可以通过简单的界面操作，在 5分钟内开发出一款大模型应用，或在几小时内训练出一个专属模型，从而将更多精力专注于应用创新。</p>
         */
        @NameInMap("Text")
        public String text;

        public static ListChunksResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListChunksResponseBodyDataNodes self = new ListChunksResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public ListChunksResponseBodyDataNodes setMetadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Object getMetadata() {
            return this.metadata;
        }

        public ListChunksResponseBodyDataNodes setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public ListChunksResponseBodyDataNodes setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListChunksResponseBodyData extends TeaModel {
        /**
         * <p>The list of text chunks.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<ListChunksResponseBodyDataNodes> nodes;

        /**
         * <p>The total number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListChunksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChunksResponseBodyData self = new ListChunksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChunksResponseBodyData setNodes(java.util.List<ListChunksResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListChunksResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public ListChunksResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
