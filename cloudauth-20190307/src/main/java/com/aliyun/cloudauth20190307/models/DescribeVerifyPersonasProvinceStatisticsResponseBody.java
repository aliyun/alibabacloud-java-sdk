// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyPersonasProvinceStatisticsResponseBody extends TeaModel {
    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>D9821F95-CC18-5439-BB1C-21A0FF0C2003</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Query result.</p>
     */
    @NameInMap("ResultObject")
    public DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObject resultObject;

    public static DescribeVerifyPersonasProvinceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyPersonasProvinceStatisticsResponseBody self = new DescribeVerifyPersonasProvinceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyPersonasProvinceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyPersonasProvinceStatisticsResponseBody setResultObject(DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems extends TeaModel {
        /**
         * <p>Total number of devices in the province.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProvinceCnt")
        public Long provinceCnt;

        /**
         * <p>Province name.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江</p>
         */
        @NameInMap("ProvinceName")
        public String provinceName;

        /**
         * <p>Percentage of the total for this province.</p>
         * 
         * <strong>example:</strong>
         * <p>35.71</p>
         */
        @NameInMap("ProvinceRate")
        public String provinceRate;

        public static DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems self = new DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems setProvinceCnt(Long provinceCnt) {
            this.provinceCnt = provinceCnt;
            return this;
        }
        public Long getProvinceCnt() {
            return this.provinceCnt;
        }

        public DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems setProvinceRate(String provinceRate) {
            this.provinceRate = provinceRate;
            return this;
        }
        public String getProvinceRate() {
            return this.provinceRate;
        }

    }

    public static class DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObject extends TeaModel {
        /**
         * <p>Total number of devices.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AllUserCnt")
        public Long allUserCnt;

        /**
         * <p>Data items.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems> items;

        public static DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObject self = new DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObject setAllUserCnt(Long allUserCnt) {
            this.allUserCnt = allUserCnt;
            return this;
        }
        public Long getAllUserCnt() {
            return this.allUserCnt;
        }

        public DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObject setItems(java.util.List<DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeVerifyPersonasProvinceStatisticsResponseBodyResultObjectItems> getItems() {
            return this.items;
        }

    }

}
