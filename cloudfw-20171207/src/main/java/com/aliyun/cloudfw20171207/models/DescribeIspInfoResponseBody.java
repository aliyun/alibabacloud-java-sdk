// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeIspInfoResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeIspInfoResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeIspInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspInfoResponseBody self = new DescribeIspInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIspInfoResponseBody setDataList(java.util.List<DescribeIspInfoResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeIspInfoResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeIspInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIspInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIspInfoResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>isp-dhyw2lxfpc****</p>
         */
        @NameInMap("IspId")
        public Integer ispId;

        @NameInMap("IspName")
        public String ispName;

        public static DescribeIspInfoResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIspInfoResponseBodyDataList self = new DescribeIspInfoResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeIspInfoResponseBodyDataList setIspId(Integer ispId) {
            this.ispId = ispId;
            return this;
        }
        public Integer getIspId() {
            return this.ispId;
        }

        public DescribeIspInfoResponseBodyDataList setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

}
