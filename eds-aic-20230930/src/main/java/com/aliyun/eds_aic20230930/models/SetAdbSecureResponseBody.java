// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SetAdbSecureResponseBody extends TeaModel {
    /**
     * <p>The returned object.</p>
     */
    @NameInMap("Data")
    public SetAdbSecureResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAdbSecureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAdbSecureResponseBody self = new SetAdbSecureResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAdbSecureResponseBody setData(SetAdbSecureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetAdbSecureResponseBodyData getData() {
        return this.data;
    }

    public SetAdbSecureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetAdbSecureResponseBodyData extends TeaModel {
        /**
         * <p>The number of the cloud phone instances for which the ADB authentication feature failed to be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The IDs of the cloud phone instances for which the ADB authentication feature is enabled.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The total number of the cloud phone instances.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SetAdbSecureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetAdbSecureResponseBodyData self = new SetAdbSecureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetAdbSecureResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public SetAdbSecureResponseBodyData setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public SetAdbSecureResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
