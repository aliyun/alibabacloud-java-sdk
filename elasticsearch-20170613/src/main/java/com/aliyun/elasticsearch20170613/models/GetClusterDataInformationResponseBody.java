// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetClusterDataInformationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
    @NameInMap("Result")
    public GetClusterDataInformationResponseBodyResult result;

    public static GetClusterDataInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDataInformationResponseBody self = new GetClusterDataInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterDataInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterDataInformationResponseBody setResult(GetClusterDataInformationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetClusterDataInformationResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetClusterDataInformationResponseBodyResultMetaInfo extends TeaModel {
        /**
         * <p>The fields in the Mapping for the index.</p>
         */
        @NameInMap("fields")
        public java.util.List<String> fields;

        /**
         * <p>The index list of the cluster.</p>
         */
        @NameInMap("indices")
        public java.util.List<String> indices;

        /**
         * <p>The Mapping configuration of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;_doc\&quot;:{\&quot;properties\&quot;:{\&quot;user\&quot;:{\&quot;properties\&quot;:{\&quot;last\&quot;:{\&quot;type\&quot;:\&quot;text\&quot;,...}}}}}}</p>
         */
        @NameInMap("mapping")
        public String mapping;

        /**
         * <p>The Settings of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n  \&quot;index\&quot;: {\n    \&quot;replication\&quot;: {\n}.....}}</p>
         */
        @NameInMap("settings")
        public String settings;

        /**
         * <p>Specifies the type of the index.</p>
         */
        @NameInMap("typeName")
        public java.util.List<String> typeName;

        public static GetClusterDataInformationResponseBodyResultMetaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetClusterDataInformationResponseBodyResultMetaInfo self = new GetClusterDataInformationResponseBodyResultMetaInfo();
            return TeaModel.build(map, self);
        }

        public GetClusterDataInformationResponseBodyResultMetaInfo setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public GetClusterDataInformationResponseBodyResultMetaInfo setIndices(java.util.List<String> indices) {
            this.indices = indices;
            return this;
        }
        public java.util.List<String> getIndices() {
            return this.indices;
        }

        public GetClusterDataInformationResponseBodyResultMetaInfo setMapping(String mapping) {
            this.mapping = mapping;
            return this;
        }
        public String getMapping() {
            return this.mapping;
        }

        public GetClusterDataInformationResponseBodyResultMetaInfo setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public GetClusterDataInformationResponseBodyResultMetaInfo setTypeName(java.util.List<String> typeName) {
            this.typeName = typeName;
            return this;
        }
        public java.util.List<String> getTypeName() {
            return this.typeName;
        }

    }

    public static class GetClusterDataInformationResponseBodyResult extends TeaModel {
        /**
         * <p>Whether it is connectable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("connectable")
        public Boolean connectable;

        /**
         * <p>The metadata of the cluster.</p>
         */
        @NameInMap("metaInfo")
        public GetClusterDataInformationResponseBodyResultMetaInfo metaInfo;

        public static GetClusterDataInformationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetClusterDataInformationResponseBodyResult self = new GetClusterDataInformationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetClusterDataInformationResponseBodyResult setConnectable(Boolean connectable) {
            this.connectable = connectable;
            return this;
        }
        public Boolean getConnectable() {
            return this.connectable;
        }

        public GetClusterDataInformationResponseBodyResult setMetaInfo(GetClusterDataInformationResponseBodyResultMetaInfo metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }
        public GetClusterDataInformationResponseBodyResultMetaInfo getMetaInfo() {
            return this.metaInfo;
        }

    }

}
