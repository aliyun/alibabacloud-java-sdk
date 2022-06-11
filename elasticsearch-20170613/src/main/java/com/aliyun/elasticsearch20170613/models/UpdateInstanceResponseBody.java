// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateInstanceResponseBodyResult result;

    public static UpdateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResponseBody self = new UpdateInstanceResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

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
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

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
        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

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
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("domain")
        public String domain;

        @NameInMap("esVersion")
        public String esVersion;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("kibanaConfiguration")
        public UpdateInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        @NameInMap("masterConfiguration")
        public UpdateInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        @NameInMap("nodeSpec")
        public UpdateInstanceResponseBodyResultNodeSpec nodeSpec;

        @NameInMap("paymentType")
        public String paymentType;

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
