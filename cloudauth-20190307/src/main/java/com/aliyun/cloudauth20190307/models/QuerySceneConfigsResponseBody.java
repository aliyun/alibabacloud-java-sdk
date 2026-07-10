// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QuerySceneConfigsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of intent verification configurations.</p>
     */
    @NameInMap("sceneConfigs")
    public java.util.List<QuerySceneConfigsResponseBodySceneConfigs> sceneConfigs;

    public static QuerySceneConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneConfigsResponseBody self = new QuerySceneConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySceneConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySceneConfigsResponseBody setSceneConfigs(java.util.List<QuerySceneConfigsResponseBodySceneConfigs> sceneConfigs) {
        this.sceneConfigs = sceneConfigs;
        return this;
    }
    public java.util.List<QuerySceneConfigsResponseBodySceneConfigs> getSceneConfigs() {
        return this.sceneConfigs;
    }

    public static class QuerySceneConfigsResponseBodySceneConfigs extends TeaModel {
        /**
         * <p>The specific configuration content, in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;faceCompareMode\&quot;:\&quot;CUSTOM\&quot;,\&quot;certConfigs\&quot;:[{\&quot;index\&quot;:0,\&quot;openVoiceCompare\&quot;:false,\&quot;openCustomizedContent\&quot;:true,\&quot;model\&quot;:\&quot;QA\&quot;}],\&quot;screenEvidence\&quot;:true}</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1760782820000</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1760782820000</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>607</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000009045</p>
         */
        @NameInMap("sceneId")
        public Long sceneId;

        /**
         * <p>The configuration type.</p>
         * 
         * <strong>example:</strong>
         * <p>VOLUNTARY</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version number of the scenario configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Long version;

        public static QuerySceneConfigsResponseBodySceneConfigs build(java.util.Map<String, ?> map) throws Exception {
            QuerySceneConfigsResponseBodySceneConfigs self = new QuerySceneConfigsResponseBodySceneConfigs();
            return TeaModel.build(map, self);
        }

        public QuerySceneConfigsResponseBodySceneConfigs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QuerySceneConfigsResponseBodySceneConfigs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySceneConfigsResponseBodySceneConfigs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QuerySceneConfigsResponseBodySceneConfigs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySceneConfigsResponseBodySceneConfigs setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public QuerySceneConfigsResponseBodySceneConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QuerySceneConfigsResponseBodySceneConfigs setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
