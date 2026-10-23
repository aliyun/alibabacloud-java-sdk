// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the current page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries that can be displayed on each page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0D6E20E4-8326-1D03-A553-2182BE9E82F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of endpoint security alert events returned on the current page.</p>
     */
    @NameInMap("SuspEvents")
    public java.util.List<DescribeSuspEventsResponseBodySuspEvents> suspEvents;

    /**
     * <p>The total number of alert events.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSuspEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsResponseBody self = new DescribeSuspEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeSuspEventsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventsResponseBody setSuspEvents(java.util.List<DescribeSuspEventsResponseBodySuspEvents> suspEvents) {
        this.suspEvents = suspEvents;
        return this;
    }
    public java.util.List<DescribeSuspEventsResponseBodySuspEvents> getSuspEvents() {
        return this.suspEvents;
    }

    public DescribeSuspEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSuspEventsResponseBodySuspEventsDetails extends TeaModel {
        /**
         * <p>The display text of the detail item name, such as ATT&amp;CK attack phase, Process path, or Handling suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>ATT&amp;CK attack phase</p>
         */
        @NameInMap("NameDisplay")
        public String nameDisplay;

        /**
         * <p>The data display type of the detail item. Valid values:</p>
         * <ul>
         * <li><code>text</code>: Text.</li>
         * <li><code>processChain</code>: Process chain (parent process relationship).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The raw value of the detail item. The meaning is determined by Name and Type. For example, the value is the phase name for an attack phase item, and the path for a process path item. When Type is <code>processChain</code>, the value is a process chain data string.</p>
         * 
         * <strong>example:</strong>
         * <p>Code execution</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The display value of the detail item, which may be the same as Value. The specific meaning depends on the detail item and is not strictly fixed as a file path.</p>
         * 
         * <strong>example:</strong>
         * <p>Code execution</p>
         */
        @NameInMap("ValueDisplay")
        public String valueDisplay;

        public static DescribeSuspEventsResponseBodySuspEventsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEventsDetails self = new DescribeSuspEventsResponseBodySuspEventsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class DescribeSuspEventsResponseBodySuspEventsEventNotes extends TeaModel {
        /**
         * <p>The note content.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The ID of the event record.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NoteId")
        public Long noteId;

        /**
         * <p>The time when the event was recorded. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-26 01:51:01</p>
         */
        @NameInMap("NoteTime")
        public String noteTime;

        public static DescribeSuspEventsResponseBodySuspEventsEventNotes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEventsEventNotes self = new DescribeSuspEventsResponseBodySuspEventsEventNotes();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEventsEventNotes setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeSuspEventsResponseBodySuspEventsEventNotes setNoteId(Long noteId) {
            this.noteId = noteId;
            return this;
        }
        public Long getNoteId() {
            return this.noteId;
        }

        public DescribeSuspEventsResponseBodySuspEventsEventNotes setNoteTime(String noteTime) {
            this.noteTime = noteTime;
            return this;
        }
        public String getNoteTime() {
            return this.noteTime;
        }

    }

    public static class DescribeSuspEventsResponseBodySuspEventsTacticItems extends TeaModel {
        /**
         * <p>The display name of the ATT&amp;CK tactic (attack stage).</p>
         * 
         * <strong>example:</strong>
         * <p>Code execution</p>
         */
        @NameInMap("TacticDisplayName")
        public String tacticDisplayName;

        /**
         * <p>The ID of the ATT&amp;CK tactic (attack stage). For example, <code>TA0002</code> corresponds to Execution.</p>
         * 
         * <strong>example:</strong>
         * <p>TA0002</p>
         */
        @NameInMap("TacticId")
        public String tacticId;

        public static DescribeSuspEventsResponseBodySuspEventsTacticItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEventsTacticItems self = new DescribeSuspEventsResponseBodySuspEventsTacticItems();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEventsTacticItems setTacticDisplayName(String tacticDisplayName) {
            this.tacticDisplayName = tacticDisplayName;
            return this;
        }
        public String getTacticDisplayName() {
            return this.tacticDisplayName;
        }

        public DescribeSuspEventsResponseBodySuspEventsTacticItems setTacticId(String tacticId) {
            this.tacticId = tacticId;
            return this;
        }
        public String getTacticId() {
            return this.tacticId;
        }

    }

    public static class DescribeSuspEventsResponseBodySuspEvents extends TeaModel {
        /**
         * <p>Indicates whether the alert is generated by offline analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Advanced")
        public Boolean advanced;

        /**
         * <p>The internal name or rule name of the alert event. For the user-facing alert name, see AlarmEventNameDisplay.</p>
         * 
         * <strong>example:</strong>
         * <p>SASE non-whitelisted startup interception_PC</p>
         */
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        /**
         * <p>The user-facing name of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Untrusted process startup</p>
         */
        @NameInMap("AlarmEventNameDisplay")
        public String alarmEventNameDisplay;

        /**
         * <p>The type of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Precision defense</p>
         */
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        /**
         * <p>The user-facing name of the alert type.</p>
         * 
         * <strong>example:</strong>
         * <p>Precision defense</p>
         */
        @NameInMap("AlarmEventTypeDisplay")
        public String alarmEventTypeDisplay;

        /**
         * <p>The unique ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>c37dd8bb7f5d24105f7499abf8fc****</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <p>The name of the application to which the alert event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-deploy-tibasic</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The completion status of automatic blocking. Returns true when the alert status is AUTO_DEALING_DONE (513), and returns false for other statuses. This field cannot be used to determine whether automatic defense has occurred. Even if OperateErrorCode is auto_defense.Success, this field may return false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoBreaking")
        public Boolean autoBreaking;

        /**
         * <p>Indicates whether the legacy online scan and kill capability is supported. This operation returns false. This field is not a list of executable operations for the alert. A value of false does not mean that the alert cannot be ignored, added to the whitelist, or marked as manually handled. To query executable operations, call DescribeSecurityEventOperations.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        /**
         * <p>Indicates whether the alert is in a state where the false positive mark can be canceled. Returns true when the alert status is FAULT (8), and returns false for other statuses. This status indicator does not replace full capability checks such as feature switches and operation configurations. To query the actual executable operations for canceling the whitelist, call DescribeSecurityEventOperations.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        /**
         * <p>The ID of the container cluster. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>c-45c926ddacXXXXXX</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Indicates whether the enhanced protection mode is enabled for the server. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        /**
         * <p>The ID of the container. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>container_1648601865161_14925_02_000****</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The ID of the container image. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:2e5a3b0ae5f452b3cb458789a9a7542ef40035a84318469a8528c5e444db1****</p>
         */
        @NameInMap("ContainerImageId")
        public String containerImageId;

        /**
         * <p>The name of the container image. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>centos7_apache:v1.0.1</p>
         */
        @NameInMap("ContainerImageName")
        public String containerImageName;

        /**
         * <p>The identifier of the alert data source. The return example for endpoint alerts is <code>aegis_suspicious_event_pc</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis_suspicious_event_pc</p>
         */
        @NameInMap("DataSource")
        public String dataSource;

        /**
         * <p>The name of the department.</p>
         * 
         * <strong>example:</strong>
         * <p>Technology Operations Department</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The summary of the alert event, which describes the detected or blocked behavior.</p>
         * 
         * <strong>example:</strong>
         * <p>Blocked the startup of a non-whitelisted process</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The list of alert detail items, which may include prompts, attack phases, malicious behaviors, process paths, command lines, handling suggestions, and parent process relationships. The detail items and their quantities may vary for different alerts.</p>
         */
        @NameInMap("Details")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> details;

        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated field</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated field</p>
         */
        @NameInMap("DevType")
        public String devType;

        /**
         * <p>Indicates whether cloud sandbox detection is supported. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisplaySandboxResult")
        public Boolean displaySandboxResult;

        /**
         * <p>The list of notes for the alert event. An empty array <code>[]</code> is returned if there are no notes.</p>
         */
        @NameInMap("EventNotes")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsEventNotes> eventNotes;

        /**
         * <p>The handling status of the endpoint alert. Valid values:</p>
         * <ul>
         * <li><code>1</code>: Pending.</li>
         * <li><code>2</code>: Ignored.</li>
         * <li><code>4</code>: Manually handled.</li>
         * <li><code>8</code>: Whitelisted (marked as a false positive).</li>
         * <li><code>32</code>: Handled, such as successful blocking by automatic defense.</li>
         * <li><code>64</code>: Expired.</li>
         * </ul>
         * <p>The system may change the status of an unhandled alert to Expired if more than 31 days have passed since its last occurrence.</p>
         * <p>The actual statuses that appear depend on the alert template and the actual handling results.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("EventStatus")
        public Integer eventStatus;

        /**
         * <p>The subtype identifier of the alert event. The value of this field may be the same as AlarmEventName.</p>
         * 
         * <strong>example:</strong>
         * <p>SASE non-whitelisted startup interception_PC</p>
         */
        @NameInMap("EventSubType")
        public String eventSubType;

        /**
         * <p>Indicates whether the alert event has tracing information. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasTraceInfo")
        public Boolean hasTraceInfo;

        /**
         * <p>The name of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>FW-NAT-1A-ZZMY</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The numeric ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The UUID of the image. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>70489fb520cea585ad9761d5a842****</p>
         */
        @NameInMap("ImageUuid")
        public String imageUuid;

        /**
         * <p>The instance identifier of the endpoint or asset affected by the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>c208107c-3b39-4fc1-bbdb-************</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the endpoint or asset affected by the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>iZ0rqjt4wqw****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the endpoint or asset affected by the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>172.18.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the K8s cluster. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>c517b37e1401e4961b3951863a49a****</p>
         */
        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        /**
         * <p>The name of the K8s cluster. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>test-daily</p>
         */
        @NameInMap("K8sClusterName")
        public String k8sClusterName;

        /**
         * <p>The K8s namespace. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        /**
         * <p>The ID of the K8s node. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp14a1ay8e0aa9t0****</p>
         */
        @NameInMap("K8sNodeId")
        public String k8sNodeId;

        /**
         * <p>The name of the K8s node. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("K8sNodeName")
        public String k8sNodeName;

        /**
         * <p>The name of the K8s pod. Not supported by SASE-EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp-pod</p>
         */
        @NameInMap("K8sPodName")
        public String k8sPodName;

        /**
         * <p>Indicates whether large model analysis tags are supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LargeModel")
        public Boolean largeModel;

        /**
         * <p>The last time the alert event occurred. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-19 20:52:13</p>
         */
        @NameInMap("LastTime")
        public String lastTime;

        /**
         * <p>The timestamp of the last occurrence, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792414333000</p>
         */
        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        /**
         * <p>The risk level of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>serious</strong>: Urgent.</li>
         * <li><strong>suspicious</strong>: Suspicious.</li>
         * <li><strong>remind</strong>: Reminder.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated field</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The status of the malicious behavior defense rule. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: Enabled.</li>
         * <li><strong>close</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("MaliciousRuleStatus")
        public String maliciousRuleStatus;

        /**
         * <p>The collection of tags for the alert event.</p>
         */
        @NameInMap("MarkList")
        public java.util.List<String> markList;

        /**
         * <p>The advanced whitelist rules.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>1.</strong>  path  contain  232</p>
         */
        @NameInMap("MarkMisRules")
        public String markMisRules;

        /**
         * <p>The full name of the alert event, such as Precise defense - untrusted process startup.</p>
         * 
         * <strong>example:</strong>
         * <p>Precise defense - untrusted process startup</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the alert event first occurred. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-19 14:09:24</p>
         */
        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        /**
         * <p>The timestamp of the first occurrence, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792390164000</p>
         */
        @NameInMap("OccurrenceTimeStamp")
        public Long occurrenceTimeStamp;

        /**
         * <p>The result code of the alert handling operation, in the format of Operation type.Result code. For example, <code>auto_defense.Success</code> indicates that automatic defense is successful. This field also returns success results and does not only indicate errors.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_defense.Success</p>
         */
        @NameInMap("OperateErrorCode")
        public String operateErrorCode;

        /**
         * <p>The note for the alert event operation.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("OperateMsg")
        public String operateMsg;

        /**
         * <p>The timestamp of the alert event operation, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792414333000</p>
         */
        @NameInMap("OperateTime")
        public Long operateTime;

        /**
         * <p>The product edition supported for alert event detection. SASE-EDR is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SaleVersion")
        public String saleVersion;

        /**
         * <p>The IDs of the associated alert events, returned as strings.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("SecurityEventIds")
        public String securityEventIds;

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.205.XXX.XXX</p>
         */
        @NameInMap("SrcIp")
        public String srcIp;

        /**
         * <p>The list of ATT&amp;CK attack stage names, returned as a serialized JSON array string. For example, if the field value is <code>[&quot;Execution&quot;]</code>, parsing it yields a string array.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Execution&quot;]</p>
         */
        @NameInMap("Stages")
        public String stages;

        /**
         * <p>The list of ATT&amp;CK attack stage details. Each item contains the stage ID and display name.</p>
         */
        @NameInMap("TacticItems")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsTacticItems> tacticItems;

        /**
         * <p>The unique key of the security alert.</p>
         * 
         * <strong>example:</strong>
         * <p>33ead328b4c3c2c6ddb5a6925ec9****</p>
         */
        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        /**
         * <p>The username of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The unique identifier of the endpoint or asset affected by the alert event. For endpoint alerts, the identifier may start with <code>inet-pc-</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>inet-pc-c6641e3e-2646-4688-ac38-************</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSuspEventsResponseBodySuspEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEvents self = new DescribeSuspEventsResponseBodySuspEvents();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEvents setAdvanced(Boolean advanced) {
            this.advanced = advanced;
            return this;
        }
        public Boolean getAdvanced() {
            return this.advanced;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventNameDisplay(String alarmEventNameDisplay) {
            this.alarmEventNameDisplay = alarmEventNameDisplay;
            return this;
        }
        public String getAlarmEventNameDisplay() {
            return this.alarmEventNameDisplay;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
            this.alarmEventTypeDisplay = alarmEventTypeDisplay;
            return this;
        }
        public String getAlarmEventTypeDisplay() {
            return this.alarmEventTypeDisplay;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAutoBreaking(Boolean autoBreaking) {
            this.autoBreaking = autoBreaking;
            return this;
        }
        public Boolean getAutoBreaking() {
            return this.autoBreaking;
        }

        public DescribeSuspEventsResponseBodySuspEvents setCanBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeSuspEventsResponseBodySuspEvents setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeSuspEventsResponseBodySuspEvents setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setContainHwMode(Boolean containHwMode) {
            this.containHwMode = containHwMode;
            return this;
        }
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        public DescribeSuspEventsResponseBodySuspEvents setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setContainerImageId(String containerImageId) {
            this.containerImageId = containerImageId;
            return this;
        }
        public String getContainerImageId() {
            return this.containerImageId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setContainerImageName(String containerImageName) {
            this.containerImageName = containerImageName;
            return this;
        }
        public String getContainerImageName() {
            return this.containerImageName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDetails(java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> getDetails() {
            return this.details;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDevType(String devType) {
            this.devType = devType;
            return this;
        }
        public String getDevType() {
            return this.devType;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDisplaySandboxResult(Boolean displaySandboxResult) {
            this.displaySandboxResult = displaySandboxResult;
            return this;
        }
        public Boolean getDisplaySandboxResult() {
            return this.displaySandboxResult;
        }

        public DescribeSuspEventsResponseBodySuspEvents setEventNotes(java.util.List<DescribeSuspEventsResponseBodySuspEventsEventNotes> eventNotes) {
            this.eventNotes = eventNotes;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsEventNotes> getEventNotes() {
            return this.eventNotes;
        }

        public DescribeSuspEventsResponseBodySuspEvents setEventStatus(Integer eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        public DescribeSuspEventsResponseBodySuspEvents setEventSubType(String eventSubType) {
            this.eventSubType = eventSubType;
            return this;
        }
        public String getEventSubType() {
            return this.eventSubType;
        }

        public DescribeSuspEventsResponseBodySuspEvents setHasTraceInfo(Boolean hasTraceInfo) {
            this.hasTraceInfo = hasTraceInfo;
            return this;
        }
        public Boolean getHasTraceInfo() {
            return this.hasTraceInfo;
        }

        public DescribeSuspEventsResponseBodySuspEvents setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSuspEventsResponseBodySuspEvents setImageUuid(String imageUuid) {
            this.imageUuid = imageUuid;
            return this;
        }
        public String getImageUuid() {
            return this.imageUuid;
        }

        public DescribeSuspEventsResponseBodySuspEvents setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeSuspEventsResponseBodySuspEvents setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sClusterName(String k8sClusterName) {
            this.k8sClusterName = k8sClusterName;
            return this;
        }
        public String getK8sClusterName() {
            return this.k8sClusterName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sNodeId(String k8sNodeId) {
            this.k8sNodeId = k8sNodeId;
            return this;
        }
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sNodeName(String k8sNodeName) {
            this.k8sNodeName = k8sNodeName;
            return this;
        }
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sPodName(String k8sPodName) {
            this.k8sPodName = k8sPodName;
            return this;
        }
        public String getK8sPodName() {
            return this.k8sPodName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setLargeModel(Boolean largeModel) {
            this.largeModel = largeModel;
            return this;
        }
        public Boolean getLargeModel() {
            return this.largeModel;
        }

        public DescribeSuspEventsResponseBodySuspEvents setLastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public String getLastTime() {
            return this.lastTime;
        }

        public DescribeSuspEventsResponseBodySuspEvents setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public DescribeSuspEventsResponseBodySuspEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSuspEventsResponseBodySuspEvents setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeSuspEventsResponseBodySuspEvents setMaliciousRuleStatus(String maliciousRuleStatus) {
            this.maliciousRuleStatus = maliciousRuleStatus;
            return this;
        }
        public String getMaliciousRuleStatus() {
            return this.maliciousRuleStatus;
        }

        public DescribeSuspEventsResponseBodySuspEvents setMarkList(java.util.List<String> markList) {
            this.markList = markList;
            return this;
        }
        public java.util.List<String> getMarkList() {
            return this.markList;
        }

        public DescribeSuspEventsResponseBodySuspEvents setMarkMisRules(String markMisRules) {
            this.markMisRules = markMisRules;
            return this;
        }
        public String getMarkMisRules() {
            return this.markMisRules;
        }

        public DescribeSuspEventsResponseBodySuspEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOccurrenceTimeStamp(Long occurrenceTimeStamp) {
            this.occurrenceTimeStamp = occurrenceTimeStamp;
            return this;
        }
        public Long getOccurrenceTimeStamp() {
            return this.occurrenceTimeStamp;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOperateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOperateMsg(String operateMsg) {
            this.operateMsg = operateMsg;
            return this;
        }
        public String getOperateMsg() {
            return this.operateMsg;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public DescribeSuspEventsResponseBodySuspEvents setSaleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }
        public String getSaleVersion() {
            return this.saleVersion;
        }

        public DescribeSuspEventsResponseBodySuspEvents setSecurityEventIds(String securityEventIds) {
            this.securityEventIds = securityEventIds;
            return this;
        }
        public String getSecurityEventIds() {
            return this.securityEventIds;
        }

        public DescribeSuspEventsResponseBodySuspEvents setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

        public DescribeSuspEventsResponseBodySuspEvents setStages(String stages) {
            this.stages = stages;
            return this;
        }
        public String getStages() {
            return this.stages;
        }

        public DescribeSuspEventsResponseBodySuspEvents setTacticItems(java.util.List<DescribeSuspEventsResponseBodySuspEventsTacticItems> tacticItems) {
            this.tacticItems = tacticItems;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsTacticItems> getTacticItems() {
            return this.tacticItems;
        }

        public DescribeSuspEventsResponseBodySuspEvents setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        public DescribeSuspEventsResponseBodySuspEvents setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
