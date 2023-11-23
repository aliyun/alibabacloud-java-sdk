// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLdpsNamespacedQuotaResponseBody extends TeaModel {
    @NameInMap("NamespacedQuotas")
    public java.util.List<GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas> namespacedQuotas;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLdpsNamespacedQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLdpsNamespacedQuotaResponseBody self = new GetLdpsNamespacedQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLdpsNamespacedQuotaResponseBody setNamespacedQuotas(java.util.List<GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas> namespacedQuotas) {
        this.namespacedQuotas = namespacedQuotas;
        return this;
    }
    public java.util.List<GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas> getNamespacedQuotas() {
        return this.namespacedQuotas;
    }

    public GetLdpsNamespacedQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas extends TeaModel {
        @NameInMap("CpuAmount")
        public String cpuAmount;

        @NameInMap("MemoryAmount")
        public String memoryAmount;

        @NameInMap("Name")
        public String name;

        @NameInMap("UsedCpu")
        public String usedCpu;

        @NameInMap("UsedMemory")
        public String usedMemory;

        public static GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas build(java.util.Map<String, ?> map) throws Exception {
            GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas self = new GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas();
            return TeaModel.build(map, self);
        }

        public GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas setCpuAmount(String cpuAmount) {
            this.cpuAmount = cpuAmount;
            return this;
        }
        public String getCpuAmount() {
            return this.cpuAmount;
        }

        public GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas setMemoryAmount(String memoryAmount) {
            this.memoryAmount = memoryAmount;
            return this;
        }
        public String getMemoryAmount() {
            return this.memoryAmount;
        }

        public GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas setUsedCpu(String usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public String getUsedCpu() {
            return this.usedCpu;
        }

        public GetLdpsNamespacedQuotaResponseBodyNamespacedQuotas setUsedMemory(String usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public String getUsedMemory() {
            return this.usedMemory;
        }

    }

}
