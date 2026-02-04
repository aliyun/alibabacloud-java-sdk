// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CheckInstanceModuleStatusResponseBody extends TeaModel {
    @NameInMap("Module")
    public CheckInstanceModuleStatusResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckInstanceModuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceModuleStatusResponseBody self = new CheckInstanceModuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceModuleStatusResponseBody setModule(CheckInstanceModuleStatusResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CheckInstanceModuleStatusResponseBodyModule getModule() {
        return this.module;
    }

    public CheckInstanceModuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckInstanceModuleStatusResponseBodyModule extends TeaModel {
        /**
         * <p>模块状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ModuleStatus")
        public String moduleStatus;

        public static CheckInstanceModuleStatusResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CheckInstanceModuleStatusResponseBodyModule self = new CheckInstanceModuleStatusResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CheckInstanceModuleStatusResponseBodyModule setModuleStatus(String moduleStatus) {
            this.moduleStatus = moduleStatus;
            return this;
        }
        public String getModuleStatus() {
            return this.moduleStatus;
        }

    }

}
