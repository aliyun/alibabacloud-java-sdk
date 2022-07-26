// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterSaveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("module")
    public CostCenterSaveResponseBodyModule module;

    @NameInMap("more_page")
    public Boolean morePage;

    @NameInMap("result_code")
    public Integer resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static CostCenterSaveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CostCenterSaveResponseBody self = new CostCenterSaveResponseBody();
        return TeaModel.build(map, self);
    }

    public CostCenterSaveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CostCenterSaveResponseBody setModule(CostCenterSaveResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CostCenterSaveResponseBodyModule getModule() {
        return this.module;
    }

    public CostCenterSaveResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public CostCenterSaveResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public CostCenterSaveResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CostCenterSaveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CostCenterSaveResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CostCenterSaveResponseBodyModule extends TeaModel {
        @NameInMap("id")
        public Long id;

        public static CostCenterSaveResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CostCenterSaveResponseBodyModule self = new CostCenterSaveResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CostCenterSaveResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
