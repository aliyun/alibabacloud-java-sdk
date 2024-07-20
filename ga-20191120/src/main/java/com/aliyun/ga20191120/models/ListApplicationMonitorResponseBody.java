// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListApplicationMonitorResponseBody extends TeaModel {
    /**
     * <p>The list of origin probing tasks.</p>
     */
    @NameInMap("ApplicationMonitors")
    public java.util.List<ListApplicationMonitorResponseBodyApplicationMonitors> applicationMonitors;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMonitorResponseBody self = new ListApplicationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationMonitorResponseBody setApplicationMonitors(java.util.List<ListApplicationMonitorResponseBodyApplicationMonitors> applicationMonitors) {
        this.applicationMonitors = applicationMonitors;
        return this;
    }
    public java.util.List<ListApplicationMonitorResponseBodyApplicationMonitors> getApplicationMonitors() {
        return this.applicationMonitors;
    }

    public ListApplicationMonitorResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationMonitorResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationMonitorResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationMonitorResponseBodyApplicationMonitors extends TeaModel {
        /**
         * <p>The ID of the GA instance on which the origin probing task runs.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The URL or IP address that was probed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>Indicates whether the automatic diagnostics feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DetectEnable")
        public Boolean detectEnable;

        /**
         * <p>The threshold that is used to trigger the automatic diagnostics feature.</p>
         * 
         * <strong>example:</strong>
         * <p>１</p>
         */
        @NameInMap("DetectThreshold")
        public Integer detectThreshold;

        /**
         * <p>The number of times that are required to reach the threshold before the automatic diagnostics feature can be triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>１</p>
         */
        @NameInMap("DetectTimes")
        public Integer detectTimes;

        /**
         * <p>The ID of the listener on which the origin probing task runs.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The extended options of the listener protocol that is used by the origin probing task. The options vary based on the listener protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;http_method&quot;: &quot;get&quot;,&quot;header&quot;: &quot;key:asd&quot;,&quot;acceptable_response_code&quot;: &quot;500&quot;,&quot;cert_verify&quot;: true }</p>
         */
        @NameInMap("OptionsJson")
        public String optionsJson;

        /**
         * <p>The silence period of the automatic diagnostics feature. This parameter indicates the interval at which the automatic diagnostics feature is triggered. If the availability rate does not return to normal after GA triggers an automatic diagnostic task, GA must wait until the silence period ends before GA can trigger another automatic diagnostic task.</p>
         * <p>If the number of consecutive times that the availability rate drops below the threshold of automatic diagnostics reaches the value of <strong>DetectTimes</strong> , the automatic diagnostics feature is triggered. The automatic diagnostics feature is not triggered again within the silence period even if the availability rate stays below the threshold. If the availability rate does not return to normal after the silence period ends, the automatic diagnostics feature is triggered again.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The status of the origin probing task. Valid values:</p>
         * <ul>
         * <li><strong>active:</strong> The origin probing task is running.</li>
         * <li><strong>inactive:</strong> The origin probing task is stopped.</li>
         * <li><strong>init:</strong> The origin probing task is being initialized.</li>
         * <li><strong>deleting:</strong> The origin probing task is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The origin probing task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sm-bp1fpdjfju9k8yr1y****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The origin probing task name.</p>
         * 
         * <strong>example:</strong>
         * <p>task1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static ListApplicationMonitorResponseBodyApplicationMonitors build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationMonitorResponseBodyApplicationMonitors self = new ListApplicationMonitorResponseBodyApplicationMonitors();
            return TeaModel.build(map, self);
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setDetectEnable(Boolean detectEnable) {
            this.detectEnable = detectEnable;
            return this;
        }
        public Boolean getDetectEnable() {
            return this.detectEnable;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setDetectThreshold(Integer detectThreshold) {
            this.detectThreshold = detectThreshold;
            return this;
        }
        public Integer getDetectThreshold() {
            return this.detectThreshold;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setDetectTimes(Integer detectTimes) {
            this.detectTimes = detectTimes;
            return this;
        }
        public Integer getDetectTimes() {
            return this.detectTimes;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setOptionsJson(String optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }
        public String getOptionsJson() {
            return this.optionsJson;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
