// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntitySetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public EntitySetResponseBodyModule module;

    @NameInMap("more_page")
    public Boolean morePage;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static EntitySetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntitySetResponseBody self = new EntitySetResponseBody();
        return TeaModel.build(map, self);
    }

    public EntitySetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EntitySetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public EntitySetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EntitySetResponseBody setModule(EntitySetResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public EntitySetResponseBodyModule getModule() {
        return this.module;
    }

    public EntitySetResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public EntitySetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EntitySetResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class EntitySetResponseBodyModule extends TeaModel {
        @NameInMap("add_num")
        public Integer addNum;

        @NameInMap("remove_num")
        public Integer removeNum;

        @NameInMap("selected_user_num")
        public Integer selectedUserNum;

        public static EntitySetResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            EntitySetResponseBodyModule self = new EntitySetResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public EntitySetResponseBodyModule setAddNum(Integer addNum) {
            this.addNum = addNum;
            return this;
        }
        public Integer getAddNum() {
            return this.addNum;
        }

        public EntitySetResponseBodyModule setRemoveNum(Integer removeNum) {
            this.removeNum = removeNum;
            return this;
        }
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        public EntitySetResponseBodyModule setSelectedUserNum(Integer selectedUserNum) {
            this.selectedUserNum = selectedUserNum;
            return this;
        }
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

    }

}
