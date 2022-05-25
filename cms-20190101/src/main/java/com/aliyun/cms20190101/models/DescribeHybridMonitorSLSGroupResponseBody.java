// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorSLSGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<DescribeHybridMonitorSLSGroupResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Total")
    public Long total;

    public static DescribeHybridMonitorSLSGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorSLSGroupResponseBody self = new DescribeHybridMonitorSLSGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorSLSGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHybridMonitorSLSGroupResponseBody setList(java.util.List<DescribeHybridMonitorSLSGroupResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeHybridMonitorSLSGroupResponseBodyList> getList() {
        return this.list;
    }

    public DescribeHybridMonitorSLSGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHybridMonitorSLSGroupResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridMonitorSLSGroupResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridMonitorSLSGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridMonitorSLSGroupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeHybridMonitorSLSGroupResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig extends TeaModel {
        @NameInMap("SLSLogstore")
        public String SLSLogstore;

        @NameInMap("SLSProject")
        public String SLSProject;

        @NameInMap("SLSRegion")
        public String SLSRegion;

        @NameInMap("SLSUserId")
        public String SLSUserId;

        public static DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig self = new DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig setSLSLogstore(String SLSLogstore) {
            this.SLSLogstore = SLSLogstore;
            return this;
        }
        public String getSLSLogstore() {
            return this.SLSLogstore;
        }

        public DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

        public DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig setSLSRegion(String SLSRegion) {
            this.SLSRegion = SLSRegion;
            return this;
        }
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        public DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig setSLSUserId(String SLSUserId) {
            this.SLSUserId = SLSUserId;
            return this;
        }
        public String getSLSUserId() {
            return this.SLSUserId;
        }

    }

    public static class DescribeHybridMonitorSLSGroupResponseBodyList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SLSGroupConfig")
        public java.util.List<DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig> SLSGroupConfig;

        @NameInMap("SLSGroupDescription")
        public String SLSGroupDescription;

        @NameInMap("SLSGroupName")
        public Long SLSGroupName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeHybridMonitorSLSGroupResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorSLSGroupResponseBodyList self = new DescribeHybridMonitorSLSGroupResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorSLSGroupResponseBodyList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeHybridMonitorSLSGroupResponseBodyList setSLSGroupConfig(java.util.List<DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig> SLSGroupConfig) {
            this.SLSGroupConfig = SLSGroupConfig;
            return this;
        }
        public java.util.List<DescribeHybridMonitorSLSGroupResponseBodyListSLSGroupConfig> getSLSGroupConfig() {
            return this.SLSGroupConfig;
        }

        public DescribeHybridMonitorSLSGroupResponseBodyList setSLSGroupDescription(String SLSGroupDescription) {
            this.SLSGroupDescription = SLSGroupDescription;
            return this;
        }
        public String getSLSGroupDescription() {
            return this.SLSGroupDescription;
        }

        public DescribeHybridMonitorSLSGroupResponseBodyList setSLSGroupName(Long SLSGroupName) {
            this.SLSGroupName = SLSGroupName;
            return this;
        }
        public Long getSLSGroupName() {
            return this.SLSGroupName;
        }

        public DescribeHybridMonitorSLSGroupResponseBodyList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
