// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeConsoleAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeConsoleAccessWhiteListResponseBodyDataList> dataList;

    @NameInMap("PageInfo")
    public DescribeConsoleAccessWhiteListResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("module")
    public String module;

    public static DescribeConsoleAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsoleAccessWhiteListResponseBody self = new DescribeConsoleAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsoleAccessWhiteListResponseBody setDataList(java.util.List<DescribeConsoleAccessWhiteListResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeConsoleAccessWhiteListResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeConsoleAccessWhiteListResponseBody setPageInfo(DescribeConsoleAccessWhiteListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeConsoleAccessWhiteListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeConsoleAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsoleAccessWhiteListResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public static class DescribeConsoleAccessWhiteListResponseBodyDataList extends TeaModel {
        @NameInMap("DstIp")
        public String dstIp;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtRealExpire")
        public String gmtRealExpire;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InsProduct")
        public String insProduct;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SrcIp")
        public String srcIp;

        @NameInMap("Status")
        public String status;

        public static DescribeConsoleAccessWhiteListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsoleAccessWhiteListResponseBodyDataList self = new DescribeConsoleAccessWhiteListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeConsoleAccessWhiteListResponseBodyDataList setDstIp(String dstIp) {
            this.dstIp = dstIp;
            return this;
        }
        public String getDstIp() {
            return this.dstIp;
        }

        public DescribeConsoleAccessWhiteListResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeConsoleAccessWhiteListResponseBodyDataList setGmtRealExpire(String gmtRealExpire) {
            this.gmtRealExpire = gmtRealExpire;
            return this;
        }
        public String getGmtRealExpire() {
            return this.gmtRealExpire;
        }

        public DescribeConsoleAccessWhiteListResponseBodyDataList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeConsoleAccessWhiteListResponseBodyDataList setInsProduct(String insProduct) {
            this.insProduct = insProduct;
            return this;
        }
        public String getInsProduct() {
            return this.insProduct;
        }

        public DescribeConsoleAccessWhiteListResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeConsoleAccessWhiteListResponseBodyDataList setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

        public DescribeConsoleAccessWhiteListResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeConsoleAccessWhiteListResponseBodyPageInfo extends TeaModel {
        @NameInMap("currentPage")
        public Integer currentPage;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static DescribeConsoleAccessWhiteListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsoleAccessWhiteListResponseBodyPageInfo self = new DescribeConsoleAccessWhiteListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeConsoleAccessWhiteListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeConsoleAccessWhiteListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeConsoleAccessWhiteListResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
