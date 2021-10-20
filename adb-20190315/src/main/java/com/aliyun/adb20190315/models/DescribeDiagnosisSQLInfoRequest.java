// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProcessId")
    public String processId;

    @NameInMap("ProcessStartTime")
    public Long processStartTime;

    @NameInMap("ProcessState")
    public String processState;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ProcessRcHost")
    public String processRcHost;

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

    public DescribeDiagnosisSQLInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosisSQLInfoRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
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

    public DescribeDiagnosisSQLInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDiagnosisSQLInfoRequest setProcessRcHost(String processRcHost) {
        this.processRcHost = processRcHost;
        return this;
    }
    public String getProcessRcHost() {
        return this.processRcHost;
    }

}
