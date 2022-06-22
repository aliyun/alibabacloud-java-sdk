// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppMachineListByPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelAppMachineListByPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelAppMachineListByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppMachineListByPageResponseBody self = new SentinelAppMachineListByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelAppMachineListByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelAppMachineListByPageResponseBody setData(SentinelAppMachineListByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelAppMachineListByPageResponseBodyData getData() {
        return this.data;
    }

    public SentinelAppMachineListByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelAppMachineListByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelAppMachineListByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelAppMachineListByPageResponseBodyDataDatas extends TeaModel {
        @NameInMap("clientType")
        public String clientType;

        @NameInMap("health")
        public Boolean health;

        @NameInMap("hostname")
        public String hostname;

        @NameInMap("id")
        public Long id;

        @NameInMap("ip")
        public String ip;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("processConfigurationId")
        public String processConfigurationId;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("version")
        public String version;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelAppMachineListByPageResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppMachineListByPageResponseBodyDataDatas self = new SentinelAppMachineListByPageResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public SentinelAppMachineListByPageResponseBodyDataDatas setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelAppMachineListByPageResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<SentinelAppMachineListByPageResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static SentinelAppMachineListByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppMachineListByPageResponseBodyData self = new SentinelAppMachineListByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelAppMachineListByPageResponseBodyData setDatas(java.util.List<SentinelAppMachineListByPageResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelAppMachineListByPageResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelAppMachineListByPageResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelAppMachineListByPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelAppMachineListByPageResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelAppMachineListByPageResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
