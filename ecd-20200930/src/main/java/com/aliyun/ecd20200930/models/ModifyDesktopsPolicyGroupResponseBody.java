// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopsPolicyGroupResponseBody extends TeaModel {
    /**
     * <p>The request results.</p>
     */
    @NameInMap("ModifyResults")
    public java.util.List<ModifyDesktopsPolicyGroupResponseBodyModifyResults> modifyResults;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDesktopsPolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopsPolicyGroupResponseBody self = new ModifyDesktopsPolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopsPolicyGroupResponseBody setModifyResults(java.util.List<ModifyDesktopsPolicyGroupResponseBodyModifyResults> modifyResults) {
        this.modifyResults = modifyResults;
        return this;
    }
    public java.util.List<ModifyDesktopsPolicyGroupResponseBodyModifyResults> getModifyResults() {
        return this.modifyResults;
    }

    public ModifyDesktopsPolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDesktopsPolicyGroupResponseBodyModifyResults extends TeaModel {
        /**
         * <p>The returned message. If the request was successful, <code>success</code> is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7w78ozhjcwa3u****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The error message returned if the request failed. This parameter is not returned if the value of Code is success.``</p>
         * 
         * <strong>example:</strong>
         * <p>The specified param DesktopId ecd-ia2zw38bi6cm7**** is not found.</p>
         */
        @NameInMap("Message")
        public String message;

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

        public ModifyDesktopsPolicyGroupResponseBodyModifyResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ModifyDesktopsPolicyGroupResponseBodyModifyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
