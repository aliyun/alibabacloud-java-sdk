// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntityAddResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public EntityAddResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    // traceId
    @NameInMap("traceId")
    public String traceId;

    public static EntityAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntityAddResponseBody self = new EntityAddResponseBody();
        return TeaModel.build(map, self);
    }

    public EntityAddResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EntityAddResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EntityAddResponseBody setModule(EntityAddResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public EntityAddResponseBodyModule getModule() {
        return this.module;
    }

    public EntityAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
