// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineOptionalSpecsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890ABCDEF01234567890ABCDEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The available specifications.</p>
     */
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
        /**
         * <p>Indicates whether the specification is available. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        /**
         * <p>The specification name.</p>
         * 
         * <strong>example:</strong>
         * <p>5ms</p>
         */
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
