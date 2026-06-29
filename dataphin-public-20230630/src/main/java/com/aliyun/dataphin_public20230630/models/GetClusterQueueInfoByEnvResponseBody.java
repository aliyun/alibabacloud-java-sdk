// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetClusterQueueInfoByEnvResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetClusterQueueInfoByEnvResponseBodyData> data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetClusterQueueInfoByEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterQueueInfoByEnvResponseBody self = new GetClusterQueueInfoByEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterQueueInfoByEnvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetClusterQueueInfoByEnvResponseBody setData(java.util.List<GetClusterQueueInfoByEnvResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetClusterQueueInfoByEnvResponseBodyData> getData() {
        return this.data;
    }

    public GetClusterQueueInfoByEnvResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetClusterQueueInfoByEnvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterQueueInfoByEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterQueueInfoByEnvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetClusterQueueInfoByEnvResponseBodyData extends TeaModel {
        /**
         * <p>The annotations.</p>
         * 
         * <strong>example:</strong>
         * <p>{  &quot;creator&quot;: &quot;<a href="mailto:new_datasource@test.aliyunid.com">new_datasource@test.aliyunid.com</a>&quot;,  &quot;modifier&quot;: &quot;<a href="mailto:new_datasource@test.aliyunid.com">new_datasource@test.aliyunid.com</a>&quot; }</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>61187014-a3ba-4cdd-8609-1f0aa3df4a3d</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-31 10:29:17</p>
         */
        @NameInMap("CreateAt")
        public String createAt;

        /**
         * <p>The Flink image registry address.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-registry-vpc.cn-shanghai.cr.aliyuncs.com/xxxx/flink:1.15.4-scala_2.12</p>
         */
        @NameInMap("FlinkImageRegistry")
        public String flinkImageRegistry;

        /**
         * <p>The Flink image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-registry-vpc.cn-shanghai.cr.aliyuncs.com</p>
         */
        @NameInMap("FlinkImageRepository")
        public String flinkImageRepository;

        /**
         * <p>The Flink image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1.15.4</p>
         */
        @NameInMap("FlinkImageTag")
        public String flinkImageTag;

        /**
         * <p>The Flink version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.15</p>
         */
        @NameInMap("FlinkVersion")
        public String flinkVersion;

        /**
         * <p>The labels.</p>
         * 
         * <strong>example:</strong>
         * <p>cdh</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The maximum number of vCores provided by each queue.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxVcore")
        public String maxVcore;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-31 10:29:17</p>
         */
        @NameInMap("ModifiedAt")
        public String modifiedAt;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphinv45prod</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The queue name, which serves as a unique identifier. For Kubernetes, this is the resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-queue</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The resource version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceVersion")
        public String resourceVersion;

        /**
         * <p>The resource specification.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n  \&quot;kind\&quot; : \&quot;kubernetes\&quot;,\n  \&quot;kubernetes\{&quot;namespace&quot; : &quot;n1730341728989z7&quot;,    &quot;clusterName&quot; : &quot;a51578bdcce145&quot;  },  &quot;state&quot; : &quot;ONLINE&quot;}</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The VVP cluster type.</p>
         * 
         * <strong>example:</strong>
         * <p>PREJOB</p>
         */
        @NameInMap("VvpClusterType")
        public String vvpClusterType;

        public static GetClusterQueueInfoByEnvResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClusterQueueInfoByEnvResponseBodyData self = new GetClusterQueueInfoByEnvResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClusterQueueInfoByEnvResponseBodyData setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setCreateAt(String createAt) {
            this.createAt = createAt;
            return this;
        }
        public String getCreateAt() {
            return this.createAt;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setFlinkImageRegistry(String flinkImageRegistry) {
            this.flinkImageRegistry = flinkImageRegistry;
            return this;
        }
        public String getFlinkImageRegistry() {
            return this.flinkImageRegistry;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setFlinkImageRepository(String flinkImageRepository) {
            this.flinkImageRepository = flinkImageRepository;
            return this;
        }
        public String getFlinkImageRepository() {
            return this.flinkImageRepository;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setFlinkImageTag(String flinkImageTag) {
            this.flinkImageTag = flinkImageTag;
            return this;
        }
        public String getFlinkImageTag() {
            return this.flinkImageTag;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setFlinkVersion(String flinkVersion) {
            this.flinkVersion = flinkVersion;
            return this;
        }
        public String getFlinkVersion() {
            return this.flinkVersion;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setMaxVcore(String maxVcore) {
            this.maxVcore = maxVcore;
            return this;
        }
        public String getMaxVcore() {
            return this.maxVcore;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setResourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public String getResourceVersion() {
            return this.resourceVersion;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetClusterQueueInfoByEnvResponseBodyData setVvpClusterType(String vvpClusterType) {
            this.vvpClusterType = vvpClusterType;
            return this;
        }
        public String getVvpClusterType() {
            return this.vvpClusterType;
        }

    }

}
