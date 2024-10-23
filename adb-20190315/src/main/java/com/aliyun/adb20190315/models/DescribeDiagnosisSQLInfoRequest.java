// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition clusters within a specific region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The language of file titles and error messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: simplified Chinese</li>
     * <li><strong>en</strong>: English</li>
     * <li><strong>ja</strong>: Japanese</li>
     * <li><strong>zh-tw</strong>: traditional Chinese</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the query ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021070216432217201616806503453******</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The IP address and port number of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the IP address and port number of the frontend node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.45.<em><strong>.</strong></em>:3145</p>
     */
    @NameInMap("ProcessRcHost")
    public String processRcHost;

    /**
     * <p>The execution start time of the SQL statement. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the execution start time of the SQL statement.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1625215402000</p>
     */
    @NameInMap("ProcessStartTime")
    public Long processStartTime;

    /**
     * <p>The state of the SQL statement. Valid values:</p>
     * <ul>
     * <li><p><strong>running</strong></p>
     * </li>
     * <li><p><strong>finished</strong></p>
     * </li>
     * <li><p><strong>failed</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the state of the SQL statement.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("ProcessState")
    public String processState;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDiagnosisSQLInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSQLInfoRequest self = new DescribeDiagnosisSQLInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSQLInfoRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDiagnosisSQLInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDiagnosisSQLInfoRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public DescribeDiagnosisSQLInfoRequest setProcessRcHost(String processRcHost) {
        this.processRcHost = processRcHost;
        return this;
    }
    public String getProcessRcHost() {
        return this.processRcHost;
    }

    public DescribeDiagnosisSQLInfoRequest setProcessStartTime(Long processStartTime) {
        this.processStartTime = processStartTime;
        return this;
    }
    public Long getProcessStartTime() {
        return this.processStartTime;
    }

    public DescribeDiagnosisSQLInfoRequest setProcessState(String processState) {
        this.processState = processState;
        return this;
    }
    public String getProcessState() {
        return this.processState;
    }

    public DescribeDiagnosisSQLInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
