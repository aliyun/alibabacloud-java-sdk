// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsCommodityModuleCodeResponseBody extends TeaModel {
    @NameInMap("CommodityCodesInfo")
    public java.util.List<DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfo> commodityCodesInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnsCommodityModuleCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsCommodityModuleCodeResponseBody self = new DescribeEnsCommodityModuleCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsCommodityModuleCodeResponseBody setCommodityCodesInfo(java.util.List<DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfo> commodityCodesInfo) {
        this.commodityCodesInfo = commodityCodesInfo;
        return this;
    }
    public java.util.List<DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfo> getCommodityCodesInfo() {
        return this.commodityCodesInfo;
    }

    public DescribeEnsCommodityModuleCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfoModuleCodesInfo extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleName")
        public String moduleName;

        public static DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfoModuleCodesInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfoModuleCodesInfo self = new DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfoModuleCodesInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfoModuleCodesInfo setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfoModuleCodesInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfo extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ModuleCodesInfo")
        public java.util.List<DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfoModuleCodesInfo> moduleCodesInfo;

        public static DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfo self = new DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfo setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfo setModuleCodesInfo(java.util.List<DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfoModuleCodesInfo> moduleCodesInfo) {
            this.moduleCodesInfo = moduleCodesInfo;
            return this;
        }
        public java.util.List<DescribeEnsCommodityModuleCodeResponseBodyCommodityCodesInfoModuleCodesInfo> getModuleCodesInfo() {
            return this.moduleCodesInfo;
        }

    }

}
