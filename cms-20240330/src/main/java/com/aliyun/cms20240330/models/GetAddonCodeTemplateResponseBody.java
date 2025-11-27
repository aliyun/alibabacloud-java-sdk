// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAddonCodeTemplateResponseBody extends TeaModel {
    @NameInMap("codes")
    public java.util.List<GetAddonCodeTemplateResponseBodyCodes> codes;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAddonCodeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAddonCodeTemplateResponseBody self = new GetAddonCodeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAddonCodeTemplateResponseBody setCodes(java.util.List<GetAddonCodeTemplateResponseBodyCodes> codes) {
        this.codes = codes;
        return this;
    }
    public java.util.List<GetAddonCodeTemplateResponseBodyCodes> getCodes() {
        return this.codes;
    }

    public GetAddonCodeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAddonCodeTemplateResponseBodyCodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>javascript\nnpm install @arms/rum-miniapp --save</p>
         */
        @NameInMap("codeTemplate")
        public String codeTemplate;

        /**
         * <strong>example:</strong>
         * <p>cs-default-CS-cs-default-1753236205394-cs-default-CS-kubeApiserver</p>
         */
        @NameInMap("name")
        public String name;

        public static GetAddonCodeTemplateResponseBodyCodes build(java.util.Map<String, ?> map) throws Exception {
            GetAddonCodeTemplateResponseBodyCodes self = new GetAddonCodeTemplateResponseBodyCodes();
            return TeaModel.build(map, self);
        }

        public GetAddonCodeTemplateResponseBodyCodes setCodeTemplate(String codeTemplate) {
            this.codeTemplate = codeTemplate;
            return this;
        }
        public String getCodeTemplate() {
            return this.codeTemplate;
        }

        public GetAddonCodeTemplateResponseBodyCodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
