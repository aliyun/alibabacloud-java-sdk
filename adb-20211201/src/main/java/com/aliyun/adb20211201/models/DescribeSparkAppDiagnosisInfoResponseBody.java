// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkAppDiagnosisInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the request denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
     *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
     *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
     * }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/455888.html">ListSparkApps</a> operation to query all application IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s202404141952sz6a1391200****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The CPU utilization. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CpuUtilization")
    public Double cpuUtilization;

    /**
     * <p>The queried diagnostic information.</p>
     */
    @NameInMap("DiagnosisInfoList")
    public java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfoList;

    /**
     * <p>The execution duration of the application. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>281063</p>
     */
    @NameInMap("DurationInMillis")
    public Long durationInMillis;

    /**
     * <p>The amount of time consumed by the Java virtual machine to perform garbage collection operations. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>81055</p>
     */
    @NameInMap("JVMGcCostInMillis")
    public Long JVMGcCostInMillis;

    /**
     * <p>The peak memory usage. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>4096000</p>
     */
    @NameInMap("PeakMemoryInByte")
    public Long peakMemoryInByte;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FB5AC339-91F6-5000-8E5A-F47065B01B87</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The amount of data used for shuffle reads. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>4096000</p>
     */
    @NameInMap("ShuffleReadInByte")
    public Long shuffleReadInByte;

    /**
     * <p>The amount of data used for shuffle writes. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>4096000</p>
     */
    @NameInMap("ShuffleWriteInByte")
    public Long shuffleWriteInByte;

    /**
     * <p>The amount of data spilled to disks when the memory is insufficient. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpillInByte")
    public Long spillInByte;

    /**
     * <p>The time when the application started to be executed.</p>
     * 
     * <strong>example:</strong>
     * <p>1718329831000</p>
     */
    @NameInMap("StartedTime")
    public Long startedTime;

    /**
     * <p>The status of the asynchronous import or export job. Valid values:</p>
     * <ul>
     * <li><strong>RUNNING</strong></li>
     * <li><strong>FINISHED</strong></li>
     * <li><strong>FAILED</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeSparkAppDiagnosisInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkAppDiagnosisInfoResponseBody self = new DescribeSparkAppDiagnosisInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setCpuUtilization(Double cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
        return this;
    }
    public Double getCpuUtilization() {
        return this.cpuUtilization;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setDiagnosisInfoList(java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfoList) {
        this.diagnosisInfoList = diagnosisInfoList;
        return this;
    }
    public java.util.List<Adb4MysqlSparkDiagnosisInfo> getDiagnosisInfoList() {
        return this.diagnosisInfoList;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setDurationInMillis(Long durationInMillis) {
        this.durationInMillis = durationInMillis;
        return this;
    }
    public Long getDurationInMillis() {
        return this.durationInMillis;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setJVMGcCostInMillis(Long JVMGcCostInMillis) {
        this.JVMGcCostInMillis = JVMGcCostInMillis;
        return this;
    }
    public Long getJVMGcCostInMillis() {
        return this.JVMGcCostInMillis;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setPeakMemoryInByte(Long peakMemoryInByte) {
        this.peakMemoryInByte = peakMemoryInByte;
        return this;
    }
    public Long getPeakMemoryInByte() {
        return this.peakMemoryInByte;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setShuffleReadInByte(Long shuffleReadInByte) {
        this.shuffleReadInByte = shuffleReadInByte;
        return this;
    }
    public Long getShuffleReadInByte() {
        return this.shuffleReadInByte;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setShuffleWriteInByte(Long shuffleWriteInByte) {
        this.shuffleWriteInByte = shuffleWriteInByte;
        return this;
    }
    public Long getShuffleWriteInByte() {
        return this.shuffleWriteInByte;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setSpillInByte(Long spillInByte) {
        this.spillInByte = spillInByte;
        return this;
    }
    public Long getSpillInByte() {
        return this.spillInByte;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setStartedTime(Long startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public Long getStartedTime() {
        return this.startedTime;
    }

    public DescribeSparkAppDiagnosisInfoResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
