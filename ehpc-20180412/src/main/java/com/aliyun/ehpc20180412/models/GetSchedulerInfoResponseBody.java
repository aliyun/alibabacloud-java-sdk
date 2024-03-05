// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetSchedulerInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The settings of the scheduler.</p>
     */
    @NameInMap("SchedInfo")
    public java.util.List<GetSchedulerInfoResponseBodySchedInfo> schedInfo;

    public static GetSchedulerInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSchedulerInfoResponseBody self = new GetSchedulerInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSchedulerInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSchedulerInfoResponseBody setSchedInfo(java.util.List<GetSchedulerInfoResponseBodySchedInfo> schedInfo) {
        this.schedInfo = schedInfo;
        return this;
    }
    public java.util.List<GetSchedulerInfoResponseBodySchedInfo> getSchedInfo() {
        return this.schedInfo;
    }

    public static class GetSchedulerInfoResponseBodySchedInfo extends TeaModel {
        /**
         * <p>The detailed settings of the scheduler.</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The type of the scheduler.</p>
         */
        @NameInMap("SchedName")
        public String schedName;

        public static GetSchedulerInfoResponseBodySchedInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSchedulerInfoResponseBodySchedInfo self = new GetSchedulerInfoResponseBodySchedInfo();
            return TeaModel.build(map, self);
        }

        public GetSchedulerInfoResponseBodySchedInfo setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetSchedulerInfoResponseBodySchedInfo setSchedName(String schedName) {
            this.schedName = schedName;
            return this;
        }
        public String getSchedName() {
            return this.schedName;
        }

    }

}
