// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMemberCapacityInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeMemberCapacityInfoResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMemberCapacityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberCapacityInfoResponseBody self = new DescribeMemberCapacityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMemberCapacityInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMemberCapacityInfoResponseBody setData(java.util.List<DescribeMemberCapacityInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMemberCapacityInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMemberCapacityInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMemberCapacityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMemberCapacityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMemberCapacityInfoResponseBodyData extends TeaModel {
        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("MemberUid")
        public String memberUid;

        @NameInMap("UsedCapacity")
        public String usedCapacity;

        @NameInMap("UsedCount")
        public String usedCount;

        public static DescribeMemberCapacityInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMemberCapacityInfoResponseBodyData self = new DescribeMemberCapacityInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMemberCapacityInfoResponseBodyData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DescribeMemberCapacityInfoResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public DescribeMemberCapacityInfoResponseBodyData setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeMemberCapacityInfoResponseBodyData setUsedCapacity(String usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public String getUsedCapacity() {
            return this.usedCapacity;
        }

        public DescribeMemberCapacityInfoResponseBodyData setUsedCount(String usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public String getUsedCount() {
            return this.usedCount;
        }

    }

}
