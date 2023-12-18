// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetLevelResponseBody extends TeaModel {
    /**
     * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The network levels.</p>
     */
    @NameInMap("EnsNetLevels")
    public DescribeEnsNetLevelResponseBodyEnsNetLevels ensNetLevels;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnsNetLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetLevelResponseBody self = new DescribeEnsNetLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetLevelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnsNetLevelResponseBody setEnsNetLevels(DescribeEnsNetLevelResponseBodyEnsNetLevels ensNetLevels) {
        this.ensNetLevels = ensNetLevels;
        return this;
    }
    public DescribeEnsNetLevelResponseBodyEnsNetLevels getEnsNetLevels() {
        return this.ensNetLevels;
    }

    public DescribeEnsNetLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnsNetLevelResponseBodyEnsNetLevelsEnsNetLevel extends TeaModel {
        /**
         * <p>The network level. Valid values:</p>
         * <br>
         * <p>*   Big: greater area.</p>
         * <p>*   Middle: province.</p>
         * <p>*   Small: city.</p>
         */
        @NameInMap("EnsNetLevelCode")
        public String ensNetLevelCode;

        public static DescribeEnsNetLevelResponseBodyEnsNetLevelsEnsNetLevel build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetLevelResponseBodyEnsNetLevelsEnsNetLevel self = new DescribeEnsNetLevelResponseBodyEnsNetLevelsEnsNetLevel();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetLevelResponseBodyEnsNetLevelsEnsNetLevel setEnsNetLevelCode(String ensNetLevelCode) {
            this.ensNetLevelCode = ensNetLevelCode;
            return this;
        }
        public String getEnsNetLevelCode() {
            return this.ensNetLevelCode;
        }

    }

    public static class DescribeEnsNetLevelResponseBodyEnsNetLevels extends TeaModel {
        @NameInMap("EnsNetLevel")
        public java.util.List<DescribeEnsNetLevelResponseBodyEnsNetLevelsEnsNetLevel> ensNetLevel;

        public static DescribeEnsNetLevelResponseBodyEnsNetLevels build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetLevelResponseBodyEnsNetLevels self = new DescribeEnsNetLevelResponseBodyEnsNetLevels();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetLevelResponseBodyEnsNetLevels setEnsNetLevel(java.util.List<DescribeEnsNetLevelResponseBodyEnsNetLevelsEnsNetLevel> ensNetLevel) {
            this.ensNetLevel = ensNetLevel;
            return this;
        }
        public java.util.List<DescribeEnsNetLevelResponseBodyEnsNetLevelsEnsNetLevel> getEnsNetLevel() {
            return this.ensNetLevel;
        }

    }

}
