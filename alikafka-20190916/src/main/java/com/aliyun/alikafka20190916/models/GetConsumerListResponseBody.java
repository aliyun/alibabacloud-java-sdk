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
    public GetConsumerListResponseBodyConsumerList consumerList;

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

    public GetConsumerListResponseBody setConsumerList(GetConsumerListResponseBodyConsumerList consumerList) {
        this.consumerList = consumerList;
        return this;
    }
    public GetConsumerListResponseBodyConsumerList getConsumerList() {
        return this.consumerList;
    }

    public GetConsumerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO self = new GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetConsumerListResponseBodyConsumerListConsumerVOTags extends TeaModel {
        @NameInMap("TagVO")
        public java.util.List<GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO> tagVO;

        public static GetConsumerListResponseBodyConsumerListConsumerVOTags build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerListConsumerVOTags self = new GetConsumerListResponseBodyConsumerListConsumerVOTags();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerListConsumerVOTags setTagVO(java.util.List<GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO> tagVO) {
            this.tagVO = tagVO;
            return this;
        }
        public java.util.List<GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO> getTagVO() {
            return this.tagVO;
        }

    }

    public static class GetConsumerListResponseBodyConsumerListConsumerVO extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("Tags")
        public GetConsumerListResponseBodyConsumerListConsumerVOTags tags;

        @NameInMap("ConsumerId")
        public String consumerId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        public static GetConsumerListResponseBodyConsumerListConsumerVO build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerListConsumerVO self = new GetConsumerListResponseBodyConsumerListConsumerVO();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setTags(GetConsumerListResponseBodyConsumerListConsumerVOTags tags) {
            this.tags = tags;
            return this;
        }
        public GetConsumerListResponseBodyConsumerListConsumerVOTags getTags() {
            return this.tags;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetConsumerListResponseBodyConsumerList extends TeaModel {
        @NameInMap("ConsumerVO")
        public java.util.List<GetConsumerListResponseBodyConsumerListConsumerVO> consumerVO;

        public static GetConsumerListResponseBodyConsumerList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerList self = new GetConsumerListResponseBodyConsumerList();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerList setConsumerVO(java.util.List<GetConsumerListResponseBodyConsumerListConsumerVO> consumerVO) {
            this.consumerVO = consumerVO;
            return this;
        }
        public java.util.List<GetConsumerListResponseBodyConsumerListConsumerVO> getConsumerVO() {
            return this.consumerVO;
        }

    }

}
