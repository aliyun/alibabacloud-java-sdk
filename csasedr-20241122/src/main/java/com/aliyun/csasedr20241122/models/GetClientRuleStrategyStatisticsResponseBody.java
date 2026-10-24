// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class GetClientRuleStrategyStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics of proactive defense policies.</p>
     */
    @NameInMap("Data")
    public GetClientRuleStrategyStatisticsResponseBodyData data;

    /**
     * <p>The unique identifier of the request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A157FA-F957-3A5A-A6B8-5BBB8ADB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClientRuleStrategyStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientRuleStrategyStatisticsResponseBody self = new GetClientRuleStrategyStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientRuleStrategyStatisticsResponseBody setData(GetClientRuleStrategyStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetClientRuleStrategyStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetClientRuleStrategyStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClientRuleStrategyStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The number of custom rule policies for proactive defense.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CustomRuleCount")
        public Integer customRuleCount;

        /**
         * <p>The number of system rule policies for proactive defense.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SystemRuleCount")
        public Integer systemRuleCount;

        public static GetClientRuleStrategyStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClientRuleStrategyStatisticsResponseBodyData self = new GetClientRuleStrategyStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClientRuleStrategyStatisticsResponseBodyData setCustomRuleCount(Integer customRuleCount) {
            this.customRuleCount = customRuleCount;
            return this;
        }
        public Integer getCustomRuleCount() {
            return this.customRuleCount;
        }

        public GetClientRuleStrategyStatisticsResponseBodyData setSystemRuleCount(Integer systemRuleCount) {
            this.systemRuleCount = systemRuleCount;
            return this;
        }
        public Integer getSystemRuleCount() {
            return this.systemRuleCount;
        }

    }

}
