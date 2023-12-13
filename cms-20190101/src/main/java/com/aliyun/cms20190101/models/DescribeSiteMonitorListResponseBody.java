// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The site monitoring tasks that are returned.</p>
     */
    @NameInMap("SiteMonitors")
    public DescribeSiteMonitorListResponseBodySiteMonitors siteMonitors;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSiteMonitorListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorListResponseBody self = new DescribeSiteMonitorListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSiteMonitorListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSiteMonitorListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSiteMonitorListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSiteMonitorListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteMonitorListResponseBody setSiteMonitors(DescribeSiteMonitorListResponseBodySiteMonitors siteMonitors) {
        this.siteMonitors = siteMonitors;
        return this;
    }
    public DescribeSiteMonitorListResponseBodySiteMonitors getSiteMonitors() {
        return this.siteMonitors;
    }

    public DescribeSiteMonitorListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSiteMonitorListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions extends TeaModel {
        /**
         * <p>The comparison operator of the assertion. Valid values:</p>
         * <br>
         * <p>*   contains: contains</p>
         * <p>*   doesNotContain: does not contain</p>
         * <p>*   matches: matches regular expressions</p>
         * <p>*   doesNotMatch: does not match regular expressions</p>
         * <p>*   is: equal to a numeric value or matches a character</p>
         * <p>*   isNot: not equal to</p>
         * <p>*   lessThan: less than</p>
         * <p>*   moreThan: greater than</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The parsing path of the assertion.</p>
         * <br>
         * <p>*   If the assertion type is `body_json`, the path is `json path`.</p>
         * <p>*   If the assertion type is `body_xml`, the path is `xml path`.</p>
         */
        @NameInMap("property")
        public String property;

        /**
         * <p>The numeric value or character used for matching.</p>
         */
        @NameInMap("target")
        public String target;

        /**
         * <p>The assertion type. Valid values:</p>
         * <br>
         * <p>*   response_time: checks whether the response time meets expectations.</p>
         * <p>*   status_code: checks whether the HTTP status code meets expectations.</p>
         * <p>*   header: checks whether the fields in the response header meet expectations.</p>
         * <p>*   body_text: checks whether the content in the response body meets expectations by using text matching.</p>
         * <p>*   body_json: checks whether the content in the response body meets expectations by using JSON parsing (JSONPath).</p>
         * <p>*   body_xml: checks whether the content in the response body meets expectations by using XML parsing (XPath).</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions self = new DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertions extends TeaModel {
        @NameInMap("assertions")
        public java.util.List<DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions> assertions;

        public static DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertions self = new DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertions();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertions setAssertions(java.util.List<DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions> assertions) {
            this.assertions = assertions;
            return this;
        }
        public java.util.List<DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertionsAssertions> getAssertions() {
            return this.assertions;
        }

    }

    public static class DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson extends TeaModel {
        /**
         * <p>The acceptable status code.</p>
         * <br>
         * <p>>  We recommend that you configure assertions.</p>
         */
        @NameInMap("acceptable_response_code")
        public String acceptableResponseCode;

        /**
         * <p>The assertions.</p>
         */
        @NameInMap("assertions")
        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertions assertions;

        /**
         * <p>The number of retries after a DNS failure occurred.</p>
         */
        @NameInMap("attempts")
        public Long attempts;

        /**
         * <p>Indicates whether the security authentication feature is enabled. Valid values:</p>
         * <br>
         * <p>*   0: The feature is enabled.</p>
         * <p>*   1: The feature is disabled.</p>
         */
        @NameInMap("authentication")
        public Integer authentication;

        /**
         * <p>Indicates whether the certificate is verified. Valid values:</p>
         * <br>
         * <p>*   false (default): The certificate is not verified.</p>
         * <p>*   true: The certificate is verified.</p>
         */
        @NameInMap("cert_verify")
        public Boolean certVerify;

        /**
         * <p>The cookie of the HTTP request.</p>
         */
        @NameInMap("cookie")
        public String cookie;

        /**
         * <p>Indicates whether MTR is automatically used to diagnose network issues if a task fails. Valid values:</p>
         * <br>
         * <p>*   false (default): MTR is not automatically used to diagnose network issues if a task fails.</p>
         * <p>*   true: MTR is automatically used to diagnose network issues if a task fails.</p>
         */
        @NameInMap("diagnosis_mtr")
        public Boolean diagnosisMtr;

        /**
         * <p>Indicates whether ping requests are automatically sent to detect network latency if a detection task fails. Valid values:</p>
         * <br>
         * <p>*   false (default): Ping requests are not automatically sent to detect network latency if a detection task fails.</p>
         * <p>*   true: Ping requests are automatically sent to detect network latency if a detection task fails.</p>
         */
        @NameInMap("diagnosis_ping")
        public Boolean diagnosisPing;

        /**
         * <p>The relationship between the list of expected aliases or IP addresses and the list of DNS results. Valid values:</p>
         * <br>
         * <p>*   IN_DNS: The list of expected values is a subset of the list of DNS results.</p>
         * <p>*   DNS_IN: The list of DNS results is a subset of the list of expected values.</p>
         * <p>*   EQUAL: The list of DNS results is the same as the list of expected values.</p>
         * <p>*   ANY: The list of DNS results intersects with the list of expected values.</p>
         */
        @NameInMap("dns_match_rule")
        public String dnsMatchRule;

        /**
         * <p>The domain name or IP address of the DNS server.</p>
         */
        @NameInMap("dns_server")
        public String dnsServer;

        /**
         * <p>The type of the DNS record. This parameter is returned only if the TaskType parameter is set to DNS. Valid values:</p>
         * <br>
         * <p>*   A (default): a record that specifies an IP address related to the specified host name or domain name.</p>
         * <p>*   CNAME: a record that maps multiple domain names to a domain name.</p>
         * <p>*   NS: a record that specifies a DNS server used to parse domain names.</p>
         * <p>*   MX: a record that links domain names to the address of a mail server.</p>
         * <p>*   TXT: a record that stores the text information of host name or domain names. The text must be 1 to 512 bytes in length. The TXT record serves as a Sender Policy Framework (SPF) record to fight against spam.</p>
         * <p>*   AAAA: a record that maps a domain name to the relevant IPv6 address.</p>
         */
        @NameInMap("dns_type")
        public String dnsType;

        /**
         * <p>Indicates whether the DNS server of the carrier is used.</p>
         * <br>
         * <p>*   true (default): The DNS server of the carrier is used.</p>
         * <p>*   false: The DNS server of the carrier is not used. The default DNS server or the specified DNS server is used.</p>
         */
        @NameInMap("enable_operator_dns")
        public Boolean enableOperatorDns;

        /**
         * <p>The packet loss rate.</p>
         * <br>
         * <p>>  This parameter is returned only if the TaskType parameter is set to PING.</p>
         */
        @NameInMap("failure_rate")
        public Float failureRate;

        /**
         * <p>The header of the HTTP request. An HTTP header is a key-value pair in which the key and the value are separated by a colon (:). The format is `key1:value1`. Each HTTP header occupies a line.</p>
         */
        @NameInMap("header")
        public String header;

        /**
         * <p>The HTTP request method. Valid values:</p>
         * <br>
         * <p>*   get</p>
         * <p>*   post</p>
         * <p>*   head</p>
         */
        @NameInMap("http_method")
        public String httpMethod;

        /**
         * <p>Indicates whether the password is decoded by using the Base64 algorithm. Valid values:</p>
         * <br>
         * <p>*   true: The password is decoded by using the Base64 algorithm.</p>
         * <p>*   false (default): The password is not decoded by using the Base64 algorithm.</p>
         */
        @NameInMap("isBase64Encode")
        public String isBase64Encode;

        /**
         * <p>Indicates whether the alert rule is included. Valid values:</p>
         * <br>
         * <p>*   0: The alert rule is included.</p>
         * <p>*   1: The alert rule is not included.</p>
         */
        @NameInMap("match_rule")
        public Integer matchRule;

        /**
         * <p>The password of the SMTP, POP3, or FTP protocol.</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The number of hops for the PING protocol.</p>
         */
        @NameInMap("ping_num")
        public Integer pingNum;

        /**
         * <p>The port number of the TCP, UDP, SMTP, or POP3 protocol.</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The protocol type of DNS detection. Valid values:</p>
         * <br>
         * <p>*   udp (default)</p>
         * <p>*   tcp</p>
         * <p>*   tcp-tls</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>Indicates whether the PROXY protocol is enabled. Valid values:</p>
         * <br>
         * <p>*   false (default): The PROXY protocol is disabled.</p>
         * <p>*   true: The PROXY protocol is enabled.</p>
         */
        @NameInMap("proxy_protocol")
        public Boolean proxyProtocol;

        /**
         * <p>The content of the HTTP request.</p>
         */
        @NameInMap("request_content")
        public String requestContent;

        /**
         * <p>The format of the HTTP request. Valid values:</p>
         * <br>
         * <p>*   hex: hexadecimal</p>
         * <p>*   txt: text</p>
         */
        @NameInMap("request_format")
        public String requestFormat;

        /**
         * <p>The response to the HTTP request.</p>
         * <br>
         * <p>*   Hexadecimal format: If the request content is a byte string and cannot be represented in printable characters, you can convert the byte string to printable characters in the hexadecimal format. If you convert the byte string to printable characters in the hexadecimal format, one byte is converted to two hexadecimal characters. For example, (byte)1 is converted to `01` and (byte)27 is converted to `1B`. If the request content is a binary array in the Java format, for example, `{(byte)1, (byte)27}`, you can convert the binary array to `011b` or `011B`. Hexadecimal characters are not case-sensitive in site monitoring tasks. You can enter `011B` in the request content and set the request_format parameter to hex.</p>
         * <p>*   Text format: Common text refers to strings that consist of printable characters.</p>
         */
        @NameInMap("response_content")
        public String responseContent;

        /**
         * <p>The format of the HTTP response. Valid values:</p>
         * <br>
         * <p>*   hex: hexadecimal</p>
         * <p>*   txt: text</p>
         */
        @NameInMap("response_format")
        public String responseFormat;

        /**
         * <p>The number of times a failed detection request is retried.</p>
         */
        @NameInMap("retry_delay")
        public Integer retryDelay;

        /**
         * <p>The timeout period. Unit: milliseconds.</p>
         */
        @NameInMap("time_out")
        public Long timeOut;

        /**
         * <p>Indicates whether redirects are followed if the status code 301 or 302 is returned. Valid values:</p>
         * <br>
         * <p>*   true: Redirects are not followed.</p>
         * <p>*   false (default): Redirects are followed.</p>
         */
        @NameInMap("unfollow_redirect")
        public Boolean unfollowRedirect;

        /**
         * <p>The username of the FTP, SMTP, or POP3 protocol.</p>
         */
        @NameInMap("username")
        public String username;

        public static DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson self = new DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setAcceptableResponseCode(String acceptableResponseCode) {
            this.acceptableResponseCode = acceptableResponseCode;
            return this;
        }
        public String getAcceptableResponseCode() {
            return this.acceptableResponseCode;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setAssertions(DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertions assertions) {
            this.assertions = assertions;
            return this;
        }
        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJsonAssertions getAssertions() {
            return this.assertions;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setAttempts(Long attempts) {
            this.attempts = attempts;
            return this;
        }
        public Long getAttempts() {
            return this.attempts;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setAuthentication(Integer authentication) {
            this.authentication = authentication;
            return this;
        }
        public Integer getAuthentication() {
            return this.authentication;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setCertVerify(Boolean certVerify) {
            this.certVerify = certVerify;
            return this;
        }
        public Boolean getCertVerify() {
            return this.certVerify;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setDiagnosisMtr(Boolean diagnosisMtr) {
            this.diagnosisMtr = diagnosisMtr;
            return this;
        }
        public Boolean getDiagnosisMtr() {
            return this.diagnosisMtr;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setDiagnosisPing(Boolean diagnosisPing) {
            this.diagnosisPing = diagnosisPing;
            return this;
        }
        public Boolean getDiagnosisPing() {
            return this.diagnosisPing;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setDnsMatchRule(String dnsMatchRule) {
            this.dnsMatchRule = dnsMatchRule;
            return this;
        }
        public String getDnsMatchRule() {
            return this.dnsMatchRule;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setDnsServer(String dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public String getDnsServer() {
            return this.dnsServer;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setDnsType(String dnsType) {
            this.dnsType = dnsType;
            return this;
        }
        public String getDnsType() {
            return this.dnsType;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setEnableOperatorDns(Boolean enableOperatorDns) {
            this.enableOperatorDns = enableOperatorDns;
            return this;
        }
        public Boolean getEnableOperatorDns() {
            return this.enableOperatorDns;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setFailureRate(Float failureRate) {
            this.failureRate = failureRate;
            return this;
        }
        public Float getFailureRate() {
            return this.failureRate;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setHeader(String header) {
            this.header = header;
            return this;
        }
        public String getHeader() {
            return this.header;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setIsBase64Encode(String isBase64Encode) {
            this.isBase64Encode = isBase64Encode;
            return this;
        }
        public String getIsBase64Encode() {
            return this.isBase64Encode;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setMatchRule(Integer matchRule) {
            this.matchRule = matchRule;
            return this;
        }
        public Integer getMatchRule() {
            return this.matchRule;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setPingNum(Integer pingNum) {
            this.pingNum = pingNum;
            return this;
        }
        public Integer getPingNum() {
            return this.pingNum;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setProxyProtocol(Boolean proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
            return this;
        }
        public Boolean getProxyProtocol() {
            return this.proxyProtocol;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setRequestContent(String requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public String getRequestContent() {
            return this.requestContent;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setRequestFormat(String requestFormat) {
            this.requestFormat = requestFormat;
            return this;
        }
        public String getRequestFormat() {
            return this.requestFormat;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setResponseContent(String responseContent) {
            this.responseContent = responseContent;
            return this;
        }
        public String getResponseContent() {
            return this.responseContent;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setResponseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }
        public String getResponseFormat() {
            return this.responseFormat;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setRetryDelay(Integer retryDelay) {
            this.retryDelay = retryDelay;
            return this;
        }
        public Integer getRetryDelay() {
            return this.retryDelay;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setTimeOut(Long timeOut) {
            this.timeOut = timeOut;
            return this;
        }
        public Long getTimeOut() {
            return this.timeOut;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setUnfollowRedirect(Boolean unfollowRedirect) {
            this.unfollowRedirect = unfollowRedirect;
            return this;
        }
        public Boolean getUnfollowRedirect() {
            return this.unfollowRedirect;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor extends TeaModel {
        /**
         * <p>The URL or IP address that is monitored by the site monitoring task.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The detection point type. Valid values:</p>
         * <br>
         * <p>*   PC</p>
         * <p>*   MOBILE</p>
         */
        @NameInMap("AgentGroup")
        public String agentGroup;

        /**
         * <p>The time when the site monitoring task was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The interval at which detection requests are sent. Unit: minutes.</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The extended options of the site monitoring task. The options vary based on the specified protocol. For more information, see [CreateSiteMonitor](~~115048~~).</p>
         */
        @NameInMap("OptionsJson")
        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson optionsJson;

        /**
         * <p>The ID of the site monitoring task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the site monitoring task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The task status. Valid values:</p>
         * <br>
         * <p>*   1: The task is enabled.</p>
         * <p>*   2: The task is disabled.</p>
         */
        @NameInMap("TaskState")
        public String taskState;

        /**
         * <p>The protocol that is used by the site monitoring task. Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The time when the site monitoring task was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor self = new DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setAgentGroup(String agentGroup) {
            this.agentGroup = agentGroup;
            return this;
        }
        public String getAgentGroup() {
            return this.agentGroup;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setOptionsJson(DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }
        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson getOptionsJson() {
            return this.optionsJson;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeSiteMonitorListResponseBodySiteMonitors extends TeaModel {
        @NameInMap("SiteMonitor")
        public java.util.List<DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor> siteMonitor;

        public static DescribeSiteMonitorListResponseBodySiteMonitors build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseBodySiteMonitors self = new DescribeSiteMonitorListResponseBodySiteMonitors();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorListResponseBodySiteMonitors setSiteMonitor(java.util.List<DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor> siteMonitor) {
            this.siteMonitor = siteMonitor;
            return this;
        }
        public java.util.List<DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor> getSiteMonitor() {
            return this.siteMonitor;
        }

    }

}
