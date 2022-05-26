// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetCustomerCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomerCategoryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomerCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerCategoryResponseBody self = new GetCustomerCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerCategoryResponseBody setData(GetCustomerCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomerCategoryResponseBodyData getData() {
        return this.data;
    }

    public GetCustomerCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("IsCheck")
        public Boolean isCheck;

        @NameInMap("MainBiz")
        public Boolean mainBiz;

        @NameInMap("Name")
        public String name;

        @NameInMap("Other")
        public String other;

        public static GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory self = new GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory();
            return TeaModel.build(map, self);
        }

        public GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory setIsCheck(Boolean isCheck) {
            this.isCheck = isCheck;
            return this;
        }
        public Boolean getIsCheck() {
            return this.isCheck;
        }

        public GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory setMainBiz(Boolean mainBiz) {
            this.mainBiz = mainBiz;
            return this;
        }
        public Boolean getMainBiz() {
            return this.mainBiz;
        }

        public GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory setOther(String other) {
            this.other = other;
            return this;
        }
        public String getOther() {
            return this.other;
        }

    }

    public static class GetCustomerCategoryResponseBodyDataBizCategorySubConfigs extends TeaModel {
        @NameInMap("BizSubCategory")
        public java.util.List<GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory> bizSubCategory;

        public static GetCustomerCategoryResponseBodyDataBizCategorySubConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerCategoryResponseBodyDataBizCategorySubConfigs self = new GetCustomerCategoryResponseBodyDataBizCategorySubConfigs();
            return TeaModel.build(map, self);
        }

        public GetCustomerCategoryResponseBodyDataBizCategorySubConfigs setBizSubCategory(java.util.List<GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory> bizSubCategory) {
            this.bizSubCategory = bizSubCategory;
            return this;
        }
        public java.util.List<GetCustomerCategoryResponseBodyDataBizCategorySubConfigsBizSubCategory> getBizSubCategory() {
            return this.bizSubCategory;
        }

    }

    public static class GetCustomerCategoryResponseBodyDataBizCategory extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("IsCheck")
        public Boolean isCheck;

        @NameInMap("MainBiz")
        public Boolean mainBiz;

        @NameInMap("Name")
        public String name;

        @NameInMap("Other")
        public String other;

        @NameInMap("SubConfigs")
        public GetCustomerCategoryResponseBodyDataBizCategorySubConfigs subConfigs;

        public static GetCustomerCategoryResponseBodyDataBizCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerCategoryResponseBodyDataBizCategory self = new GetCustomerCategoryResponseBodyDataBizCategory();
            return TeaModel.build(map, self);
        }

        public GetCustomerCategoryResponseBodyDataBizCategory setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetCustomerCategoryResponseBodyDataBizCategory setIsCheck(Boolean isCheck) {
            this.isCheck = isCheck;
            return this;
        }
        public Boolean getIsCheck() {
            return this.isCheck;
        }

        public GetCustomerCategoryResponseBodyDataBizCategory setMainBiz(Boolean mainBiz) {
            this.mainBiz = mainBiz;
            return this;
        }
        public Boolean getMainBiz() {
            return this.mainBiz;
        }

        public GetCustomerCategoryResponseBodyDataBizCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCustomerCategoryResponseBodyDataBizCategory setOther(String other) {
            this.other = other;
            return this;
        }
        public String getOther() {
            return this.other;
        }

        public GetCustomerCategoryResponseBodyDataBizCategory setSubConfigs(GetCustomerCategoryResponseBodyDataBizCategorySubConfigs subConfigs) {
            this.subConfigs = subConfigs;
            return this;
        }
        public GetCustomerCategoryResponseBodyDataBizCategorySubConfigs getSubConfigs() {
            return this.subConfigs;
        }

    }

    public static class GetCustomerCategoryResponseBodyData extends TeaModel {
        @NameInMap("BizCategory")
        public java.util.List<GetCustomerCategoryResponseBodyDataBizCategory> bizCategory;

        public static GetCustomerCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerCategoryResponseBodyData self = new GetCustomerCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerCategoryResponseBodyData setBizCategory(java.util.List<GetCustomerCategoryResponseBodyDataBizCategory> bizCategory) {
            this.bizCategory = bizCategory;
            return this;
        }
        public java.util.List<GetCustomerCategoryResponseBodyDataBizCategory> getBizCategory() {
            return this.bizCategory;
        }

    }

}
