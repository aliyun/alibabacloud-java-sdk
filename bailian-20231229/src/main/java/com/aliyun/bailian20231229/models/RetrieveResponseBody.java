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
     * <p>The business data returned by the API.</p>
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
     * <p>The HTTP status code of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The call succeeded.</p>
     * </li>
     * <li><p>false: The call failed.</p>
     * </li>
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
         * <p>A map of metadata for the text chunk.</p>
         * <blockquote>
         * <p>For document search knowledge bases, the <code>file_path</code> field in the metadata map is not applicable and should not be used in your application code.</p>
         * </blockquote>
         * <blockquote>
         * <p>When you retrieve data from a document search knowledge base, if a text chunk contains an image, its URL is returned in the <code>image_url</code> field of the metadata map. This URL expires.</p>
         * </blockquote>
         * <blockquote>
         * <p>When you retrieve data from an audio/video search knowledge base, if a text chunk contains audio, its URL is returned in the <code>audio_url</code> field of the metadata map. This URL expires.</p>
         * </blockquote>
         * <blockquote>
         * <p>When you retrieve data from an audio/video search knowledge base, if a text chunk contains video, its URL is returned in the <code>video_url</code> field of the metadata map. This URL expires.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>A map of metadata for the text chunk.</p>
         * <blockquote>
         * <p>For document search knowledge bases, the <code>file_path</code> field in the metadata map is not applicable and should not be used in your application code.</p>
         * </blockquote>
         * <blockquote>
         * <p>When you retrieve data from a document search knowledge base, if a text chunk contains an image, its URL is returned in the <code>image_url</code> field of the metadata map. This URL expires.</p>
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
         *   &quot;title&quot;: &quot;阿里云百炼文档&quot;,
         *   &quot;doc_id&quot;: &quot;doc_</strong></em>&quot;,
         *   &quot;content&quot;: &quot;阿里云百炼是基于通义大模型、行业大模型以及三方大模型的一站式大模型开发平台。面向企业客户和个人开发者，提供完整的模型服务工具和全链路应用开发套件，预置丰富的能力插件，提供API及SDK等便捷的集成方式，高效完成大模型应用构建&quot;,
         *   &quot;workspace_id&quot;: &quot;ws_***&quot;,
         *   &quot;hier_title&quot;: &quot;阿里云百炼文档&quot;,
         *   &quot;doc_name&quot;: &quot;阿里云百炼文档介绍.pdpf&quot;,
         *   &quot;pipeline_id&quot;: &quot;rhd***&quot;,
         *   &quot;<em>id&quot;: &quot;ws</em>***&quot;
         * }</p>
         */
        @NameInMap("Metadata")
        public Object metadata;

        /**
         * <p>The similarity score of the text chunk, ranging from 0 to 1.</p>
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
         * <p>阿里云百炼是基于通义大模型、行业大模型以及三方大模型的一站式大模型开发平台。面向企业客户和个人开发者，提供完整的模型服务工具和全链路应用开发套件，预置丰富的能力插件，提供API及SDK等便捷的集成方式，高效完成大模型应用构建。</p>
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
         * <p>An array of retrieved text chunks.</p>
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
