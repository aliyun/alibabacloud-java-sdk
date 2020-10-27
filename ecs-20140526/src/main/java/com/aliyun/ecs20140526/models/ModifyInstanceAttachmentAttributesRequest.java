// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttachmentAttributesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("PrivatePoolOptions")
    public ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions privatePoolOptions;

    public static ModifyInstanceAttachmentAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttachmentAttributesRequest self = new ModifyInstanceAttachmentAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttachmentAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceAttachmentAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAttachmentAttributesRequest setPrivatePoolOptions(ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public static class ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("MatchCriteria")
        @Validation(required = true)
        public String matchCriteria;

        @NameInMap("Id")
        public String id;

        public static ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions self = new ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
