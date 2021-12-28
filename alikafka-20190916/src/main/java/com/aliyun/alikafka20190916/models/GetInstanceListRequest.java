// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetInstanceListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<GetInstanceListRequestTag> tag;

    public static GetInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListRequest self = new GetInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceListRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceListRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceListRequest setTag(java.util.List<GetInstanceListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetInstanceListRequestTag> getTag() {
        return this.tag;
    }

    public static class GetInstanceListRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetInstanceListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListRequestTag self = new GetInstanceListRequestTag();
            return TeaModel.build(map, self);
        }

        public GetInstanceListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
