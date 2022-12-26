// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CorpAuthLinkInfoQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CorpAuthLinkInfoQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("traceId")
    public String traceId;

    public static CorpAuthLinkInfoQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CorpAuthLinkInfoQueryResponseBody self = new CorpAuthLinkInfoQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CorpAuthLinkInfoQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CorpAuthLinkInfoQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CorpAuthLinkInfoQueryResponseBody setModule(CorpAuthLinkInfoQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CorpAuthLinkInfoQueryResponseBodyModule getModule() {
        return this.module;
    }

    public CorpAuthLinkInfoQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CorpAuthLinkInfoQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps extends TeaModel {
        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("open_corp_id")
        public String openCorpId;

        @NameInMap("true_corp_id")
        public String trueCorpId;

        public static CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps build(java.util.Map<String, ?> map) throws Exception {
            CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps self = new CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps();
            return TeaModel.build(map, self);
        }

        public CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps setOpenCorpId(String openCorpId) {
            this.openCorpId = openCorpId;
            return this;
        }
        public String getOpenCorpId() {
            return this.openCorpId;
        }

        public CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps setTrueCorpId(String trueCorpId) {
            this.trueCorpId = trueCorpId;
            return this;
        }
        public String getTrueCorpId() {
            return this.trueCorpId;
        }

    }

    public static class CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp extends TeaModel {
        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("open_corp_id")
        public String openCorpId;

        @NameInMap("true_corp_id")
        public String trueCorpId;

        public static CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp build(java.util.Map<String, ?> map) throws Exception {
            CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp self = new CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp();
            return TeaModel.build(map, self);
        }

        public CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp setOpenCorpId(String openCorpId) {
            this.openCorpId = openCorpId;
            return this;
        }
        public String getOpenCorpId() {
            return this.openCorpId;
        }

        public CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp setTrueCorpId(String trueCorpId) {
            this.trueCorpId = trueCorpId;
            return this;
        }
        public String getTrueCorpId() {
            return this.trueCorpId;
        }

    }

    public static class CorpAuthLinkInfoQueryResponseBodyModule extends TeaModel {
        @NameInMap("link_corps")
        public java.util.List<CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps> linkCorps;

        @NameInMap("org_corp")
        public CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp orgCorp;

        public static CorpAuthLinkInfoQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CorpAuthLinkInfoQueryResponseBodyModule self = new CorpAuthLinkInfoQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CorpAuthLinkInfoQueryResponseBodyModule setLinkCorps(java.util.List<CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps> linkCorps) {
            this.linkCorps = linkCorps;
            return this;
        }
        public java.util.List<CorpAuthLinkInfoQueryResponseBodyModuleLinkCorps> getLinkCorps() {
            return this.linkCorps;
        }

        public CorpAuthLinkInfoQueryResponseBodyModule setOrgCorp(CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp orgCorp) {
            this.orgCorp = orgCorp;
            return this;
        }
        public CorpAuthLinkInfoQueryResponseBodyModuleOrgCorp getOrgCorp() {
            return this.orgCorp;
        }

    }

}
