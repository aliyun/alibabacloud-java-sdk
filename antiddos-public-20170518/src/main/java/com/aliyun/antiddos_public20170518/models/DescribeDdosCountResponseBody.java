// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCountResponseBody extends TeaModel {
    @NameInMap("DdosCount")
    public DescribeDdosCountResponseBodyDdosCount ddosCount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDdosCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosCountResponseBody self = new DescribeDdosCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosCountResponseBody setDdosCount(DescribeDdosCountResponseBodyDdosCount ddosCount) {
        this.ddosCount = ddosCount;
        return this;
    }
    public DescribeDdosCountResponseBodyDdosCount getDdosCount() {
        return this.ddosCount;
    }

    public DescribeDdosCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDdosCountResponseBodyDdosCount extends TeaModel {
        @NameInMap("DefenseCount")
        public Integer defenseCount;

        @NameInMap("BlackholeCount")
        public Integer blackholeCount;

        @NameInMap("InstacenCount")
        public Integer instacenCount;

        public static DescribeDdosCountResponseBodyDdosCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosCountResponseBodyDdosCount self = new DescribeDdosCountResponseBodyDdosCount();
            return TeaModel.build(map, self);
        }

        public DescribeDdosCountResponseBodyDdosCount setDefenseCount(Integer defenseCount) {
            this.defenseCount = defenseCount;
            return this;
        }
        public Integer getDefenseCount() {
            return this.defenseCount;
        }

        public DescribeDdosCountResponseBodyDdosCount setBlackholeCount(Integer blackholeCount) {
            this.blackholeCount = blackholeCount;
            return this;
        }
        public Integer getBlackholeCount() {
            return this.blackholeCount;
        }

        public DescribeDdosCountResponseBodyDdosCount setInstacenCount(Integer instacenCount) {
            this.instacenCount = instacenCount;
            return this;
        }
        public Integer getInstacenCount() {
            return this.instacenCount;
        }

    }

}
