// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsServiceLogRequest extends TeaModel {
    /**
     * <p>The ID of the data migration or synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>c1yr56py103****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The end of the time range to query. You can call the <a href="https://help.aliyun.com/document_detail/209718.html">DescribePreCheckStatus</a> operation to query the execution time of the subtasks.</p>
     * <blockquote>
     * <ul>
     * <li>To obtain the logs that are generated for DTS subtasks within a specific period of time, you can call the <a href="https://help.aliyun.com/document_detail/209718.html">DescribePreCheckStatus</a> operation to query the execution time of the subtasks.</li>
     * <li>Specify the time in the 13-digit UNIX timestamp format. Unit: milliseconds. You can use a search engine to obtain a UNIX timestamp converter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1620897227000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The keyword that is passed to specify the query content.</p>
     * <blockquote>
     * <p> Fuzzy match is used and the keyword is case-sensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>state = IDLE</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0 and less than or equal to the maximum value supported by the integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of log entries to return on each page. Valid values: <strong>20</strong>, <strong>50</strong>, <strong>100</strong>, <strong>500</strong>, and <strong>1000</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <blockquote>
     * <ul>
     * <li>To obtain the logs that are generated for Data Transmission Service (DTS) subtasks within a specific period of time, you can call the <a href="https://help.aliyun.com/document_detail/209718.html">DescribePreCheckStatus</a> operation to query the execution time of the subtasks.</li>
     * <li>Specify the time in the 13-digit UNIX timestamp format. Unit: milliseconds. You can use a search engine to obtain a UNIX timestamp converter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1620896327000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The log level. Separate multiple log levels with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: displays the logs that are generated when the DTS task runs as expected.</li>
     * <li><strong>WARN</strong>: displays the logs about severe issues that stop the DTS task from running.</li>
     * <li><strong>ERROR</strong>: displays the logs about unexpected issues that stop specific processes form running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL,WARN,ERROR</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of a DTS subtask. Valid values:</p>
     * <ul>
     * <li><strong>DATA_LOAD</strong>: full migration or full synchronization</li>
     * <li><strong>ONLINE_WRITER</strong>: incremental migration</li>
     * <li><strong>SYNC_WRITER</strong>: incremental synchronization</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYNC_WRITER</p>
     */
    @NameInMap("SubJobType")
    public String subJobType;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static DescribeDtsServiceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsServiceLogRequest self = new DescribeDtsServiceLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDtsServiceLogRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsServiceLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDtsServiceLogRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeDtsServiceLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDtsServiceLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDtsServiceLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDtsServiceLogRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDtsServiceLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDtsServiceLogRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDtsServiceLogRequest setSubJobType(String subJobType) {
        this.subJobType = subJobType;
        return this;
    }
    public String getSubJobType() {
        return this.subJobType;
    }

    public DescribeDtsServiceLogRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
