// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntityAddResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("module")
    public EntityAddResponseBodyModule module;

    @NameInMap("result_code")
    public Integer resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static EntityAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntityAddResponseBody self = new EntityAddResponseBody();
        return TeaModel.build(map, self);
    }

    public EntityAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EntityAddResponseBody setModule(EntityAddResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public EntityAddResponseBodyModule getModule() {
        return this.module;
    }

    public EntityAddResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public EntityAddResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EntityAddResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EntityAddResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class EntityAddResponseBodyModule extends TeaModel {
        @NameInMap("add_num")
        public Integer addNum;

        @NameInMap("selected_user_num")
        public Integer selectedUserNum;

        public static EntityAddResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            EntityAddResponseBodyModule self = new EntityAddResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public EntityAddResponseBodyModule setAddNum(Integer addNum) {
            this.addNum = addNum;
            return this;
        }
        public Integer getAddNum() {
            return this.addNum;
        }

        public EntityAddResponseBodyModule setSelectedUserNum(Integer selectedUserNum) {
            this.selectedUserNum = selectedUserNum;
            return this;
        }
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

    }

}
