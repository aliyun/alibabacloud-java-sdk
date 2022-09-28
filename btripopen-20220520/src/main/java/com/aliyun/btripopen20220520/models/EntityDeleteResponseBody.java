// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntityDeleteResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public EntityDeleteResponseBodyModule module;

    @NameInMap("more_page")
    public Boolean morePage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static EntityDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntityDeleteResponseBody self = new EntityDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public EntityDeleteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public EntityDeleteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EntityDeleteResponseBody setModule(EntityDeleteResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public EntityDeleteResponseBodyModule getModule() {
        return this.module;
    }

    public EntityDeleteResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public EntityDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EntityDeleteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EntityDeleteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class EntityDeleteResponseBodyModule extends TeaModel {
        @NameInMap("remove_num")
        public Integer removeNum;

        @NameInMap("selected_user_num")
        public Integer selectedUserNum;

        public static EntityDeleteResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            EntityDeleteResponseBodyModule self = new EntityDeleteResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public EntityDeleteResponseBodyModule setRemoveNum(Integer removeNum) {
            this.removeNum = removeNum;
            return this;
        }
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        public EntityDeleteResponseBodyModule setSelectedUserNum(Integer selectedUserNum) {
            this.selectedUserNum = selectedUserNum;
            return this;
        }
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

    }

}
