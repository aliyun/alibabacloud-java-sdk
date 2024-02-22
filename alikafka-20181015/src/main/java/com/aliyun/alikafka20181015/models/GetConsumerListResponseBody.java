// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class GetConsumerListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ConsumerList")
    public GetConsumerListResponseBodyConsumerList consumerList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetConsumerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerListResponseBody self = new GetConsumerListResponseBody();
        return TeaModel.build(map, self);
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

    public GetConsumerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumerListResponseBodyConsumerListConsumerVO extends TeaModel {
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
