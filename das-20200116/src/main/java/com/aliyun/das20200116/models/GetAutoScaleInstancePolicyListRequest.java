// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoScaleInstancePolicyListRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OnOff")
    public String onOff;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    public static GetAutoScaleInstancePolicyListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScaleInstancePolicyListRequest self = new GetAutoScaleInstancePolicyListRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoScaleInstancePolicyListRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetAutoScaleInstancePolicyListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAutoScaleInstancePolicyListRequest setOnOff(String onOff) {
        this.onOff = onOff;
        return this;
    }
    public String getOnOff() {
        return this.onOff;
    }

    public GetAutoScaleInstancePolicyListRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetAutoScaleInstancePolicyListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
