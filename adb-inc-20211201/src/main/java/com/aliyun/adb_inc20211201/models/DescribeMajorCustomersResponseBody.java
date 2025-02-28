// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeMajorCustomersResponseBody extends TeaModel {
    @NameInMap("MajorCustomers")
    public java.util.List<DescribeMajorCustomersResponseBodyMajorCustomers> majorCustomers;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMajorCustomersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMajorCustomersResponseBody self = new DescribeMajorCustomersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMajorCustomersResponseBody setMajorCustomers(java.util.List<DescribeMajorCustomersResponseBodyMajorCustomers> majorCustomers) {
        this.majorCustomers = majorCustomers;
        return this;
    }
    public java.util.List<DescribeMajorCustomersResponseBodyMajorCustomers> getMajorCustomers() {
        return this.majorCustomers;
    }

    public DescribeMajorCustomersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMajorCustomersResponseBodyMajorCustomers extends TeaModel {
        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Area")
        public String area;

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

        @NameInMap("Description")
        public String description;

        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Industry")
        public String industry;

        @NameInMap("Pd")
        public String pd;

        @NameInMap("Pdsa")
        public String pdsa;

        @NameInMap("Ranking")
        public Long ranking;

        @NameInMap("Rd")
        public String rd;

        @NameInMap("Sa")
        public String sa;

        public static DescribeMajorCustomersResponseBodyMajorCustomers build(java.util.Map<String, ?> map) throws Exception {
            DescribeMajorCustomersResponseBodyMajorCustomers self = new DescribeMajorCustomersResponseBodyMajorCustomers();
            return TeaModel.build(map, self);
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setPd(String pd) {
            this.pd = pd;
            return this;
        }
        public String getPd() {
            return this.pd;
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setPdsa(String pdsa) {
            this.pdsa = pdsa;
            return this;
        }
        public String getPdsa() {
            return this.pdsa;
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setRanking(Long ranking) {
            this.ranking = ranking;
            return this;
        }
        public Long getRanking() {
            return this.ranking;
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setRd(String rd) {
            this.rd = rd;
            return this;
        }
        public String getRd() {
            return this.rd;
        }

        public DescribeMajorCustomersResponseBodyMajorCustomers setSa(String sa) {
            this.sa = sa;
            return this;
        }
        public String getSa() {
            return this.sa;
        }

    }

}
