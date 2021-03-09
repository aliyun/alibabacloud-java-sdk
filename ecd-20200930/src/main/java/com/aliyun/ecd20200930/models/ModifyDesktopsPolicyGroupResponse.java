// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopsPolicyGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ModifyResults")
    @Validation(required = true)
    public java.util.List<ModifyDesktopsPolicyGroupResponseModifyResults> modifyResults;

    public static ModifyDesktopsPolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopsPolicyGroupResponse self = new ModifyDesktopsPolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopsPolicyGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDesktopsPolicyGroupResponse setModifyResults(java.util.List<ModifyDesktopsPolicyGroupResponseModifyResults> modifyResults) {
        this.modifyResults = modifyResults;
        return this;
    }
    public java.util.List<ModifyDesktopsPolicyGroupResponseModifyResults> getModifyResults() {
        return this.modifyResults;
    }

    public static class ModifyDesktopsPolicyGroupResponseModifyResults extends TeaModel {
        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static ModifyDesktopsPolicyGroupResponseModifyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopsPolicyGroupResponseModifyResults self = new ModifyDesktopsPolicyGroupResponseModifyResults();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopsPolicyGroupResponseModifyResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ModifyDesktopsPolicyGroupResponseModifyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyDesktopsPolicyGroupResponseModifyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
