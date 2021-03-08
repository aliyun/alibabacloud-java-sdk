// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopsPolicyGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ModifyResults")
    public java.util.List<ModifyDesktopsPolicyGroupResponseBodyModifyResults> modifyResults;

    public static ModifyDesktopsPolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopsPolicyGroupResponseBody self = new ModifyDesktopsPolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopsPolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDesktopsPolicyGroupResponseBody setModifyResults(java.util.List<ModifyDesktopsPolicyGroupResponseBodyModifyResults> modifyResults) {
        this.modifyResults = modifyResults;
        return this;
    }
    public java.util.List<ModifyDesktopsPolicyGroupResponseBodyModifyResults> getModifyResults() {
        return this.modifyResults;
    }

    public static class ModifyDesktopsPolicyGroupResponseBodyModifyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public Integer message;

        @NameInMap("DesktopId")
        public String desktopId;

        public static ModifyDesktopsPolicyGroupResponseBodyModifyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopsPolicyGroupResponseBodyModifyResults self = new ModifyDesktopsPolicyGroupResponseBodyModifyResults();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopsPolicyGroupResponseBodyModifyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyDesktopsPolicyGroupResponseBodyModifyResults setMessage(Integer message) {
            this.message = message;
            return this;
        }
        public Integer getMessage() {
            return this.message;
        }

        public ModifyDesktopsPolicyGroupResponseBodyModifyResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

    }

}
