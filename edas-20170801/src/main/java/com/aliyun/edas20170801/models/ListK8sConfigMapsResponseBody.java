// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sConfigMapsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The query results that are returned.</p>
     */
    @NameInMap("Result")
    public ListK8sConfigMapsResponseBodyResult result;

    public static ListK8sConfigMapsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListK8sConfigMapsResponseBody self = new ListK8sConfigMapsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListK8sConfigMapsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListK8sConfigMapsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListK8sConfigMapsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListK8sConfigMapsResponseBody setResult(ListK8sConfigMapsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListK8sConfigMapsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListK8sConfigMapsResponseBodyResultConfigMapsData extends TeaModel {
        /**
         * <p>The user-defined key that is stored in the ConfigMap.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The user-defined value that is stored in the ConfigMap.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListK8sConfigMapsResponseBodyResultConfigMapsData build(java.util.Map<String, ?> map) throws Exception {
            ListK8sConfigMapsResponseBodyResultConfigMapsData self = new ListK8sConfigMapsResponseBodyResultConfigMapsData();
            return TeaModel.build(map, self);
        }

        public ListK8sConfigMapsResponseBodyResultConfigMapsData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListK8sConfigMapsResponseBodyResultConfigMapsData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListK8sConfigMapsResponseBodyResultConfigMapsRelatedApps extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static ListK8sConfigMapsResponseBodyResultConfigMapsRelatedApps build(java.util.Map<String, ?> map) throws Exception {
            ListK8sConfigMapsResponseBodyResultConfigMapsRelatedApps self = new ListK8sConfigMapsResponseBodyResultConfigMapsRelatedApps();
            return TeaModel.build(map, self);
        }

        public ListK8sConfigMapsResponseBodyResultConfigMapsRelatedApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListK8sConfigMapsResponseBodyResultConfigMapsRelatedApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListK8sConfigMapsResponseBodyResultConfigMaps extends TeaModel {
        /**
         * <p>The ID of the Kubernetes cluster. You can obtain the cluster ID by calling the GetK8sCluster operation. For more information, see [GetK8sCluster](https://help.aliyun.com/document_detail/181437.html).</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The time when the ConfigMaps were created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The information about ConfigMaps.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListK8sConfigMapsResponseBodyResultConfigMapsData> data;

        /**
         * <p>The name of the ConfigMap.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The related applications.</p>
         */
        @NameInMap("RelatedApps")
        public java.util.List<ListK8sConfigMapsResponseBodyResultConfigMapsRelatedApps> relatedApps;

        public static ListK8sConfigMapsResponseBodyResultConfigMaps build(java.util.Map<String, ?> map) throws Exception {
            ListK8sConfigMapsResponseBodyResultConfigMaps self = new ListK8sConfigMapsResponseBodyResultConfigMaps();
            return TeaModel.build(map, self);
        }

        public ListK8sConfigMapsResponseBodyResultConfigMaps setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListK8sConfigMapsResponseBodyResultConfigMaps setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListK8sConfigMapsResponseBodyResultConfigMaps setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListK8sConfigMapsResponseBodyResultConfigMaps setData(java.util.List<ListK8sConfigMapsResponseBodyResultConfigMapsData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListK8sConfigMapsResponseBodyResultConfigMapsData> getData() {
            return this.data;
        }

        public ListK8sConfigMapsResponseBodyResultConfigMaps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListK8sConfigMapsResponseBodyResultConfigMaps setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListK8sConfigMapsResponseBodyResultConfigMaps setRelatedApps(java.util.List<ListK8sConfigMapsResponseBodyResultConfigMapsRelatedApps> relatedApps) {
            this.relatedApps = relatedApps;
            return this;
        }
        public java.util.List<ListK8sConfigMapsResponseBodyResultConfigMapsRelatedApps> getRelatedApps() {
            return this.relatedApps;
        }

    }

    public static class ListK8sConfigMapsResponseBodyResult extends TeaModel {
        /**
         * <p>The information about ConfigMaps.</p>
         */
        @NameInMap("ConfigMaps")
        public java.util.List<ListK8sConfigMapsResponseBodyResultConfigMaps> configMaps;

        /**
         * <p>The total number of entries that are returned.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListK8sConfigMapsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListK8sConfigMapsResponseBodyResult self = new ListK8sConfigMapsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListK8sConfigMapsResponseBodyResult setConfigMaps(java.util.List<ListK8sConfigMapsResponseBodyResultConfigMaps> configMaps) {
            this.configMaps = configMaps;
            return this;
        }
        public java.util.List<ListK8sConfigMapsResponseBodyResultConfigMaps> getConfigMaps() {
            return this.configMaps;
        }

        public ListK8sConfigMapsResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
