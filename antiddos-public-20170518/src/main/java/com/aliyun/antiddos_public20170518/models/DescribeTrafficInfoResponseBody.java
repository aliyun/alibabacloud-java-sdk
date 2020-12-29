// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeTrafficInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficInfo")
    public DescribeTrafficInfoResponseBodyTrafficInfo trafficInfo;

    public static DescribeTrafficInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficInfoResponseBody self = new DescribeTrafficInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrafficInfoResponseBody setTrafficInfo(DescribeTrafficInfoResponseBodyTrafficInfo trafficInfo) {
        this.trafficInfo = trafficInfo;
        return this;
    }
    public DescribeTrafficInfoResponseBodyTrafficInfo getTrafficInfo() {
        return this.trafficInfo;
    }

    public static class DescribeTrafficInfoResponseBodyTrafficInfo extends TeaModel {
        @NameInMap("LastUsedTraffic")
        public Integer lastUsedTraffic;

        @NameInMap("AddTraffic")
        public Integer addTraffic;

        @NameInMap("UsableTraffic")
        public Integer usableTraffic;

        public static DescribeTrafficInfoResponseBodyTrafficInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficInfoResponseBodyTrafficInfo self = new DescribeTrafficInfoResponseBodyTrafficInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficInfoResponseBodyTrafficInfo setLastUsedTraffic(Integer lastUsedTraffic) {
            this.lastUsedTraffic = lastUsedTraffic;
            return this;
        }
        public Integer getLastUsedTraffic() {
            return this.lastUsedTraffic;
        }

        public DescribeTrafficInfoResponseBodyTrafficInfo setAddTraffic(Integer addTraffic) {
            this.addTraffic = addTraffic;
            return this;
        }
        public Integer getAddTraffic() {
            return this.addTraffic;
        }

        public DescribeTrafficInfoResponseBodyTrafficInfo setUsableTraffic(Integer usableTraffic) {
            this.usableTraffic = usableTraffic;
            return this;
        }
        public Integer getUsableTraffic() {
            return this.usableTraffic;
        }

    }

}
