// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public UpdateInstanceResponseBodyResult result;

    public static UpdateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResponseBody self = new UpdateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceResponseBody setResult(UpdateInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateInstanceResponseBodyResultKibanaConfiguration extends TeaModel {
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage size of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>节点规格。</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        public static UpdateInstanceResponseBodyResultKibanaConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResultKibanaConfiguration self = new UpdateInstanceResponseBodyResultKibanaConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResultKibanaConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public UpdateInstanceResponseBodyResultKibanaConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public UpdateInstanceResponseBodyResultKibanaConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public UpdateInstanceResponseBodyResultKibanaConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class UpdateInstanceResponseBodyResultMasterConfiguration extends TeaModel {
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage size of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node. Only cloud_ssd (standard SSD) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>节点规格。</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
         */
        @NameInMap("spec")
        public String spec;

        public static UpdateInstanceResponseBodyResultMasterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResultMasterConfiguration self = new UpdateInstanceResponseBodyResultMasterConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResultMasterConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public UpdateInstanceResponseBodyResultMasterConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public UpdateInstanceResponseBodyResultMasterConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public UpdateInstanceResponseBodyResultMasterConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class UpdateInstanceResponseBodyResultNodeSpec extends TeaModel {
        /**
         * <p>The storage size of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node. Valid values:</p>
         * <ul>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>节点规格。</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.xlarge</p>
         */
        @NameInMap("spec")
        public String spec;

        public static UpdateInstanceResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResultNodeSpec self = new UpdateInstanceResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResultNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public UpdateInstanceResponseBodyResultNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public UpdateInstanceResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class UpdateInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-13T03:58:07.253Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>实例的私网访问域名。</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-abc.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The instance version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.5.3_with_X-Pack</p>
         */
        @NameInMap("esVersion")
        public String esVersion;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-abc</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The Kibana node configuration.</p>
         */
        @NameInMap("kibanaConfiguration")
        public UpdateInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        /**
         * <p>The master node configuration.</p>
         */
        @NameInMap("masterConfiguration")
        public UpdateInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        /**
         * <p>The number of data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The data node configuration.</p>
         */
        @NameInMap("nodeSpec")
        public UpdateInstanceResponseBodyResultNodeSpec nodeSpec;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>prepaid: subscription</li>
         * <li>postpaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>active: Normal</li>
         * <li>activating: Taking effect</li>
         * <li>inactive: Frozen</li>
         * <li>invalid: Invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        public static UpdateInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResult self = new UpdateInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateInstanceResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateInstanceResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public UpdateInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateInstanceResponseBodyResult setKibanaConfiguration(UpdateInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }
        public UpdateInstanceResponseBodyResultKibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        public UpdateInstanceResponseBodyResult setMasterConfiguration(UpdateInstanceResponseBodyResultMasterConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }
        public UpdateInstanceResponseBodyResultMasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        public UpdateInstanceResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public UpdateInstanceResponseBodyResult setNodeSpec(UpdateInstanceResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public UpdateInstanceResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public UpdateInstanceResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public UpdateInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
