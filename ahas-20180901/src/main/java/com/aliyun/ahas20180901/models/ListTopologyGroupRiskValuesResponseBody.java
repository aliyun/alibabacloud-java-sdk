// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListTopologyGroupRiskValuesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTopologyGroupRiskValuesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTopologyGroupRiskValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTopologyGroupRiskValuesResponseBody self = new ListTopologyGroupRiskValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTopologyGroupRiskValuesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTopologyGroupRiskValuesResponseBody setData(java.util.List<ListTopologyGroupRiskValuesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTopologyGroupRiskValuesResponseBodyData> getData() {
        return this.data;
    }

    public ListTopologyGroupRiskValuesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTopologyGroupRiskValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopologyGroupRiskValuesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTopologyGroupRiskValuesResponseBodyDataRiskList extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static ListTopologyGroupRiskValuesResponseBodyDataRiskList build(java.util.Map<String, ?> map) throws Exception {
            ListTopologyGroupRiskValuesResponseBodyDataRiskList self = new ListTopologyGroupRiskValuesResponseBodyDataRiskList();
            return TeaModel.build(map, self);
        }

        public ListTopologyGroupRiskValuesResponseBodyDataRiskList setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class ListTopologyGroupRiskValuesResponseBodyData extends TeaModel {
        @NameInMap("riskCount")
        public Integer riskCount;

        @NameInMap("riskList")
        public java.util.List<ListTopologyGroupRiskValuesResponseBodyDataRiskList> riskList;

        @NameInMap("riskNodeCount")
        public Integer riskNodeCount;

        public static ListTopologyGroupRiskValuesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTopologyGroupRiskValuesResponseBodyData self = new ListTopologyGroupRiskValuesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTopologyGroupRiskValuesResponseBodyData setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public ListTopologyGroupRiskValuesResponseBodyData setRiskList(java.util.List<ListTopologyGroupRiskValuesResponseBodyDataRiskList> riskList) {
            this.riskList = riskList;
            return this;
        }
        public java.util.List<ListTopologyGroupRiskValuesResponseBodyDataRiskList> getRiskList() {
            return this.riskList;
        }

        public ListTopologyGroupRiskValuesResponseBodyData setRiskNodeCount(Integer riskNodeCount) {
            this.riskNodeCount = riskNodeCount;
            return this;
        }
        public Integer getRiskNodeCount() {
            return this.riskNodeCount;
        }

    }

}
