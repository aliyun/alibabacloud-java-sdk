// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetRpcAppFlowRuleSummarysRequest extends TeaModel {
    // 单元
    @NameInMap("UnitFlag")
    public String unitFlag;

    // 命名空间ID
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // 应用名
    @NameInMap("AppName")
    public String appName;

    // 生效状态.未配置,创建未生效,修改未生效,删除未生效,推送中,生效中,生效失败
    @NameInMap("Status")
    public String status;

    // 当前页码
    @NameInMap("PageNum")
    public Long pageNum;

    // 页面大小
    @NameInMap("PageSize")
    public Long pageSize;

    // rpc 类型。sc, dubbo
    @NameInMap("RpcType")
    public String rpcType;

    public static GetRpcAppFlowRuleSummarysRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRpcAppFlowRuleSummarysRequest self = new GetRpcAppFlowRuleSummarysRequest();
        return TeaModel.build(map, self);
    }

    public GetRpcAppFlowRuleSummarysRequest setUnitFlag(String unitFlag) {
        this.unitFlag = unitFlag;
        return this;
    }
    public String getUnitFlag() {
        return this.unitFlag;
    }

    public GetRpcAppFlowRuleSummarysRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public GetRpcAppFlowRuleSummarysRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetRpcAppFlowRuleSummarysRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRpcAppFlowRuleSummarysRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public GetRpcAppFlowRuleSummarysRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetRpcAppFlowRuleSummarysRequest setRpcType(String rpcType) {
        this.rpcType = rpcType;
        return this;
    }
    public String getRpcType() {
        return this.rpcType;
    }

}
