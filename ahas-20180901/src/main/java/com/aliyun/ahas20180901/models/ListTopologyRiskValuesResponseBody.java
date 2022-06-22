// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListTopologyRiskValuesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTopologyRiskValuesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTopologyRiskValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTopologyRiskValuesResponseBody self = new ListTopologyRiskValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTopologyRiskValuesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTopologyRiskValuesResponseBody setData(java.util.List<ListTopologyRiskValuesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTopologyRiskValuesResponseBodyData> getData() {
        return this.data;
    }

    public ListTopologyRiskValuesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTopologyRiskValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopologyRiskValuesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTopologyRiskValuesResponseBodyDataRiskList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<String> items;

        public static ListTopologyRiskValuesResponseBodyDataRiskList build(java.util.Map<String, ?> map) throws Exception {
            ListTopologyRiskValuesResponseBodyDataRiskList self = new ListTopologyRiskValuesResponseBodyDataRiskList();
            return TeaModel.build(map, self);
        }

        public ListTopologyRiskValuesResponseBodyDataRiskList setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class ListTopologyRiskValuesResponseBodyData extends TeaModel {
        @NameInMap("RiskCount")
        public Integer riskCount;

        @NameInMap("RiskList")
        public java.util.List<ListTopologyRiskValuesResponseBodyDataRiskList> riskList;

        @NameInMap("RiskNodeCount")
        public Integer riskNodeCount;

        public static ListTopologyRiskValuesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTopologyRiskValuesResponseBodyData self = new ListTopologyRiskValuesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTopologyRiskValuesResponseBodyData setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public ListTopologyRiskValuesResponseBodyData setRiskList(java.util.List<ListTopologyRiskValuesResponseBodyDataRiskList> riskList) {
            this.riskList = riskList;
            return this;
        }
        public java.util.List<ListTopologyRiskValuesResponseBodyDataRiskList> getRiskList() {
            return this.riskList;
        }

        public ListTopologyRiskValuesResponseBodyData setRiskNodeCount(Integer riskNodeCount) {
            this.riskNodeCount = riskNodeCount;
            return this;
        }
        public Integer getRiskNodeCount() {
            return this.riskNodeCount;
        }

    }

}
