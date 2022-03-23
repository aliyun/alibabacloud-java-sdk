// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetUserInfoResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public GetUserInfoResponseBodyResult result;

    public static GetUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponseBody self = new GetUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserInfoResponseBody setResult(GetUserInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetUserInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetUserInfoResponseBodyResult extends TeaModel {
        // 是否开启应用创建限制
        @NameInMap("EnableCreateAppLimit")
        public Boolean enableCreateAppLimit;

        // 是否开通服务
        @NameInMap("HasOrderedImp")
        public Boolean hasOrderedImp;

        // 是否欠费
        @NameInMap("IsOverdue")
        public Boolean isOverdue;

        // 是否购买时长套餐
        @NameInMap("IsPayByWatchTimeLengthUser")
        public Boolean isPayByWatchTimeLengthUser;

        // 最大的限制
        @NameInMap("MaxCreateAppCount")
        public Long maxCreateAppCount;

        public static GetUserInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserInfoResponseBodyResult self = new GetUserInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetUserInfoResponseBodyResult setEnableCreateAppLimit(Boolean enableCreateAppLimit) {
            this.enableCreateAppLimit = enableCreateAppLimit;
            return this;
        }
        public Boolean getEnableCreateAppLimit() {
            return this.enableCreateAppLimit;
        }

        public GetUserInfoResponseBodyResult setHasOrderedImp(Boolean hasOrderedImp) {
            this.hasOrderedImp = hasOrderedImp;
            return this;
        }
        public Boolean getHasOrderedImp() {
            return this.hasOrderedImp;
        }

        public GetUserInfoResponseBodyResult setIsOverdue(Boolean isOverdue) {
            this.isOverdue = isOverdue;
            return this;
        }
        public Boolean getIsOverdue() {
            return this.isOverdue;
        }

        public GetUserInfoResponseBodyResult setIsPayByWatchTimeLengthUser(Boolean isPayByWatchTimeLengthUser) {
            this.isPayByWatchTimeLengthUser = isPayByWatchTimeLengthUser;
            return this;
        }
        public Boolean getIsPayByWatchTimeLengthUser() {
            return this.isPayByWatchTimeLengthUser;
        }

        public GetUserInfoResponseBodyResult setMaxCreateAppCount(Long maxCreateAppCount) {
            this.maxCreateAppCount = maxCreateAppCount;
            return this;
        }
        public Long getMaxCreateAppCount() {
            return this.maxCreateAppCount;
        }

    }

}
