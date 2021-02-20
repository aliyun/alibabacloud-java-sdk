// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeHostsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Records")
    public java.util.List<DescribeHostsResponseBodyRecords> records;

    public static DescribeHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostsResponseBody self = new DescribeHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHostsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeHostsResponseBody setRecords(java.util.List<DescribeHostsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeHostsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeHostsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("OS")
        public String OS;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("IP")
        public String IP;

        @NameInMap("IsUp")
        public String isUp;

        public static DescribeHostsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostsResponseBodyRecords self = new DescribeHostsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeHostsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeHostsResponseBodyRecords setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public DescribeHostsResponseBodyRecords setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeHostsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeHostsResponseBodyRecords setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeHostsResponseBodyRecords setIsUp(String isUp) {
            this.isUp = isUp;
            return this;
        }
        public String getIsUp() {
            return this.isUp;
        }

    }

}
