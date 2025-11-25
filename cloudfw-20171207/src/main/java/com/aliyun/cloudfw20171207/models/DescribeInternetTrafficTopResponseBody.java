// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTrafficTopResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DataCount")
    public Integer dataCount;

    @NameInMap("DataList")
    public java.util.List<DescribeInternetTrafficTopResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>in_src_ip</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>15FCCC52-1E23-57AE-B5EF-3E00A3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInternetTrafficTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetTrafficTopResponseBody self = new DescribeInternetTrafficTopResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetTrafficTopResponseBody setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
        return this;
    }
    public Integer getDataCount() {
        return this.dataCount;
    }

    public DescribeInternetTrafficTopResponseBody setDataList(java.util.List<DescribeInternetTrafficTopResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInternetTrafficTopResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInternetTrafficTopResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DescribeInternetTrafficTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInternetTrafficTopResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>US</p>
         */
        @NameInMap("DataName")
        public String dataName;

        /**
         * <strong>example:</strong>
         * <p>47.12</p>
         */
        @NameInMap("DataValue")
        public String dataValue;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsSubscribed")
        public Boolean isSubscribed;

        @NameInMap("LabelList")
        public java.util.List<String> labelList;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        public static DescribeInternetTrafficTopResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetTrafficTopResponseBodyDataList self = new DescribeInternetTrafficTopResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetTrafficTopResponseBodyDataList setDataName(String dataName) {
            this.dataName = dataName;
            return this;
        }
        public String getDataName() {
            return this.dataName;
        }

        public DescribeInternetTrafficTopResponseBodyDataList setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public DescribeInternetTrafficTopResponseBodyDataList setIsSubscribed(Boolean isSubscribed) {
            this.isSubscribed = isSubscribed;
            return this;
        }
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        public DescribeInternetTrafficTopResponseBodyDataList setLabelList(java.util.List<String> labelList) {
            this.labelList = labelList;
            return this;
        }
        public java.util.List<String> getLabelList() {
            return this.labelList;
        }

        public DescribeInternetTrafficTopResponseBodyDataList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeInternetTrafficTopResponseBodyDataList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

    }

}
