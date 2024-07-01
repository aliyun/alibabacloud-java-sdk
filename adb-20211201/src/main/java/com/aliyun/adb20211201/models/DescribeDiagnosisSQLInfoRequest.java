// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The language of file titles and error messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: simplified Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>ja</strong>: Japanese.</li>
     * <li><strong>zh-tw</strong>: traditional Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The query ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the diagnostic information about SQL statements for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster, including the query ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021070216432217201616806503453</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The IP address and port number of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the diagnostic information about SQL statements for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster, including the IP address and port number of the frontend node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.45.<em><strong>.</strong></em>:3145</p>
     */
    @NameInMap("ProcessRcHost")
    public String processRcHost;

    /**
     * <p>The execution start time of the SQL statement. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the diagnostic information about SQL statements for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster, including the execution start time of the SQL statement.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1625215402000</p>
     */
    @NameInMap("ProcessStartTime")
    public Long processStartTime;

    /**
     * <p>The status of the SQL statement. Valid values:</p>
     * <ul>
     * <li><strong>running</strong></li>
     * <li><strong>finished</strong></li>
     * <li><strong>failed</strong></li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the diagnostic information about SQL statements for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster, including the status of the SQL statement.</p>
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
