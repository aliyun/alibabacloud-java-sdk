// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeLoginLogsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("LogList")
    public DescribeLoginLogsResponseBodyLogList logList;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLoginLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginLogsResponseBody self = new DescribeLoginLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoginLogsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeLoginLogsResponseBody setLogList(DescribeLoginLogsResponseBodyLogList logList) {
        this.logList = logList;
        return this;
    }
    public DescribeLoginLogsResponseBodyLogList getLogList() {
        return this.logList;
    }

    public DescribeLoginLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoginLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoginLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoginLogsResponseBodyLogListLogList extends TeaModel {
        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Location")
        public String location;

        @NameInMap("LoginSourceIp")
        public String loginSourceIp;

        @NameInMap("LoginTime")
        public Long loginTime;

        @NameInMap("Online")
        public String online;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("Protocol")
        public Integer protocol;

        @NameInMap("ProtocolName")
        public String protocolName;

        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("id")
        public Long id;

        public static DescribeLoginLogsResponseBodyLogListLogList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginLogsResponseBodyLogListLogList self = new DescribeLoginLogsResponseBodyLogListLogList();
            return TeaModel.build(map, self);
        }

        public DescribeLoginLogsResponseBodyLogListLogList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setLoginSourceIp(String loginSourceIp) {
            this.loginSourceIp = loginSourceIp;
            return this;
        }
        public String getLoginSourceIp() {
            return this.loginSourceIp;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setLoginTime(Long loginTime) {
            this.loginTime = loginTime;
            return this;
        }
        public Long getLoginTime() {
            return this.loginTime;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setOnline(String online) {
            this.online = online;
            return this;
        }
        public String getOnline() {
            return this.online;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setProtocol(Integer protocol) {
            this.protocol = protocol;
            return this;
        }
        public Integer getProtocol() {
            return this.protocol;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeLoginLogsResponseBodyLogListLogList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DescribeLoginLogsResponseBodyLogList extends TeaModel {
        @NameInMap("LogList")
        public java.util.List<DescribeLoginLogsResponseBodyLogListLogList> logList;

        public static DescribeLoginLogsResponseBodyLogList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginLogsResponseBodyLogList self = new DescribeLoginLogsResponseBodyLogList();
            return TeaModel.build(map, self);
        }

        public DescribeLoginLogsResponseBodyLogList setLogList(java.util.List<DescribeLoginLogsResponseBodyLogListLogList> logList) {
            this.logList = logList;
            return this;
        }
        public java.util.List<DescribeLoginLogsResponseBodyLogListLogList> getLogList() {
            return this.logList;
        }

    }

}
