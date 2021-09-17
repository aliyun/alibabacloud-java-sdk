// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DescribeInstanceResponseBodyData data;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceResponseBody setData(DescribeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeInstanceResponseBodyDataCommodityInstanceAdministrator extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeInstanceResponseBodyDataCommodityInstanceAdministrator build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyDataCommodityInstanceAdministrator self = new DescribeInstanceResponseBodyDataCommodityInstanceAdministrator();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyDataCommodityInstanceAdministrator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeInstanceResponseBodyDataCommodityInstanceAdministrator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyDataCommodityInstanceAdministrator setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public DescribeInstanceResponseBodyDataCommodityInstanceAdministrator setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

    public static class DescribeInstanceResponseBodyDataCommodityInstance extends TeaModel {
        @NameInMap("CommodityInstanceId")
        public String commodityInstanceId;

        @NameInMap("Description")
        public String description;

        @NameInMap("CommodityInstanceName")
        public String commodityInstanceName;

        @NameInMap("Commodities")
        public java.util.List<String> commodities;

        @NameInMap("Administrator")
        public DescribeInstanceResponseBodyDataCommodityInstanceAdministrator administrator;

        public static DescribeInstanceResponseBodyDataCommodityInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyDataCommodityInstance self = new DescribeInstanceResponseBodyDataCommodityInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyDataCommodityInstance setCommodityInstanceId(String commodityInstanceId) {
            this.commodityInstanceId = commodityInstanceId;
            return this;
        }
        public String getCommodityInstanceId() {
            return this.commodityInstanceId;
        }

        public DescribeInstanceResponseBodyDataCommodityInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceResponseBodyDataCommodityInstance setCommodityInstanceName(String commodityInstanceName) {
            this.commodityInstanceName = commodityInstanceName;
            return this;
        }
        public String getCommodityInstanceName() {
            return this.commodityInstanceName;
        }

        public DescribeInstanceResponseBodyDataCommodityInstance setCommodities(java.util.List<String> commodities) {
            this.commodities = commodities;
            return this;
        }
        public java.util.List<String> getCommodities() {
            return this.commodities;
        }

        public DescribeInstanceResponseBodyDataCommodityInstance setAdministrator(DescribeInstanceResponseBodyDataCommodityInstanceAdministrator administrator) {
            this.administrator = administrator;
            return this;
        }
        public DescribeInstanceResponseBodyDataCommodityInstanceAdministrator getAdministrator() {
            return this.administrator;
        }

    }

    public static class DescribeInstanceResponseBodyData extends TeaModel {
        @NameInMap("CommodityInstance")
        public DescribeInstanceResponseBodyDataCommodityInstance commodityInstance;

        public static DescribeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyData self = new DescribeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyData setCommodityInstance(DescribeInstanceResponseBodyDataCommodityInstance commodityInstance) {
            this.commodityInstance = commodityInstance;
            return this;
        }
        public DescribeInstanceResponseBodyDataCommodityInstance getCommodityInstance() {
            return this.commodityInstance;
        }

    }

}
