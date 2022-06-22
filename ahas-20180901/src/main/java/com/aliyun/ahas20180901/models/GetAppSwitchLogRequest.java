// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetAppSwitchLogRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BeginTimeStamp")
    public Long beginTimeStamp;

    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SwitchName")
    public String switchName;

    @NameInMap("SwitchNameSpace")
    public String switchNameSpace;

    public static GetAppSwitchLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppSwitchLogRequest self = new GetAppSwitchLogRequest();
        return TeaModel.build(map, self);
    }

    public GetAppSwitchLogRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public GetAppSwitchLogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppSwitchLogRequest setBeginTimeStamp(Long beginTimeStamp) {
        this.beginTimeStamp = beginTimeStamp;
        return this;
    }
    public Long getBeginTimeStamp() {
        return this.beginTimeStamp;
    }

    public GetAppSwitchLogRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public GetAppSwitchLogRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public GetAppSwitchLogRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public GetAppSwitchLogRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetAppSwitchLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAppSwitchLogRequest setSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }
    public String getSwitchName() {
        return this.switchName;
    }

    public GetAppSwitchLogRequest setSwitchNameSpace(String switchNameSpace) {
        this.switchNameSpace = switchNameSpace;
        return this;
    }
    public String getSwitchNameSpace() {
        return this.switchNameSpace;
    }

}
