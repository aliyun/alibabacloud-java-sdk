// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDiagnoseReportResponseBody extends TeaModel {
    @NameInMap("Content")
    public DescribeCdnDiagnoseReportResponseBodyContent content;

    /**
     * <strong>example:</strong>
     * <p>64D28B53-xxxxx-xxx-xxxxx-FD46680144FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnDiagnoseReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDiagnoseReportResponseBody self = new DescribeCdnDiagnoseReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDiagnoseReportResponseBody setContent(DescribeCdnDiagnoseReportResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeCdnDiagnoseReportResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeCdnDiagnoseReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnDiagnoseReportResponseBodyContentClientInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Chrome</p>
         */
        @NameInMap("BrowserInfo")
        public String browserInfo;

        /**
         * <strong>example:</strong>
         * <p>Macintosh</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <strong>example:</strong>
         * <p>Mozilla/5.0 (Macintosh Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36</p>
         */
        @NameInMap("UAString")
        public String UAString;

        public static DescribeCdnDiagnoseReportResponseBodyContentClientInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDiagnoseReportResponseBodyContentClientInfo self = new DescribeCdnDiagnoseReportResponseBodyContentClientInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDiagnoseReportResponseBodyContentClientInfo setBrowserInfo(String browserInfo) {
            this.browserInfo = browserInfo;
            return this;
        }
        public String getBrowserInfo() {
            return this.browserInfo;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentClientInfo setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentClientInfo setUAString(String UAString) {
            this.UAString = UAString;
            return this;
        }
        public String getUAString() {
            return this.UAString;
        }

    }

    public static class DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>150.xxx.xxx.197:81</p>
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>Unmatched CNAME.</p>
         */
        @NameInMap("ErrorLog")
        public String errorLog;

        /**
         * <strong>example:</strong>
         * <p>107ms</p>
         */
        @NameInMap("Fbt")
        public String fbt;

        @NameInMap("Intro")
        public String intro;

        /**
         * <strong>example:</strong>
         * <p>aG9zd******8tbWVtYmV</p>
         */
        @NameInMap("ReqHeader")
        public String reqHeader;

        /**
         * <strong>example:</strong>
         * <p>2023-02-06 12:17:47</p>
         */
        @NameInMap("ReqTime")
        public String reqTime;

        /**
         * <strong>example:</strong>
         * <p>U2VydmV*******Qo</p>
         */
        @NameInMap("RespHeader")
        public String respHeader;

        /**
         * <strong>example:</strong>
         * <p>2892</p>
         */
        @NameInMap("RespSize")
        public Long respSize;

        /**
         * <strong>example:</strong>
         * <p>107ms</p>
         */
        @NameInMap("Rt")
        public String rt;

        /**
         * <strong>example:</strong>
         * <p>cn4461</p>
         */
        @NameInMap("Station")
        public String station;

        public static DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine self = new DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setErrorLog(String errorLog) {
            this.errorLog = errorLog;
            return this;
        }
        public String getErrorLog() {
            return this.errorLog;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setFbt(String fbt) {
            this.fbt = fbt;
            return this;
        }
        public String getFbt() {
            return this.fbt;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setReqHeader(String reqHeader) {
            this.reqHeader = reqHeader;
            return this;
        }
        public String getReqHeader() {
            return this.reqHeader;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setReqTime(String reqTime) {
            this.reqTime = reqTime;
            return this;
        }
        public String getReqTime() {
            return this.reqTime;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setRespHeader(String respHeader) {
            this.respHeader = respHeader;
            return this;
        }
        public String getRespHeader() {
            return this.respHeader;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setRespSize(Long respSize) {
            this.respSize = respSize;
            return this;
        }
        public Long getRespSize() {
            return this.respSize;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setRt(String rt) {
            this.rt = rt;
            return this;
        }
        public String getRt() {
            return this.rt;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine setStation(String station) {
            this.station = station;
            return this;
        }
        public String getStation() {
            return this.station;
        }

    }

    public static class DescribeCdnDiagnoseReportResponseBodyContentReport extends TeaModel {
        @NameInMap("ClientInfo")
        public String clientInfo;

        @NameInMap("DiagnoseResult")
        public String diagnoseResult;

        @NameInMap("L1Node")
        public String l1Node;

        @NameInMap("L1Tengine")
        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine l1Tengine;

        @NameInMap("SourceInfo")
        public java.util.List<String> sourceInfo;

        public static DescribeCdnDiagnoseReportResponseBodyContentReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDiagnoseReportResponseBodyContentReport self = new DescribeCdnDiagnoseReportResponseBodyContentReport();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReport setClientInfo(String clientInfo) {
            this.clientInfo = clientInfo;
            return this;
        }
        public String getClientInfo() {
            return this.clientInfo;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReport setDiagnoseResult(String diagnoseResult) {
            this.diagnoseResult = diagnoseResult;
            return this;
        }
        public String getDiagnoseResult() {
            return this.diagnoseResult;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReport setL1Node(String l1Node) {
            this.l1Node = l1Node;
            return this;
        }
        public String getL1Node() {
            return this.l1Node;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReport setL1Tengine(DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine l1Tengine) {
            this.l1Tengine = l1Tengine;
            return this;
        }
        public DescribeCdnDiagnoseReportResponseBodyContentReportL1Tengine getL1Tengine() {
            return this.l1Tengine;
        }

        public DescribeCdnDiagnoseReportResponseBodyContentReport setSourceInfo(java.util.List<String> sourceInfo) {
            this.sourceInfo = sourceInfo;
            return this;
        }
        public java.util.List<String> getSourceInfo() {
            return this.sourceInfo;
        }

    }

    public static class DescribeCdnDiagnoseReportResponseBodyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1077********7468</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("ClientInfo")
        public DescribeCdnDiagnoseReportResponseBodyContentClientInfo clientInfo;

        /**
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <strong>example:</strong>
         * <p>2022-12-10 15:11:47</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>f2xxxxd5</p>
         */
        @NameInMap("DiagnoseId")
        public String diagnoseId;

        @NameInMap("DiagnoseReportLink")
        public String diagnoseReportLink;

        /**
         * <strong>example:</strong>
         * <p><a href="http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx">http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx</a></p>
         */
        @NameInMap("DiagnoseUrl")
        public String diagnoseUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>1678701915</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RemainDiagnoseTimes")
        public Long remainDiagnoseTimes;

        @NameInMap("Report")
        public DescribeCdnDiagnoseReportResponseBodyContentReport report;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxx-xxxxx-xxxxx-xxxxxxxxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>1s</p>
         */
        @NameInMap("TimeConsuming")
        public Long timeConsuming;

        /**
         * <strong>example:</strong>
         * <p><a href="https://tracing-sk.alibaba-inc.com/trace/xxxxxxxxxxxxxx">https://tracing-sk.alibaba-inc.com/trace/xxxxxxxxxxxxxx</a></p>
         */
        @NameInMap("TraceDisplayLink")
        public String traceDisplayLink;

        /**
         * <strong>example:</strong>
         * <p>0000006xxxxxxxxxxxx533427e</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static DescribeCdnDiagnoseReportResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDiagnoseReportResponseBodyContent self = new DescribeCdnDiagnoseReportResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setClientInfo(DescribeCdnDiagnoseReportResponseBodyContentClientInfo clientInfo) {
            this.clientInfo = clientInfo;
            return this;
        }
        public DescribeCdnDiagnoseReportResponseBodyContentClientInfo getClientInfo() {
            return this.clientInfo;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setDiagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setDiagnoseReportLink(String diagnoseReportLink) {
            this.diagnoseReportLink = diagnoseReportLink;
            return this;
        }
        public String getDiagnoseReportLink() {
            return this.diagnoseReportLink;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setDiagnoseUrl(String diagnoseUrl) {
            this.diagnoseUrl = diagnoseUrl;
            return this;
        }
        public String getDiagnoseUrl() {
            return this.diagnoseUrl;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setRemainDiagnoseTimes(Long remainDiagnoseTimes) {
            this.remainDiagnoseTimes = remainDiagnoseTimes;
            return this;
        }
        public Long getRemainDiagnoseTimes() {
            return this.remainDiagnoseTimes;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setReport(DescribeCdnDiagnoseReportResponseBodyContentReport report) {
            this.report = report;
            return this;
        }
        public DescribeCdnDiagnoseReportResponseBodyContentReport getReport() {
            return this.report;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setTimeConsuming(Long timeConsuming) {
            this.timeConsuming = timeConsuming;
            return this;
        }
        public Long getTimeConsuming() {
            return this.timeConsuming;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setTraceDisplayLink(String traceDisplayLink) {
            this.traceDisplayLink = traceDisplayLink;
            return this;
        }
        public String getTraceDisplayLink() {
            return this.traceDisplayLink;
        }

        public DescribeCdnDiagnoseReportResponseBodyContent setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
