// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DedicateHostList")
    public CreateDedicatedHostResponseBodyDedicateHostList dedicateHostList;

    public static CreateDedicatedHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostResponseBody self = new CreateDedicatedHostResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateDedicatedHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDedicatedHostResponseBody setDedicateHostList(CreateDedicatedHostResponseBodyDedicateHostList dedicateHostList) {
        this.dedicateHostList = dedicateHostList;
        return this;
    }
    public CreateDedicatedHostResponseBodyDedicateHostList getDedicateHostList() {
        return this.dedicateHostList;
    }

    public static class CreateDedicatedHostResponseBodyDedicateHostListDedicateHostList extends TeaModel {
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        public static CreateDedicatedHostResponseBodyDedicateHostListDedicateHostList build(java.util.Map<String, ?> map) throws Exception {
            CreateDedicatedHostResponseBodyDedicateHostListDedicateHostList self = new CreateDedicatedHostResponseBodyDedicateHostListDedicateHostList();
            return TeaModel.build(map, self);
        }

        public CreateDedicatedHostResponseBodyDedicateHostListDedicateHostList setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class CreateDedicatedHostResponseBodyDedicateHostList extends TeaModel {
        @NameInMap("DedicateHostList")
        public java.util.List<CreateDedicatedHostResponseBodyDedicateHostListDedicateHostList> dedicateHostList;

        public static CreateDedicatedHostResponseBodyDedicateHostList build(java.util.Map<String, ?> map) throws Exception {
            CreateDedicatedHostResponseBodyDedicateHostList self = new CreateDedicatedHostResponseBodyDedicateHostList();
            return TeaModel.build(map, self);
        }

        public CreateDedicatedHostResponseBodyDedicateHostList setDedicateHostList(java.util.List<CreateDedicatedHostResponseBodyDedicateHostListDedicateHostList> dedicateHostList) {
            this.dedicateHostList = dedicateHostList;
            return this;
        }
        public java.util.List<CreateDedicatedHostResponseBodyDedicateHostListDedicateHostList> getDedicateHostList() {
            return this.dedicateHostList;
        }

    }

}
