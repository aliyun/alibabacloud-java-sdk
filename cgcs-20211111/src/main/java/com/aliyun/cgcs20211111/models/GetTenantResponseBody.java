// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetTenantResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public GetTenantResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTenantResponseBody self = new GetTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTenantResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTenantResponseBody setData(GetTenantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTenantResponseBodyData getData() {
        return this.data;
    }

    public GetTenantResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTenantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTenantResponseBodyData extends TeaModel {
        // 计收模式
        @NameInMap("ChargeMode")
        public String chargeMode;

        // 联系人电话
        @NameInMap("ContactsMobile")
        public String contactsMobile;

        // 联系人
        @NameInMap("ContactsName")
        public String contactsName;

        // 租户所属行业(Code)
        @NameInMap("IndustryCategory")
        public String industryCategory;

        // 业务场景描述
        @NameInMap("ScenceDesc")
        public String scenceDesc;

        // 租户状态
        @NameInMap("Status")
        public String status;

        // 租户ID(AlipayUserId)
        @NameInMap("TenantId")
        public String tenantId;

        // 租户名称
        @NameInMap("TenantName")
        public String tenantName;

        public static GetTenantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTenantResponseBodyData self = new GetTenantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTenantResponseBodyData setChargeMode(String chargeMode) {
            this.chargeMode = chargeMode;
            return this;
        }
        public String getChargeMode() {
            return this.chargeMode;
        }

        public GetTenantResponseBodyData setContactsMobile(String contactsMobile) {
            this.contactsMobile = contactsMobile;
            return this;
        }
        public String getContactsMobile() {
            return this.contactsMobile;
        }

        public GetTenantResponseBodyData setContactsName(String contactsName) {
            this.contactsName = contactsName;
            return this;
        }
        public String getContactsName() {
            return this.contactsName;
        }

        public GetTenantResponseBodyData setIndustryCategory(String industryCategory) {
            this.industryCategory = industryCategory;
            return this;
        }
        public String getIndustryCategory() {
            return this.industryCategory;
        }

        public GetTenantResponseBodyData setScenceDesc(String scenceDesc) {
            this.scenceDesc = scenceDesc;
            return this;
        }
        public String getScenceDesc() {
            return this.scenceDesc;
        }

        public GetTenantResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTenantResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetTenantResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
