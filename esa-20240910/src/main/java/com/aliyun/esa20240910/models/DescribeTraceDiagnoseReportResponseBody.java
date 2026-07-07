// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeTraceDiagnoseReportResponseBody extends TeaModel {
    /**
     * <p>The IP address of the local DNS server.</p>
     * 
     * <strong>example:</strong>
     * <p>47.xx.112.120</p>
     */
    @NameInMap("ClientAddr")
    public String clientAddr;

    /**
     * <p>The client information.</p>
     */
    @NameInMap("ClientInfo")
    public DescribeTraceDiagnoseReportResponseBodyClientInfo clientInfo;

    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>33.7.98.136</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The creation time. Format: yyyy-MM-dd HH:mm:ss. Time zone: UTC+8.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-11T01:23:21Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The diagnostic ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpndgn-hn316ixao7ut50ybl5qui</p>
     */
    @NameInMap("DiagnoseId")
    public String diagnoseId;

    /**
     * <p>The diagnostic report link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cdnskyeye.alibaba-inc.com/#/databrain/detectionPlatformAction?module=trace&id=xxx&instance_id=xxxx&type=copy&edition_id=xxxxx">https://cdnskyeye.alibaba-inc.com/#/databrain/detectionPlatformAction?module=trace&amp;id=xxx&amp;instance_id=xxxx&amp;type=copy&amp;edition_id=xxxxx</a></p>
     */
    @NameInMap("DiagnoseReportLink")
    public String diagnoseReportLink;

    /**
     * <p>The diagnostic link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx">http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx</a></p>
     */
    @NameInMap("DiagnoseUrl")
    public String diagnoseUrl;

    /**
     * <p>The diagnosed domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.pecmnr.cn">www.pecmnr.cn</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The expiration time. Unit: seconds. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1678701915</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The remaining number of available diagnostic attempts.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RemainDiagnoseTimes")
    public Long remainDiagnoseTimes;

    /**
     * <p>The diagnostic report details.</p>
     */
    @NameInMap("Report")
    public DescribeTraceDiagnoseReportResponseBodyReport report;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The report generation status. Valid values:</p>
     * <p>0: succeeded.
     * 1: failed.
     * 2: timed out.
     * 3: running.
     * 4: waiting.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The status of the diagnostic link. Valid values:</p>
     * <p>1: active.
     * 0: expired.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxx-xxxxx-xxxxx-xxxxxxxxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The time consumed to generate the report. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TimeConsuming")
    public Long timeConsuming;

    /**
     * <p>The trace display link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://tracing-sk.alibaba-inc.com/trace/xxxxxxxxxxxxxx">https://tracing-sk.alibaba-inc.com/trace/xxxxxxxxxxxxxx</a></p>
     */
    @NameInMap("TraceDisplayLink")
    public String traceDisplayLink;

    /**
     * <p>The diagnostic trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000006xxxxxxxxxxxx533427e</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeTraceDiagnoseReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceDiagnoseReportResponseBody self = new DescribeTraceDiagnoseReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTraceDiagnoseReportResponseBody setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }
    public String getClientAddr() {
        return this.clientAddr;
    }

    public DescribeTraceDiagnoseReportResponseBody setClientInfo(DescribeTraceDiagnoseReportResponseBodyClientInfo clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public DescribeTraceDiagnoseReportResponseBodyClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public DescribeTraceDiagnoseReportResponseBody setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeTraceDiagnoseReportResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeTraceDiagnoseReportResponseBody setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public DescribeTraceDiagnoseReportResponseBody setDiagnoseReportLink(String diagnoseReportLink) {
        this.diagnoseReportLink = diagnoseReportLink;
        return this;
    }
    public String getDiagnoseReportLink() {
        return this.diagnoseReportLink;
    }

    public DescribeTraceDiagnoseReportResponseBody setDiagnoseUrl(String diagnoseUrl) {
        this.diagnoseUrl = diagnoseUrl;
        return this;
    }
    public String getDiagnoseUrl() {
        return this.diagnoseUrl;
    }

    public DescribeTraceDiagnoseReportResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeTraceDiagnoseReportResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public DescribeTraceDiagnoseReportResponseBody setRemainDiagnoseTimes(Long remainDiagnoseTimes) {
        this.remainDiagnoseTimes = remainDiagnoseTimes;
        return this;
    }
    public Long getRemainDiagnoseTimes() {
        return this.remainDiagnoseTimes;
    }

    public DescribeTraceDiagnoseReportResponseBody setReport(DescribeTraceDiagnoseReportResponseBodyReport report) {
        this.report = report;
        return this;
    }
    public DescribeTraceDiagnoseReportResponseBodyReport getReport() {
        return this.report;
    }

    public DescribeTraceDiagnoseReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTraceDiagnoseReportResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeTraceDiagnoseReportResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public DescribeTraceDiagnoseReportResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeTraceDiagnoseReportResponseBody setTimeConsuming(Long timeConsuming) {
        this.timeConsuming = timeConsuming;
        return this;
    }
    public Long getTimeConsuming() {
        return this.timeConsuming;
    }

    public DescribeTraceDiagnoseReportResponseBody setTraceDisplayLink(String traceDisplayLink) {
        this.traceDisplayLink = traceDisplayLink;
        return this;
    }
    public String getTraceDisplayLink() {
        return this.traceDisplayLink;
    }

    public DescribeTraceDiagnoseReportResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeTraceDiagnoseReportResponseBodyClientInfo extends TeaModel {
        /**
         * <p>The browser.</p>
         * 
         * <strong>example:</strong>
         * <p>Chrome</p>
         */
        @NameInMap("BrowserInfo")
        public String browserInfo;

        /**
         * <p>The operating system name.</p>
         * 
         * <strong>example:</strong>
         * <p>Macintosh</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>Mozilla/5.0 (Macintosh Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36</p>
         */
        @NameInMap("UaString")
        public String uaString;

        public static DescribeTraceDiagnoseReportResponseBodyClientInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceDiagnoseReportResponseBodyClientInfo self = new DescribeTraceDiagnoseReportResponseBodyClientInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTraceDiagnoseReportResponseBodyClientInfo setBrowserInfo(String browserInfo) {
            this.browserInfo = browserInfo;
            return this;
        }
        public String getBrowserInfo() {
            return this.browserInfo;
        }

        public DescribeTraceDiagnoseReportResponseBodyClientInfo setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeTraceDiagnoseReportResponseBodyClientInfo setUaString(String uaString) {
            this.uaString = uaString;
            return this;
        }
        public String getUaString() {
            return this.uaString;
        }

    }

    public static class DescribeTraceDiagnoseReportResponseBodyReport extends TeaModel {
        /**
         * <p>The client information.</p>
         * 
         * <strong>example:</strong>
         * <p>Client IP : xxx.xxx.xxx.xxx DNS_IP : xxx.xxx.xxx.xxx</p>
         */
        @NameInMap("ClientInfo")
        public String clientInfo;

        /**
         * <p>The diagnostic result.</p>
         * 
         * <strong>example:</strong>
         * <p>Diagnosis Result: Normal Scheduling Result: Normal Check Item Details: Exception Item: [Request Normal]</p>
         */
        @NameInMap("DiagnoseResult")
        public String diagnoseResult;

        /**
         * <p>The response header of the client request.</p>
         * 
         * <strong>example:</strong>
         * <p><br>connection: keep-alive<br>content-type: application/json</p>
         */
        @NameInMap("ResponseHeader")
        public String responseHeader;

        /**
         * <p>The static snapshot page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn.dns-detect.alicdn.com/diagnose_v2#/snapshot?data=H4sIAAAAAAACA%2B1aeW%2FcxhX%2FKgSLFkm7pGbI4bWGUSiSEqmxZMG7Tow4hjAkh1pGFLkmuVorgYE4QeI0cc7eB3IgLpIWTdO4ORzXQb6MV5b%2F6lfomyG5u1xpbUW2mwSNpAWWM2%2FmHfPm935DzTNyHm6yLKebXbkpa0gzFWQo2Gkjp4nNpm6qBJtPyA052WLpVsj6cvMZ2Y%2BzeZYzLw%2BTmD%2Fn7FwOo%2BdXWjsfvT%2B4ehXEvSRKUmj7kaF5BFP5fEOOEo9GJ9OoDerGRt18%2BfOdZy%2FcfPcCQWRw%2FbmJ4UFAfBLw4Vm42YtoziaG73z43s4r7%2Bx89srux7%2B59fyHg5devN0kfrJJw3iFbjJoH3xxZXD54s57L8lVxxxL8zAIPVDDp66cSVmWRFtsrsO8jTHVS6tb5u4H7%2B%2B8%2FcbtVAq355I45vHaCvPtceNfemPw8js3X7t44%2Bo1jNCP%2F3P90u7Xb9969o87z34wPZTcD5bTMMr4VGF3KQ4S%2Fk1oWuLriJGpYqzqRMUazBDBgvFWW1MdDZoM1YTWsHu8y1Kai8lv%2Ff7rWxcvDV584eZXb4q%2B1TTZCmNPxOnS725c%2B%2Fvg6nOiYy7pxXkKXsg3rn40%2BNNXPHhxtmeqG9feLHqmTAQ9%2B8wEiZj3wNY87bGJ2MnN08%2FIvTQC8X6%2Fr54NadxnseolmyJGPijQEKpPAU89z2NZoUpu6g15k%2Fkwcr4H1ors1bHWkCkkN11nY60azOSXjzDZac2wVQcVP5qmG1oDBqq6U%2FzYBnKchm7bKi5lMHEQPnO%2BMW4yjcLt3t1bjG17H4uxY9Ytxoah6qU1yCIGMhvYtlRz3ECtoRFDtSq%2FHBtp%2BoTRZ8%2FevcGOsY%2FBGiYTBuuQm2VAHc0gDmlgh6j2WIzBcx0T1axJTRjs0tDv3b3NJrH2i7JorlltErBxLM4NaDHHTeQtBqqtxZnzZxqym4iUTkFzCvld2sLzLqTrcZKF2XKeLvngFnjSah0r90E75OCFLTCaZhkHrCQ%2BwbJelGeFaDeM1%2BcFPhTPi%2B32am2s6cA%2BzjhOENMAAZamSTonQgUY3JBzmq6zvNq3cyvFNDBCfC2R4otP4a%2FYsWneTmmcBSxtFWEFKR7mCjl7Rewq21oszld6m0UDTRld4NMu9uhDLJS59mxjIfbbo7KELcsB7MK2AX9j4VmFyar4FDYvZd2F0tx2ktOo8FfXYYtnSS%2F12FJ3yyz6AX9aUNFYKuAS8Y2rQv7psEvGnuzSoJbwch%2BTiG3oPM8Ekon4DLGsWwZQWLTCYHC8vt4TIWPd2oqVw4XgXCeMaW0VH07STZrnrPR0kVH%2Bja%2FqDFaxBEsmrSS59DBM4j%2BZPhnDWucQYuUY6Ms7TQnxxhbLlbkk2QhZU6Jefy33jmqB5WLNZaPwIqLbJrYZ1glyYKPZpuXqtmH5gYlp4Gg6CVwMAHKkS%2FPO0Zkji3nePR5H20eW6Tlldp0d1aFzUpvnx2sZ8%2B6zxnko2U2pDXtbwo60TLclzmWkgsVoRHpkuc3FYAkhrspsFCV95XgarodxU%2FppYTJPhqa00Jrlj4%2FRdLspzUI6d3NlIQYggXGiI6RNicWZ4lGvw3SsRhpLsGkq2DoNZbeBGvOrZxrTJewG%2F8CiKVizUWN5XNZyarIYNdB4N7FUL7aww7usPYrqvRibU5QQbSRngwLu1CmlFeZMmeP9SksgZVNaXmq1eOdsFCqtfhjkyiNR4tJIaQEsctbYlEYLWc4ixEb909bDqNajGrLAIagpJbAiEmBGF7CVSeTUKUlg07iksLHUztsX6HrEQr8pTU8uLsY%2FsHmAop6g%2FXHImANGVmGGB1WkjrI64E2a9HL2i6yCsM1zWW382NYX%2FKjq5ZBIBUUWGBV4nmlBiVM8x7AU4miB4riupvgAOQwh6um%2BXZqwmrK8BNQK7IeoLOgd0AyolZpmqhrHb2FgobVCuVIIQExXsSVQ7Fw%2BsgxEBGesgHAStnOvuzcOXhWpx4GHx16HuhzM%2BmGaM45J%2B6A%2Fx6j5pB9HCfVbXcYRDBXIthzGxczyhFjRiorGE2UmjNWmKjkeSvztUQUR0R%2B8%2BhoQTLkwlBc3XRS3c93qoFIVIMCOkfJ6sasyAQKwx5s4KwOY9ZIpQQ7L%2BgNbxqUurXxbaZVhRMZYpRrlnKgu9SXXdTyqIIV7L76w%2B9YfBq9f3r34t50r%2Fx5cula6c4J5LNxi%2FrCm5vuVTsRJEKx1m69%2BUX0K6Yp%2FDCM%2F2heFQD8FbDjBzvZg0j1BAU0ZMCRe4aoaBK094CUi67Hp6Lph246t2Zhgwh2O4fRVRjKA8tZL2Qla5W%2BxWnvTohU%2BXTNurGDK5TFhvjjj3LaUQ0Bd1t7ucm2h78mjiCzT3OsUs5WuFjkNTatAATcB9OOkAFBRYwVS8kqbJlG96yT4zktTnDeluU6abLIZwxI4KooJlJsZUXAWkyxv%2BjTrZF7SZSrojMNefwPAeQyveCoXrOLLS4MX%2Fjn4%2BJ3B1eeLAxSnJSLGvqEFPtKJQm3bVQgzdMUB%2Bqn4VIeou55p0IBnbRZNrB7nzYdknwY5NPu0ze8p%2BySGrh%2BCfRIL3z%2F2iUz8HWOf0%2Br0fgSUWo5j4FHFJpquEThpMwsR2zKohjUfiqbNCDVNm3iIBpDPcBQ8NAG9fxoPSEDr9BG4GBC%2BnmMoGAE3xHtJXU3AAF5nTON1GqmJOnXuiDEAi20QHQ6sxh41o17NQA3%2B2V8HRiM5POKOB6RwExT7rkkn%2BWak8wCHgBGZnJooU09YU08Mh6SeyLpX1NOAo5QeoEDxLYKgQECpcOzAVwLPtUzX1d0AW1Opp1GnnoS%2FP4SNTxzVwVO5p%2B4AhhFVQ5ZqobsmnzwSQ%2FK52OuwDk1y9p3mnqZl3nfuORnkO5BP0z4o9xQV6x5yT%2FID9zws97wHPHM%2F%2BvrNuOfgzeuDty7tfPbXm7%2F88tvnnpp2aOr5fX3vSbCDD8E8%2BXug%2B8c8%2BTuJOzPPReYK776Nd551rmVawI%2B82NI157RO9lCgiW6g%2BvtTIBOPyRl1kqVxGmWZhnXa1vcoqHXa2rS3c%2BZQikwQrG%2FAcO74ssxyDEenLhlbT8cghqaxKVx9%2BgCsa4hgz3Cp5wfUdhAUJNMknu8xIBfOoV8W30eNt%2BfqehXFA3PQg747vi3jPTiPns5fD0k1yb1imh6jrufbQDI94ijE1XyFEuIqvh5Yhm76xKZ0GtPkuD5GNOE0BNQGEAkbqkZuxzQdWwU2ajh3zTPJGM18okPj9adCupF8t19yGkj%2FXxDNsRjf6R2nflCaKcpTjWbuXPkXOHfzzxd%2BYJf%2FR%2Bzy%2BruDf3w%2BeP39e0Ytz9Tv%2BRT%2F8YdwPMbSMNgG8Kf8tkzW63aTNF9j4nJMQKOMS4Xra%2BVtn%2BHAoqnIqrmV2eWFpvRAnMTsQQiGBCmapH7WfDKWpPF%2Fy%2FBnYsFZWVeh8GtYm2jQUb0BO059imLE6NkCbfAzVDi0QezVwpWwu0VGNxyGbebQPY9xh891YVv4E41BIO4nsbW8QI3hVTAiIauJSFPD0s%2F49QXpZHtOrk1VH2IDq6mGoL1DqnsYcpyMTDnfkDtQrIeJOfjVq4Nrvx5c%2FvTG1%2B%2FtXPh497UvBq%2F%2FdnD5k91P%2FyIXouO0HbQfd58S16oKQ0xsq5q0mXGdPClLIMQqKRq5GDDMagsC0ogNbVSD8hGHHjWDjUlWXbVKuAfL1AvjPMk6MMRNk35WbCqxWzhUUC6TPB1GEZ0xVCQ9MBxwRFoCvhoB9fCk4y3plITRGjbWrAel2W43Yo8z99EwnzF0S9VN6YFHF9vLxxpSFG4w6RHmbSQPVlsSE1tF%2FFdq0YCmYTlE0GtOqBZi6kZ8qYucEGjSyhN%2Bp2WiK4mPhTEb5sQwHUpIIevijhzEK4w3%2BCsZQNecn9kgKjlAyklx%2FYYvTNacmdl378%2F8nEbhGid4PnN762t8prXQP1oAuWHZWEHw61gYeB0KGMYscC3MgNthD3m6ZzKNIvMnfCE4Cgtw%2BtYifP6%2Fq6Vk7DkpAAA%3D">https://cdn.dns-detect.alicdn.com/diagnose_v2#/snapshot?data=H4sIAAAAAAACA%2B1aeW%2FcxhX%2FKgSLFkm7pGbI4bWGUSiSEqmxZMG7Tow4hjAkh1pGFLkmuVorgYE4QeI0cc7eB3IgLpIWTdO4ORzXQb6MV5b%2F6lfomyG5u1xpbUW2mwSNpAWWM2%2FmHfPm935DzTNyHm6yLKebXbkpa0gzFWQo2Gkjp4nNpm6qBJtPyA052WLpVsj6cvMZ2Y%2BzeZYzLw%2BTmD%2Fn7FwOo%2BdXWjsfvT%2B4ehXEvSRKUmj7kaF5BFP5fEOOEo9GJ9OoDerGRt18%2BfOdZy%2FcfPcCQWRw%2FbmJ4UFAfBLw4Vm42YtoziaG73z43s4r7%2Bx89srux7%2B59fyHg5devN0kfrJJw3iFbjJoH3xxZXD54s57L8lVxxxL8zAIPVDDp66cSVmWRFtsrsO8jTHVS6tb5u4H7%2B%2B8%2FcbtVAq355I45vHaCvPtceNfemPw8js3X7t44%2Bo1jNCP%2F3P90u7Xb9969o87z34wPZTcD5bTMMr4VGF3KQ4S%2Fk1oWuLriJGpYqzqRMUazBDBgvFWW1MdDZoM1YTWsHu8y1Kai8lv%2Ff7rWxcvDV584eZXb4q%2B1TTZCmNPxOnS725c%2B%2Fvg6nOiYy7pxXkKXsg3rn40%2BNNXPHhxtmeqG9feLHqmTAQ9%2B8wEiZj3wNY87bGJ2MnN08%2FIvTQC8X6%2Fr54NadxnseolmyJGPijQEKpPAU89z2NZoUpu6g15k%2Fkwcr4H1ors1bHWkCkkN11nY60azOSXjzDZac2wVQcVP5qmG1oDBqq6U%2FzYBnKchm7bKi5lMHEQPnO%2BMW4yjcLt3t1bjG17H4uxY9Ytxoah6qU1yCIGMhvYtlRz3ECtoRFDtSq%2FHBtp%2BoTRZ8%2FevcGOsY%2FBGiYTBuuQm2VAHc0gDmlgh6j2WIzBcx0T1axJTRjs0tDv3b3NJrH2i7JorlltErBxLM4NaDHHTeQtBqqtxZnzZxqym4iUTkFzCvld2sLzLqTrcZKF2XKeLvngFnjSah0r90E75OCFLTCaZhkHrCQ%2BwbJelGeFaDeM1%2BcFPhTPi%2B32am2s6cA%2BzjhOENMAAZamSTonQgUY3JBzmq6zvNq3cyvFNDBCfC2R4otP4a%2FYsWneTmmcBSxtFWEFKR7mCjl7Rewq21oszld6m0UDTRld4NMu9uhDLJS59mxjIfbbo7KELcsB7MK2AX9j4VmFyar4FDYvZd2F0tx2ktOo8FfXYYtnSS%2F12FJ3yyz6AX9aUNFYKuAS8Y2rQv7psEvGnuzSoJbwch%2BTiG3oPM8Ekon4DLGsWwZQWLTCYHC8vt4TIWPd2oqVw4XgXCeMaW0VH07STZrnrPR0kVH%2Bja%2FqDFaxBEsmrSS59DBM4j%2BZPhnDWucQYuUY6Ms7TQnxxhbLlbkk2QhZU6Jefy33jmqB5WLNZaPwIqLbJrYZ1glyYKPZpuXqtmH5gYlp4Gg6CVwMAHKkS%2FPO0Zkji3nePR5H20eW6Tlldp0d1aFzUpvnx2sZ8%2B6zxnko2U2pDXtbwo60TLclzmWkgsVoRHpkuc3FYAkhrspsFCV95XgarodxU%2FppYTJPhqa00Jrlj4%2FRdLspzUI6d3NlIQYggXGiI6RNicWZ4lGvw3SsRhpLsGkq2DoNZbeBGvOrZxrTJewG%2F8CiKVizUWN5XNZyarIYNdB4N7FUL7aww7usPYrqvRibU5QQbSRngwLu1CmlFeZMmeP9SksgZVNaXmq1eOdsFCqtfhjkyiNR4tJIaQEsctbYlEYLWc4ixEb909bDqNajGrLAIagpJbAiEmBGF7CVSeTUKUlg07iksLHUztsX6HrEQr8pTU8uLsY%2FsHmAop6g%2FXHImANGVmGGB1WkjrI64E2a9HL2i6yCsM1zWW382NYX%2FKjq5ZBIBUUWGBV4nmlBiVM8x7AU4miB4riupvgAOQwh6um%2BXZqwmrK8BNQK7IeoLOgd0AyolZpmqhrHb2FgobVCuVIIQExXsSVQ7Fw%2BsgxEBGesgHAStnOvuzcOXhWpx4GHx16HuhzM%2BmGaM45J%2B6A%2Fx6j5pB9HCfVbXcYRDBXIthzGxczyhFjRiorGE2UmjNWmKjkeSvztUQUR0R%2B8%2BhoQTLkwlBc3XRS3c93qoFIVIMCOkfJ6sasyAQKwx5s4KwOY9ZIpQQ7L%2BgNbxqUurXxbaZVhRMZYpRrlnKgu9SXXdTyqIIV7L76w%2B9YfBq9f3r34t50r%2Fx5cula6c4J5LNxi%2FrCm5vuVTsRJEKx1m69%2BUX0K6Yp%2FDCM%2F2heFQD8FbDjBzvZg0j1BAU0ZMCRe4aoaBK094CUi67Hp6Lph246t2Zhgwh2O4fRVRjKA8tZL2Qla5W%2BxWnvTohU%2BXTNurGDK5TFhvjjj3LaUQ0Bd1t7ucm2h78mjiCzT3OsUs5WuFjkNTatAATcB9OOkAFBRYwVS8kqbJlG96yT4zktTnDeluU6abLIZwxI4KooJlJsZUXAWkyxv%2BjTrZF7SZSrojMNefwPAeQyveCoXrOLLS4MX%2Fjn4%2BJ3B1eeLAxSnJSLGvqEFPtKJQm3bVQgzdMUB%2Bqn4VIeou55p0IBnbRZNrB7nzYdknwY5NPu0ze8p%2BySGrh%2BCfRIL3z%2F2iUz8HWOf0%2Br0fgSUWo5j4FHFJpquEThpMwsR2zKohjUfiqbNCDVNm3iIBpDPcBQ8NAG9fxoPSEDr9BG4GBC%2BnmMoGAE3xHtJXU3AAF5nTON1GqmJOnXuiDEAi20QHQ6sxh41o17NQA3%2B2V8HRiM5POKOB6RwExT7rkkn%2BWak8wCHgBGZnJooU09YU08Mh6SeyLpX1NOAo5QeoEDxLYKgQECpcOzAVwLPtUzX1d0AW1Opp1GnnoS%2FP4SNTxzVwVO5p%2B4AhhFVQ5ZqobsmnzwSQ%2FK52OuwDk1y9p3mnqZl3nfuORnkO5BP0z4o9xQV6x5yT%2FID9zws97wHPHM%2F%2BvrNuOfgzeuDty7tfPbXm7%2F88tvnnpp2aOr5fX3vSbCDD8E8%2BXug%2B8c8%2BTuJOzPPReYK776Nd551rmVawI%2B82NI157RO9lCgiW6g%2BvtTIBOPyRl1kqVxGmWZhnXa1vcoqHXa2rS3c%2BZQikwQrG%2FAcO74ssxyDEenLhlbT8cghqaxKVx9%2BgCsa4hgz3Cp5wfUdhAUJNMknu8xIBfOoV8W30eNt%2BfqehXFA3PQg747vi3jPTiPns5fD0k1yb1imh6jrufbQDI94ijE1XyFEuIqvh5Yhm76xKZ0GtPkuD5GNOE0BNQGEAkbqkZuxzQdWwU2ajh3zTPJGM18okPj9adCupF8t19yGkj%2FXxDNsRjf6R2nflCaKcpTjWbuXPkXOHfzzxd%2BYJf%2FR%2Bzy%2BruDf3w%2BeP39e0Ytz9Tv%2BRT%2F8YdwPMbSMNgG8Kf8tkzW63aTNF9j4nJMQKOMS4Xra%2BVtn%2BHAoqnIqrmV2eWFpvRAnMTsQQiGBCmapH7WfDKWpPF%2Fy%2FBnYsFZWVeh8GtYm2jQUb0BO059imLE6NkCbfAzVDi0QezVwpWwu0VGNxyGbebQPY9xh891YVv4E41BIO4nsbW8QI3hVTAiIauJSFPD0s%2F49QXpZHtOrk1VH2IDq6mGoL1DqnsYcpyMTDnfkDtQrIeJOfjVq4Nrvx5c%2FvTG1%2B%2FtXPh497UvBq%2F%2FdnD5k91P%2FyIXouO0HbQfd58S16oKQ0xsq5q0mXGdPClLIMQqKRq5GDDMagsC0ogNbVSD8hGHHjWDjUlWXbVKuAfL1AvjPMk6MMRNk35WbCqxWzhUUC6TPB1GEZ0xVCQ9MBxwRFoCvhoB9fCk4y3plITRGjbWrAel2W43Yo8z99EwnzF0S9VN6YFHF9vLxxpSFG4w6RHmbSQPVlsSE1tF%2FFdq0YCmYTlE0GtOqBZi6kZ8qYucEGjSyhN%2Bp2WiK4mPhTEb5sQwHUpIIevijhzEK4w3%2BCsZQNecn9kgKjlAyklx%2FYYvTNacmdl378%2F8nEbhGid4PnN762t8prXQP1oAuWHZWEHw61gYeB0KGMYscC3MgNthD3m6ZzKNIvMnfCE4Cgtw%2BtYifP6%2Fq6Vk7DkpAAA%3D</a></p>
         */
        @NameInMap("StaticHtml")
        public String staticHtml;

        public static DescribeTraceDiagnoseReportResponseBodyReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceDiagnoseReportResponseBodyReport self = new DescribeTraceDiagnoseReportResponseBodyReport();
            return TeaModel.build(map, self);
        }

        public DescribeTraceDiagnoseReportResponseBodyReport setClientInfo(String clientInfo) {
            this.clientInfo = clientInfo;
            return this;
        }
        public String getClientInfo() {
            return this.clientInfo;
        }

        public DescribeTraceDiagnoseReportResponseBodyReport setDiagnoseResult(String diagnoseResult) {
            this.diagnoseResult = diagnoseResult;
            return this;
        }
        public String getDiagnoseResult() {
            return this.diagnoseResult;
        }

        public DescribeTraceDiagnoseReportResponseBodyReport setResponseHeader(String responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }
        public String getResponseHeader() {
            return this.responseHeader;
        }

        public DescribeTraceDiagnoseReportResponseBodyReport setStaticHtml(String staticHtml) {
            this.staticHtml = staticHtml;
            return this;
        }
        public String getStaticHtml() {
            return this.staticHtml;
        }

    }

}
