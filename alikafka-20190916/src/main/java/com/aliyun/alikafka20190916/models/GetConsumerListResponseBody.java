// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("ConsumerList")
    public java.util.List<GetConsumerListResponseBodyConsumerList> consumerList;

    @NameInMap("Success")
    public Boolean success;

    public static GetConsumerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerListResponseBody self = new GetConsumerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetConsumerListResponseBody setConsumerList(java.util.List<GetConsumerListResponseBodyConsumerList> consumerList) {
        this.consumerList = consumerList;
        return this;
    }
    public java.util.List<GetConsumerListResponseBodyConsumerList> getConsumerList() {
        return this.consumerList;
    }

    public GetConsumerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumerListResponseBodyConsumerListTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetConsumerListResponseBodyConsumerListTags build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerListTags self = new GetConsumerListResponseBodyConsumerListTags();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConsumerListResponseBodyConsumerListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetConsumerListResponseBodyConsumerList extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("Tags")
        public java.util.List<GetConsumerListResponseBodyConsumerListTags> tags;

        @NameInMap("ConsumerId")
        public String consumerId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        public static GetConsumerListResponseBodyConsumerList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerList self = new GetConsumerListResponseBodyConsumerList();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetConsumerListResponseBodyConsumerList setTags(java.util.List<GetConsumerListResponseBodyConsumerListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetConsumerListResponseBodyConsumerListTags> getTags() {
            return this.tags;
        }

        public GetConsumerListResponseBodyConsumerList setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public GetConsumerListResponseBodyConsumerList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetConsumerListResponseBodyConsumerList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
