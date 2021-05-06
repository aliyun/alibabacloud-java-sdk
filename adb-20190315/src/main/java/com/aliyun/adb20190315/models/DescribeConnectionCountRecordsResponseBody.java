// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeConnectionCountRecordsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("AccessIpRecords")
    public java.util.List<DescribeConnectionCountRecordsResponseBodyAccessIpRecords> accessIpRecords;

    @NameInMap("UserRecords")
    public java.util.List<DescribeConnectionCountRecordsResponseBodyUserRecords> userRecords;

    public static DescribeConnectionCountRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectionCountRecordsResponseBody self = new DescribeConnectionCountRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConnectionCountRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeConnectionCountRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConnectionCountRecordsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeConnectionCountRecordsResponseBody setAccessIpRecords(java.util.List<DescribeConnectionCountRecordsResponseBodyAccessIpRecords> accessIpRecords) {
        this.accessIpRecords = accessIpRecords;
        return this;
    }
    public java.util.List<DescribeConnectionCountRecordsResponseBodyAccessIpRecords> getAccessIpRecords() {
        return this.accessIpRecords;
    }

    public DescribeConnectionCountRecordsResponseBody setUserRecords(java.util.List<DescribeConnectionCountRecordsResponseBodyUserRecords> userRecords) {
        this.userRecords = userRecords;
        return this;
    }
    public java.util.List<DescribeConnectionCountRecordsResponseBodyUserRecords> getUserRecords() {
        return this.userRecords;
    }

    public static class DescribeConnectionCountRecordsResponseBodyAccessIpRecords extends TeaModel {
        @NameInMap("AccessIp")
        public String accessIp;

        @NameInMap("Count")
        public Long count;

        public static DescribeConnectionCountRecordsResponseBodyAccessIpRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectionCountRecordsResponseBodyAccessIpRecords self = new DescribeConnectionCountRecordsResponseBodyAccessIpRecords();
            return TeaModel.build(map, self);
        }

        public DescribeConnectionCountRecordsResponseBodyAccessIpRecords setAccessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }
        public String getAccessIp() {
            return this.accessIp;
        }

        public DescribeConnectionCountRecordsResponseBodyAccessIpRecords setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeConnectionCountRecordsResponseBodyUserRecords extends TeaModel {
        @NameInMap("User")
        public String user;

        @NameInMap("Count")
        public Long count;

        public static DescribeConnectionCountRecordsResponseBodyUserRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectionCountRecordsResponseBodyUserRecords self = new DescribeConnectionCountRecordsResponseBodyUserRecords();
            return TeaModel.build(map, self);
        }

        public DescribeConnectionCountRecordsResponseBodyUserRecords setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribeConnectionCountRecordsResponseBodyUserRecords setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
