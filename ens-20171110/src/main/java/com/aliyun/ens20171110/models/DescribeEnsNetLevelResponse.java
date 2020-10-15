// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetLevelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("EnsNetLevels")
    @Validation(required = true)
    public DescribeEnsNetLevelResponseEnsNetLevels ensNetLevels;

    public static DescribeEnsNetLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetLevelResponse self = new DescribeEnsNetLevelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetLevelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsNetLevelResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnsNetLevelResponse setEnsNetLevels(DescribeEnsNetLevelResponseEnsNetLevels ensNetLevels) {
        this.ensNetLevels = ensNetLevels;
        return this;
    }
    public DescribeEnsNetLevelResponseEnsNetLevels getEnsNetLevels() {
        return this.ensNetLevels;
    }

    public static class DescribeEnsNetLevelResponseEnsNetLevelsEnsNetLevel extends TeaModel {
        @NameInMap("EnsNetLevelCode")
        @Validation(required = true)
        public String ensNetLevelCode;

        public static DescribeEnsNetLevelResponseEnsNetLevelsEnsNetLevel build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetLevelResponseEnsNetLevelsEnsNetLevel self = new DescribeEnsNetLevelResponseEnsNetLevelsEnsNetLevel();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetLevelResponseEnsNetLevelsEnsNetLevel setEnsNetLevelCode(String ensNetLevelCode) {
            this.ensNetLevelCode = ensNetLevelCode;
            return this;
        }
        public String getEnsNetLevelCode() {
            return this.ensNetLevelCode;
        }

    }

    public static class DescribeEnsNetLevelResponseEnsNetLevels extends TeaModel {
        @NameInMap("EnsNetLevel")
        @Validation(required = true)
        public java.util.List<DescribeEnsNetLevelResponseEnsNetLevelsEnsNetLevel> ensNetLevel;

        public static DescribeEnsNetLevelResponseEnsNetLevels build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetLevelResponseEnsNetLevels self = new DescribeEnsNetLevelResponseEnsNetLevels();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetLevelResponseEnsNetLevels setEnsNetLevel(java.util.List<DescribeEnsNetLevelResponseEnsNetLevelsEnsNetLevel> ensNetLevel) {
            this.ensNetLevel = ensNetLevel;
            return this;
        }
        public java.util.List<DescribeEnsNetLevelResponseEnsNetLevelsEnsNetLevel> getEnsNetLevel() {
            return this.ensNetLevel;
        }

    }

}
