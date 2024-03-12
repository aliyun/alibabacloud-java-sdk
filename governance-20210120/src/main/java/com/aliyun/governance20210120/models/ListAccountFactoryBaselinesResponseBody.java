// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListAccountFactoryBaselinesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of baselines.</p>
     */
    @NameInMap("Baselines")
    public java.util.List<ListAccountFactoryBaselinesResponseBodyBaselines> baselines;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The baseline ID.</p>
         */
        @NameInMap("BaselineId")
        public String baselineId;

        /**
         * <p>The name of the baseline.</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The time at which the baseline was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the baseline.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the baseline. Valid values:</p>
         * <br>
         * <p>*   System: default baseline</p>
         * <p>*   Custom: custom baseline</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the baseline was updated.</p>
         */
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
