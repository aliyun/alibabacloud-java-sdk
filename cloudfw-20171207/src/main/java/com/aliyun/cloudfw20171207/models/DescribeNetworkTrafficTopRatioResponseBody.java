// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkTrafficTopRatioResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataCount")
    public Integer dataCount;

    @NameInMap("DataList")
    public java.util.List<DescribeNetworkTrafficTopRatioResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>in_src_ip</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>C05D58A1-28A9-563A-BB59-5F7D1867****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkTrafficTopRatioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkTrafficTopRatioResponseBody self = new DescribeNetworkTrafficTopRatioResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkTrafficTopRatioResponseBody setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
        return this;
    }
    public Integer getDataCount() {
        return this.dataCount;
    }

    public DescribeNetworkTrafficTopRatioResponseBody setDataList(java.util.List<DescribeNetworkTrafficTopRatioResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeNetworkTrafficTopRatioResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeNetworkTrafficTopRatioResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DescribeNetworkTrafficTopRatioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNetworkTrafficTopRatioResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DataName")
        public String dataName;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("DataValue")
        public String dataValue;

        public static DescribeNetworkTrafficTopRatioResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkTrafficTopRatioResponseBodyDataList self = new DescribeNetworkTrafficTopRatioResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkTrafficTopRatioResponseBodyDataList setDataName(String dataName) {
            this.dataName = dataName;
            return this;
        }
        public String getDataName() {
            return this.dataName;
        }

        public DescribeNetworkTrafficTopRatioResponseBodyDataList setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

    }

}
