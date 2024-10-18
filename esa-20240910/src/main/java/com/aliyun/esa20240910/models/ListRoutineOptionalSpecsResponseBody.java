// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineOptionalSpecsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Specs")
    public java.util.List<ListRoutineOptionalSpecsResponseBodySpecs> specs;

    public static ListRoutineOptionalSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineOptionalSpecsResponseBody self = new ListRoutineOptionalSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoutineOptionalSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoutineOptionalSpecsResponseBody setSpecs(java.util.List<ListRoutineOptionalSpecsResponseBodySpecs> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<ListRoutineOptionalSpecsResponseBodySpecs> getSpecs() {
        return this.specs;
    }

    public static class ListRoutineOptionalSpecsResponseBodySpecs extends TeaModel {
        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        @NameInMap("SpecName")
        public String specName;

        public static ListRoutineOptionalSpecsResponseBodySpecs build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineOptionalSpecsResponseBodySpecs self = new ListRoutineOptionalSpecsResponseBodySpecs();
            return TeaModel.build(map, self);
        }

        public ListRoutineOptionalSpecsResponseBodySpecs setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public ListRoutineOptionalSpecsResponseBodySpecs setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

}
