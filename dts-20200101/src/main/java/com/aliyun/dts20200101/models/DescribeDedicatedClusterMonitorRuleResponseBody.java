// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterMonitorRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("CpuAlarmThreshold")
    public String cpuAlarmThreshold;

    /**
     * <strong>example:</strong>
     * <p>dtsClustervcwn1oeyu5fx4yf</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("DiskAlarmThreshold")
    public String diskAlarmThreshold;

    /**
     * <strong>example:</strong>
     * <p>46</p>
     */
    @NameInMap("DuAlarmThreshold")
    public String duAlarmThreshold;

    /**
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("MemAlarmThreshold")
    public String memAlarmThreshold;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NoticeSwitch")
    public String noticeSwitch;

    /**
     * <strong>example:</strong>
     * <p>186****7653</p>
     */
    @NameInMap("Phones")
    public String phones;

    /**
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeDedicatedClusterMonitorRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterMonitorRuleResponseBody self = new DescribeDedicatedClusterMonitorRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setCpuAlarmThreshold(String cpuAlarmThreshold) {
        this.cpuAlarmThreshold = cpuAlarmThreshold;
        return this;
    }
    public String getCpuAlarmThreshold() {
        return this.cpuAlarmThreshold;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setDiskAlarmThreshold(String diskAlarmThreshold) {
        this.diskAlarmThreshold = diskAlarmThreshold;
        return this;
    }
    public String getDiskAlarmThreshold() {
        return this.diskAlarmThreshold;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setDuAlarmThreshold(String duAlarmThreshold) {
        this.duAlarmThreshold = duAlarmThreshold;
        return this;
    }
    public String getDuAlarmThreshold() {
        return this.duAlarmThreshold;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setMemAlarmThreshold(String memAlarmThreshold) {
        this.memAlarmThreshold = memAlarmThreshold;
        return this;
    }
    public String getMemAlarmThreshold() {
        return this.memAlarmThreshold;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setNoticeSwitch(String noticeSwitch) {
        this.noticeSwitch = noticeSwitch;
        return this;
    }
    public String getNoticeSwitch() {
        return this.noticeSwitch;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setPhones(String phones) {
        this.phones = phones;
        return this;
    }
    public String getPhones() {
        return this.phones;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedClusterMonitorRuleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
