// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSuspEventSummaryResponseBody extends TeaModel {
    /**
     * <p>API response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public GetSuspEventSummaryResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message for the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9B2DAE9B-B901-5818-AFEF-E5637D938280</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful.</p>
     * <ul>
     * <li>true: Call succeeded.</li>
     * <li>false: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSuspEventSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSuspEventSummaryResponseBody self = new GetSuspEventSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSuspEventSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSuspEventSummaryResponseBody setData(GetSuspEventSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSuspEventSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetSuspEventSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSuspEventSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSuspEventSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSuspEventSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList extends TeaModel {
        /**
         * <p>Date.</p>
         * 
         * <strong>example:</strong>
         * <p>202409或20240901</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>DDoS count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DdosCount")
        public Long ddosCount;

        /**
         * <p>EIP count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EipCount")
        public Long eipCount;

        /**
         * <p>WAF count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WafCount")
        public Long wafCount;

        public static GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList self = new GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList();
            return TeaModel.build(map, self);
        }

        public GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList setDdosCount(Long ddosCount) {
            this.ddosCount = ddosCount;
            return this;
        }
        public Long getDdosCount() {
            return this.ddosCount;
        }

        public GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList setEipCount(Long eipCount) {
            this.eipCount = eipCount;
            return this;
        }
        public Long getEipCount() {
            return this.eipCount;
        }

        public GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList setWafCount(Long wafCount) {
            this.wafCount = wafCount;
            return this;
        }
        public Long getWafCount() {
            return this.wafCount;
        }

    }

    public static class GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTO extends TeaModel {
        /**
         * <p>Collection of trend nodes for each attack item.</p>
         */
        @NameInMap("TrendList")
        public java.util.List<GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList> trendList;

        public static GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTO build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTO self = new GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTO();
            return TeaModel.build(map, self);
        }

        public GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTO setTrendList(java.util.List<GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList> trendList) {
            this.trendList = trendList;
            return this;
        }
        public java.util.List<GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTOTrendList> getTrendList() {
            return this.trendList;
        }

    }

    public static class GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO extends TeaModel {
        /**
         * <p>Completed.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CompletedCount")
        public Long completedCount;

        /**
         * <p>In progress.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HandingCount")
        public Long handingCount;

        /**
         * <p>Alert handling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("HandingRate")
        public String handingRate;

        /**
         * <p>Total number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>Year-over-year comparison of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalGrowthRate")
        public String totalGrowthRate;

        /**
         * <p>Number of unhandled alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WaitHandleCount")
        public Long waitHandleCount;

        public static GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO self = new GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO();
            return TeaModel.build(map, self);
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO setCompletedCount(Long completedCount) {
            this.completedCount = completedCount;
            return this;
        }
        public Long getCompletedCount() {
            return this.completedCount;
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO setHandingCount(Long handingCount) {
            this.handingCount = handingCount;
            return this;
        }
        public Long getHandingCount() {
            return this.handingCount;
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO setHandingRate(String handingRate) {
            this.handingRate = handingRate;
            return this;
        }
        public String getHandingRate() {
            return this.handingRate;
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO setTotalGrowthRate(String totalGrowthRate) {
            this.totalGrowthRate = totalGrowthRate;
            return this;
        }
        public String getTotalGrowthRate() {
            return this.totalGrowthRate;
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO setWaitHandleCount(Long waitHandleCount) {
            this.waitHandleCount = waitHandleCount;
            return this;
        }
        public Long getWaitHandleCount() {
            return this.waitHandleCount;
        }

    }

    public static class GetSuspEventSummaryResponseBodyDataSuspEventTopDTOSuspEventList extends TeaModel {
        /**
         * <p>Alert name.</p>
         * 
         * <strong>example:</strong>
         * <p>主动外连风险 IP</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>Count.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TaskCount")
        public Long taskCount;

        public static GetSuspEventSummaryResponseBodyDataSuspEventTopDTOSuspEventList build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventSummaryResponseBodyDataSuspEventTopDTOSuspEventList self = new GetSuspEventSummaryResponseBodyDataSuspEventTopDTOSuspEventList();
            return TeaModel.build(map, self);
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventTopDTOSuspEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventTopDTOSuspEventList setTaskCount(Long taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Long getTaskCount() {
            return this.taskCount;
        }

    }

    public static class GetSuspEventSummaryResponseBodyDataSuspEventTopDTO extends TeaModel {
        /**
         * <p>Top 10 before handling alarms</p>
         */
        @NameInMap("SuspEventList")
        public java.util.List<GetSuspEventSummaryResponseBodyDataSuspEventTopDTOSuspEventList> suspEventList;

        public static GetSuspEventSummaryResponseBodyDataSuspEventTopDTO build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventSummaryResponseBodyDataSuspEventTopDTO self = new GetSuspEventSummaryResponseBodyDataSuspEventTopDTO();
            return TeaModel.build(map, self);
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventTopDTO setSuspEventList(java.util.List<GetSuspEventSummaryResponseBodyDataSuspEventTopDTOSuspEventList> suspEventList) {
            this.suspEventList = suspEventList;
            return this;
        }
        public java.util.List<GetSuspEventSummaryResponseBodyDataSuspEventTopDTOSuspEventList> getSuspEventList() {
            return this.suspEventList;
        }

    }

    public static class GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList extends TeaModel {
        /**
         * <p>Time point.</p>
         * 
         * <strong>example:</strong>
         * <p>202405或者20240501</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>Number of handled alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DealCount")
        public Long dealCount;

        /**
         * <p>Number of discovered alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("FindCount")
        public Long findCount;

        public static GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList self = new GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList();
            return TeaModel.build(map, self);
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList setDealCount(Long dealCount) {
            this.dealCount = dealCount;
            return this;
        }
        public Long getDealCount() {
            return this.dealCount;
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList setFindCount(Long findCount) {
            this.findCount = findCount;
            return this;
        }
        public Long getFindCount() {
            return this.findCount;
        }

    }

    public static class GetSuspEventSummaryResponseBodyDataSuspEventTrendDTO extends TeaModel {
        /**
         * <p>Trend of alerts.</p>
         */
        @NameInMap("TrendList")
        public java.util.List<GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList> trendList;

        public static GetSuspEventSummaryResponseBodyDataSuspEventTrendDTO build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventSummaryResponseBodyDataSuspEventTrendDTO self = new GetSuspEventSummaryResponseBodyDataSuspEventTrendDTO();
            return TeaModel.build(map, self);
        }

        public GetSuspEventSummaryResponseBodyDataSuspEventTrendDTO setTrendList(java.util.List<GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList> trendList) {
            this.trendList = trendList;
            return this;
        }
        public java.util.List<GetSuspEventSummaryResponseBodyDataSuspEventTrendDTOTrendList> getTrendList() {
            return this.trendList;
        }

    }

    public static class GetSuspEventSummaryResponseBodyData extends TeaModel {
        /**
         * <p>Network attack trend.</p>
         */
        @NameInMap("NetworkAttackTrendDTO")
        public GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTO networkAttackTrendDTO;

        /**
         * <p>Overview of alert handling.</p>
         */
        @NameInMap("SuspEventDealSummaryDTO")
        public GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO suspEventDealSummaryDTO;

        /**
         * <p>Top 10 alerts before handling.</p>
         */
        @NameInMap("SuspEventTopDTO")
        public GetSuspEventSummaryResponseBodyDataSuspEventTopDTO suspEventTopDTO;

        /**
         * <p>Trend of alert responses.</p>
         */
        @NameInMap("SuspEventTrendDTO")
        public GetSuspEventSummaryResponseBodyDataSuspEventTrendDTO suspEventTrendDTO;

        public static GetSuspEventSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventSummaryResponseBodyData self = new GetSuspEventSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSuspEventSummaryResponseBodyData setNetworkAttackTrendDTO(GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTO networkAttackTrendDTO) {
            this.networkAttackTrendDTO = networkAttackTrendDTO;
            return this;
        }
        public GetSuspEventSummaryResponseBodyDataNetworkAttackTrendDTO getNetworkAttackTrendDTO() {
            return this.networkAttackTrendDTO;
        }

        public GetSuspEventSummaryResponseBodyData setSuspEventDealSummaryDTO(GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO suspEventDealSummaryDTO) {
            this.suspEventDealSummaryDTO = suspEventDealSummaryDTO;
            return this;
        }
        public GetSuspEventSummaryResponseBodyDataSuspEventDealSummaryDTO getSuspEventDealSummaryDTO() {
            return this.suspEventDealSummaryDTO;
        }

        public GetSuspEventSummaryResponseBodyData setSuspEventTopDTO(GetSuspEventSummaryResponseBodyDataSuspEventTopDTO suspEventTopDTO) {
            this.suspEventTopDTO = suspEventTopDTO;
            return this;
        }
        public GetSuspEventSummaryResponseBodyDataSuspEventTopDTO getSuspEventTopDTO() {
            return this.suspEventTopDTO;
        }

        public GetSuspEventSummaryResponseBodyData setSuspEventTrendDTO(GetSuspEventSummaryResponseBodyDataSuspEventTrendDTO suspEventTrendDTO) {
            this.suspEventTrendDTO = suspEventTrendDTO;
            return this;
        }
        public GetSuspEventSummaryResponseBodyDataSuspEventTrendDTO getSuspEventTrendDTO() {
            return this.suspEventTrendDTO;
        }

    }

}
