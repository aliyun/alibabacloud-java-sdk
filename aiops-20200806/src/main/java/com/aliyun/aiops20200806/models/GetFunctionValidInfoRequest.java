// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetFunctionValidInfoRequest extends TeaModel {
    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("ServiceName")
    public String serviceName;

    public static GetFunctionValidInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionValidInfoRequest self = new GetFunctionValidInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionValidInfoRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public GetFunctionValidInfoRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetFunctionValidInfoRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public GetFunctionValidInfoRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
