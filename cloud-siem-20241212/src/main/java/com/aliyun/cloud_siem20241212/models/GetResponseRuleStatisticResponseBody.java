// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetResponseRuleStatisticResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics of automated response rules.</p>
     */
    @NameInMap("ResponseStatistic")
    public GetResponseRuleStatisticResponseBodyResponseStatistic responseStatistic;

    public static GetResponseRuleStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResponseRuleStatisticResponseBody self = new GetResponseRuleStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResponseRuleStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResponseRuleStatisticResponseBody setResponseStatistic(GetResponseRuleStatisticResponseBodyResponseStatistic responseStatistic) {
        this.responseStatistic = responseStatistic;
        return this;
    }
    public GetResponseRuleStatisticResponseBodyResponseStatistic getResponseStatistic() {
        return this.responseStatistic;
    }

    public static class GetResponseRuleStatisticResponseBodyResponseStatistic extends TeaModel {
        /**
         * <p>The total number of automated response rules.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ResponseRuleAllCount")
        public Integer responseRuleAllCount;

        /**
         * <p>The number of online automated response rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResponseRuleOnlineCount")
        public Integer responseRuleOnlineCount;

        public static GetResponseRuleStatisticResponseBodyResponseStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetResponseRuleStatisticResponseBodyResponseStatistic self = new GetResponseRuleStatisticResponseBodyResponseStatistic();
            return TeaModel.build(map, self);
        }

        public GetResponseRuleStatisticResponseBodyResponseStatistic setResponseRuleAllCount(Integer responseRuleAllCount) {
            this.responseRuleAllCount = responseRuleAllCount;
            return this;
        }
        public Integer getResponseRuleAllCount() {
            return this.responseRuleAllCount;
        }

        public GetResponseRuleStatisticResponseBodyResponseStatistic setResponseRuleOnlineCount(Integer responseRuleOnlineCount) {
            this.responseRuleOnlineCount = responseRuleOnlineCount;
            return this;
        }
        public Integer getResponseRuleOnlineCount() {
            return this.responseRuleOnlineCount;
        }

    }

}
