// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAttackTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AttackTypes")
    public java.util.List<DescribeDDosEventAttackTypeResponseBodyAttackTypes> attackTypes;

    public static DescribeDDosEventAttackTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventAttackTypeResponseBody self = new DescribeDDosEventAttackTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventAttackTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDosEventAttackTypeResponseBody setAttackTypes(java.util.List<DescribeDDosEventAttackTypeResponseBodyAttackTypes> attackTypes) {
        this.attackTypes = attackTypes;
        return this;
    }
    public java.util.List<DescribeDDosEventAttackTypeResponseBodyAttackTypes> getAttackTypes() {
        return this.attackTypes;
    }

    public static class DescribeDDosEventAttackTypeResponseBodyAttackTypes extends TeaModel {
        @NameInMap("AttackType")
        public String attackType;

        @NameInMap("InPkts")
        public Long inPkts;

        public static DescribeDDosEventAttackTypeResponseBodyAttackTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDosEventAttackTypeResponseBodyAttackTypes self = new DescribeDDosEventAttackTypeResponseBodyAttackTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDDosEventAttackTypeResponseBodyAttackTypes setAttackType(String attackType) {
            this.attackType = attackType;
            return this;
        }
        public String getAttackType() {
            return this.attackType;
        }

        public DescribeDDosEventAttackTypeResponseBodyAttackTypes setInPkts(Long inPkts) {
            this.inPkts = inPkts;
            return this;
        }
        public Long getInPkts() {
            return this.inPkts;
        }

    }

}
