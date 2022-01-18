// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("nodeAmount")
    public Long nodeAmount;

    @NameInMap("nodeSpec")
    public UpdateLogstashRequestNodeSpec nodeSpec;

    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashRequest self = new UpdateLogstashRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLogstashRequest setNodeAmount(Long nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }
    public Long getNodeAmount() {
        return this.nodeAmount;
    }

    public UpdateLogstashRequest setNodeSpec(UpdateLogstashRequestNodeSpec nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }
    public UpdateLogstashRequestNodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    public UpdateLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateLogstashRequestNodeSpec extends TeaModel {
        @NameInMap("disk")
        public Long disk;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        public static UpdateLogstashRequestNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogstashRequestNodeSpec self = new UpdateLogstashRequestNodeSpec();
            return TeaModel.build(map, self);
        }

        public UpdateLogstashRequestNodeSpec setDisk(Long disk) {
            this.disk = disk;
            return this;
        }
        public Long getDisk() {
            return this.disk;
        }

        public UpdateLogstashRequestNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public UpdateLogstashRequestNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
