// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceNetInfoForInnerResponseBody extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("NetInfos")
    public DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfos netInfos;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsInstanceNetInfoForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceNetInfoForInnerResponseBody self = new DescribeDrdsInstanceNetInfoForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceNetInfoForInnerResponseBody setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsInstanceNetInfoForInnerResponseBody setNetInfos(DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfos netInfos) {
        this.netInfos = netInfos;
        return this;
    }
    public DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfos getNetInfos() {
        return this.netInfos;
    }

    public DescribeDrdsInstanceNetInfoForInnerResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeDrdsInstanceNetInfoForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceNetInfoForInnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("IsForVpc")
        public Boolean isForVpc;

        @NameInMap("Port")
        public String port;

        @NameInMap("Type")
        public String type;

        public static DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo self = new DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo setIsForVpc(Boolean isForVpc) {
            this.isForVpc = isForVpc;
            return this;
        }
        public Boolean getIsForVpc() {
            return this.isForVpc;
        }

        public DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfos extends TeaModel {
        @NameInMap("NetInfo")
        public java.util.List<DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo> netInfo;

        public static DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfos self = new DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfos setNetInfo(java.util.List<DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo> netInfo) {
            this.netInfo = netInfo;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceNetInfoForInnerResponseBodyNetInfosNetInfo> getNetInfo() {
            return this.netInfo;
        }

    }

}
