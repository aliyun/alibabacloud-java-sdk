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
     * <p>The end time of the log information. You can call <a href="https://help.aliyun.com/document_detail/209718.html">DescribePreCheckStatus</a> to query the end time.</p>
     * <blockquote>
     * <ul>
     * <li>To query the log information of a DTS subtask within a specific time range, call <a href="https://help.aliyun.com/document_detail/209718.html">DescribePreCheckStatus</a> to query the execution time of the DTS subtask.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The time is a 13-digit UNIX timestamp in milliseconds. You can use a search engine to find a UNIX timestamp converter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1620897227000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The keyword used to filter query results.</p>
     * <blockquote>
     * <p>Fuzzy match is used and the keyword is case-sensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>state = IDLE</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of log entries per page. Valid values: <strong>20</strong>, <strong>50</strong>, <strong>100</strong>, <strong>500</strong>, and <strong>1000</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. Specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start time of the log information.</p>
     * <blockquote>
     * <ul>
     * <li>To query the log information of a DTS subtask within a specific time range, call <a href="https://help.aliyun.com/document_detail/209718.html">DescribePreCheckStatus</a> to query the execution time of the DTS subtask.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The start time is a 13-digit UNIX timestamp in milliseconds. You can use a search engine to find a UNIX timestamp converter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1620896327000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The log level of the log information. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: Normal.</li>
     * <li><strong>WARN</strong>: Warning.</li>
     * <li><strong>ERROR</strong>: Error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL,WARN,ERROR</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the DTS task subnode. Valid values:</p>
     * <ul>
     * <li><strong>DATA_LOAD</strong>: full data migration or initial full data synchronization.</li>
     * <li><strong>ONLINE_WRITER</strong>: incremental data migration.</li>
     * <li><strong>SYNC_WRITER</strong>: incremental data synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYNC_WRITER</p>
     */
    @NameInMap("SubJobType")
    public String subJobType;

    /**
     * <p>Specifies whether the node is a seamless integration (Zero-ETL) node. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
