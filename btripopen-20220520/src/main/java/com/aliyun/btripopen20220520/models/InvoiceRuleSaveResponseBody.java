// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleSaveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("module")
    public InvoiceRuleSaveResponseBodyModule module;

    @NameInMap("more_page")
    public Boolean morePage;

    @NameInMap("result_code")
    public Integer resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static InvoiceRuleSaveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleSaveResponseBody self = new InvoiceRuleSaveResponseBody();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleSaveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvoiceRuleSaveResponseBody setModule(InvoiceRuleSaveResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InvoiceRuleSaveResponseBodyModule getModule() {
        return this.module;
    }

    public InvoiceRuleSaveResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public InvoiceRuleSaveResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public InvoiceRuleSaveResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InvoiceRuleSaveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvoiceRuleSaveResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InvoiceRuleSaveResponseBodyModule extends TeaModel {
        @NameInMap("account")
        public String account;

        @NameInMap("add_num")
        public Integer addNum;

        @NameInMap("havana_id")
        public String havanaId;

        @NameInMap("remove_num")
        public Integer removeNum;

        @NameInMap("selected_external_user_num")
        public Integer selectedExternalUserNum;

        @NameInMap("selected_user_num")
        public Integer selectedUserNum;

        @NameInMap("suite_key")
        public String suiteKey;

        @NameInMap("token_grant_type")
        public Integer tokenGrantType;

        @NameInMap("version")
        public Integer version;

        @NameInMap("without_authority")
        public Boolean withoutAuthority;

        public static InvoiceRuleSaveResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InvoiceRuleSaveResponseBodyModule self = new InvoiceRuleSaveResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InvoiceRuleSaveResponseBodyModule setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public InvoiceRuleSaveResponseBodyModule setAddNum(Integer addNum) {
            this.addNum = addNum;
            return this;
        }
        public Integer getAddNum() {
            return this.addNum;
        }

        public InvoiceRuleSaveResponseBodyModule setHavanaId(String havanaId) {
            this.havanaId = havanaId;
            return this;
        }
        public String getHavanaId() {
            return this.havanaId;
        }

        public InvoiceRuleSaveResponseBodyModule setRemoveNum(Integer removeNum) {
            this.removeNum = removeNum;
            return this;
        }
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        public InvoiceRuleSaveResponseBodyModule setSelectedExternalUserNum(Integer selectedExternalUserNum) {
            this.selectedExternalUserNum = selectedExternalUserNum;
            return this;
        }
        public Integer getSelectedExternalUserNum() {
            return this.selectedExternalUserNum;
        }

        public InvoiceRuleSaveResponseBodyModule setSelectedUserNum(Integer selectedUserNum) {
            this.selectedUserNum = selectedUserNum;
            return this;
        }
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

        public InvoiceRuleSaveResponseBodyModule setSuiteKey(String suiteKey) {
            this.suiteKey = suiteKey;
            return this;
        }
        public String getSuiteKey() {
            return this.suiteKey;
        }

        public InvoiceRuleSaveResponseBodyModule setTokenGrantType(Integer tokenGrantType) {
            this.tokenGrantType = tokenGrantType;
            return this;
        }
        public Integer getTokenGrantType() {
            return this.tokenGrantType;
        }

        public InvoiceRuleSaveResponseBodyModule setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public InvoiceRuleSaveResponseBodyModule setWithoutAuthority(Boolean withoutAuthority) {
            this.withoutAuthority = withoutAuthority;
            return this;
        }
        public Boolean getWithoutAuthority() {
            return this.withoutAuthority;
        }

    }

}
