// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkStatIbResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkStatIbResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkStatIbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkStatIbResponseBody self = new ClinkStatIbResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkStatIbResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkStatIbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkStatIbResponseBody setData(ClinkStatIbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkStatIbResponseBodyData getData() {
        return this.data;
    }

    public ClinkStatIbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkStatIbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkStatIbResponseBodyDataStatIb extends TeaModel {
        /**
         * <p>接听电话座席数</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("AnsweredAgentCount")
        public Long answeredAgentCount;

        /**
         * <p>人均接听量</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AvgAnsweredAgentCount")
        public Long avgAnsweredAgentCount;

        /**
         * <p>日期（统计方式2为同步日期；统计方式3为分时信息，例 0-1时）</p>
         * 
         * <strong>example:</strong>
         * <p>20240203</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>热线号码</p>
         * 
         * <strong>example:</strong>
         * <p>Hotline</p>
         */
        @NameInMap("Hotline")
        public String hotline;

        /**
         * <p>热线别名</p>
         * 
         * <strong>example:</strong>
         * <p>HotlineName</p>
         */
        @NameInMap("HotlineName")
        public String hotlineName;

        /**
         * <p>呼叫座席来电总数</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("IbAgentCount")
        public Long ibAgentCount;

        /**
         * <p>人工接听数</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("IbAnsweredCount")
        public Long ibAnsweredCount;

        /**
         * <p>人工接听排队总时长</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("IbAnsweredQueueDuration")
        public Long ibAnsweredQueueDuration;

        /**
         * <p>呼入人工接听率</p>
         * 
         * <strong>example:</strong>
         * <p>0.28</p>
         */
        @NameInMap("IbAnsweredRate")
        public Double ibAnsweredRate;

        /**
         * <p>人工接听平均排队时长</p>
         * 
         * <strong>example:</strong>
         * <p>93</p>
         */
        @NameInMap("IbAvgAnsweredQueueDuration")
        public Long ibAvgAnsweredQueueDuration;

        /**
         * <p>呼入平均通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("IbAvgBridgeDuration")
        public Long ibAvgBridgeDuration;

        /**
         * <p>呼入平均时长</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("IbAvgDuration")
        public Long ibAvgDuration;

        /**
         * <p>进入队列平均排队时长</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("IbAvgQueueDuration")
        public Long ibAvgQueueDuration;

        /**
         * <p>机器人应答数</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("IbBotAnsweredCount")
        public Long ibBotAnsweredCount;

        /**
         * <p>机器人未应答数</p>
         * 
         * <strong>example:</strong>
         * <p>79</p>
         */
        @NameInMap("IbBotUnansweredCount")
        public Long ibBotUnansweredCount;

        /**
         * <p>呼入通话总时长（客户侧）</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("IbBridgeDuration")
        public Long ibBridgeDuration;

        /**
         * <p>直转座席数</p>
         * 
         * <strong>example:</strong>
         * <p>61</p>
         */
        @NameInMap("IbDirectAgentCount")
        public Long ibDirectAgentCount;

        /**
         * <p>直转队列数</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("IbDirectQueueCount")
        public Long ibDirectQueueCount;

        /**
         * <p>直转电话/IP话机数</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("IbDirectTelCount")
        public Long ibDirectTelCount;

        /**
         * <p>进入IVR人工接听数</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("IbIvrAnsweredCount")
        public Long ibIvrAnsweredCount;

        /**
         * <p>进入IVR数</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("IbIvrCount")
        public Long ibIvrCount;

        /**
         * <p>进入IVR未转队列数</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("IbIvrNoQueueCount")
        public Long ibIvrNoQueueCount;

        /**
         * <p>进入IVR转队列数</p>
         * 
         * <strong>example:</strong>
         * <p>94</p>
         */
        @NameInMap("IbIvrQueueCount")
        public Long ibIvrQueueCount;

        /**
         * <p>进入IVR客户速挂</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("IbIvrQuickUnlinkCount")
        public Long ibIvrQuickUnlinkCount;

        /**
         * <p>进入IVR系统应答数</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IbIvrSystemAnsweredCount")
        public Long ibIvrSystemAnsweredCount;

        /**
         * <p>进入IVR人工未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("IbIvrUnAnsweredCount")
        public Long ibIvrUnAnsweredCount;

        /**
         * <p>未进入IVR数</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IbNoIvrCount")
        public Long ibNoIvrCount;

        /**
         * <p>进入队列来电通数</p>
         * 
         * <strong>example:</strong>
         * <p>91</p>
         */
        @NameInMap("IbQueueCount")
        public Long ibQueueCount;

        /**
         * <p>进入队列排队总时长</p>
         * 
         * <strong>example:</strong>
         * <p>79</p>
         */
        @NameInMap("IbQueueDuration")
        public Long ibQueueDuration;

        /**
         * <p>黑名单来电数</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("IbRestrictCount")
        public Long ibRestrictCount;

        /**
         * <p>X秒接听数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IbRingingRangeCount")
        public Long ibRingingRangeCount;

        /**
         * <p>X秒接听率</p>
         * 
         * <strong>example:</strong>
         * <p>0.43</p>
         */
        @NameInMap("IbRingingRangeRate")
        public Double ibRingingRangeRate;

        /**
         * <p>系统应答数</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("IbSystemAnsweredCount")
        public Long ibSystemAnsweredCount;

        /**
         * <p>系统未应答数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IbSystemUnAnsweredCount")
        public Long ibSystemUnAnsweredCount;

        /**
         * <p>来电总通数</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("IbTotalCount")
        public Long ibTotalCount;

        /**
         * <p>人工未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("IbUnansweredCount")
        public Long ibUnansweredCount;

        /**
         * <p>VIP呼入数</p>
         * 
         * <strong>example:</strong>
         * <p>77</p>
         */
        @NameInMap("IbVipCount")
        public Long ibVipCount;

        /**
         * <p>网上400呼入数</p>
         * 
         * <strong>example:</strong>
         * <p>53</p>
         */
        @NameInMap("IbWebCount")
        public Long ibWebCount;

        /**
         * <p>呼入总时长</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("IbtotalDuration")
        public Long ibtotalDuration;

        /**
         * <p>进入IVR直转电话/IP话机人工接听数</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("IvrDirectTelAnsweredCount")
        public Long ivrDirectTelAnsweredCount;

        /**
         * <p>进入IVR直转电话/IP话机数</p>
         * 
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("IvrDirectTelCount")
        public Long ivrDirectTelCount;

        /**
         * <p>进入IVR直转电话/IP话机系统应答数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IvrDirectTelSysAnsweredCount")
        public Long ivrDirectTelSysAnsweredCount;

        /**
         * <p>进入IVR直转电话/IP话机人工未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("IvrDirectTelUnansweredCount")
        public Long ivrDirectTelUnansweredCount;

        /**
         * <p>客户速挂数</p>
         * 
         * <strong>example:</strong>
         * <p>67</p>
         */
        @NameInMap("QuickUnlinkCount")
        public Long quickUnlinkCount;

        /**
         * <p>热线重复来电数</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("RepeatHotlineCount")
        public Long repeatHotlineCount;

        public static ClinkStatIbResponseBodyDataStatIb build(java.util.Map<String, ?> map) throws Exception {
            ClinkStatIbResponseBodyDataStatIb self = new ClinkStatIbResponseBodyDataStatIb();
            return TeaModel.build(map, self);
        }

        public ClinkStatIbResponseBodyDataStatIb setAnsweredAgentCount(Long answeredAgentCount) {
            this.answeredAgentCount = answeredAgentCount;
            return this;
        }
        public Long getAnsweredAgentCount() {
            return this.answeredAgentCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setAvgAnsweredAgentCount(Long avgAnsweredAgentCount) {
            this.avgAnsweredAgentCount = avgAnsweredAgentCount;
            return this;
        }
        public Long getAvgAnsweredAgentCount() {
            return this.avgAnsweredAgentCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ClinkStatIbResponseBodyDataStatIb setHotline(String hotline) {
            this.hotline = hotline;
            return this;
        }
        public String getHotline() {
            return this.hotline;
        }

        public ClinkStatIbResponseBodyDataStatIb setHotlineName(String hotlineName) {
            this.hotlineName = hotlineName;
            return this;
        }
        public String getHotlineName() {
            return this.hotlineName;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbAgentCount(Long ibAgentCount) {
            this.ibAgentCount = ibAgentCount;
            return this;
        }
        public Long getIbAgentCount() {
            return this.ibAgentCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbAnsweredCount(Long ibAnsweredCount) {
            this.ibAnsweredCount = ibAnsweredCount;
            return this;
        }
        public Long getIbAnsweredCount() {
            return this.ibAnsweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbAnsweredQueueDuration(Long ibAnsweredQueueDuration) {
            this.ibAnsweredQueueDuration = ibAnsweredQueueDuration;
            return this;
        }
        public Long getIbAnsweredQueueDuration() {
            return this.ibAnsweredQueueDuration;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbAnsweredRate(Double ibAnsweredRate) {
            this.ibAnsweredRate = ibAnsweredRate;
            return this;
        }
        public Double getIbAnsweredRate() {
            return this.ibAnsweredRate;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbAvgAnsweredQueueDuration(Long ibAvgAnsweredQueueDuration) {
            this.ibAvgAnsweredQueueDuration = ibAvgAnsweredQueueDuration;
            return this;
        }
        public Long getIbAvgAnsweredQueueDuration() {
            return this.ibAvgAnsweredQueueDuration;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbAvgBridgeDuration(Long ibAvgBridgeDuration) {
            this.ibAvgBridgeDuration = ibAvgBridgeDuration;
            return this;
        }
        public Long getIbAvgBridgeDuration() {
            return this.ibAvgBridgeDuration;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbAvgDuration(Long ibAvgDuration) {
            this.ibAvgDuration = ibAvgDuration;
            return this;
        }
        public Long getIbAvgDuration() {
            return this.ibAvgDuration;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbAvgQueueDuration(Long ibAvgQueueDuration) {
            this.ibAvgQueueDuration = ibAvgQueueDuration;
            return this;
        }
        public Long getIbAvgQueueDuration() {
            return this.ibAvgQueueDuration;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbBotAnsweredCount(Long ibBotAnsweredCount) {
            this.ibBotAnsweredCount = ibBotAnsweredCount;
            return this;
        }
        public Long getIbBotAnsweredCount() {
            return this.ibBotAnsweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbBotUnansweredCount(Long ibBotUnansweredCount) {
            this.ibBotUnansweredCount = ibBotUnansweredCount;
            return this;
        }
        public Long getIbBotUnansweredCount() {
            return this.ibBotUnansweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbBridgeDuration(Long ibBridgeDuration) {
            this.ibBridgeDuration = ibBridgeDuration;
            return this;
        }
        public Long getIbBridgeDuration() {
            return this.ibBridgeDuration;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbDirectAgentCount(Long ibDirectAgentCount) {
            this.ibDirectAgentCount = ibDirectAgentCount;
            return this;
        }
        public Long getIbDirectAgentCount() {
            return this.ibDirectAgentCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbDirectQueueCount(Long ibDirectQueueCount) {
            this.ibDirectQueueCount = ibDirectQueueCount;
            return this;
        }
        public Long getIbDirectQueueCount() {
            return this.ibDirectQueueCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbDirectTelCount(Long ibDirectTelCount) {
            this.ibDirectTelCount = ibDirectTelCount;
            return this;
        }
        public Long getIbDirectTelCount() {
            return this.ibDirectTelCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbIvrAnsweredCount(Long ibIvrAnsweredCount) {
            this.ibIvrAnsweredCount = ibIvrAnsweredCount;
            return this;
        }
        public Long getIbIvrAnsweredCount() {
            return this.ibIvrAnsweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbIvrCount(Long ibIvrCount) {
            this.ibIvrCount = ibIvrCount;
            return this;
        }
        public Long getIbIvrCount() {
            return this.ibIvrCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbIvrNoQueueCount(Long ibIvrNoQueueCount) {
            this.ibIvrNoQueueCount = ibIvrNoQueueCount;
            return this;
        }
        public Long getIbIvrNoQueueCount() {
            return this.ibIvrNoQueueCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbIvrQueueCount(Long ibIvrQueueCount) {
            this.ibIvrQueueCount = ibIvrQueueCount;
            return this;
        }
        public Long getIbIvrQueueCount() {
            return this.ibIvrQueueCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbIvrQuickUnlinkCount(Long ibIvrQuickUnlinkCount) {
            this.ibIvrQuickUnlinkCount = ibIvrQuickUnlinkCount;
            return this;
        }
        public Long getIbIvrQuickUnlinkCount() {
            return this.ibIvrQuickUnlinkCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbIvrSystemAnsweredCount(Long ibIvrSystemAnsweredCount) {
            this.ibIvrSystemAnsweredCount = ibIvrSystemAnsweredCount;
            return this;
        }
        public Long getIbIvrSystemAnsweredCount() {
            return this.ibIvrSystemAnsweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbIvrUnAnsweredCount(Long ibIvrUnAnsweredCount) {
            this.ibIvrUnAnsweredCount = ibIvrUnAnsweredCount;
            return this;
        }
        public Long getIbIvrUnAnsweredCount() {
            return this.ibIvrUnAnsweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbNoIvrCount(Long ibNoIvrCount) {
            this.ibNoIvrCount = ibNoIvrCount;
            return this;
        }
        public Long getIbNoIvrCount() {
            return this.ibNoIvrCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbQueueCount(Long ibQueueCount) {
            this.ibQueueCount = ibQueueCount;
            return this;
        }
        public Long getIbQueueCount() {
            return this.ibQueueCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbQueueDuration(Long ibQueueDuration) {
            this.ibQueueDuration = ibQueueDuration;
            return this;
        }
        public Long getIbQueueDuration() {
            return this.ibQueueDuration;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbRestrictCount(Long ibRestrictCount) {
            this.ibRestrictCount = ibRestrictCount;
            return this;
        }
        public Long getIbRestrictCount() {
            return this.ibRestrictCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbRingingRangeCount(Long ibRingingRangeCount) {
            this.ibRingingRangeCount = ibRingingRangeCount;
            return this;
        }
        public Long getIbRingingRangeCount() {
            return this.ibRingingRangeCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbRingingRangeRate(Double ibRingingRangeRate) {
            this.ibRingingRangeRate = ibRingingRangeRate;
            return this;
        }
        public Double getIbRingingRangeRate() {
            return this.ibRingingRangeRate;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbSystemAnsweredCount(Long ibSystemAnsweredCount) {
            this.ibSystemAnsweredCount = ibSystemAnsweredCount;
            return this;
        }
        public Long getIbSystemAnsweredCount() {
            return this.ibSystemAnsweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbSystemUnAnsweredCount(Long ibSystemUnAnsweredCount) {
            this.ibSystemUnAnsweredCount = ibSystemUnAnsweredCount;
            return this;
        }
        public Long getIbSystemUnAnsweredCount() {
            return this.ibSystemUnAnsweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbTotalCount(Long ibTotalCount) {
            this.ibTotalCount = ibTotalCount;
            return this;
        }
        public Long getIbTotalCount() {
            return this.ibTotalCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbUnansweredCount(Long ibUnansweredCount) {
            this.ibUnansweredCount = ibUnansweredCount;
            return this;
        }
        public Long getIbUnansweredCount() {
            return this.ibUnansweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbVipCount(Long ibVipCount) {
            this.ibVipCount = ibVipCount;
            return this;
        }
        public Long getIbVipCount() {
            return this.ibVipCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbWebCount(Long ibWebCount) {
            this.ibWebCount = ibWebCount;
            return this;
        }
        public Long getIbWebCount() {
            return this.ibWebCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIbtotalDuration(Long ibtotalDuration) {
            this.ibtotalDuration = ibtotalDuration;
            return this;
        }
        public Long getIbtotalDuration() {
            return this.ibtotalDuration;
        }

        public ClinkStatIbResponseBodyDataStatIb setIvrDirectTelAnsweredCount(Long ivrDirectTelAnsweredCount) {
            this.ivrDirectTelAnsweredCount = ivrDirectTelAnsweredCount;
            return this;
        }
        public Long getIvrDirectTelAnsweredCount() {
            return this.ivrDirectTelAnsweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIvrDirectTelCount(Long ivrDirectTelCount) {
            this.ivrDirectTelCount = ivrDirectTelCount;
            return this;
        }
        public Long getIvrDirectTelCount() {
            return this.ivrDirectTelCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIvrDirectTelSysAnsweredCount(Long ivrDirectTelSysAnsweredCount) {
            this.ivrDirectTelSysAnsweredCount = ivrDirectTelSysAnsweredCount;
            return this;
        }
        public Long getIvrDirectTelSysAnsweredCount() {
            return this.ivrDirectTelSysAnsweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setIvrDirectTelUnansweredCount(Long ivrDirectTelUnansweredCount) {
            this.ivrDirectTelUnansweredCount = ivrDirectTelUnansweredCount;
            return this;
        }
        public Long getIvrDirectTelUnansweredCount() {
            return this.ivrDirectTelUnansweredCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setQuickUnlinkCount(Long quickUnlinkCount) {
            this.quickUnlinkCount = quickUnlinkCount;
            return this;
        }
        public Long getQuickUnlinkCount() {
            return this.quickUnlinkCount;
        }

        public ClinkStatIbResponseBodyDataStatIb setRepeatHotlineCount(Long repeatHotlineCount) {
            this.repeatHotlineCount = repeatHotlineCount;
            return this;
        }
        public Long getRepeatHotlineCount() {
            return this.repeatHotlineCount;
        }

    }

    public static class ClinkStatIbResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>报表数据（注：时长字段单位均为秒）</p>
         */
        @NameInMap("StatIb")
        public java.util.List<ClinkStatIbResponseBodyDataStatIb> statIb;

        public static ClinkStatIbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkStatIbResponseBodyData self = new ClinkStatIbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkStatIbResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkStatIbResponseBodyData setStatIb(java.util.List<ClinkStatIbResponseBodyDataStatIb> statIb) {
            this.statIb = statIb;
            return this;
        }
        public java.util.List<ClinkStatIbResponseBodyDataStatIb> getStatIb() {
            return this.statIb;
        }

    }

}
