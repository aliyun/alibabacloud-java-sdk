// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("nodeAmount")
    public Integer nodeAmount;

    @NameInMap("nodeSpec")
    public UpdateLogstashRequestNodeSpec nodeSpec;

    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashRequest self = new UpdateLogstashRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashRequest setNodeAmount(Integer nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }
    public Integer getNodeAmount() {
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
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>elasticsearch.sn1ne.large</p>
         */
        @NameInMap("spec")
        public String spec;

        public static UpdateLogstashRequestNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogstashRequestNodeSpec self = new UpdateLogstashRequestNodeSpec();
            return TeaModel.build(map, self);
        }

        public UpdateLogstashRequestNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
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
