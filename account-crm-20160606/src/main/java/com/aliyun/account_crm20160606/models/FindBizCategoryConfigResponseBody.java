// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindBizCategoryConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FindBizCategoryConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindBizCategoryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindBizCategoryConfigResponseBody self = new FindBizCategoryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public FindBizCategoryConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindBizCategoryConfigResponseBody setData(FindBizCategoryConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindBizCategoryConfigResponseBodyData getData() {
        return this.data;
    }

    public FindBizCategoryConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindBizCategoryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindBizCategoryConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory extends TeaModel {
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

        public static FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory build(java.util.Map<String, ?> map) throws Exception {
            FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory self = new FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory();
            return TeaModel.build(map, self);
        }

        public FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory setIsCheck(Boolean isCheck) {
            this.isCheck = isCheck;
            return this;
        }
        public Boolean getIsCheck() {
            return this.isCheck;
        }

        public FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory setMainBiz(Boolean mainBiz) {
            this.mainBiz = mainBiz;
            return this;
        }
        public Boolean getMainBiz() {
            return this.mainBiz;
        }

        public FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory setOther(String other) {
            this.other = other;
            return this;
        }
        public String getOther() {
            return this.other;
        }

    }

    public static class FindBizCategoryConfigResponseBodyDataBizCategorySubConfigs extends TeaModel {
        @NameInMap("BizSubCategory")
        public java.util.List<FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory> bizSubCategory;

        public static FindBizCategoryConfigResponseBodyDataBizCategorySubConfigs build(java.util.Map<String, ?> map) throws Exception {
            FindBizCategoryConfigResponseBodyDataBizCategorySubConfigs self = new FindBizCategoryConfigResponseBodyDataBizCategorySubConfigs();
            return TeaModel.build(map, self);
        }

        public FindBizCategoryConfigResponseBodyDataBizCategorySubConfigs setBizSubCategory(java.util.List<FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory> bizSubCategory) {
            this.bizSubCategory = bizSubCategory;
            return this;
        }
        public java.util.List<FindBizCategoryConfigResponseBodyDataBizCategorySubConfigsBizSubCategory> getBizSubCategory() {
            return this.bizSubCategory;
        }

    }

    public static class FindBizCategoryConfigResponseBodyDataBizCategory extends TeaModel {
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
        public FindBizCategoryConfigResponseBodyDataBizCategorySubConfigs subConfigs;

        public static FindBizCategoryConfigResponseBodyDataBizCategory build(java.util.Map<String, ?> map) throws Exception {
            FindBizCategoryConfigResponseBodyDataBizCategory self = new FindBizCategoryConfigResponseBodyDataBizCategory();
            return TeaModel.build(map, self);
        }

        public FindBizCategoryConfigResponseBodyDataBizCategory setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public FindBizCategoryConfigResponseBodyDataBizCategory setIsCheck(Boolean isCheck) {
            this.isCheck = isCheck;
            return this;
        }
        public Boolean getIsCheck() {
            return this.isCheck;
        }

        public FindBizCategoryConfigResponseBodyDataBizCategory setMainBiz(Boolean mainBiz) {
            this.mainBiz = mainBiz;
            return this;
        }
        public Boolean getMainBiz() {
            return this.mainBiz;
        }

        public FindBizCategoryConfigResponseBodyDataBizCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindBizCategoryConfigResponseBodyDataBizCategory setOther(String other) {
            this.other = other;
            return this;
        }
        public String getOther() {
            return this.other;
        }

        public FindBizCategoryConfigResponseBodyDataBizCategory setSubConfigs(FindBizCategoryConfigResponseBodyDataBizCategorySubConfigs subConfigs) {
            this.subConfigs = subConfigs;
            return this;
        }
        public FindBizCategoryConfigResponseBodyDataBizCategorySubConfigs getSubConfigs() {
            return this.subConfigs;
        }

    }

    public static class FindBizCategoryConfigResponseBodyData extends TeaModel {
        @NameInMap("BizCategory")
        public java.util.List<FindBizCategoryConfigResponseBodyDataBizCategory> bizCategory;

        public static FindBizCategoryConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindBizCategoryConfigResponseBodyData self = new FindBizCategoryConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindBizCategoryConfigResponseBodyData setBizCategory(java.util.List<FindBizCategoryConfigResponseBodyDataBizCategory> bizCategory) {
            this.bizCategory = bizCategory;
            return this;
        }
        public java.util.List<FindBizCategoryConfigResponseBodyDataBizCategory> getBizCategory() {
            return this.bizCategory;
        }

    }

}
