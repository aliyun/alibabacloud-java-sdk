// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListRouteRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListRouteRuleResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRouteRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRuleResponseBody self = new ListRouteRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRouteRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRouteRuleResponseBody setData(ListRouteRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRouteRuleResponseBodyData getData() {
        return this.data;
    }

    public ListRouteRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRouteRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRouteRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRouteRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRouteRuleResponseBodyDataPageData extends TeaModel {
        @NameInMap("BizChainId")
        public Long bizChainId;

        @NameInMap("BizChainName")
        public String bizChainName;

        @NameInMap("BlockChainType")
        public String blockChainType;

        @NameInMap("ContractName")
        public String contractName;

        @NameInMap("ContractTemplateId")
        public String contractTemplateId;

        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("DeviceGroupName")
        public String deviceGroupName;

        @NameInMap("InvokeType")
        public String invokeType;

        @NameInMap("PrivacyRuleId")
        public String privacyRuleId;

        @NameInMap("PrivacyRuleName")
        public String privacyRuleName;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RouteRuleId")
        public String routeRuleId;

        public static ListRouteRuleResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListRouteRuleResponseBodyDataPageData self = new ListRouteRuleResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListRouteRuleResponseBodyDataPageData setBizChainId(Long bizChainId) {
            this.bizChainId = bizChainId;
            return this;
        }
        public Long getBizChainId() {
            return this.bizChainId;
        }

        public ListRouteRuleResponseBodyDataPageData setBizChainName(String bizChainName) {
            this.bizChainName = bizChainName;
            return this;
        }
        public String getBizChainName() {
            return this.bizChainName;
        }

        public ListRouteRuleResponseBodyDataPageData setBlockChainType(String blockChainType) {
            this.blockChainType = blockChainType;
            return this;
        }
        public String getBlockChainType() {
            return this.blockChainType;
        }

        public ListRouteRuleResponseBodyDataPageData setContractName(String contractName) {
            this.contractName = contractName;
            return this;
        }
        public String getContractName() {
            return this.contractName;
        }

        public ListRouteRuleResponseBodyDataPageData setContractTemplateId(String contractTemplateId) {
            this.contractTemplateId = contractTemplateId;
            return this;
        }
        public String getContractTemplateId() {
            return this.contractTemplateId;
        }

        public ListRouteRuleResponseBodyDataPageData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public ListRouteRuleResponseBodyDataPageData setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

        public ListRouteRuleResponseBodyDataPageData setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public ListRouteRuleResponseBodyDataPageData setPrivacyRuleId(String privacyRuleId) {
            this.privacyRuleId = privacyRuleId;
            return this;
        }
        public String getPrivacyRuleId() {
            return this.privacyRuleId;
        }

        public ListRouteRuleResponseBodyDataPageData setPrivacyRuleName(String privacyRuleName) {
            this.privacyRuleName = privacyRuleName;
            return this;
        }
        public String getPrivacyRuleName() {
            return this.privacyRuleName;
        }

        public ListRouteRuleResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListRouteRuleResponseBodyDataPageData setRouteRuleId(String routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public String getRouteRuleId() {
            return this.routeRuleId;
        }

    }

    public static class ListRouteRuleResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListRouteRuleResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListRouteRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRouteRuleResponseBodyData self = new ListRouteRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRouteRuleResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListRouteRuleResponseBodyData setPageData(java.util.List<ListRouteRuleResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListRouteRuleResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListRouteRuleResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListRouteRuleResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
