// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class UpdateVpcConfigRequest extends TeaModel {
    /**
     * <p>The list of VPC IDs to delete.</p>
     */
    @NameInMap("removals")
    public java.util.List<String> removals;

    /**
     * <p>The list of VPCs to update.</p>
     */
    @NameInMap("updates")
    public java.util.List<UpdateVpcConfigRequestUpdates> updates;

    public static UpdateVpcConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcConfigRequest self = new UpdateVpcConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcConfigRequest setRemovals(java.util.List<String> removals) {
        this.removals = removals;
        return this;
    }
    public java.util.List<String> getRemovals() {
        return this.removals;
    }

    public UpdateVpcConfigRequest setUpdates(java.util.List<UpdateVpcConfigRequestUpdates> updates) {
        this.updates = updates;
        return this;
    }
    public java.util.List<UpdateVpcConfigRequestUpdates> getUpdates() {
        return this.updates;
    }

    public static class UpdateVpcConfigRequestUpdates extends TeaModel {
        /**
         * <p>The list of configuration items.</p>
         */
        @NameInMap("extendedOptions")
        public java.util.Map<String, String> extendedOptions;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf67xxxx</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static UpdateVpcConfigRequestUpdates build(java.util.Map<String, ?> map) throws Exception {
            UpdateVpcConfigRequestUpdates self = new UpdateVpcConfigRequestUpdates();
            return TeaModel.build(map, self);
        }

        public UpdateVpcConfigRequestUpdates setExtendedOptions(java.util.Map<String, String> extendedOptions) {
            this.extendedOptions = extendedOptions;
            return this;
        }
        public java.util.Map<String, String> getExtendedOptions() {
            return this.extendedOptions;
        }

        public UpdateVpcConfigRequestUpdates setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
