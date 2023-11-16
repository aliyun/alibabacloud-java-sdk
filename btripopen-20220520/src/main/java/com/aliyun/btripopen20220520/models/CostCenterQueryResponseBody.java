// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<CostCenterQueryResponseBodyModule> module;

    @NameInMap("more_page")
    public Boolean morePage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static CostCenterQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CostCenterQueryResponseBody self = new CostCenterQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CostCenterQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CostCenterQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CostCenterQueryResponseBody setModule(java.util.List<CostCenterQueryResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<CostCenterQueryResponseBodyModule> getModule() {
        return this.module;
    }

    public CostCenterQueryResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public CostCenterQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CostCenterQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CostCenterQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CostCenterQueryResponseBodyModuleEntityDOS extends TeaModel {
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("entity_id")
        public String entityId;

        @NameInMap("entity_type")
        public String entityType;

        @NameInMap("name")
        public String name;

        @NameInMap("user_num")
        public Integer userNum;

        public static CostCenterQueryResponseBodyModuleEntityDOS build(java.util.Map<String, ?> map) throws Exception {
            CostCenterQueryResponseBodyModuleEntityDOS self = new CostCenterQueryResponseBodyModuleEntityDOS();
            return TeaModel.build(map, self);
        }

        public CostCenterQueryResponseBodyModuleEntityDOS setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CostCenterQueryResponseBodyModuleEntityDOS setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public CostCenterQueryResponseBodyModuleEntityDOS setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public CostCenterQueryResponseBodyModuleEntityDOS setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CostCenterQueryResponseBodyModuleEntityDOS setUserNum(Integer userNum) {
            this.userNum = userNum;
            return this;
        }
        public Integer getUserNum() {
            return this.userNum;
        }

    }

    public static class CostCenterQueryResponseBodyModule extends TeaModel {
        @NameInMap("alipay_no")
        public String alipayNo;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("disable")
        public Long disable;

        @NameInMap("entity_d_o_s")
        public java.util.List<CostCenterQueryResponseBodyModuleEntityDOS> entityDOS;

        @NameInMap("id")
        public Long id;

        @NameInMap("number")
        public String number;

        /**
         * <p>rule code</p>
         */
        @NameInMap("rule_code")
        public Long ruleCode;

        @NameInMap("scope")
        public Long scope;

        @NameInMap("thirdpart_id")
        public String thirdpartId;

        @NameInMap("title")
        public String title;

        public static CostCenterQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CostCenterQueryResponseBodyModule self = new CostCenterQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CostCenterQueryResponseBodyModule setAlipayNo(String alipayNo) {
            this.alipayNo = alipayNo;
            return this;
        }
        public String getAlipayNo() {
            return this.alipayNo;
        }

        public CostCenterQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CostCenterQueryResponseBodyModule setDisable(Long disable) {
            this.disable = disable;
            return this;
        }
        public Long getDisable() {
            return this.disable;
        }

        public CostCenterQueryResponseBodyModule setEntityDOS(java.util.List<CostCenterQueryResponseBodyModuleEntityDOS> entityDOS) {
            this.entityDOS = entityDOS;
            return this;
        }
        public java.util.List<CostCenterQueryResponseBodyModuleEntityDOS> getEntityDOS() {
            return this.entityDOS;
        }

        public CostCenterQueryResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CostCenterQueryResponseBodyModule setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public CostCenterQueryResponseBodyModule setRuleCode(Long ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public Long getRuleCode() {
            return this.ruleCode;
        }

        public CostCenterQueryResponseBodyModule setScope(Long scope) {
            this.scope = scope;
            return this;
        }
        public Long getScope() {
            return this.scope;
        }

        public CostCenterQueryResponseBodyModule setThirdpartId(String thirdpartId) {
            this.thirdpartId = thirdpartId;
            return this;
        }
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        public CostCenterQueryResponseBodyModule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
