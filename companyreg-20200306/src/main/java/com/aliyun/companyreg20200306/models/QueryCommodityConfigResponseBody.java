// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryCommodityConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryCommodityConfigResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCommodityConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityConfigResponseBody self = new QueryCommodityConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCommodityConfigResponseBody setData(QueryCommodityConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCommodityConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryCommodityConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCommodityConfigResponseBodyDataCommodityModules extends TeaModel {
        @NameInMap("LxModuleCode")
        public String lxModuleCode;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleDescription")
        public String moduleDescription;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("ModuleTip")
        public String moduleTip;

        @NameInMap("ModuleType")
        public String moduleType;

        @NameInMap("ModuleUrl")
        public String moduleUrl;

        @NameInMap("ModuleValue")
        public String moduleValue;

        @NameInMap("SortNumber")
        public Integer sortNumber;

        public static QueryCommodityConfigResponseBodyDataCommodityModules build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityConfigResponseBodyDataCommodityModules self = new QueryCommodityConfigResponseBodyDataCommodityModules();
            return TeaModel.build(map, self);
        }

        public QueryCommodityConfigResponseBodyDataCommodityModules setLxModuleCode(String lxModuleCode) {
            this.lxModuleCode = lxModuleCode;
            return this;
        }
        public String getLxModuleCode() {
            return this.lxModuleCode;
        }

        public QueryCommodityConfigResponseBodyDataCommodityModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public QueryCommodityConfigResponseBodyDataCommodityModules setModuleDescription(String moduleDescription) {
            this.moduleDescription = moduleDescription;
            return this;
        }
        public String getModuleDescription() {
            return this.moduleDescription;
        }

        public QueryCommodityConfigResponseBodyDataCommodityModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryCommodityConfigResponseBodyDataCommodityModules setModuleTip(String moduleTip) {
            this.moduleTip = moduleTip;
            return this;
        }
        public String getModuleTip() {
            return this.moduleTip;
        }

        public QueryCommodityConfigResponseBodyDataCommodityModules setModuleType(String moduleType) {
            this.moduleType = moduleType;
            return this;
        }
        public String getModuleType() {
            return this.moduleType;
        }

        public QueryCommodityConfigResponseBodyDataCommodityModules setModuleUrl(String moduleUrl) {
            this.moduleUrl = moduleUrl;
            return this;
        }
        public String getModuleUrl() {
            return this.moduleUrl;
        }

        public QueryCommodityConfigResponseBodyDataCommodityModules setModuleValue(String moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public String getModuleValue() {
            return this.moduleValue;
        }

        public QueryCommodityConfigResponseBodyDataCommodityModules setSortNumber(Integer sortNumber) {
            this.sortNumber = sortNumber;
            return this;
        }
        public Integer getSortNumber() {
            return this.sortNumber;
        }

    }

    public static class QueryCommodityConfigResponseBodyData extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityModules")
        public java.util.List<QueryCommodityConfigResponseBodyDataCommodityModules> commodityModules;

        @NameInMap("Description")
        public String description;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("ProductLine")
        public String productLine;

        @NameInMap("ProtocolUrl")
        public String protocolUrl;

        @NameInMap("StartingPrice")
        public String startingPrice;

        @NameInMap("Type")
        public Integer type;

        public static QueryCommodityConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityConfigResponseBodyData self = new QueryCommodityConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCommodityConfigResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryCommodityConfigResponseBodyData setCommodityModules(java.util.List<QueryCommodityConfigResponseBodyDataCommodityModules> commodityModules) {
            this.commodityModules = commodityModules;
            return this;
        }
        public java.util.List<QueryCommodityConfigResponseBodyDataCommodityModules> getCommodityModules() {
            return this.commodityModules;
        }

        public QueryCommodityConfigResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCommodityConfigResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public QueryCommodityConfigResponseBodyData setProductLine(String productLine) {
            this.productLine = productLine;
            return this;
        }
        public String getProductLine() {
            return this.productLine;
        }

        public QueryCommodityConfigResponseBodyData setProtocolUrl(String protocolUrl) {
            this.protocolUrl = protocolUrl;
            return this;
        }
        public String getProtocolUrl() {
            return this.protocolUrl;
        }

        public QueryCommodityConfigResponseBodyData setStartingPrice(String startingPrice) {
            this.startingPrice = startingPrice;
            return this;
        }
        public String getStartingPrice() {
            return this.startingPrice;
        }

        public QueryCommodityConfigResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
