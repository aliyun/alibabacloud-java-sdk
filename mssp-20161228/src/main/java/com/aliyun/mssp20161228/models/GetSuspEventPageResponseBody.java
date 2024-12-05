// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSuspEventPageResponseBody extends TeaModel {
    /**
     * <p>API response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetSuspEventPageResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message of the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>system error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PageInfo")
    public GetSuspEventPageResponseBodyPageInfo pageInfo;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AFA6F7B7-7C4B-58BB-B8FB-E0FFA4483561</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSuspEventPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSuspEventPageResponseBody self = new GetSuspEventPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSuspEventPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSuspEventPageResponseBody setData(java.util.List<GetSuspEventPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSuspEventPageResponseBodyData> getData() {
        return this.data;
    }

    public GetSuspEventPageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSuspEventPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSuspEventPageResponseBody setPageInfo(GetSuspEventPageResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetSuspEventPageResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetSuspEventPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSuspEventPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSuspEventPageResponseBodyData extends TeaModel {
        /**
         * <p>Alarm event type.</p>
         * 
         * <strong>example:</strong>
         * <p>精准防御</p>
         */
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        /**
         * <p>Alarm ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5b1eeebe4f22daa2b177298234214fa3</p>
         */
        @NameInMap("AlarmId")
        public Long alarmId;

        /**
         * <p>Alarm name.</p>
         * 
         * <strong>example:</strong>
         * <p>Web服务漏洞利用</p>
         */
        @NameInMap("AlarmName")
        public String alarmName;

        /**
         * <p>Alarm source.</p>
         * 
         * <strong>example:</strong>
         * <p>SUSP_EVENT</p>
         */
        @NameInMap("AlarmSource")
        public String alarmSource;

        /**
         * <p>Latest alarm time.</p>
         * 
         * <strong>example:</strong>
         * <p>1722515522000</p>
         */
        @NameInMap("AlarmTime")
        public String alarmTime;

        /**
         * <p>Analysis process.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;value&quot;:&quot;服务器可能已被黑客攻击，存在恶意进程在运行。 分析过程：告警显示，服务端存在一个名为”dns.exe”的进程在访问”polling.burpcollaborator.net”，这是一个被黑名单列出的恶意域名。在正常情况下,”dns.exe”不应该单独存在于系统的路径下，并且也不应该访问这类恶意域名。因此，这个进程可能是黑客留下的恶意进程。&quot;,&quot;key&quot;:&quot;结论&quot;},{&quot;value&quot;:&quot;尽快对服务器进行全面扫描，清除恶意进程。同时，联系网络安全专家进行深入调查，以确定是否有其他潜在的安全威胁。&quot;,&quot;key&quot;:&quot;处置建议&quot;}]</p>
         */
        @NameInMap("AnalysisResult")
        public String analysisResult;

        /**
         * <p>Alarm handling time.</p>
         * 
         * <strong>example:</strong>
         * <p>1732515522000</p>
         */
        @NameInMap("DealTime")
        public String dealTime;

        /**
         * <p>Alarm level.</p>
         * 
         * <strong>example:</strong>
         * <p>suspicious</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>Ticket primary key id.</p>
         * 
         * <strong>example:</strong>
         * <p>9947</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Affected asset.</p>
         * 
         * <strong>example:</strong>
         * <p>shells-azhou</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.99.188.31</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>Private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.109.130</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>First occurrence time.</p>
         * 
         * <strong>example:</strong>
         * <p>该字段暂未使用，有问题请联系管理员</p>
         */
        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        /**
         * <p>Owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>Disposal method.</p>
         * 
         * <strong>example:</strong>
         * <p>处理完成</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Handling status.</p>
         * 
         * <strong>example:</strong>
         * <p>未处理</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetSuspEventPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventPageResponseBodyData self = new GetSuspEventPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSuspEventPageResponseBodyData setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public GetSuspEventPageResponseBodyData setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public GetSuspEventPageResponseBodyData setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public GetSuspEventPageResponseBodyData setAlarmSource(String alarmSource) {
            this.alarmSource = alarmSource;
            return this;
        }
        public String getAlarmSource() {
            return this.alarmSource;
        }

        public GetSuspEventPageResponseBodyData setAlarmTime(String alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public String getAlarmTime() {
            return this.alarmTime;
        }

        public GetSuspEventPageResponseBodyData setAnalysisResult(String analysisResult) {
            this.analysisResult = analysisResult;
            return this;
        }
        public String getAnalysisResult() {
            return this.analysisResult;
        }

        public GetSuspEventPageResponseBodyData setDealTime(String dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public String getDealTime() {
            return this.dealTime;
        }

        public GetSuspEventPageResponseBodyData setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public GetSuspEventPageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSuspEventPageResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetSuspEventPageResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetSuspEventPageResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public GetSuspEventPageResponseBodyData setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public GetSuspEventPageResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetSuspEventPageResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetSuspEventPageResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetSuspEventPageResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The current page number in pagination queries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of items displayed per page in the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetSuspEventPageResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSuspEventPageResponseBodyPageInfo self = new GetSuspEventPageResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetSuspEventPageResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetSuspEventPageResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSuspEventPageResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
