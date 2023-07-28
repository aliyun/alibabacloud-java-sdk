// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](~~129857~~) operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition clusters within a specific region.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The language of file titles and error messages. Valid values:</p>
     * <br>
     * <p>*   **zh**: simplified Chinese</p>
     * <p>*   **en**: English</p>
     * <p>*   **ja**: Japanese</p>
     * <p>*   **zh-tw**: traditional Chinese</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the query.</p>
     * <br>
     * <p>>  You can call the [DescribeDiagnosisRecords](~~308207~~) operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the query ID.</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The IP address and port number of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.</p>
     * <br>
     * <p>>  You can call the [DescribeDiagnosisRecords](~~308207~~) operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the IP address and port number of the frontend node.</p>
     */
    @NameInMap("ProcessRcHost")
    public String processRcHost;

    /**
     * <p>The execution start time of the SQL statement. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     * <br>
     * <p>>  You can call the [DescribeDiagnosisRecords](~~308207~~) operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the execution start time of the SQL statement.</p>
     */
    @NameInMap("ProcessStartTime")
    public Long processStartTime;

    /**
     * <p>The state of the SQL statement. Valid values:</p>
     * <br>
     * <p>*   **running**</p>
     * <br>
     * <p>*   **finished**</p>
     * <br>
     * <p>*   **failed**</p>
     * <br>
     * <p>> You can call the [DescribeDiagnosisRecords](~~308207~~) operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the state of the SQL statement.</p>
     */
    @NameInMap("ProcessState")
    public String processState;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
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
