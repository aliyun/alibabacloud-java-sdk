// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSpecResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>D9888DAD-331E-5FBC-B5A0-F2445115****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpecInfoModel")
    public java.util.List<DescribeSpecResponseBodySpecInfoModel> specInfoModel;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        @NameInMap("SpecId")
        public String specId;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("SpecStatus")
        public String specStatus;

        /**
         * <strong>example:</strong>
         * <p>ARM</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
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
