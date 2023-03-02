// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeCapacityInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeCapacityInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCapacityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityInfoResponseBody self = new DescribeCapacityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCapacityInfoResponseBody setData(DescribeCapacityInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCapacityInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeCapacityInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCapacityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCapacityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCapacityInfoResponseBodyData extends TeaModel {
        @NameInMap("CapacityQuota")
        public Long capacityQuota;

        @NameInMap("CountQuota")
        public Long countQuota;

        @NameInMap("MemberUsedCapacity")
        public Long memberUsedCapacity;

        @NameInMap("MemberUsedCount")
        public Long memberUsedCount;

        @NameInMap("UsedCapacity")
        public Long usedCapacity;

        @NameInMap("UsedCount")
        public Long usedCount;

        public static DescribeCapacityInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityInfoResponseBodyData self = new DescribeCapacityInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityInfoResponseBodyData setCapacityQuota(Long capacityQuota) {
            this.capacityQuota = capacityQuota;
            return this;
        }
        public Long getCapacityQuota() {
            return this.capacityQuota;
        }

        public DescribeCapacityInfoResponseBodyData setCountQuota(Long countQuota) {
            this.countQuota = countQuota;
            return this;
        }
        public Long getCountQuota() {
            return this.countQuota;
        }

        public DescribeCapacityInfoResponseBodyData setMemberUsedCapacity(Long memberUsedCapacity) {
            this.memberUsedCapacity = memberUsedCapacity;
            return this;
        }
        public Long getMemberUsedCapacity() {
            return this.memberUsedCapacity;
        }

        public DescribeCapacityInfoResponseBodyData setMemberUsedCount(Long memberUsedCount) {
            this.memberUsedCount = memberUsedCount;
            return this;
        }
        public Long getMemberUsedCount() {
            return this.memberUsedCount;
        }

        public DescribeCapacityInfoResponseBodyData setUsedCapacity(Long usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public DescribeCapacityInfoResponseBodyData setUsedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Long getUsedCount() {
            return this.usedCount;
        }

    }

}
