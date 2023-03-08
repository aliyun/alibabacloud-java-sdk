// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListAccountFactoryBaselinesResponseBody extends TeaModel {
    @NameInMap("Baselines")
    public java.util.List<ListAccountFactoryBaselinesResponseBodyBaselines> baselines;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAccountFactoryBaselinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountFactoryBaselinesResponseBody self = new ListAccountFactoryBaselinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountFactoryBaselinesResponseBody setBaselines(java.util.List<ListAccountFactoryBaselinesResponseBodyBaselines> baselines) {
        this.baselines = baselines;
        return this;
    }
    public java.util.List<ListAccountFactoryBaselinesResponseBodyBaselines> getBaselines() {
        return this.baselines;
    }

    public ListAccountFactoryBaselinesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccountFactoryBaselinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccountFactoryBaselinesResponseBodyBaselines extends TeaModel {
        @NameInMap("BaselineId")
        public String baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListAccountFactoryBaselinesResponseBodyBaselines build(java.util.Map<String, ?> map) throws Exception {
            ListAccountFactoryBaselinesResponseBodyBaselines self = new ListAccountFactoryBaselinesResponseBodyBaselines();
            return TeaModel.build(map, self);
        }

        public ListAccountFactoryBaselinesResponseBodyBaselines setBaselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public String getBaselineId() {
            return this.baselineId;
        }

        public ListAccountFactoryBaselinesResponseBodyBaselines setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public ListAccountFactoryBaselinesResponseBodyBaselines setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAccountFactoryBaselinesResponseBodyBaselines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAccountFactoryBaselinesResponseBodyBaselines setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAccountFactoryBaselinesResponseBodyBaselines setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
