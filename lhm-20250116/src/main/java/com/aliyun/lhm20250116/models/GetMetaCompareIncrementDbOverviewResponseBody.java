// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetMetaCompareIncrementDbOverviewResponseBody extends TeaModel {
    /**
     * <p>The list of data returned by the API operation. For the element structure, see the descriptions of the child fields.</p>
     */
    @NameInMap("data")
    public GetMetaCompareIncrementDbOverviewResponseBodyData data;

    /**
     * <p>The fault message code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed. If the call fails, troubleshoot the issue based on errCode and errMessage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetMetaCompareIncrementDbOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCompareIncrementDbOverviewResponseBody self = new GetMetaCompareIncrementDbOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaCompareIncrementDbOverviewResponseBody setData(GetMetaCompareIncrementDbOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaCompareIncrementDbOverviewResponseBodyData getData() {
        return this.data;
    }

    public GetMetaCompareIncrementDbOverviewResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetMetaCompareIncrementDbOverviewResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetMetaCompareIncrementDbOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaCompareIncrementDbOverviewResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the current metadata comparison job.</p>
         * 
         * <strong>example:</strong>
         * <p>100256</p>
         */
        @NameInMap("compareJobId")
        public Long compareJobId;

        /**
         * <p>The metadata version time corresponding to the current comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-15T10:30:00Z</p>
         */
        @NameInMap("curVersionTime")
        public String curVersionTime;

        /**
         * <p>The number of partitions added compared to the last comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("diffAddPartitionNum")
        public Long diffAddPartitionNum;

        /**
         * <p>The number of tables added compared to the last comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("diffAddTableNum")
        public Long diffAddTableNum;

        /**
         * <p>The number of partitions deleted compared to the last comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("diffDelPartitionNum")
        public Long diffDelPartitionNum;

        /**
         * <p>The number of tables deleted compared to the last comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("diffDelTableNum")
        public Long diffDelTableNum;

        /**
         * <p>The number of partitions whose properties changed compared to the last comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("diffModifyPartitionNum")
        public Long diffModifyPartitionNum;

        /**
         * <p>The number of tables whose structure underwent schema evolution compared to the last comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("diffModifyTableNum")
        public Long diffModifyTableNum;

        /**
         * <p>The total number of differences at the partition level, which is the sum of the number of added, deleted, and modified partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("diffPartitionNum")
        public Long diffPartitionNum;

        /**
         * <p>The total number of differences at the table level, which is the sum of the number of added, deleted, and modified tables.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("diffTableNum")
        public Long diffTableNum;

        /**
         * <p>The metadata version time corresponding to the last comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-14T10:30:00Z</p>
         */
        @NameInMap("prevVersionTime")
        public String prevVersionTime;

        public static GetMetaCompareIncrementDbOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaCompareIncrementDbOverviewResponseBodyData self = new GetMetaCompareIncrementDbOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setCompareJobId(Long compareJobId) {
            this.compareJobId = compareJobId;
            return this;
        }
        public Long getCompareJobId() {
            return this.compareJobId;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setCurVersionTime(String curVersionTime) {
            this.curVersionTime = curVersionTime;
            return this;
        }
        public String getCurVersionTime() {
            return this.curVersionTime;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setDiffAddPartitionNum(Long diffAddPartitionNum) {
            this.diffAddPartitionNum = diffAddPartitionNum;
            return this;
        }
        public Long getDiffAddPartitionNum() {
            return this.diffAddPartitionNum;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setDiffAddTableNum(Long diffAddTableNum) {
            this.diffAddTableNum = diffAddTableNum;
            return this;
        }
        public Long getDiffAddTableNum() {
            return this.diffAddTableNum;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setDiffDelPartitionNum(Long diffDelPartitionNum) {
            this.diffDelPartitionNum = diffDelPartitionNum;
            return this;
        }
        public Long getDiffDelPartitionNum() {
            return this.diffDelPartitionNum;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setDiffDelTableNum(Long diffDelTableNum) {
            this.diffDelTableNum = diffDelTableNum;
            return this;
        }
        public Long getDiffDelTableNum() {
            return this.diffDelTableNum;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setDiffModifyPartitionNum(Long diffModifyPartitionNum) {
            this.diffModifyPartitionNum = diffModifyPartitionNum;
            return this;
        }
        public Long getDiffModifyPartitionNum() {
            return this.diffModifyPartitionNum;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setDiffModifyTableNum(Long diffModifyTableNum) {
            this.diffModifyTableNum = diffModifyTableNum;
            return this;
        }
        public Long getDiffModifyTableNum() {
            return this.diffModifyTableNum;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setDiffPartitionNum(Long diffPartitionNum) {
            this.diffPartitionNum = diffPartitionNum;
            return this;
        }
        public Long getDiffPartitionNum() {
            return this.diffPartitionNum;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setDiffTableNum(Long diffTableNum) {
            this.diffTableNum = diffTableNum;
            return this;
        }
        public Long getDiffTableNum() {
            return this.diffTableNum;
        }

        public GetMetaCompareIncrementDbOverviewResponseBodyData setPrevVersionTime(String prevVersionTime) {
            this.prevVersionTime = prevVersionTime;
            return this;
        }
        public String getPrevVersionTime() {
            return this.prevVersionTime;
        }

    }

}
