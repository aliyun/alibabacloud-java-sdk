// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2StreamEngineInfoResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupList")
    public java.util.List<GetLindormV2StreamEngineInfoResponseBodyResourceGroupList> resourceGroupList;

    public static GetLindormV2StreamEngineInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2StreamEngineInfoResponseBody self = new GetLindormV2StreamEngineInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormV2StreamEngineInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLindormV2StreamEngineInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormV2StreamEngineInfoResponseBody setResourceGroupList(java.util.List<GetLindormV2StreamEngineInfoResponseBodyResourceGroupList> resourceGroupList) {
        this.resourceGroupList = resourceGroupList;
        return this;
    }
    public java.util.List<GetLindormV2StreamEngineInfoResponseBodyResourceGroupList> getResourceGroupList() {
        return this.resourceGroupList;
    }

    public static class GetLindormV2StreamEngineInfoResponseBodyResourceGroupList extends TeaModel {
        @NameInMap("JmIpList")
        public java.util.List<String> jmIpList;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("SgIpList")
        public java.util.List<String> sgIpList;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("SpecId")
        public String specId;

        @NameInMap("Status")
        public String status;

        public static GetLindormV2StreamEngineInfoResponseBodyResourceGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2StreamEngineInfoResponseBodyResourceGroupList self = new GetLindormV2StreamEngineInfoResponseBodyResourceGroupList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2StreamEngineInfoResponseBodyResourceGroupList setJmIpList(java.util.List<String> jmIpList) {
            this.jmIpList = jmIpList;
            return this;
        }
        public java.util.List<String> getJmIpList() {
            return this.jmIpList;
        }

        public GetLindormV2StreamEngineInfoResponseBodyResourceGroupList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public GetLindormV2StreamEngineInfoResponseBodyResourceGroupList setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public GetLindormV2StreamEngineInfoResponseBodyResourceGroupList setSgIpList(java.util.List<String> sgIpList) {
            this.sgIpList = sgIpList;
            return this;
        }
        public java.util.List<String> getSgIpList() {
            return this.sgIpList;
        }

        public GetLindormV2StreamEngineInfoResponseBodyResourceGroupList setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetLindormV2StreamEngineInfoResponseBodyResourceGroupList setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

        public GetLindormV2StreamEngineInfoResponseBodyResourceGroupList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
