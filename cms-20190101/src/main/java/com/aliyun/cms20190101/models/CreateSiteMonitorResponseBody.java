// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateSiteMonitorResponseBody extends TeaModel {
    /**
     * <p>The extended options of the protocol that is used by the site monitoring task. The options vary based on the protocol.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("CreateResultList")
    public CreateSiteMonitorResponseBodyCreateResultList createResultList;

    /**
     * <p>The result of the site monitoring task.</p>
     */
    @NameInMap("Data")
    public CreateSiteMonitorResponseBodyData data;

    /**
     * <p>The URL or IP address that is monitored by the task.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the alert rule.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The interval at which detection requests are sent.</p>
     * <br>
     * <p>Valid values: 1, 5, 15, 30, and 60. Unit: minutes.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateSiteMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteMonitorResponseBody self = new CreateSiteMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSiteMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSiteMonitorResponseBody setCreateResultList(CreateSiteMonitorResponseBodyCreateResultList createResultList) {
        this.createResultList = createResultList;
        return this;
    }
    public CreateSiteMonitorResponseBodyCreateResultList getCreateResultList() {
        return this.createResultList;
    }

    public CreateSiteMonitorResponseBody setData(CreateSiteMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSiteMonitorResponseBodyData getData() {
        return this.data;
    }

    public CreateSiteMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSiteMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSiteMonitorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateSiteMonitorResponseBodyCreateResultListCreateResultList extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static CreateSiteMonitorResponseBodyCreateResultListCreateResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyCreateResultListCreateResultList self = new CreateSiteMonitorResponseBodyCreateResultListCreateResultList();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyCreateResultListCreateResultList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateSiteMonitorResponseBodyCreateResultListCreateResultList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class CreateSiteMonitorResponseBodyCreateResultList extends TeaModel {
        @NameInMap("CreateResultList")
        public java.util.List<CreateSiteMonitorResponseBodyCreateResultListCreateResultList> createResultList;

        public static CreateSiteMonitorResponseBodyCreateResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyCreateResultList self = new CreateSiteMonitorResponseBodyCreateResultList();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyCreateResultList setCreateResultList(java.util.List<CreateSiteMonitorResponseBodyCreateResultListCreateResultList> createResultList) {
            this.createResultList = createResultList;
            return this;
        }
        public java.util.List<CreateSiteMonitorResponseBodyCreateResultListCreateResultList> getCreateResultList() {
            return this.createResultList;
        }

    }

    public static class CreateSiteMonitorResponseBodyDataAttachAlertResultContact extends TeaModel {
        /**
         * <p>The status code that is returned after you associate the existing alert rule with the site monitoring task.</p>
         * <br>
         * <p>>  The status code 200 indicates that the call was successful.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The following tables describe the extended options of the HTTP, HTTPS, PING, TCP, UDP, DNS, SMTP. POP3, and FTP protocols specified by the TaskType parameter.  </p>
         * <br>
         * <p>- HTTP or HTTPS</p>
         * <br>
         * <p>| Parameter | Type | Description |</p>
         * <p>| --------- | ---- | ----------- |</p>
         * <p>| http_method | String | The HTTP or HTTPS request method. Valid values: GET, POST, and HEAD. Default value: GET. |</p>
         * <p>| header | String | The custom HTTP headers that are separated by line feeds (\n). </p>
         * <br>
         * <p>Each header must comply with the HTTP protocol. Each header must be a key-value pair in which the key and value are separated by a colon (:). |</p>
         * <p>| cookie | String | The HTTP cookie that is specified in compliance with the HTTP request standard. |</p>
         * <p>| request_content | String | The content of the request. The content can be in the JSON or form format. If this parameter is not specified, the request body is empty. |</p>
         * <p>| response_content | String | The expected content of the response. The first 64 bytes of the content returned by the HTTP server are checked during site monitoring. |</p>
         * <p>| match_rule | String | 0: If the response does not contain the content specified by the response_content parameter, the detection is successful.  </p>
         * <br>
         * <p>1: If the response contains the content specified by the response_content parameter, the detection is successful. |</p>
         * <p>| username | String | If the username parameter is specified, the HTTP request contains the basic authentication header. |</p>
         * <p>| password | String | The password that is used to authenticate the HTTP or HTTPS request. |</p>
         * <p>| time_out | int | The timeout period. Unit: milliseconds. Default value: 5. |</p>
         * <p>| max_redirect | int | The maximum number of redirections. The default value is 5 for a detection point that is running on an Elastic Compute Service (ECS) instance and 2 for a detection point that is provided by a carrier.  </p>
         * <br>
         * <p>To disable redirections, set the value to 0. </p>
         * <br>
         * <p>Valid values: 0 to 50. |</p>
         * <p>- PING</p>
         * <br>
         * <p>| Parameter | Type | Description |</p>
         * <p>| --------- | ---- | ----------- |</p>
         * <p>| failure_rate | Text | If the rate of the failed pings exceeds the value of this parameter, the detection fails and the status code 610 or 615 is returned. The error message of the status code 610 is PingAllFail and the error message of the status code 615 is PingPartialFail. </p>
         * <br>
         * <p>Default value: 0.1. |</p>
         * <p>| ping_num | int | The number of times that the monitored address is pinged. Default value: 10. </p>
         * <br>
         * <p>Valid values: 1 to 100. |</p>
         * <p>- DNS</p>
         * <br>
         * <p>| Parameter | Type | Description |</p>
         * <p>| --------- | ---- | ----------- |</p>
         * <p>| dns_server | string | The domain name or IP address of the Domain Name System (DNS) server. |</p>
         * <p>| dns_type | string | The type of the DNS records to query. Valid values: A, NS, CNAME, MX, TXT, ANY, and AAAA. |</p>
         * <p>| expect_value | string | The list of expected values. Separate the expected values with space characters. |</p>
         * <p>| match_rule | string | The relationship between the list of expected values and the list of DNS results. If the two lists do not meet the specified relationship, the detection fails. Valid values:    </p>
         * <br>
         * <p>Empty string or IN_DNS: The list of expected values is a subset of the list of DNS results.   </p>
         * <br>
         * <p>DNS_IN: The list of DNS results is a subset of the list of expected values.    </p>
         * <br>
         * <p>EQUAL: The list of DNS results is the same as the list of expected values.   </p>
         * <br>
         * <p>ANY: The list of DNS results intersects with the list of expected values. |</p>
         * <p>- FTP</p>
         * <br>
         * <p>| Parameter | Type | Description |</p>
         * <p>| --------- | ---- | ----------- |</p>
         * <p>| port | int | The port number of the FTP server. If this parameter is not specified, the default value is used. The default port number is 21 for FTP and 990 for FTPS. |</p>
         * <p>| username | string | The username that is used to log on to the FTP server.  If this parameter is not specified, anonymous logon is used. |</p>
         * <p>| password | string | The password that is used to log on to the FTP server. |</p>
         * <p>- POP3 or SMTP</p>
         * <br>
         * <p>| Parameter | Type | Description |</p>
         * <p>| --------- | ---- | ----------- |</p>
         * <p>| port | int | The port number of the POP3 or SMTP server. The default port number is 110 for POP3, 995 for POPS3, and 25 for SMTP. |</p>
         * <p>| username | string | The username that is used to log on to the POP3 or SMTP server. The username and password that are used to log on to the POP3 or SMTP server are required. |</p>
         * <p>| password | string | The password that is used to log on to the POP3 or SMTP server. The username and password that are used to log on to the POP3 or SMTP server are required. |</p>
         * <p>- TCP or UDP</p>
         * <br>
         * <p>| Parameter | Type | Description |</p>
         * <p>| --------- | ---- | ----------- |</p>
         * <p>| port | int | The port number of the TCP or UDP server. |</p>
         * <p>| request_content | string | The content of the request. If the request_format parameter is set to hex, the value of the request_content parameter is parsed in the hexadecimal format. |</p>
         * <p>| request_format | string | If the request_format parameter is set to another value, the value of the request_content parameter is sent to the TCP or UDP server as a regular string. |</p>
         * <p>| response_content | string | The content of the response. If the response from the TCP or UDP server does not contain the content specified by the response_content parameter, the detection fails.  </p>
         * <br>
         * <p>If the response_format parameter is set to hex, the value of the response_content parameter is parsed in the hexadecimal format.  </p>
         * <br>
         * <p>If the response_format parameter is set to another value, the value of the response_content parameter is parsed as a regular string. |</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Creates a site monitoring task.</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Success")
        public String success;

        public static CreateSiteMonitorResponseBodyDataAttachAlertResultContact build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyDataAttachAlertResultContact self = new CreateSiteMonitorResponseBodyDataAttachAlertResultContact();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class CreateSiteMonitorResponseBodyDataAttachAlertResult extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<CreateSiteMonitorResponseBodyDataAttachAlertResultContact> contact;

        public static CreateSiteMonitorResponseBodyDataAttachAlertResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyDataAttachAlertResult self = new CreateSiteMonitorResponseBodyDataAttachAlertResult();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResult setContact(java.util.List<CreateSiteMonitorResponseBodyDataAttachAlertResultContact> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<CreateSiteMonitorResponseBodyDataAttachAlertResultContact> getContact() {
            return this.contact;
        }

    }

    public static class CreateSiteMonitorResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("AttachAlertResult")
        public CreateSiteMonitorResponseBodyDataAttachAlertResult attachAlertResult;

        public static CreateSiteMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyData self = new CreateSiteMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyData setAttachAlertResult(CreateSiteMonitorResponseBodyDataAttachAlertResult attachAlertResult) {
            this.attachAlertResult = attachAlertResult;
            return this;
        }
        public CreateSiteMonitorResponseBodyDataAttachAlertResult getAttachAlertResult() {
            return this.attachAlertResult;
        }

    }

}
