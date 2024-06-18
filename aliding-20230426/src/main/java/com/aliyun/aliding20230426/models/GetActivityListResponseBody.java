// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetActivityListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<GetActivityListResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static GetActivityListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetActivityListResponseBody self = new GetActivityListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetActivityListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetActivityListResponseBody setResult(java.util.List<GetActivityListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetActivityListResponseBodyResult> getResult() {
        return this.result;
    }

    public GetActivityListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetActivityListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetActivityListResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0q8gsudxxx</p>
         */
        @NameInMap("ActivityId")
        public String activityId;

        /**
         * <strong>example:</strong>
         * <p>activity123</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <strong>example:</strong>
         * <p>activity123</p>
         */
        @NameInMap("ActivityNameInEnglish")
        public String activityNameInEnglish;

        public static GetActivityListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetActivityListResponseBodyResult self = new GetActivityListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetActivityListResponseBodyResult setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public GetActivityListResponseBodyResult setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public GetActivityListResponseBodyResult setActivityNameInEnglish(String activityNameInEnglish) {
            this.activityNameInEnglish = activityNameInEnglish;
            return this;
        }
        public String getActivityNameInEnglish() {
            return this.activityNameInEnglish;
        }

    }

}
