// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimTenantFlowResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimTenantFlowResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimTenantFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimTenantFlowResponseBody self = new GetBimTenantFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimTenantFlowResponseBody setDatas(GetBimTenantFlowResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimTenantFlowResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimTenantFlowResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimTenantFlowResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimTenantFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimTenantFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimTenantFlowResponseBodyDatas extends TeaModel {
        // 单位（B,KB,M）
        @NameInMap("Company")
        public String company;

        // 总流量
        @NameInMap("Flow")
        public Long flow;

        // 已用流量
        @NameInMap("UsedFlow")
        public Long usedFlow;

        public static GetBimTenantFlowResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimTenantFlowResponseBodyDatas self = new GetBimTenantFlowResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimTenantFlowResponseBodyDatas setCompany(String company) {
            this.company = company;
            return this;
        }
        public String getCompany() {
            return this.company;
        }

        public GetBimTenantFlowResponseBodyDatas setFlow(Long flow) {
            this.flow = flow;
            return this;
        }
        public Long getFlow() {
            return this.flow;
        }

        public GetBimTenantFlowResponseBodyDatas setUsedFlow(Long usedFlow) {
            this.usedFlow = usedFlow;
            return this;
        }
        public Long getUsedFlow() {
            return this.usedFlow;
        }

    }

}
