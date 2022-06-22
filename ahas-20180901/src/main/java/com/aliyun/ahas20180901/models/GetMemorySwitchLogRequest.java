// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetMemorySwitchLogRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BeginTimeStamp")
    public Long beginTimeStamp;

    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SwitchName")
    public String switchName;

    @NameInMap("SwitchNameSpace")
    public String switchNameSpace;

    public static GetMemorySwitchLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMemorySwitchLogRequest self = new GetMemorySwitchLogRequest();
        return TeaModel.build(map, self);
    }

    public GetMemorySwitchLogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetMemorySwitchLogRequest setBeginTimeStamp(Long beginTimeStamp) {
        this.beginTimeStamp = beginTimeStamp;
        return this;
    }
    public Long getBeginTimeStamp() {
        return this.beginTimeStamp;
    }

    public GetMemorySwitchLogRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public GetMemorySwitchLogRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetMemorySwitchLogRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public GetMemorySwitchLogRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetMemorySwitchLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMemorySwitchLogRequest setSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }
    public String getSwitchName() {
        return this.switchName;
    }

    public GetMemorySwitchLogRequest setSwitchNameSpace(String switchNameSpace) {
        this.switchNameSpace = switchNameSpace;
        return this;
    }
    public String getSwitchNameSpace() {
        return this.switchNameSpace;
    }

}
