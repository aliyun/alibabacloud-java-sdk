// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSpecResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpecInfoModel")
    public java.util.List<DescribeSpecResponseBodySpecInfoModel> specInfoModel;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpecResponseBody self = new DescribeSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpecResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpecResponseBody setSpecInfoModel(java.util.List<DescribeSpecResponseBodySpecInfoModel> specInfoModel) {
        this.specInfoModel = specInfoModel;
        return this;
    }
    public java.util.List<DescribeSpecResponseBodySpecInfoModel> getSpecInfoModel() {
        return this.specInfoModel;
    }

    public DescribeSpecResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSpecResponseBodySpecInfoModel extends TeaModel {
        @NameInMap("Core")
        public Integer core;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("SpecId")
        public String specId;

        @NameInMap("SpecStatus")
        public String specStatus;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribeSpecResponseBodySpecInfoModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpecResponseBodySpecInfoModel self = new DescribeSpecResponseBodySpecInfoModel();
            return TeaModel.build(map, self);
        }

        public DescribeSpecResponseBodySpecInfoModel setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public DescribeSpecResponseBodySpecInfoModel setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeSpecResponseBodySpecInfoModel setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

        public DescribeSpecResponseBodySpecInfoModel setSpecStatus(String specStatus) {
            this.specStatus = specStatus;
            return this;
        }
        public String getSpecStatus() {
            return this.specStatus;
        }

        public DescribeSpecResponseBodySpecInfoModel setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public DescribeSpecResponseBodySpecInfoModel setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
