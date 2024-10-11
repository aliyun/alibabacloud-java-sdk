// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskReferenceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. The value is unique for each request. This helps troubleshoot issues later.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public ListFlowControlTaskReferenceResponseBodyResult result;

    public static ListFlowControlTaskReferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskReferenceResponseBody self = new ListFlowControlTaskReferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskReferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowControlTaskReferenceResponseBody setResult(ListFlowControlTaskReferenceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListFlowControlTaskReferenceResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListFlowControlTaskReferenceResponseBodyResult extends TeaModel {
        /**
         * <p>The average exposure rate of the item pool in the last seven days.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("last7PvPercent")
        public Double last7PvPercent;

        /**
         * <p>The average number of exposures for the items in the selected scene in the last seven days.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("last7ScenePv")
        public Double last7ScenePv;

        /**
         * <p>The average number of exposures for the item pool in the selected scene in the last seven days.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("last7TaskPv")
        public Double last7TaskPv;

        /**
         * <p>The exposure rate of the item pool yesterday.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("lastPvPercent")
        public Double lastPvPercent;

        /**
         * <p>The total number of exposures for the items in the selected scene yesterday.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("lastScenePv")
        public Long lastScenePv;

        /**
         * <p>The number of exposures for the item pool in the selected scene yesterday.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("lastTaskPv")
        public Long lastTaskPv;

        /**
         * <p>The ID of the reference data.</p>
         * 
         * <strong>example:</strong>
         * <p>421351235918</p>
         */
        @NameInMap("referenceId")
        public String referenceId;

        public static ListFlowControlTaskReferenceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskReferenceResponseBodyResult self = new ListFlowControlTaskReferenceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskReferenceResponseBodyResult setLast7PvPercent(Double last7PvPercent) {
            this.last7PvPercent = last7PvPercent;
            return this;
        }
        public Double getLast7PvPercent() {
            return this.last7PvPercent;
        }

        public ListFlowControlTaskReferenceResponseBodyResult setLast7ScenePv(Double last7ScenePv) {
            this.last7ScenePv = last7ScenePv;
            return this;
        }
        public Double getLast7ScenePv() {
            return this.last7ScenePv;
        }

        public ListFlowControlTaskReferenceResponseBodyResult setLast7TaskPv(Double last7TaskPv) {
            this.last7TaskPv = last7TaskPv;
            return this;
        }
        public Double getLast7TaskPv() {
            return this.last7TaskPv;
        }

        public ListFlowControlTaskReferenceResponseBodyResult setLastPvPercent(Double lastPvPercent) {
            this.lastPvPercent = lastPvPercent;
            return this;
        }
        public Double getLastPvPercent() {
            return this.lastPvPercent;
        }

        public ListFlowControlTaskReferenceResponseBodyResult setLastScenePv(Long lastScenePv) {
            this.lastScenePv = lastScenePv;
            return this;
        }
        public Long getLastScenePv() {
            return this.lastScenePv;
        }

        public ListFlowControlTaskReferenceResponseBodyResult setLastTaskPv(Long lastTaskPv) {
            this.lastTaskPv = lastTaskPv;
            return this;
        }
        public Long getLastTaskPv() {
            return this.lastTaskPv;
        }

        public ListFlowControlTaskReferenceResponseBodyResult setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

}
