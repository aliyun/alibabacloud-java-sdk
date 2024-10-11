// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskItemReportsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D486768B-8BF8-4D80-B491-43DC3D0AF8AB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ListFlowControlTaskItemReportsResponseBodyResult result;

    public static ListFlowControlTaskItemReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskItemReportsResponseBody self = new ListFlowControlTaskItemReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskItemReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowControlTaskItemReportsResponseBody setResult(ListFlowControlTaskItemReportsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListFlowControlTaskItemReportsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListFlowControlTaskItemReportsResponseBodyResultDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3.24</p>
         */
        @NameInMap("accClickPercent")
        public String accClickPercent;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("accItemClick")
        public String accItemClick;

        /**
         * <strong>example:</strong>
         * <p>4.56</p>
         */
        @NameInMap("accItemCtr")
        public String accItemCtr;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("accItemPv")
        public String accItemPv;

        /**
         * <strong>example:</strong>
         * <p>20.12</p>
         */
        @NameInMap("accPvPercent")
        public String accPvPercent;

        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("accTaskClick")
        public String accTaskClick;

        /**
         * <strong>example:</strong>
         * <p>3.22</p>
         */
        @NameInMap("accTaskCtr")
        public String accTaskCtr;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("accTaskPv")
        public String accTaskPv;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("accTaskRank")
        public String accTaskRank;

        /**
         * <strong>example:</strong>
         * <p>1.23</p>
         */
        @NameInMap("clickPercent")
        public String clickPercent;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("itemClick")
        public String itemClick;

        /**
         * <strong>example:</strong>
         * <p>2.34</p>
         */
        @NameInMap("itemCtr")
        public String itemCtr;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("itemPv")
        public String itemPv;

        /**
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <strong>example:</strong>
         * <p>10.12</p>
         */
        @NameInMap("pvPercent")
        public String pvPercent;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("taskClick")
        public String taskClick;

        /**
         * <strong>example:</strong>
         * <p>1.23</p>
         */
        @NameInMap("taskCtr")
        public String taskCtr;

        /**
         * <strong>example:</strong>
         * <p>1666669577221</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("taskPv")
        public String taskPv;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("taskRank")
        public String taskRank;

        public static ListFlowControlTaskItemReportsResponseBodyResultDetail build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskItemReportsResponseBodyResultDetail self = new ListFlowControlTaskItemReportsResponseBodyResultDetail();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setAccClickPercent(String accClickPercent) {
            this.accClickPercent = accClickPercent;
            return this;
        }
        public String getAccClickPercent() {
            return this.accClickPercent;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setAccItemClick(String accItemClick) {
            this.accItemClick = accItemClick;
            return this;
        }
        public String getAccItemClick() {
            return this.accItemClick;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setAccItemCtr(String accItemCtr) {
            this.accItemCtr = accItemCtr;
            return this;
        }
        public String getAccItemCtr() {
            return this.accItemCtr;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setAccItemPv(String accItemPv) {
            this.accItemPv = accItemPv;
            return this;
        }
        public String getAccItemPv() {
            return this.accItemPv;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setAccPvPercent(String accPvPercent) {
            this.accPvPercent = accPvPercent;
            return this;
        }
        public String getAccPvPercent() {
            return this.accPvPercent;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setAccTaskClick(String accTaskClick) {
            this.accTaskClick = accTaskClick;
            return this;
        }
        public String getAccTaskClick() {
            return this.accTaskClick;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setAccTaskCtr(String accTaskCtr) {
            this.accTaskCtr = accTaskCtr;
            return this;
        }
        public String getAccTaskCtr() {
            return this.accTaskCtr;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setAccTaskPv(String accTaskPv) {
            this.accTaskPv = accTaskPv;
            return this;
        }
        public String getAccTaskPv() {
            return this.accTaskPv;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setAccTaskRank(String accTaskRank) {
            this.accTaskRank = accTaskRank;
            return this;
        }
        public String getAccTaskRank() {
            return this.accTaskRank;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setClickPercent(String clickPercent) {
            this.clickPercent = clickPercent;
            return this;
        }
        public String getClickPercent() {
            return this.clickPercent;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setItemClick(String itemClick) {
            this.itemClick = itemClick;
            return this;
        }
        public String getItemClick() {
            return this.itemClick;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setItemCtr(String itemCtr) {
            this.itemCtr = itemCtr;
            return this;
        }
        public String getItemCtr() {
            return this.itemCtr;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setItemPv(String itemPv) {
            this.itemPv = itemPv;
            return this;
        }
        public String getItemPv() {
            return this.itemPv;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setPvPercent(String pvPercent) {
            this.pvPercent = pvPercent;
            return this;
        }
        public String getPvPercent() {
            return this.pvPercent;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setTaskClick(String taskClick) {
            this.taskClick = taskClick;
            return this;
        }
        public String getTaskClick() {
            return this.taskClick;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setTaskCtr(String taskCtr) {
            this.taskCtr = taskCtr;
            return this;
        }
        public String getTaskCtr() {
            return this.taskCtr;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setTaskPv(String taskPv) {
            this.taskPv = taskPv;
            return this;
        }
        public String getTaskPv() {
            return this.taskPv;
        }

        public ListFlowControlTaskItemReportsResponseBodyResultDetail setTaskRank(String taskRank) {
            this.taskRank = taskRank;
            return this;
        }
        public String getTaskRank() {
            return this.taskRank;
        }

    }

    public static class ListFlowControlTaskItemReportsResponseBodyResult extends TeaModel {
        @NameInMap("detail")
        public java.util.List<ListFlowControlTaskItemReportsResponseBodyResultDetail> detail;

        public static ListFlowControlTaskItemReportsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskItemReportsResponseBodyResult self = new ListFlowControlTaskItemReportsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskItemReportsResponseBodyResult setDetail(java.util.List<ListFlowControlTaskItemReportsResponseBodyResultDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListFlowControlTaskItemReportsResponseBodyResultDetail> getDetail() {
            return this.detail;
        }

    }

}
