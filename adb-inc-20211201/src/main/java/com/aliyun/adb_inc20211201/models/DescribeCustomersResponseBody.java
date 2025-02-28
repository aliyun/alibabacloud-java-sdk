// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeCustomersResponseBody extends TeaModel {
    @NameInMap("Customers")
    public java.util.List<DescribeCustomersResponseBodyCustomers> customers;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustomersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomersResponseBody self = new DescribeCustomersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomersResponseBody setCustomers(java.util.List<DescribeCustomersResponseBodyCustomers> customers) {
        this.customers = customers;
        return this;
    }
    public java.util.List<DescribeCustomersResponseBodyCustomers> getCustomers() {
        return this.customers;
    }

    public DescribeCustomersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCustomersResponseBodyCustomers extends TeaModel {
        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("CustomerName")
        public String customerName;

        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("GcLevel")
        public String gcLevel;

        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("IsMajor")
        public Integer isMajor;

        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeCustomersResponseBodyCustomers build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomersResponseBodyCustomers self = new DescribeCustomersResponseBodyCustomers();
            return TeaModel.build(map, self);
        }

        public DescribeCustomersResponseBodyCustomers setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public DescribeCustomersResponseBodyCustomers setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public DescribeCustomersResponseBodyCustomers setGcLevel(String gcLevel) {
            this.gcLevel = gcLevel;
            return this;
        }
        public String getGcLevel() {
            return this.gcLevel;
        }

        public DescribeCustomersResponseBodyCustomers setIsMajor(Integer isMajor) {
            this.isMajor = isMajor;
            return this;
        }
        public Integer getIsMajor() {
            return this.isMajor;
        }

        public DescribeCustomersResponseBodyCustomers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeCustomersResponseBodyCustomers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
