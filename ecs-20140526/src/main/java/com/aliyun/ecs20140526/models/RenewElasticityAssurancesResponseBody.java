// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewElasticityAssurancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the renewal order.</p>
     * 
     * <strong>example:</strong>
     * <p>182372800****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The IDs of the elasticity assurances.</p>
     */
    @NameInMap("PrivatePoolOptionsIdSet")
    public RenewElasticityAssurancesResponseBodyPrivatePoolOptionsIdSet privatePoolOptionsIdSet;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewElasticityAssurancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewElasticityAssurancesResponseBody self = new RenewElasticityAssurancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewElasticityAssurancesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewElasticityAssurancesResponseBody setPrivatePoolOptionsIdSet(RenewElasticityAssurancesResponseBodyPrivatePoolOptionsIdSet privatePoolOptionsIdSet) {
        this.privatePoolOptionsIdSet = privatePoolOptionsIdSet;
        return this;
    }
    public RenewElasticityAssurancesResponseBodyPrivatePoolOptionsIdSet getPrivatePoolOptionsIdSet() {
        return this.privatePoolOptionsIdSet;
    }

    public RenewElasticityAssurancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RenewElasticityAssurancesResponseBodyPrivatePoolOptionsIdSet extends TeaModel {
        @NameInMap("PrivatePoolOptionsId")
        public java.util.List<String> privatePoolOptionsId;

        public static RenewElasticityAssurancesResponseBodyPrivatePoolOptionsIdSet build(java.util.Map<String, ?> map) throws Exception {
            RenewElasticityAssurancesResponseBodyPrivatePoolOptionsIdSet self = new RenewElasticityAssurancesResponseBodyPrivatePoolOptionsIdSet();
            return TeaModel.build(map, self);
        }

        public RenewElasticityAssurancesResponseBodyPrivatePoolOptionsIdSet setPrivatePoolOptionsId(java.util.List<String> privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public java.util.List<String> getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

    }

}
