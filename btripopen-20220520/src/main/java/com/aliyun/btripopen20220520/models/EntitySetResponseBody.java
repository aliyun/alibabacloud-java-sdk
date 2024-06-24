// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntitySetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public EntitySetResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("more_page")
    public Boolean morePage;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static EntitySetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntitySetResponseBody self = new EntitySetResponseBody();
        return TeaModel.build(map, self);
    }

    public EntitySetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
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

    public EntitySetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("add_num")
        public Integer addNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("remove_num")
        public Integer removeNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
