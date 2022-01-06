// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DescribeInstanceSaleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeInstanceSaleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSaleResponseBody self = new DescribeInstanceSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSaleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceSaleResponseBody setData(DescribeInstanceSaleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceSaleResponseBodyData getData() {
        return this.data;
    }

    public DescribeInstanceSaleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSaleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        public static DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator self = new DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class DescribeInstanceSaleResponseBodyDataCommodityInstance extends TeaModel {
        @NameInMap("Administrator")
        public DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator administrator;

        @NameInMap("Commodities")
        public java.util.List<String> commodities;

        @NameInMap("CommodityInstanceId")
        public String commodityInstanceId;

        @NameInMap("CommodityInstanceName")
        public String commodityInstanceName;

        @NameInMap("Description")
        public String description;

        public static DescribeInstanceSaleResponseBodyDataCommodityInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSaleResponseBodyDataCommodityInstance self = new DescribeInstanceSaleResponseBodyDataCommodityInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSaleResponseBodyDataCommodityInstance setAdministrator(DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator administrator) {
            this.administrator = administrator;
            return this;
        }
        public DescribeInstanceSaleResponseBodyDataCommodityInstanceAdministrator getAdministrator() {
            return this.administrator;
        }

        public DescribeInstanceSaleResponseBodyDataCommodityInstance setCommodities(java.util.List<String> commodities) {
            this.commodities = commodities;
            return this;
        }
        public java.util.List<String> getCommodities() {
            return this.commodities;
        }

        public DescribeInstanceSaleResponseBodyDataCommodityInstance setCommodityInstanceId(String commodityInstanceId) {
            this.commodityInstanceId = commodityInstanceId;
            return this;
        }
        public String getCommodityInstanceId() {
            return this.commodityInstanceId;
        }

        public DescribeInstanceSaleResponseBodyDataCommodityInstance setCommodityInstanceName(String commodityInstanceName) {
            this.commodityInstanceName = commodityInstanceName;
            return this;
        }
        public String getCommodityInstanceName() {
            return this.commodityInstanceName;
        }

        public DescribeInstanceSaleResponseBodyDataCommodityInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeInstanceSaleResponseBodyData extends TeaModel {
        @NameInMap("CommodityInstance")
        public DescribeInstanceSaleResponseBodyDataCommodityInstance commodityInstance;

        public static DescribeInstanceSaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSaleResponseBodyData self = new DescribeInstanceSaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSaleResponseBodyData setCommodityInstance(DescribeInstanceSaleResponseBodyDataCommodityInstance commodityInstance) {
            this.commodityInstance = commodityInstance;
            return this;
        }
        public DescribeInstanceSaleResponseBodyDataCommodityInstance getCommodityInstance() {
            return this.commodityInstance;
        }

    }

}
