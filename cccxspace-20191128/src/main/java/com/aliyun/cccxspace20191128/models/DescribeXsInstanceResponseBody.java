// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DescribeXsInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CommodityInstance")
    public DescribeXsInstanceResponseBodyCommodityInstance commodityInstance;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeXsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeXsInstanceResponseBody self = new DescribeXsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeXsInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeXsInstanceResponseBody setCommodityInstance(DescribeXsInstanceResponseBodyCommodityInstance commodityInstance) {
        this.commodityInstance = commodityInstance;
        return this;
    }
    public DescribeXsInstanceResponseBodyCommodityInstance getCommodityInstance() {
        return this.commodityInstance;
    }

    public DescribeXsInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeXsInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeXsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeXsInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeXsInstanceResponseBodyCommodityInstanceAdministrator extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("UserName")
        public String userName;

        public static DescribeXsInstanceResponseBodyCommodityInstanceAdministrator build(java.util.Map<String, ?> map) throws Exception {
            DescribeXsInstanceResponseBodyCommodityInstanceAdministrator self = new DescribeXsInstanceResponseBodyCommodityInstanceAdministrator();
            return TeaModel.build(map, self);
        }

        public DescribeXsInstanceResponseBodyCommodityInstanceAdministrator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeXsInstanceResponseBodyCommodityInstanceAdministrator setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeXsInstanceResponseBodyCommodityInstanceAdministrator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeXsInstanceResponseBodyCommodityInstanceAdministrator setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public DescribeXsInstanceResponseBodyCommodityInstanceAdministrator setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeXsInstanceResponseBodyCommodityInstance extends TeaModel {
        @NameInMap("Administrator")
        public DescribeXsInstanceResponseBodyCommodityInstanceAdministrator administrator;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndData")
        public Long endData;

        @NameInMap("HotlineSeatNum")
        public Integer hotlineSeatNum;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OnlineSeatNum")
        public Integer onlineSeatNum;

        @NameInMap("StartData")
        public Long startData;

        @NameInMap("Status")
        public Integer status;

        public static DescribeXsInstanceResponseBodyCommodityInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeXsInstanceResponseBodyCommodityInstance self = new DescribeXsInstanceResponseBodyCommodityInstance();
            return TeaModel.build(map, self);
        }

        public DescribeXsInstanceResponseBodyCommodityInstance setAdministrator(DescribeXsInstanceResponseBodyCommodityInstanceAdministrator administrator) {
            this.administrator = administrator;
            return this;
        }
        public DescribeXsInstanceResponseBodyCommodityInstanceAdministrator getAdministrator() {
            return this.administrator;
        }

        public DescribeXsInstanceResponseBodyCommodityInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeXsInstanceResponseBodyCommodityInstance setEndData(Long endData) {
            this.endData = endData;
            return this;
        }
        public Long getEndData() {
            return this.endData;
        }

        public DescribeXsInstanceResponseBodyCommodityInstance setHotlineSeatNum(Integer hotlineSeatNum) {
            this.hotlineSeatNum = hotlineSeatNum;
            return this;
        }
        public Integer getHotlineSeatNum() {
            return this.hotlineSeatNum;
        }

        public DescribeXsInstanceResponseBodyCommodityInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeXsInstanceResponseBodyCommodityInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeXsInstanceResponseBodyCommodityInstance setOnlineSeatNum(Integer onlineSeatNum) {
            this.onlineSeatNum = onlineSeatNum;
            return this;
        }
        public Integer getOnlineSeatNum() {
            return this.onlineSeatNum;
        }

        public DescribeXsInstanceResponseBodyCommodityInstance setStartData(Long startData) {
            this.startData = startData;
            return this;
        }
        public Long getStartData() {
            return this.startData;
        }

        public DescribeXsInstanceResponseBodyCommodityInstance setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
